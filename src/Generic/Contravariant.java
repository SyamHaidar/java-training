package Generic;

// Contravariant bisa write dan read namun harus berhati" saat melakukan read
// bisa melakukan subtitusi dengan child dan parent
// untuk menjadi generic contravariant yaitu menggunakan <? super String>
public class Contravariant {

  public static void main(String[] args) {
    Data<Object> objectData = new Data<>("Syam");
    objectData.setData(1000);

    Data<? super String> data = objectData;
    // process(objectData);
    process(data);

    System.out.println(objectData.getData());
  }

  public static void process(Data<? super String> data) {
    Object value = data.getData();
    System.out.println(value);

    data.setData("Syam Haidar");

  }

}
