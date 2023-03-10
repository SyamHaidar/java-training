package TodoList;

public class Main {

  public static String[] model = new String[10];

  public static java.util.Scanner scanner = new java.util.Scanner(System.in);

  public static void main(String[] args) {
    viewShowTodoList();
  }

  public static void showTodoList() {
    System.out.println("TODO LIST");

    for (int i = 0; i < model.length; i++) {
      String todo = model[i];
      int no = i + 1;

      if (todo != null) {
        System.out.println(no + ". " + todo);
      }
    }

  }

  public static void testShowTodoList() {
    model[0] = "Sedang belajar java";
    model[1] = "Sedang belajar java todo";
    showTodoList();
  }

  public static void addTodoList(String todo) {
    // cek data pada array apakah masih ada null?
    boolean isFull = true;

    for (int i = 0; i < model.length; i++) {
      if (model[i] == null) {
        isFull = false;
        break;
      }
    }

    // jika penuh resize ukuran array 2x lipat
    if (isFull) {
      String[] temp = model;
      model = new String[model.length * 2];

      for (int i = 0; i < temp.length; i++) {
        model[i] = temp[i];
      }
    }

    // tambah data pada array yang null
    for (int i = 0; i < model.length; i++) {
      if (model[i] == null) {
        model[i] = todo;
        break;
      }
    }
  }

  public static void testAddTodoList() {
    for (int i = 0; i < 25; i++) {
      addTodoList("Todo ke : " + i);
    }

    showTodoList();
  }

  public static boolean removeTodoList(Integer number) {
    if ((number - 1) >= model.length) {
      return false;
    } else if (model[number - 1] == null) {
      return false;
    } else {
      for (int i = (number - 1); i < model.length; i++) {
        if (i == (model.length - 1)) {
          model[i] = null;
        } else {
          model[i] = model[i + 1];
        }
      }
      return true;
    }
  }

  public static void testRemoveTodoList() {
    addTodoList("satu");
    addTodoList("dua");
    addTodoList("tiga");
    addTodoList("empat");
    addTodoList("lime");

    boolean result = removeTodoList(20);
    System.out.println(result);

    result = removeTodoList(4);
    System.out.println(result);

    result = removeTodoList(2);
    System.out.println(result);

    showTodoList();
  }

  public static String input(String input) {
    System.out.print(input + " : ");
    String data = scanner.nextLine();
    return data;
  }

  public static void testInput() {
    String name = input("Nama");
    System.out.println("Hi " + name);

  }

  public static void viewShowTodoList() {
    while (true) {
      showTodoList();

      System.out.println("Menu : ");
      System.out.println("1. Tambah");
      System.out.println("2. Hapus");
      System.out.println("x. Keluar");

      String input = input("Pilih");

      if (input.equals("1")) {
        viewAddTodoList();
      } else if (input.equals("2")) {
        viewRemoveTodoList();
      } else if (input.equals("x")) {
        break;
      } else {
        System.out.println("Pilihan tidak ada");
      }

    }
  }

  public static void testViewShowTodoList() {
    addTodoList("satu");
    addTodoList("dua");
    addTodoList("tiga");
    addTodoList("empat");
    addTodoList("lima");
    viewShowTodoList();
  }

  public static void viewAddTodoList() {
    System.out.println("ADD TODO LIST");

    String todo = input("Todo (x jika batal)");

    if (todo.equals("x")) {
      //
    } else {
      addTodoList(todo);
    }
  }

  public static void testViewAddTodoList() {
    addTodoList("satu");
    addTodoList("dua");

    viewAddTodoList();

    showTodoList();
  }

  public static void viewRemoveTodoList() {
    System.out.println("MENGHAPUS TODO LIST");

    String todo = input("Nomor yang dihapus (x jika batal)");

    if (todo.equals("x")) {
      //
    } else {
      boolean success = removeTodoList(Integer.valueOf(todo));

      if (!success) {
        System.out.println("Gagal menghapus : " + todo);
      }
    }
  }

  public static void testViewRemoveTodoList() {
    addTodoList("satu");
    addTodoList("dua");
    addTodoList("tiga");

    showTodoList();

    viewRemoveTodoList();

    showTodoList();
  }

}
