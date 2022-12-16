package Generic;

public class Constraint {

  public static void main(String[] args) {

    NumberData<Integer> integerNumberData = new NumberData<>(1);
    NumberData<Long> longNumberData = new NumberData<>(1L);

    // tidak bisa karena String bukan turunan Number
    // NumberData<String> stringumberData = new NumberData<>(1);

    System.out.println("Integer : " + integerNumberData.getData());
    System.out.println("Long : " + longNumberData.getData());
  }

  // bisa menambah beberapa parameter namun harus di interface
  // contoh <T extends Number & String & String>
  public static class NumberData<T extends Number> {

    private T data;

    public NumberData(T data) {
      this.data = data;
    }

    public T getData() {
      return data;
    }

    public void setData(T data) {
      this.data = data;
    }
  }

}
