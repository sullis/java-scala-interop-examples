package example;

import org.testng.*;
import org.testng.annotations.Test;
import static org.testng.Assert.*;
import static scala.collection.JavaConverters.seqAsJavaListConverter;
import static scala.collection.JavaConverters.mapAsJavaMapConverter;
import java.util.List;
import java.util.Map;

public class JavaCollectionsTest {

    @Test
    public void scalaList2JavaList() {
        List<String> javaList = (java.util.List<String>) seqAsJavaListConverter(ScalaStuff$.MODULE$.listOfStrings()).asJava();
        assertEquals(javaList.size(), ScalaStuff$.MODULE$.listOfStrings().size());
    }

    @Test
    public void scalaMap2JavaMap() {
        Map<String, String> javaMap = (java.util.Map<String, String>) mapAsJavaMapConverter(ScalaStuff$.MODULE$.foodieMap()).asJava();
        assertEquals(javaMap.size(), ScalaStuff$.MODULE$.foodieMap().size());
    }
}
