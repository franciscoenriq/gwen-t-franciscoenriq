package cl.uchile.dcc
import cl.uchile.dcc.gwent.cards.{AbstractCard, DistanceCard}
import cl.uchile.dcc.gwent.player.UserPlayer
import munit.FunSuite

import scala.collection.mutable.ArrayBuffer
class AbstractPlayerTest extends FunSuite  {
  val mazo: ArrayBuffer[AbstractCard] = ArrayBuffer[AbstractCard]()
  val handOfCards:ArrayBuffer[AbstractCard] = ArrayBuffer[AbstractCard]()
  val player1: UserPlayer = null

  ArrayBuffer[AbstractCard]

  override def beforeEach(context: BeforeEach): Unit = {
    val mazo: ArrayBuffer[AbstractCard] = ArrayBuffer[AbstractCard]()
    val handOfCards:ArrayBuffer[AbstractCard] = ArrayBuffer[AbstractCard]()
    val player1: UserPlayer = new UserPlayer("han solo",2,mazo,handOfCards)
  }

  test("se deberian iniciar de buena manera todas los parametros del jugador") {
    val player1: UserPlayer = new UserPlayer("han solo",2,mazo,handOfCards)
    assertEquals(player1.getName(), "hanSolo")
    assertEquals(player1.getGemCount(), 2)
    assertEquals(player1.getDeckOfCards(), mazo)
    assertEquals(player1.getHandOfCards(), handOfCards)
  }
  test("setters tests"){
    val player1: UserPlayer = new UserPlayer("han solo",2,mazo,handOfCards)
    val a:Int = 1
    val cartaPrueba:DistanceCard = new DistanceCard("carta1",4)
    val myArrayBuffer = ArrayBuffer[AbstractCard]()
    myArrayBuffer.append(cartaPrueba)
    assertEquals(player1.setGemCount(1),1)
    assertEquals(player1.setHandOfCards(cartaPrueba),myArrayBuffer)
  }
  test("takeCard test"){
    val player1: UserPlayer = new UserPlayer("han solo",2,mazo,handOfCards)
    val cartaPrueba:DistanceCard = new DistanceCard("carta1",4)
    val cartaPrueba1:DistanceCard = new DistanceCard("carta1",4)
    val cartaPrueba2:DistanceCard = new DistanceCard("carta1",4)
    mazo.append(cartaPrueba1)
    mazo.append(cartaPrueba2)
    mazo.append(cartaPrueba)
    val myArrayBuffer = ArrayBuffer[AbstractCard]()
    myArrayBuffer.append(cartaPrueba1)
    assertEquals((player1.getHandOfCards()),myArrayBuffer)
  }
  test("playCard"){
    val cartaPrueba:DistanceCard = new DistanceCard("carta1",4)
    player1.setHandOfCards(cartaPrueba)
    assertEquals(player1.playCard(0),cartaPrueba)
  }
}
