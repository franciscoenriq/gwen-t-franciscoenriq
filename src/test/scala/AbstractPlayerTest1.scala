package cl.uchile.dcc

import cl.uchile.dcc.gwent.battlefield.Tablero
import cl.uchile.dcc.gwent.cards.{AbstractCard, Cards, DistanceCard}
import cl.uchile.dcc.gwent.player.UserPlayer
import munit.FunSuite

import scala.collection.mutable.ArrayBuffer

class AbstractPlayerTest1 extends FunSuite{
  val mazo: ArrayBuffer[Cards] = ArrayBuffer[Cards]()
  val handOfCards: ArrayBuffer[Cards] = ArrayBuffer[Cards]()
  val tablero: Tablero = new Tablero()
  val player1: UserPlayer = new UserPlayer("hanSolo", 2, mazo, handOfCards, tablero)

  override def beforeEach(context: BeforeEach): Unit = {
    // val player1: UserPlayer =  new UserPlayer("hanSolo",2,mazo,handOfCards, tablero)
  }

  test("se deberian iniciar de buena manera todas los parametros del jugador") {
    assertEquals(player1.getName(), "hanSolo")
    assertEquals(player1.getGemCount(), 2)
    assertEquals(player1.getDeckOfCards(), mazo)
    assertEquals(player1.getHandOfCards(), handOfCards)
  }
  test("setters tests") {
    val player1: UserPlayer = new UserPlayer("han solo", 2, mazo, handOfCards, tablero)
    val a: Int = 1
    val cartaPrueba: DistanceCard = new DistanceCard("carta1", 4)
    val myArrayBuffer = ArrayBuffer[AbstractCard]()
    myArrayBuffer.append(cartaPrueba)

    //-------------------------------------------------
    player1.setGemCount(a)
    assertEquals(player1.getGemCount(), 1)
    //-------------------------------------------------
    player1.setHandOfCards(cartaPrueba)
    assertEquals(player1.getHandOfCards()(0), myArrayBuffer(0))
  }
  test("takeCard test") {
    val cartaPrueba: DistanceCard = new DistanceCard("carta1", 4)
    val cartaPrueba1: DistanceCard = new DistanceCard("carta1", 4)
    val cartaPrueba2: DistanceCard = new DistanceCard("carta1", 4)
    mazo.append(cartaPrueba1)
    mazo.append(cartaPrueba2)
    mazo.append(cartaPrueba)


    assertEquals((player1.getHandOfCards())(0), cartaPrueba)
    //assertEquals((player1.getHandOfCards())(1), cartaPrueba1)
    //assertEquals((player1.getHandOfCards())(2), cartaPrueba2)
  }
}

