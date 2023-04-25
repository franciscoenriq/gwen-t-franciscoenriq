package cl.uchile.dcc
package gwent.cards

abstract class AbstractUnitCard(private val name:String, private val force:Int) extends AbstractCard (name){
  def getForce():Int={
    this.force
  }

}
