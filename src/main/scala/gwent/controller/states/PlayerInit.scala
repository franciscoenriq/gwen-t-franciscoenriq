package cl.uchile.dcc
package gwent.controller.states

import gwent.controller.GameController
import gwent.controller.states.AbstractState
import gwent.player.AbstractPlayer

class PlayerInit(private var context: GameController) extends AbstractState(context){
  
  override def takeCardInit(): Unit = {
    for (i <- 1 to 10) {
      context.getJugador1().takeCard()
    }
  }
  override def playCard(i:Int): Unit = {
    context.getJugador1().playCard(i)
  }
  
  override def finalizarTurno(): Unit = {
    context.setState(new PlayerCpuInit(context))
  }
  override def passTurn(): Unit = {
    context.setState(new PlayerCpuInit(context))

  }
  override def toString = s"PlayerInit($context)"

  private def canEqual(other: Any): Boolean = other.isInstanceOf[PlayerInit]
  
  override def equals(other: Any): Boolean = other match
    case that: PlayerInit =>
      that.canEqual(this) &&
        context == that.context
    case _ => false
  override def hashCode(): Int =
    val state = Seq(context)
    state.map(_.hashCode()).foldLeft(0)((a, b) => 31 * a + b)
}
