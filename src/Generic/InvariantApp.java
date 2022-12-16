package Generic;

// Invariant tidak boleh di subtitusi dengan child(subtype) atau parent(supertype)
// harus sesuai, misal Contoh<String> != Contoh<Object> atau sebaliknya maka akan error
public class InvariantApp {

  public static void main(String[] args) {

    Data<String> stringData = new Data<>("Syam");
    // doItObject(stringData); // error karena harus string
    doItString(stringData); // success

    Data<Object> objectData = new Data<>(1000);
    // doItInteger(objectData); // error karena harus integer
    doItObject(objectData); // success

  }

  public static void doItObject(Data<Object> objectData) {
    System.out.println("print object");
  }

  public static void doItString(Data<String> stringData) {
    System.out.println("print string");
  }

  public static void doItInteger(Data<Integer> integerData) {
    System.out.println("print integer");
  }

}
