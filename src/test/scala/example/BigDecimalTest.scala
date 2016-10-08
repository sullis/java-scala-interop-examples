
package example

import org.scalatest.{Matchers, FlatSpec}
import java.math.{BigDecimal => JBigDecimal}

class BigDecimalTest extends FlatSpec with Matchers {

  "scala.BigDecimal" should "have an underlying java.math.BigDecimal" in {
    val jPrice = new JBigDecimal("49.99")
    val price = BigDecimal(jPrice)
    val underlyingJavaBigDecimal = price.underlying
    underlyingJavaBigDecimal.toString should be ("49.99")
  }
}
