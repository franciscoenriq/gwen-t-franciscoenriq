package cl.uchile.dcc
package gwent.battlefield
import cl.uchile.dcc.gwent.cards.{AsedioCard, Cards, ClimateCard, CuerpoACuerpoCard, DistanceCard}
import scala.collection.mutable.ArrayBuffer

/**
 * clase tablero , en la cual se jugará el juego, contiene variables las cuales represetaran las distintas
 * partes del campo de juego.
 * por el momento esta es la unica clase que se usa con las variables publicas
 * de esta manera es mas facil acceder a las variables dado que se hace doubleDispacth
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
