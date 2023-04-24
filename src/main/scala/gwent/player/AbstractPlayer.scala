package cl.uchile.dcc
package gwent.player

import gwent.battlefield.Board
import gwent.cards.Card

abstract class AbstractPlayer(val name: String, val gemCount: Int = 2,
                              val deckOfCards:Card, val handOfCards:Card) {


  /**
   * we use this when you play a card
   * we define this private in first place
   *
   * @return void
   */
   private def playCard(): Unit ={}

  /**
   * use this when you take a card from the deck of cards
   *
   * @return void
   */
  private def takeCard(): Unit = {}




}
