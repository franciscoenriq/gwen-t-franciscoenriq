package cl.uchile.dcc
package gwent.controller

import gwent.cards.Cards
import gwent.cards.ClimateCard

import cl.uchile.dcc.gwent.controller.factoria.{CardFactory, CuerpoCuerpoFactory, DistanceCardFactory, climateCardFactory}
import  cl.uchile.dcc.gwent.controller.GameController
import scala.util.Random
class GameInitialization(private var context: GameController) extends AbstractState(context) {
    

    private var cardFactory: CardFactory = null

    def setFactory(i: CardFactory): Unit = {
        cardFactory = i
    }
    override def init(): Unit = {
        
        setFactory(new climateCardFactory())
        for( i <- 1 to 10){
            context.getJugador1().getDeckOfCards().append(cardFactory.create())
            context.getJugador2Cpu().getDeckOfCards().append(cardFactory.create())
        }
        setFactory(new CuerpoCuerpoFactory())
        for( i <- 1 to 5 ){
            context.getJugador1().getDeckOfCards().append(cardFactory.create())
            context.getJugador2Cpu().getDeckOfCards().append(cardFactory.create())
        }
        setFactory(new DistanceCardFactory())
        for (i <- 1 to 5) {
            context.getJugador1().getDeckOfCards().append(cardFactory.create())
            context.getJugador2Cpu().getDeckOfCards().append(cardFactory.create())
        }
        setFactory(new CuerpoCuerpoFactory())
        for (i <- 1 to 5) {
            context.getJugador1().getDeckOfCards().append(cardFactory.create())
            context.getJugador2Cpu().getDeckOfCards().append(cardFactory.create())
        }
        
        Random.shuffle(context.getJugador1().getDeckOfCards())
        Random.shuffle(context.getJugador2Cpu().getDeckOfCards())

    }
}
