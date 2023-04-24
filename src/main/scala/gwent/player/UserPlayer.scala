package cl.uchile.dcc
package gwent.player
import cl.uchile.dcc.gwent.cards.AbstractCard
import scala.collection.mutable.ArrayBuffer


class UserPlayer(val name: String, val gemCount: Int,val deckOfCards:ArrayBuffer[AbstractCard],
                 val handOfCards:ArrayBuffer[AbstractCard]) extends AbstractPlayer(name, gemCount, deckOfCards, handOfCards){




}





