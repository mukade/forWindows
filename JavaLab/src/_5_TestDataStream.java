import java.io.*;

public class _5_TestDataStream {
  public static void main(String[] args) throws IOException {
    // Create an output stream for file temp.dat
    DataOutputStream output =
      new DataOutputStream(new FileOutputStream("D:\\temp.dat"));

    // Write student test scores to the file
    output.writeUTF("John");
    output.writeDouble(85.5);
    output.writeUTF("Jim");
    output.writeDouble(185.5);
    output.writeUTF("George");
    output.writeDouble(105.25);

    // Close output stream
    output.close();

    // Create an input stream for file temp.dat
    DataInputStream input =
      new DataInputStream(new FileInputStream("D:\\temp.dat"));

    // Read student test scores from the file
    System.out.println(input.readUTF() + " " + input.readDouble());
    System.out.println(input.readUTF() + " " + input.readDouble());
    System.out.println(input.readUTF() + " " + input.readDouble());
  }
}


