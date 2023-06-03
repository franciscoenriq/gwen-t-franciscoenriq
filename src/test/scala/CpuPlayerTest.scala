package cl.uchile.dcc
import cl.uchile.dcc.gwent.battlefield.Tablero
import cl.uchile.dcc.gwent.cards.{AbstractCard, AsedioCard, Cards, CuerpoACuerpoCard, DistanceCard}
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
  test("doubleDispatch") {
    val distanciaCarta: DistanceCard = new DistanceCard("distancia", 12)
    val asedioCarta: AsedioCard = new AsedioCard("asedio", 12)
    val cuerpoCarta: CuerpoACuerpoCard = new CuerpoACuerpoCard("cuerpo", 14)
    //---------------------------------------
    deckOfCards.append(distanciaCarta)
    player1.takeCard()
    assertEquals( handOfCards(0),distanciaCarta)
    player1.playCard(0)
    assertEquals(tablero.distanciaCpu.getCartasDistancia(0),distanciaCarta)
    //---------------------------------------
    deckOfCards.append(asedioCarta)
    player1.takeCard()
    player1.playCard(0)
    assertEquals(tablero.asedioCpu.getCardFromAsedioTable(0), asedioCarta)
    //---------------------------------------
    deckOfCards.append(cuerpoCarta)
    player1.takeCard()
    player1.playCard(0)
    assertEquals(tablero.cuerpoACuerpoCpu.getCardFromCuerpoCuerpoTable(0), cuerpoCarta)
  }
}
