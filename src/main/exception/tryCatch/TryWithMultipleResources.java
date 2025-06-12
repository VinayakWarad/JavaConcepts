package main.exception.tryCatch;

import java.io.*;

public class TryWithMultipleResources {
    public static void main(String[] args) {

TryWithMultipleResources tryWithMultipleResources=new TryWithMultipleResources();

tryWithMultipleResources.test();
// Both reader and writer are auto-closed here, no need for explicit close() calls

    }

    public void test() {
        try (
                BufferedReader reader = new BufferedReader(new FileReader("file.txt"));
                BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}