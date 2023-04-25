package cl.uchile.dcc
import cl.uchile.dcc.gwent.cards.AbstractCard
import cl.uchile.dcc.gwent.player.{CpuPlayer, UserPlayer}
import munit.FunSuite

import scala.collection.mutable.ArrayBuffer

class UserPlayerTest extends FunSuite{
  val mazo: ArrayBuffer[AbstractCard] = ArrayBuffer[AbstractCard]()
  val handOfCards: ArrayBuffer[AbstractCard] = ArrayBuffer[AbstractCard]()
  val player1: UserPlayer = new UserPlayer("han solo", 2, mazo, handOfCards)
  override def beforeEach(context: BeforeEach): Unit = {
    val mazo: ArrayBuffer[AbstractCard] = ArrayBuffer[AbstractCard]()
    val handOfCards: ArrayBuffer[AbstractCard] = ArrayBuffer[AbstractCard]()
    val player1: UserPlayer = new UserPlayer("han solo", 2, mazo, handOfCards)
  }
  test("testeasmos el equals") {
    val player1: UserPlayer = new UserPlayer("han solo", 2, mazo, handOfCards)
    val player2: CpuPlayer = new CpuPlayer("han solo", 2, mazo, handOfCards)
    assertEquals(player1.equals(player2), false)
    assertEquals(player1.equals(player1), true)
  }
  test("toString"){
    val player1: UserPlayer = new UserPlayer("han solo", 2, mazo, handOfCards)
    assertEquals(player1.toString(),"UserPlayer(name=han solo,gemCount=2,deckOfCards=mazo,handOfCards=handOfCards)")
  }
}
