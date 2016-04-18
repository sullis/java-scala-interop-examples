
package example;

public class Foo {
  private Integer count = 0;
  private String[] names;

  public void setNamesVarArg(String... names) {
    this.names = names;
  }
}
