package cl.uchile.dcc
package test

import cl.uchile.dcc.gwent.battlefield.Board
import cl.uchile.dcc.gwent.cards.Card
import cl.uchile.dcc.gwent.player.Player

class playerTest extends FunSuite{
  val carta:Card = null
  val mazo:Card = null
  val tablero:Board = null
  val player1:Player = null

  override def beforeEach(context:BeforeEach):Unit={
    val carta: Card = new Card()
    val mazo: Card = new Card()
    val tablero: Board = new Board()
    val player1: Player = new Player("hanSolo", tablero, 2, carta, mazo)
  }
  test("se deberian iniciar de buena manera todas los parametros del jugador"){
    assertEquals(player1.name,"hanSolo")
    assertEquals(player1.gemCount,2)
    assertEquals(player1.sectionBoard,tablero)
    assertEquals(player1.deckOfCards,carta)
    assertEquals(player1.handOfCards,mazo)
  }




}
