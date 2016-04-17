
package example

import org.scalatest.{ShouldMatchers, FlatSpec}

class BigDecimalTest extends FlatSpec with ShouldMatchers {

  "scala.BigDecimal" should "have a Java BigDecimal" {
    val scalaBigDecimal = BigDecimal(55.0)
  }
}