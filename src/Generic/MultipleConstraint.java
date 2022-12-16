package Generic;

public class MultipleConstraint {

  public static void main(String[] args) {
    // Error karena manajer tidak implement CanSayHello
    // Data<Manager> managerData = new Data<>(new Manager());

    Data<VicePresident> vicePresidentData = new Data<>(new VicePresident());
    vicePresidentData.data.sayHello("Syam");
  }

  public static interface CanSayHello {
    void sayHello(String name);
  }

  public static abstract class Employee {

  }

  public static class Manager extends Employee {

  }

  public static class VicePresident extends Employee implements CanSayHello {

    @Override
    public void sayHello(String name) {
      System.out.println("Hello " + name);
    }

  }

  public static class Data<T extends Employee & CanSayHello> {
    private T data;

    public Data(T data) {
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
