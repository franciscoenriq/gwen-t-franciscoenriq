package cl.uchile.dcc
import cl.uchile.dcc.gwent.cards.{AbstractCard, Cards, DistanceCard}
import cl.uchile.dcc.gwent.player.UserPlayer
import munit.FunSuite

import scala.collection.mutable.ArrayBuffer
class AbstractCardTest extends FunSuite{
  val mazo: ArrayBuffer[Cards] = ArrayBuffer[Cards]()
  val handOfCards: ArrayBuffer[Cards] = ArrayBuffer[Cards]()
  override def beforeEach(context: BeforeEach): Unit = {
    val mazo: ArrayBuffer[AbstractCard] = ArrayBuffer[AbstractCard]()

  }

  test("getter"){
    val cartaDeDistancia: DistanceCard=new DistanceCard("carta",23)
    assertEquals(cartaDeDistancia.getName(),"carta")
    assertEquals(cartaDeDistancia.getForce(),23)
  }




}
