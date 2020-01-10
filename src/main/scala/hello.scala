object hello {
//  Unit  =====  无返回值
  def main(args: Array[String]): Unit = {
    cout()
    println("hello2")
    hello.cout()
  }

  private def cout(): Unit = {
    println("test")
  }
}
