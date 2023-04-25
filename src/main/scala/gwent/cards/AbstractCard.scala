package cl.uchile.dcc
package gwent.cards
import scala.collection.mutable.ArrayBuffer
abstract class AbstractCard(private val name:String) {
  def getName(): String = {
    this.name
  }
  /**
   * use this method when you want to add the card to the deck
   * @param deckOfCards
   */
  def addCard(deckOfCards: ArrayBuffer[AbstractCard]):Unit={
    deckOfCards.append(this)
  }
}
