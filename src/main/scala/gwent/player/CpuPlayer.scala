package cl.uchile.dcc
package gwent.player
import gwent.cards.AbstractCard
import scala.collection.mutable.ArrayBuffer


class CpuPlayer(name: String, gemCount: Int = 2,
                deckOfCards:ArrayBuffer[AbstractCard], handOfCards:ArrayBuffer[AbstractCard]) extends AbstractPlayer(name, gemCount, deckOfCards,handOfCards) {



}
