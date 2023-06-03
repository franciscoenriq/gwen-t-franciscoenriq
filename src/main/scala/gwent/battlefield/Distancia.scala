package cl.uchile.dcc
package gwent.battlefield

import cl.uchile.dcc.gwent.cards.DistanceCard

import scala.collection.mutable.ArrayBuffer

class Distancia(private var distanceCard:ArrayBuffer[DistanceCard])  {
  def setDistancia(a: DistanceCard): Unit = {
    distanceCard.append(a)
  }
  def getCartasDistancia(i:Int):DistanceCard = {
    distanceCard(i)
  }
}
