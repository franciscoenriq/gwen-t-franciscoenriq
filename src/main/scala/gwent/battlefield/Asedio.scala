package cl.uchile.dcc
package gwent.battlefield

import cl.uchile.dcc.gwent.cards.{AbstractCard, AsedioCard}

import scala.collection.mutable.ArrayBuffer

class Asedio(AsedioCards:ArrayBuffer[AsedioCard]) extends AbstractTable() {
  def setAsedio(a:AsedioCard): Unit = {
    AsedioCards.append(a)
  }
}
