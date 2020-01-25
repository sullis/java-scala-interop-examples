package example

import org.gfccollective.guava.GuavaConverters._
import com.google.common.base.Optional
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class GuavaOptionalTest extends AnyFlatSpec with Matchers {

  "Guava Optional conversion" should "work" in {
    Optional.of("foo").asScala should be (Some("foo"))
    Optional.absent[String].asScala should be (None)

    Some("thing").asJava should be (Optional.of("thing"))
    None.asJava should be (Optional.absent)
  }

}
