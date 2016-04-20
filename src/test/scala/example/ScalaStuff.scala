package example

import scala.collection.JavaConverters._

object ScalaStuff {
  def listOfPersons = List(PersonCaseClass("a", "b", "c"), PersonCaseClass("d", "e", "f"))
  def listOfStrings: List[String] = List("Canada", "United States")
  def javaListOfStrings: java.util.List[String] = List("Canada", "United States").asJava
  def listOfIntegers: List[Int] = List(10, 20, 30)
  def setOfIntegers: Set[Int] = Set (1, 2, 3)
  def setOfStrings: List[String] = List("Sydney", "Melbourne")
  def foodieMap: Map[String, String] = Map("New York City" -> "Bagels", "Hawaii" -> "Pineapple")
}
