package cl.uchile.dcc
package gwent.battlefield

import cl.uchile.dcc.gwent.cards.ClimateCard

import scala.collection.mutable.ArrayBuffer

class Clima(private var climaCards:ArrayBuffer[ClimateCard])  {
  def setClima(a: ClimateCard): Unit = {
    climaCards.append(a)
  }
    def getCardFromClimaTable(n:Int):ClimateCard ={
     climaCards(n)
  }
}
