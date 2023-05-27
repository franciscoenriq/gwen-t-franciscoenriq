package cl.uchile.dcc
import cl.uchile.dcc.gwent.battlefield.{AbstractTable, Clima, Tablero}
import cl.uchile.dcc.gwent.cards.{AbstractCard, ClimateCard}
import cl.uchile.dcc.gwent.player.{CpuPlayer, UserPlayer}
import munit.FunSuite

import scala.collection.mutable.ArrayBuffer

class UserPlayerTest extends FunSuite{
  val mazo: ArrayBuffer[AbstractCard] = ArrayBuffer[AbstractCard]()
  val handOfCards: ArrayBuffer[AbstractCard] = ArrayBuffer[AbstractCard]()
  val tablero:Tablero = new Tablero()
  val player1: UserPlayer = new UserPlayer("han solo", 2, mazo, handOfCards,tablero)
  val diaLluvioso: ClimateCard = new ClimateCard("Día Lluvioso")
  override def beforeEach(context: BeforeEach): Unit = {

    mazo.append(diaLluvioso)
    val player1: UserPlayer = new UserPlayer("han solo", 2, mazo, handOfCards,tablero)
  }
  test("testeasmos el equals") {
    val player1: UserPlayer = new UserPlayer("han solo", 2, mazo, handOfCards,tablero)
    val player2: CpuPlayer = new CpuPlayer("han solo", 2, mazo, handOfCards,tablero)
    assertEquals(player1.equals(player2), false)
    assertEquals(player1.equals(player1), true)
  }
  test("toString"){
    val player1: UserPlayer = new UserPlayer("han solo", 2, mazo, handOfCards,tablero)
    assertEquals(player1.toString(),"UserPlayer(name=han solo,gemCount=2,deckOfCards=mazo,handOfCards=handOfCards)")
  }
  test("añadir carta a la mano"){
    player1.takeCard()
    assertEquals(player1.getHandOfCards()(0),diaLluvioso)
  }
  test("jugamos una carta"){
    player1.playCard(0)
    assertEquals(player1)
  }

}
