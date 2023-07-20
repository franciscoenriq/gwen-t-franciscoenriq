package cl.uchile.dcc
package gwent.controller.states

import gwent.controller.GameController

class PlayerCpuTurn(private var context: GameController) extends AbstractState(context) {
  override def takeCardInit(): Unit = {
      context.getJugador2Cpu().takeCard()
  }

  override def playCard(i: Int): Unit = {
    context.getJugador2Cpu().playCard(i)
  }
  override def finalizarTurno(): Unit = {
    context.setState(new PlayerTurn(context))
  }
  override def passTurn(): Unit = {
    context.setState(new PlayerTurn(context))
  }

  override def endGame(): Unit ={
    context.setState(new EndGame(context))
  }
  //_-----------------------
  override def toString = s"PlayerCpuTurn($context)"

  private def canEqual(other: Any): Boolean = other.isInstanceOf[PlayerCpuTurn]
  
  override def equals(other: Any): Boolean = other match
    case that: PlayerCpuTurn =>
      that.canEqual(this) &&
        context == that.context
    case _ => false
  
  override def hashCode(): Int =
    val state = Seq(context)
    state.map(_.hashCode()).foldLeft(0)((a, b) => 31 * a + b)
}
