public class Loops {

  public static void main(String[] argsP) {
    forLoop();

    whileLoop();

    doWhile();

  }

  static void forLoop() {
    for (int x = 1; x <= 5; x++) {
      System.out.println(x);
    }
  }

  static void whileLoop() {
    int counter = 0;
    while (counter < 5) {
      counter = counter + 1;
      System.out.println(counter);
    }
  }

  static void doWhile() {
    int counter = 0;
    do {
      counter++;
      System.out.println(counter);
    } while (counter < 5);
  }

}
