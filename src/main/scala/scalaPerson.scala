object scalaPerson {
  def main(args: Array[String]): Unit = {
//    print(1)
    val a:scalap2 = new scalap2()
    a.setName("laoda")
    print(a.getName())
    println(scalap2.sex)
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
//如果希望类中存在静态内容，可以使scala中特有的伴生对象
//伴生对象的名称应该和类名相同
//  从技术角度讲，scala还是没有静态的内容，只不过将伴生对象又生成了一个新的类，
object scalap2{
  var sex:Boolean = true
}
class scalaP3{
  private var name : String = _
//  默认的get，set方法为public
}