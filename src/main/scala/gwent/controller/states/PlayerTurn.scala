package cl.uchile.dcc
package gwent.controller.states

import gwent.controller.GameController

class PlayerTurn(private var context: GameController) extends AbstractState(context) {
  override def takeCardInit(): Unit = {
      context.getJugador1().takeCard()
  }
  override def playCard(i: Int): Unit = {
    context.getJugador1().playCard(i)
  }
  override def finalizarTurno(): Unit = {
    context.setState(new PlayerCpuTurn(context))
  }
  override def passTurn(): Unit = {
    context.setState(new PlayerCpuTurn(context))
  }

  override def endGame(): Unit = {
    context.setState(new EndGame(context))
  }

  override def toString = s"PlayerTurn($context)"

  private def canEqual(other: Any): Boolean = other.isInstanceOf[PlayerTurn]
  
  override def equals(other: Any): Boolean = other match
    case that: PlayerTurn =>
      that.canEqual(this) &&
        context == that.context
    case _ => false
  
  override def hashCode(): Int =
    val state = Seq(context)
    state.map(_.hashCode()).foldLeft(0)((a, b) => 31 * a + b)
}
