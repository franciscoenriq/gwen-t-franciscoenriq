package cl.uchile.dcc
package gwent.battlefield
import cl.uchile.dcc.gwent.cards.{AsedioCard, Cards, ClimateCard, CuerpoACuerpoCard, DistanceCard}
import scala.collection.mutable.ArrayBuffer

/**
 * clase tablero , en la cual se jugará el juego, contiene variables las cuales represetaran las distintas
 * partes del campo de juego.
 */
class Tablero(){
  val asedioJugador:Asedio = new Asedio(new ArrayBuffer[AsedioCard]())
  val cuerpoACuerpoJugador:CuerpoCuerpo = new CuerpoCuerpo(new ArrayBuffer[CuerpoACuerpoCard]())
  val distanciaJugador:Distancia = new Distancia(new ArrayBuffer[DistanceCard]())
  val asedioCpu:Asedio = new Asedio(new ArrayBuffer[AsedioCard]())
  val cuerpoACuerpoCpu:CuerpoCuerpo = new CuerpoCuerpo(new ArrayBuffer[CuerpoACuerpoCard]())
  val distanciaCpu:Distancia = new Distancia(new ArrayBuffer[DistanceCard]())
  val clima:Clima = new Clima(new ArrayBuffer[ClimateCard]())
  }
