package cl.uchile.dcc
package gwent.battlefield

import cl.uchile.dcc.gwent.cards.CuerpoACuerpoCard

import scala.collection.mutable.ArrayBuffer

class CuerpoCuerpo(private var cuerpoCuerpoCards:ArrayBuffer[CuerpoACuerpoCard])  {
  def setCuerpoCuerpo(a: CuerpoACuerpoCard): Unit = {
    cuerpoCuerpoCards.append(a)
  }
  def getCardFromCuerpoCuerpoTable(n: Int): CuerpoACuerpoCard = {
    cuerpoCuerpoCards(n)
  }
}
