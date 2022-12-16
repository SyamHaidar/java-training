package InnerClass;

// Inner class atau nested class
class Outer_Demo {
  // contoh 1
  int num;

  // inner class
  private class Inner_Demo {
    public void print() {
      System.out.println("This is an inner class");
    }
  }

  // Accessing he inner class from the method within
  void display_Inner() {
    Inner_Demo inner = new Inner_Demo();
    inner.print();
  }

  // contoh 2
  // // private variable of the outer class
  // private int num = 175;

  // // inner class
  // public class Inner_Demo {
  // public int getNum() {
  // System.out.println("This is the getnum method of the inner class");
  // return num;
  // }
  // }
}

public class InnerClass {

  public static void main(String args[]) {
    // Instantiating the outer class
    Outer_Demo outer = new Outer_Demo();

    // Accessing the display_Inner() method.
    outer.display_Inner();

    // Instantiating the inner class
    // Outer_Demo.Inner_Demo inner = outer.new Inner_Demo();
    // System.out.println(inner.getNum());
  }
}
