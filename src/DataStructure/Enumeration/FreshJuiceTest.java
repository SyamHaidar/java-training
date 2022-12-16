package Enumeration;

class FreshJuice {
  enum FreshJuiceSize {
    SMALL, MEDIUM, LARGE
  }

  FreshJuiceSize size;
}

public class FreshJuiceTest {

  public static void main(String args[]) {
    FreshJuice juice = new FreshJuice();
    juice.size = FreshJuice.FreshJuiceSize.MEDIUM;

    System.out.println("Size: " + juice.size);

    // switch
    switch (juice.size) {
      case SMALL:
        System.out.println("Small size");
        break;
      case MEDIUM:
        System.out.println("Medium size");
        break;
      case LARGE:
        System.out.println("Large size");
        break;
    }
  }
}