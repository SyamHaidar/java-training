package Generic;

// Covariant adalah read-only tidak dapat mengubah data
// bisa melakukan subtitusi dengan child dan parent
// untuk menjadi generic covariant yaitu menggunakan <? extends Object>
public class CovariantApp {

  public static void main(String[] args) {

    Data<String> stringData = new Data<>("Syam");
    process(stringData);

    Data<? extends Object> data = stringData;
    process(data);

  }

  public static void process(Data<? extends Object> data) {
    System.out.println(data.getData());

    // data.setData("string"); // error tidak boleh karena extends object
    // data.setData(1); // error tidak boleh karena extends object
  }

}
