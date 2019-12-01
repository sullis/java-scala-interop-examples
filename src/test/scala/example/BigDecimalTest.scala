
package example

import java.math.{BigDecimal => JBigDecimal}
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class BigDecimalTest extends AnyFlatSpec with Matchers {

  "scala.BigDecimal" should "have an underlying java.math.BigDecimal" in {
    val jPrice = new JBigDecimal("49.99")
    val price = BigDecimal(jPrice)
    val underlyingJavaBigDecimal = price.underlying
    underlyingJavaBigDecimal.toString should be ("49.99")
  }
}
