package cl.uchile.dcc
package gwent.cards
import gwent.player.playerMethods
/**
 * trait para determinar que tiene que tener una carta para poder ser jugada dentro del juego 
 */
trait Cards {
  /**
   * siguiendo la linea del doubleDispatch es necesario que cada carta le diga a cada jugador 
   * que carta se está colocando en el tablero . 
   * De esta manera como cada carta sabe cual es su tipo , esta va llamando a los difernetes metodos 
   * dependiendo de su tipo , de esta manera se termina usando cosas del estilo , 
   * jugador.jugarCartaEnAsedio(this) 
   * @param jugador: la carta debe saber a que jugador nos estamos refiriendo para llamar al un metodo 
   * como el descrito anteriormente , por este motivo jugador puede ser tal que cumpla el trait playerMethods.
   */
  def play(jugador:playerMethods):Unit={}
}
