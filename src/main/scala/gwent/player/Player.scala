package cl.uchile.dcc
package gwent.player
import cl.uchile.dcc.gwent.cards.Card
import cl.uchile.dcc.gwent.battlefield.Board
/**
 *
 * @param name:represent the name of the player
 * @param sectionBoard:part of the board
 * @param gemCount:the number of gem's
 * @param deckOfCards:represent the total of cards that you have
 * @param handOfCards: the cards that you are available to play
 * por mientras estos dos ultimos parametros seran ambos del tipo carta
 *
 */

class Player(private val name: String,private val sectionBoard: Board,private val gemCount: Int,
             private val deckOfCards:Card,private val handOfCards:Card){

  /**
   * we implements all of getters we need
    */



  /**
   * we use this when you play a card
   * we define this private in first place
   * @return void
   */
  private def playCard(): Unit ={

  }
  /**
   * use this when you take a card from the deck of cards
   * @return void
   */
  private def takeCard(): Unit = {
  }


}





