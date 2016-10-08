package example

import com.gilt.gfc.guava.GuavaConverters._
import com.google.common.base.Optional
import org.scalatest.{Matchers, FlatSpec}

class GuavaOptionalTest extends FlatSpec with Matchers {

  "Guava Optional conversion" should "work" in {
    Optional.of("foo").asScala should be (Some("foo"))
    Optional.absent[String].asScala should be (None)

    Some("thing").asJava should be (Optional.of("thing"))
    None.asJava should be (Optional.absent)
  }

}
