package example;

import org.testng.annotations.Test;
import static org.testng.Assert.*;
import scala.jdk.javaapi.CollectionConverters;
import java.util.List;
import java.util.Map;

public class JavaCollectionsTest {

    @Test
    public void scalaList2JavaList() {
        List<String> javaList = (java.util.List<String>) CollectionConverters.asJava(ScalaStuff$.MODULE$.listOfStrings());
        assertEquals(javaList.size(), ScalaStuff$.MODULE$.listOfStrings().size());
    }

    @Test
    public void scalaMap2JavaMap() {
        Map<String, String> javaMap = (java.util.Map<String, String>) CollectionConverters.asJava(ScalaStuff$.MODULE$.foodieMap());
        assertEquals(javaMap.size(), ScalaStuff$.MODULE$.foodieMap().size());
    }
}
