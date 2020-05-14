object hello {
//  Unit  =====  无返回值
  def main(args: Array[String]): Unit = {
    cout()
    println("hello3")
    println("hello3")
    hello.cout()
  }

  private def cout(): Unit = {
    println("test")
  }
}
