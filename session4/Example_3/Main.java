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

    // code that may generate IOException
    File newFile = new File("/home/ivan/documents/prop/session4/Example_3/test.txt");
    //File newFile = new File("/home/ivan/documents/prop/session4/Example_3/text.txt");
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
