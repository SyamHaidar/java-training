package Generic;

class Data<T> {
  private T data;

  public Data(T data) {
    this.data = data;
  }

  public T getData() {
    return data;
  }

  public void setData(T newData) {
    data = newData;
  }
}

class Pair<T, U> {
  private T first;

  private U second;

  public Pair(T first, U second) {
    this.first = first;
    this.second = second;
  }

  public T getFirst() {
    return first;
  }

  public U getSecond() {
    return second;
  }

  public void setFirst(T first) {
    this.first = first;
  }

  public void setSecond(U second) {
    this.second = second;
  }

}

// Generic adalah parameter type
// memungkinkan untuk mengubah type data sesuai keinginan
// contoh Data<T> bisa Data<String> atau Data<Integer>
public class GenericDemo {

  public static void main(String[] args) {
    Data<String> dataString = new Data<String>("Syam");
    Data<Integer> dataInteger = new Data<>(25); // boleh kosong <> atau <Integer>

    String stringValue = dataString.getData();
    Integer integerValue = dataInteger.getData();

    System.out.println(stringValue);
    System.out.println(integerValue);

    Pair<String, Integer> pair = new Pair<String, Integer>("Syam", 25);
    System.out.println(pair.getFirst());
    System.out.println(pair.getSecond());
  }

}
