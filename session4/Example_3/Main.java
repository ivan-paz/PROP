//
//
//     Exception handling using Java throw
//
//
//
import java.io.*;

class Main {
  // DECLARA  H E R E the type of exception
  public static void findFile() throws IOException {

    // code that MAY generate IOException
    // para evitar la Exception el archivo debe exsistir . . . obvio
    //File newFile = new File("/home/ivan/documents/prop/session4/Example_3/test.txt");
    File newFile = new File("/home/ivan/documents/prop/session4/Example_3/text.txt");
    FileInputStream stream = new FileInputStream(newFile);
  }

  public static void main(String[] args) {
    try {
      findFile();
    }
    catch (IOException e) {
      System.out.println(e);
    }
  }
}
