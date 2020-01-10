object scala01_var {
  def main(args: Array[String]): Unit = {
    var a : String = "1"
    a = "2"
//    val 声明的值无法改变，var声明的值可改变
    val b:String = "1"
    var f3 = f2()
    println(f3)
  }

  def f1(): Int ={
    1
  }

  def f2(): Unit ={
//    一定要加 _
    f1 _
  }
  // 纯函数
  def sum( num1:Int, num2:Int ) {
    num1 + num2
  }
  // 非纯函数
  var num1 = 10; // 函数外变量
  def sum( num2:Int ) {
    num1 + num2
  }

}
