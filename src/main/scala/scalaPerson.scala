object scalaPerson {
  def main(args: Array[String]): Unit = {
//    print(1)
    val a:scalap2 = new scalap2()
    a.setName("laoda")
    print(a.getName())
  }
}

class scalap2{
//  若给属性设定null值，那么属性类型最好声明
  private var name : String = null
//  下划线给属性，等同于null
//  private var name : String = _


  def setName(name :String): Unit ={
      this.name = name
  }

  def getName():String = {
    return name
  }

}

class scalaP3{
  private var name : String = _
//  默认的get，set方法为public
}