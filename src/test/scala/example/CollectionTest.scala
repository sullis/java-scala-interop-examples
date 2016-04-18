package example

import org.scalatest.{ShouldMatchers, FlatSpec}
import java.util.{ArrayList => JArrayList, List => JList, HashMap => JHashMap, Map => JMap}
import scala.collection.JavaConverters._

class CollectionTest extends FlatSpec with ShouldMatchers {

  "java.util.ArrayList" should "convert to Scala List" in {
    val jArrayList = new JArrayList[String]
    jArrayList.add("a")
    jArrayList.add("b")
    jArrayList.add("c")

    val scalaList = jArrayList.asScala

    scalaList should be (List("a", "b", "c"))
  }

  "scala List" should "convert to java.util.List" in {
    val scalaList = List("a", "b", "c")
    val javaList = scalaList.asJava
    javaList.isInstanceOf[JList[String]] should be (true)
  }

  "java.util.HashMap" should "convert to Scala Map" in {
    val jMap = new JHashMap[String, String]
    jMap.put("Oregon", "hazelnuts")
    jMap.put("California", "avocados")

    val scalaMap = jMap.asScala

    scalaMap.get("Oregon") should be (Some("hazelnuts"))
    scalaMap.get("California") should be (Some("avocados"))
  }

  "Java method with varargs" should "work" in {
    val names = Array("Barack", "George", "Bill")
    val foo = new Foo()
    // foo.setNamesVarArg(
  }
}
