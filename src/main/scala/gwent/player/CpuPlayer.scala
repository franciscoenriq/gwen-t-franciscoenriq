package cl.uchile.dcc
package gwent.player
import gwent.cards.AbstractCard
import scala.collection.mutable.ArrayBuffer


class CpuPlayer(name: String, gemCount: Int = 2,
                deckOfCards:ArrayBuffer[AbstractCard], handOfCards:ArrayBuffer[AbstractCard]) extends AbstractPlayer(name, gemCount, deckOfCards,handOfCards) {


    override def equals(obj: Any): Boolean = {
      if(this.getClass().getName == obj.getClass.getName){
        val otherCpuPlayer = obj.asInstanceOf[CpuPlayer]
         this.name == otherCpuPlayer.name
      }else false
    }
  override def toString = s"CpuPlayer(name=$name,gemCount=$gemCount,deckOfCards=$deckOfCards,handOfCards=$handOfCards)"


}

