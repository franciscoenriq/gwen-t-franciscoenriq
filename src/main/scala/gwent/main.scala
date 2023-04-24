package cl.uchile.dcc
package gwent
import cl.uchile.dcc.gwent.battlefield.Board
import cl.uchile.dcc.gwent.cards.Card
import cl.uchile.dcc.gwent.player.Player


@main
def main(): Unit = {
  val carta:Card = new Card()
  val mazo: Card = new Card()
  val tablero:Board = new Board()
  val player1:Player= new Player("chubaca",tablero,2,carta,mazo)


}