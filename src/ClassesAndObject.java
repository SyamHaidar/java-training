// import javax.swing.JLabel;

class Person {

  String name;
  int age;

}

public class ClassesAndObject {

  public static void main(String[] args) {
    // JLabel label = new JLabel();

    Person john = new Person();
    john.name = "John";
    john.age = 20;

    Person bob = new Person();
    bob.name = "Bob";
    bob.age = 25;

    System.out.println("John is " + john.age + " years old");
    System.out.println("Bob is " + bob.age + " years old");

  }
}
