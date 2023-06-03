package cl.uchile.dcc
import cl.uchile.dcc.gwent.battlefield.{Clima, CuerpoCuerpo, Tablero}
import cl.uchile.dcc.gwent.cards.{AbstractCard, AsedioCard, Cards, ClimateCard, CuerpoACuerpoCard, DistanceCard}
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
    //deckOfCards.append(diaLluvioso)
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
    deckOfCards.append(diaLluvioso)
    player1.takeCard()
    assertEquals(player1.getHandOfCards()(0),diaLluvioso)
  }
  test("ayuda"){
    deckOfCards.append(diaLluvioso)
    val carta:ClimateCard = new ClimateCard("dialluvioso")
    tablero.clima.setClima(carta)
    assertEquals(tablero.clima.getCardFromClimaTable(0),carta)
    player1.takeCard()
    player1.playCard(0)
    assertEquals(tablero.clima.getCardFromClimaTable(1),diaLluvioso)
  }
  test("probamos el tablero"){
    val distanciaCarta:DistanceCard = new DistanceCard("distancia",12)
    val asedioCarta :AsedioCard = new AsedioCard("asedio",12)
    val cuerpoCarta:CuerpoACuerpoCard = new CuerpoACuerpoCard("cuerpo",14)
    //-------------------------------------------------------
    tablero.distanciaJugador.setDistancia(distanciaCarta)
    assertEquals(tablero.distanciaJugador.getCartasDistancia(0),distanciaCarta)
    //-------------------------------------------------------
    tablero.asedioJugador.setAsedio(asedioCarta)
    assertEquals(tablero.asedioJugador.getCardFromAsedioTable(0),asedioCarta)
    //-------------------------------------------------------
    tablero.cuerpoACuerpoJugador.setCuerpoCuerpo(cuerpoCarta)
    assertEquals(tablero.cuerpoACuerpoJugador.getCardFromCuerpoCuerpoTable(0),cuerpoCarta)
  }
  test("doubleDispatch"){
    val distanciaCarta: DistanceCard = new DistanceCard("distancia", 12)
    val asedioCarta: AsedioCard = new AsedioCard("asedio", 12)
    val cuerpoCarta: CuerpoACuerpoCard = new CuerpoACuerpoCard("cuerpo", 14)
    //---------------------------------------
    deckOfCards.append(distanciaCarta)
    player1.takeCard()
    player1.playCard(0)
    assertEquals(tablero.distanciaJugador.getCartasDistancia(0),distanciaCarta)
    //---------------------------------------
    deckOfCards.append(asedioCarta)
    player1.takeCard()
    player1.playCard(0)
    assertEquals(tablero.asedioJugador.getCardFromAsedioTable(0), asedioCarta)
    //---------------------------------------
    deckOfCards.append(cuerpoCarta)
    player1.takeCard()
    player1.playCard(0)
    assertEquals(tablero.cuerpoACuerpoJugador.getCardFromCuerpoCuerpoTable(0), cuerpoCarta)
  }
}
