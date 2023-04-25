package cl.uchile.dcc
package gwent.player
import gwent.cards.AbstractCard
import scala.collection.mutable.ArrayBuffer


class CpuPlayer(name: String, gemCount: Int = 2,
                deckOfCards:ArrayBuffer[AbstractCard], handOfCards:ArrayBuffer[AbstractCard]) extends AbstractPlayer(name, gemCount, deckOfCards,handOfCards) {
  private val cpu:String =""
    override def equals(obj: Any): Boolean = {
      if(this.getClass().getName == obj.getClass.getName){
        val otherCpuPlayer = obj.asInstanceOf[CpuPlayer]
         this.name == otherCpuPlayer.name
      }else false
    }


  override def toString = s"CpuPlayer()"

  override def hashCode(): Int = {
    val state = Seq(cpu)
    state.map(_.hashCode()).foldLeft(0)((a, b) => 31 * a + b)
  }
}

