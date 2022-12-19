package TodoList;

public class Main {

  public static String[] model = new String[10];

  public static void main(String[] args) {
    testShowTodoList();
  }

  public static void showTodoList() {
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

  public static void deleteTodoList() {

  }

  public static void viewShowTodoList() {

  }

  public static void viewAddTodoList() {

  }

  public static void viewDeleteTodoList() {

  }

}
