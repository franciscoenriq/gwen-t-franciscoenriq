package cl.uchile.dcc
package gwent.player
import cl.uchile.dcc.gwent.battlefield.Tablero
import cl.uchile.dcc.gwent.cards.{AbstractCard, AsedioCard, Cards, ClimateCard, CuerpoACuerpoCard, DistanceCard}
import cl.uchile.dcc

import scala.collection.mutable.ArrayBuffer


class UserPlayer( name: String,  gemCount: Int,  deckOfCards:ArrayBuffer[Cards],
                
                  handOfCards:ArrayBuffer[Cards], tablero:Tablero) extends AbstractPlayer(name, gemCount, deckOfCards, handOfCards, tablero){

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





