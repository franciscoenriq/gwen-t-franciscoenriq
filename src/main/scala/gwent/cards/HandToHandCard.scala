package cl.uchile.dcc
package gwent.cards

class HandToHandCard(private val name: String,private val force:Int) extends AbstractUnitCard(name,force) {

  override def toString = s"HandToHandCard()"
  override def equals(obj: Any): Boolean = {
    if (this.getClass().getName == obj.getClass.getName) {
      val otherCpuPlayer = obj.asInstanceOf[HandToHandCard]
      this.name == otherCpuPlayer.name
    } else false
  }
}
