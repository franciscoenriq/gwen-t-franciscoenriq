package cl.uchile.dcc
package gwent.player
import gwent.cards.{AbstractCard, AsedioCard, ClimateCard, CuerpoACuerpoCard, DistanceCard}
import gwent.cards.Cards
import scala.collection.mutable.ArrayBuffer
/**
 * metodos que tiene que usar cualquier jugador para poder jugar este juego
 * Estan pensados dentro de la idea de realizar double dispatcth
 */
trait playerMethods {
  /**
   * takeCard nos sirve para tomar una carta del mazo y colocarla en nuestra mano.
   */
  def takeCard():Unit
  /**
   * Los siguientes metodos son necesarios para implementar la accion de jugar una carta por parte de
   * algun jugador, ya sea un userPlayer o un cpuPlayer.
   * Al unico metodo que, en este caso tendría acceso el usuario final sería playCard , ya que los demas
   * se usan de manera interna entre clases para realizar el double dispatch
   * Los metodos empezados por "jugarCartaEn " son llamados a traves de un metodo alojado en alguna de las cartas.
   * jugarCartaEnClima y playCard estan implementados en AbstractPlayer ya que son comunes para ambos jugadores
   * Ambos jugadores comparten el mismo espacio para dejar cartas de clima.
   * A diferencia del resto de metodos que son diferentes para ambos jugadores , tienen que llamar a partes
   * deferentes del tablero.
   * @param i:representa la posicion de la carta que queremos jugar desde nuestra mano , que al fin de
   * cuentas es un arreglo.
   */
  def playCard(i:Int):Unit
  /**
   * @param a: representa el tipo de carta nesesaria para jugar en cada parte del mapa.
   */
  def jugarCartaEnAsedio(a: AsedioCard): Unit
  def jugarCartaEnCuerpoCuerpo(a: CuerpoACuerpoCard): Unit
  def jugarCartaEnDistancia(a: DistanceCard): Unit
  def jugarCartaEnClima(a: ClimateCard): Unit
  def getDeckOfCards(): ArrayBuffer[Cards] 

  def getHandOfCards(): ArrayBuffer[Cards] 
  def setDeckOfCards(deck:ArrayBuffer[Cards]):Unit
}
