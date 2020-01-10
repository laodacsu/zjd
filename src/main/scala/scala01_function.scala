object scala01_function {
  def main(args: Array[String]): Unit = {
//    无参数列表，小括号可省略
    printMsg
    print("result = "+sum(1,2))
  }

  def printMsg() = {
    println("函数声明")
  }

  def printMsg2(): Unit ={
    print(
      1
    )
  }

  //    加Unit即便有return也不会有返回值
//  返回为（）即代表无返回值
  def sum(v1:Int,v2:Int): Int ={
    return v1 + v2
  }

//  scala中函数的返回值可以不用return声明，函数会使用最后一行代码的结果来作为返回值
  def sum1(v1:Int,v2:Int) ={
//    return v1 + v2
//   方法返回值由scala自行推断出来
    v1 + v2
  }
}
