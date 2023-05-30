package cl.uchile.dcc
package gwent.player
import cl.uchile.dcc.gwent.battlefield.Tablero
import cl.uchile.dcc.gwent.cards.{AbstractCard, AsedioCard, Cards, ClimateCard, CuerpoACuerpoCard, DistanceCard}

import scala.collection.mutable.ArrayBuffer


class UserPlayer( override val name: String, var gemCount: Int, var deckOfCards:ArrayBuffer[Cards],
                
                 var handOfCards:ArrayBuffer[Cards],var tablero:Tablero) extends AbstractPlayer(name, gemCount, deckOfCards, handOfCards,tablero){

  def jugarCartaEnAsedio(a: AsedioCard): Unit = {
    this.tablero.asedioJugador.setAsedio(a)
  }
  def jugarCartaEnCuerpoCuerpo(a: CuerpoACuerpoCard): Unit = {
    this.tablero.cuerpoACuerpoJugador.setCuerpoCuerpo(a)
  }

  def jugarCartaEnDistancia(a: DistanceCard): Unit = {
    this.tablero.distanciaJugador.setDistancia(a)
  }


  override def equals(obj: Any): Boolean = {
    if (this.getClass().getName == obj.getClass.getName) {
      val otherCpuPlayer = obj.asInstanceOf[UserPlayer]
      this.name == otherCpuPlayer.name
    } else false
  }


  override def toString = s"UserPlayer(name=$name,age=$gemCount,deckOfCards=$deckOfCards,handOfCards=$handOfCards)"
}





