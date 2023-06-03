package cl.uchile.dcc
package gwent.player
import gwent.cards.{AbstractCard, AsedioCard, Cards, ClimateCard, CuerpoACuerpoCard, DistanceCard}

import cl.uchile.dcc.gwent.battlefield.Tablero

import scala.collection.mutable.ArrayBuffer


class CpuPlayer(private val name: String,private var gemCount: Int = 2,
                private var deckOfCards:ArrayBuffer[Cards],private var handOfCards:ArrayBuffer[Cards],private var tablero:Tablero) extends AbstractPlayer(name, gemCount, deckOfCards,handOfCards,tablero ) {
  def jugarCartaEnAsedio(a: AsedioCard): Unit = {
    this.tablero.asedioCpu.setAsedio(a)
  }
  def jugarCartaEnCuerpoCuerpo(a: CuerpoACuerpoCard): Unit = {
    this.tablero.cuerpoACuerpoCpu.setCuerpoCuerpo(a)
  }
  def jugarCartaEnDistancia(a: DistanceCard): Unit = {
    this.tablero.distanciaCpu.setDistancia(a)
  }
    override def equals(obj: Any): Boolean = {
      if(this.getClass().getName == obj.getClass.getName){
        val otherCpuPlayer = obj.asInstanceOf[CpuPlayer]
         this.name == otherCpuPlayer.name
      }else false
    }
  override def toString = s"CpuPlayer(name=$name,gemCount=$gemCount,deckOfCards=$deckOfCards,handOfCards=$handOfCards)"


}

