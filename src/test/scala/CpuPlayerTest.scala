package cl.uchile.dcc
import cl.uchile.dcc.gwent.battlefield.Tablero
import cl.uchile.dcc.gwent.cards.{AbstractCard, Cards, DistanceCard}
import cl.uchile.dcc.gwent.player.{CpuPlayer, UserPlayer}
import munit.FunSuite

import scala.collection.mutable.ArrayBuffer
class CpuPlayerTest extends FunSuite{
  val name: String = "han solo"
  var gemCount:Int = 2
  var deckOfCards: ArrayBuffer[Cards] = ArrayBuffer[Cards]()
  var handOfCards: ArrayBuffer[Cards] = ArrayBuffer[Cards]()
  var tablero: Tablero = new Tablero()
  var player1: CpuPlayer = new CpuPlayer("han solo", 2, deckOfCards, handOfCards,tablero)

  override def beforeEach(context: BeforeEach): Unit = {
    //val player1: CpuPlayer = new CpuPlayer("han solo", 2, mazo, handOfCards)

  }
  test("testeasmos el equals"){
    val mazo1: ArrayBuffer[Cards] = ArrayBuffer[Cards]()
    val handOfCards1: ArrayBuffer[Cards] = ArrayBuffer[Cards]()
    val player2:UserPlayer = new UserPlayer("han solo",2,mazo1,handOfCards1,tablero)
    assertEquals(player1.equals(player2),false)
    assertEquals(player1.equals(player1),true)
  }
  test("toString") {
    assertEquals(player1.toString(), s"CpuPlayer(name=$name,gemCount=$gemCount,deckOfCards=$deckOfCards,handOfCards=$handOfCards)")
  }
}
