package cl.uchile.dcc
import cl.uchile.dcc.gwent.battlefield.{AbstractTable, Clima, Tablero}
import cl.uchile.dcc.gwent.cards.{AbstractCard, Cards, ClimateCard, DistanceCard}
import cl.uchile.dcc.gwent.player.{CpuPlayer, UserPlayer}
import munit.FunSuite

import scala.collection.mutable.ArrayBuffer

class UserPlayerTest extends FunSuite{
  val name: String = "han solo"
  var gemCount:Int = 2
  var deckOfCards: ArrayBuffer[Cards] = ArrayBuffer[Cards]()
  var handOfCards: ArrayBuffer[Cards] = ArrayBuffer[Cards]()
  var tablero:Tablero = new Tablero()
  var player1: UserPlayer = new UserPlayer("han solo", 2, deckOfCards, handOfCards,tablero)
  var diaLluvioso: ClimateCard = new ClimateCard("Día Lluvioso")

  override def beforeEach(context: BeforeEach): Unit = {
    deckOfCards.append(diaLluvioso)
    //val player1: UserPlayer = new UserPlayer("han solo", 2, mazo, handOfCards,tablero)
  }
  test("testeasmos el equals") {
    val mazo1: ArrayBuffer[Cards] = ArrayBuffer[Cards]()
    val handOfCards1: ArrayBuffer[Cards] = ArrayBuffer[Cards]()
    val player2: CpuPlayer = new CpuPlayer("han solo", 2, mazo1, handOfCards1,tablero)
    assertEquals(player1.equals(player2), false)
    assertEquals(player1.equals(player1), true)
  }
  test("toString"){
    assertEquals(player1.toString(), s"UserPlayer(name=$name,age=$gemCount,deckOfCards=$deckOfCards,handOfCards=$handOfCards)")
  }
  test("añadir carta a la mano"){
    player1.takeCard()
    assertEquals(player1.getHandOfCards()(0),diaLluvioso)
  }
  test("provemos doubleDispatch"){
    val carta:DistanceCard = new DistanceCard("distancia",23)
    player1.deckOfCards.append(carta)
    player1.takeCard()
    player1.playCard(0)
    assertEquals(tablero.distanciaJugador.getCartasDistancia(0),carta)
  }
}
