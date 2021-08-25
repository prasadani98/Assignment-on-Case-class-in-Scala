import scala.math.sqrt
import scala.math.pow
import scala.math.abs

object myapp extends App {
  val p1=Point(2,3)
  val p2=Point(5,3)

  val printInfo=(p:Point)=>p match {
    case Point(0,0)=>"Point Origin"
    case Point(_,0)=>"Point on x axis"
    case Point(0,_)=>"Point on y axis"
    case _ => println(p)
  }

  // Q1-Add two given points
  //println(p1+p2)

  //Q2-Move the point by given distance
  //val p3=p1.move(6,8)

  //Q3-Calculate the distance between two points
  //println(p2.distance(p1))

  //Q4-Invert a point
  //println(p1.invert())

}

case class Point(a:Int,b:Int){

  def x:Int=a
  def y:Int=b

  def +(p:Point):Point=Point(this.x+p.x,this.y+p.y)
  def move(dx:Int,dy:Int):Point=Point(this.x+dx,this.y+dy)
  def distance(p:Point):Double= abs(sqrt( pow(this.x-p.x,2) + pow(this.y-p.y,2)))
  def invert():Point= Point(this.y,this.x)
  override def toString:String="(" +x+ "," +y+ ")"

}
