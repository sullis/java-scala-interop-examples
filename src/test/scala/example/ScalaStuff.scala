package example

import scala.collection.JavaConverters._

object ScalaStuff {
  val listOfPersons = List(PersonCaseClass("a", "b", "c"), PersonCaseClass("d", "e", "f"))
  val listOfStrings: List[String] = List("Canada", "United States")
  val javaListOfStrings: java.util.List[String] = List("Canada", "United States").asJava
  val listOfIntegers: List[Int] = List(10, 20, 30)
  val setOfIntegers: Set[Int] = Set (1, 2, 3)
  val setOfStrings: List[String] = List("Sydney", "Melbourne")
  val foodieMap: Map[String, String] = Map("New York City" -> "Bagels", "Hawaii" -> "Pineapple")
}
