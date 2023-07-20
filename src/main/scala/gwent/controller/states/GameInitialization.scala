package cl.uchile.dcc
package gwent.controller.states

import gwent.cards.{Cards, ClimateCard}
import gwent.controller.GameController
import gwent.controller.factoria.{AsedioFactory, CardFactory, CuerpoCuerpoFactory, DistanceCardFactory, climateCardFactory}
import gwent.controller.states.AbstractState

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
        setFactory(new AsedioFactory())
        for (i <- 1 to 5) {
            context.getJugador1().getDeckOfCards().append(cardFactory.create())
            context.getJugador2Cpu().getDeckOfCards().append(cardFactory.create())
        }
        /**
         * revolvemos los mazos 
         */
        context.getJugador1().setDeckOfCards(Random.shuffle(context.getJugador1().getDeckOfCards()))
        context.getJugador2Cpu().setDeckOfCards(context.getJugador2Cpu().getDeckOfCards())
        
        context.setState(new PlayerInit(context))
        
    }
}
