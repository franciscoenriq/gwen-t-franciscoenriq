package cl.uchile.dcc
package gwent.cards

class DistanceCard(private val name:String,private val force:Int) extends AbstractUnitCard(name,force){



  override def toString = s"DistanceCard()"
  override def equals(obj: Any): Boolean = {
    if (this.getClass().getName == obj.getClass.getName) {
      val otherCpuPlayer = obj.asInstanceOf[DistanceCard]
      this.name == otherCpuPlayer.name
    } else false
  }

}
