package cl.uchile.dcc
package gwent.player
import cl.uchile.dcc.gwent.cards.AbstractCard
import scala.collection.mutable.ArrayBuffer


class UserPlayer(val name: String, val gemCount: Int,val deckOfCards:ArrayBuffer[AbstractCard],
                 val handOfCards:ArrayBuffer[AbstractCard]) extends AbstractPlayer(name, gemCount, deckOfCards, handOfCards){


  override def equals(obj: Any): Boolean = {
    if (this.getClass().getName == obj.getClass.getName) {
      val otherCpuPlayer = obj.asInstanceOf[UserPlayer]
      this.name == otherCpuPlayer.name
    } else false
  }

  override def hashCode(): Int = {
    val state = Seq(name, gemCount, deckOfCards, handOfCards)
    state.map(_.hashCode()).foldLeft(0)((a, b) => 31 * a + b)
  }
  override def toString = s"UserPlayer()"
}





