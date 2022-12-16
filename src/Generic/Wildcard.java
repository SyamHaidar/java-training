package Generic;

public class Wildcard {
  public static void main(String[] args) {
    print(new Data<Integer>(100));
    print(new Data<String>("Syam Haidar"));
    print(new Data<Double>(5.25));
    print(new Data<MultipleConstraint.Manager>(new MultipleConstraint.Manager()));
  }

  // bisa menggunakan parameter apapun
  // contoh <?> = <Object> .
  // bisa string maupun integer atau turunan object lainnya
  public static void print(Data<?> data) {
    System.out.println(data.getData());
  }
}
