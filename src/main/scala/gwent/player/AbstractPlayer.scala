package cl.uchile.dcc
package gwent.player
import scala.collection.mutable.ArrayBuffer
import cl.uchile.dcc.gwent.cards.AbstractCard
import scala.util.Random
/**
 *
 * @param name:represent the name of the player
 * @param gemCount:the number of gem's
 * @param deckOfCards:represent the total of cards that you have
 * @param handOfCards: the cards that you are available to play
 */
abstract class AbstractPlayer(private val name: String,private var gemCount: Int = 2,
                              private var deckOfCards:ArrayBuffer[AbstractCard],private var handOfCards:ArrayBuffer[AbstractCard] ) extends playerMethods {
  /**
   *
   * first we define ours getters and setters metodhs
   */
  def setHandOfCards(carta:AbstractCard): Unit = {
    this.handOfCards.append(carta)
  }
  def setGemCount(i:Int): Unit = {
    this.gemCount = i
  }
  def getName():String={
    this.name
  }
  def getGemCount():Int ={
    this.gemCount
  }
  def getDeckOfCards():ArrayBuffer[AbstractCard]={
    this.deckOfCards
  }

  def getHandOfCards(): ArrayBuffer[AbstractCard] = {
    this.handOfCards
  }
  /**
   * we use takeCard when you want to take a card from your deck of cards.
   * first set the hand of card with .remove(0) , we say that 0 is the top of the deck
   * then use random to the deck
   */
  def takeCard():Unit = {
    setHandOfCards(deckOfCards.remove(0))//.remove elimina y entrega el elemento en la posicion 0 del mazo de cartas.
    Random.shuffle(deckOfCards)
  }
  /**
   * @param i is the position card in your hand that you want to play
   * @return the card played
   */
  def playCard(i:Int):AbstractCard={
    handOfCards.remove(i)
  }

}


