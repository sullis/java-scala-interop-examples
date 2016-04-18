package example

import org.scalatest.{ShouldMatchers, FlatSpec}
import java.util.{ArrayList => JArrayList, List => JList}
import scala.collection.JavaConverters._

class CollectionTest extends FlatSpec with ShouldMatchers {

  "java.util.ArrayList" should "convert to scala List" in {
    val jArrayList = new JArrayList[String]()
    jArrayList.add("a")
    jArrayList.add("b")
    jArrayList.add("c")

    val scalaList = jArrayList.asScala
    scalaList should be (List("a", "b", "c"))
  }

  "scala List" should "convert to Java List" in {
    val scalaList = List("a", "b", "c")
    val javaList = scalaList.asJava
    javaList.isInstanceOf[JList[String]] should be (true)
  }

  "Java method with varargs" should "work" in {
    val names = Array("Barack", "George", "Bill")
    val foo = new Foo()
    // foo.setNamesVarArg(
  }
}
