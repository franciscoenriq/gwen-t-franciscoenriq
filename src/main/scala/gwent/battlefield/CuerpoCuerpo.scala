package cl.uchile.dcc
package gwent.battlefield

import cl.uchile.dcc.gwent.cards.CuerpoACuerpoCard

import scala.collection.mutable.ArrayBuffer

class CuerpoCuerpo(cuerpoCuerpoCards:ArrayBuffer[CuerpoACuerpoCard]) extends AbstractTable {
  def setCuerpoCuerpo(a: CuerpoACuerpoCard): Unit = {
    cuerpoCuerpoCards.append(a)
  }
}
