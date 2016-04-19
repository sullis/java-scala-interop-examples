package example

object ScalaStuff {
  def listOfPersons = List(PersonCaseClass("a", "b", "c"), PersonCaseClass("d", "e", "f"))
  def listOfStrings: List[String] = List("Canada", "United States")
  def listOfIntegers: List[Int] = List(10, 20, 30)
  def setOfIntegers: Set[Int] = Set (1, 2, 3)
  def setOfStrings: List[String] = List("Sydney", "Melbourne")
  def foodieMap: Map[String, String] = Map("New York City" -> "Bagels", "Hawaii" -> "Pineapple")
}
