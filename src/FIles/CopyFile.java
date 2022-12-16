package FIles;

import java.io.*;

public class CopyFile {

  public static void main(String args[]) throws IOException {
    // Java byte streams digunakan untuk input dan output 8-bit bytes.
    // FileInputStream in = null;
    // FileOutputStream out = null;

    // Java Character streams digunakan untuk input dan output 16-bit unicode.
    FileReader in = null;
    FileWriter out = null;

    try {
      // in = new FileInputStream("src/Files/input.txt");
      // out = new FileOutputStream("src/Files/output.txt");

      in = new FileReader("src/Files/input.txt");
      out = new FileWriter("src/Files/output.txt");

      int c;
      while ((c = in.read()) != -1) {
        out.write(c);
      }
    } finally {
      if (in != null) {
        in.close();
      }
      if (out != null) {
        out.close();
      }
    }
  }
}