package main.exception.tryCatch;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;



    public class tryWithResources {
        public static void main(String[] args) {
            // The file resource will be automatically closed
            // BufferedReader implements Autoclosable Interface
            try (BufferedReader reader = new BufferedReader(new FileReader("example.txt"))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            // No need to explicitly close 'reader', it's automatically closed after the try block
        }
    }

