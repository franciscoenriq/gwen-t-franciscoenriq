package cl.uchile.dcc
package gwent.cards

/**
 *
 * @param name
 * @param force
 */
abstract class AbstractUnitCard(private val name:String, private val force:Int) extends AbstractCard (name){
  def getForce():Int={
    this.force
  }

}
