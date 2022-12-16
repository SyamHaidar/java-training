package Generic;

class ArrayHelperClass {

  public static <T> int count(T[] array) {
    return array.length;
  }

}

// Generic method bisa digunakan di class / interface / method
public class ArrayHelper {

  public static void main(String[] args) {
    String[] names = { "Syam", "Haidar" };
    Integer[] numbers = { 1, 2, 3, 4, 5 };

    System.out.println(ArrayHelperClass.count(names));
    System.out.println(ArrayHelperClass.count(numbers));
  }

}