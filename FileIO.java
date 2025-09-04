// File IO Practice
// FileIO.java
// 9/4/25
// aJ


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileIO {
    public static void main(String[] args) {


        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            writer.write("Writing to a file");
            writer.write("\nHere is another line");
            writer.write("\nHere is the third line my boy!");
            writer.write("\n 4th line time")
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}