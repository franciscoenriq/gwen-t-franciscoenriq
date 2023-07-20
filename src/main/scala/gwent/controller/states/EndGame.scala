package cl.uchile.dcc
package gwent.controller.states

import gwent.controller.GameController

class EndGame(private var context: GameController) extends AbstractState(context){

  private def canEqual(other: Any): Boolean = other.isInstanceOf[EndGame]

  override def equals(other: Any): Boolean = other match
    case that: EndGame =>
      that.canEqual(this) &&
        context == that.context
    case _ => false

  override def hashCode(): Int =
    val state = Seq(context)
    state.map(_.hashCode()).foldLeft(0)((a, b) => 31 * a + b)
  override def toString = s"EndGame($context)"
}
