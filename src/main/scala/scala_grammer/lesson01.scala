package scala_grammer
import scala.math._
object lesson01 {
  def main(args: Array[String]): Unit = {
    print(sqrt(100))
    println()
    for(i <- 1 to 3){
      print(i + " ")
    }
    println()
    print("------------------")
    println()

    for(i <- 1 until 3) {
      print(i + " ")
    }
    println()

  }
//  实际上是方法，进行了简化
  def username = "zhangsan"
}
