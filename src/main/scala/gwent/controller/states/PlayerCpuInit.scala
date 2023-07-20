package cl.uchile.dcc
package gwent.controller.states

import gwent.controller.GameController

class PlayerCpuInit(private var context: GameController) extends AbstractState(context) {
  override def takeCardInit(): Unit = {
    for (i <- 1 to 10) {
      context.getJugador2Cpu().takeCard()
    }
  }

  override def playCard(i: Int): Unit = {
    context.getJugador2Cpu().playCard(i)
  }

  override def finalizarTurno(): Unit = {
    context.setState(new PlayerTurn(context))
  }
  override def passTurn(): Unit = {
    context.setState(new PlayerCpuInit(context))
  }
  
  override def toString = s"PlayerCpuInit($context)"

  private def canEqual(other: Any): Boolean = other.isInstanceOf[PlayerCpuInit]
  
  override def equals(other: Any): Boolean = other match
    case that: PlayerCpuInit =>
      that.canEqual(this) &&
        context == that.context
    case _ => false
  
  override def hashCode(): Int =
    val state = Seq(context)
    state.map(_.hashCode()).foldLeft(0)((a, b) => 31 * a + b)
}
