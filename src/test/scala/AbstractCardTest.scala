package cl.uchile.dcc
import cl.uchile.dcc.gwent.cards.{AbstractCard, AsedioCard, Cards, ClimateCard, CuerpoACuerpoCard, DistanceCard}
import cl.uchile.dcc.gwent.player.UserPlayer
import munit.FunSuite

import scala.collection.mutable.ArrayBuffer
class AbstractCardTest extends FunSuite{
  val mazo: ArrayBuffer[Cards] = ArrayBuffer[Cards]()
  val handOfCards: ArrayBuffer[Cards] = ArrayBuffer[Cards]()
  override def beforeEach(context: BeforeEach): Unit = {
    //val mazo: ArrayBuffer[AbstractCard] = ArrayBuffer[AbstractCard]()
  }
  test("getter"){
    val cartaDeDistancia: DistanceCard=new DistanceCard("carta",23)
    assertEquals(cartaDeDistancia.getName(),"carta")
    assertEquals(cartaDeDistancia.getForce(),23)
  }
  test( "toString distanciaCard"){
    val name: String = "distancia"
    val diaLluvia:ClimateCard = new ClimateCard("dialluvioso")
    val force: Int = 12
    val distanciaCarta: DistanceCard = new DistanceCard("distancia", 12)
    assertEquals(distanciaCarta.toString(), s"DistanceCard(name=$name,force=$force)")
    assertEquals(distanciaCarta.equals(diaLluvia),false)
  }
  test("toString asedioCarta"){
    val diaLluvia:ClimateCard = new ClimateCard("dialluvioso")
    val name: String = "asedio"
    val force: Int = 12
    val asedioCarta: AsedioCard = new AsedioCard("asedio", 12)
    assertEquals(asedioCarta.toString(), s"SiegeZone(name=$name,force=$force)")
    assertEquals(asedioCarta.equals(diaLluvia),false)
  }
  test("toString cuerpoAcuerpoCarta"){
    val diaLluvia:ClimateCard = new ClimateCard("dialluvioso")
    val name: String = "cuerpo"
    val force: Int = 14
    val cuerpoCarta: CuerpoACuerpoCard = new CuerpoACuerpoCard("cuerpo", 14)
    assertEquals(cuerpoCarta.toString(), s"HandToHandCard(name=$name,force=$force)")
    assertEquals(cuerpoCarta.equals(diaLluvia),false)
  }
  test("toString ClimaCards"){
    val name :String = "dialluvioso"
    val diaLluvia:ClimateCard = new ClimateCard("dialluvioso")
    val diaLluvia1:ClimateCard = new ClimateCard("dialluvioso1")
    val cuerpoCarta: CuerpoACuerpoCard = new CuerpoACuerpoCard("cuerpo", 14)
    assertEquals(diaLluvia.toString(),s"ClimateCard(name=$name)")
    assertEquals(diaLluvia.equals(cuerpoCarta),false)
  }

}
