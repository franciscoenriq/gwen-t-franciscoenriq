package cl.uchile.dcc
package gwent.player

import gwent.cards.Card

class CpuPlayer(  name: String,  gemCount: Int = 2,
                 deckOfCards:Card, override val handOfCards:Card) extends AbstractPlayer(name, gemCount, deckOfCards, handOfCards) {



}
