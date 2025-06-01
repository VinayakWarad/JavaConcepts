package main.exception;

import java.io.PrintWriter;

// Note : getMessage(), printStackTrace(), getCause(), e.toString() are methods of Throwable class
    public class ExceptionEx2 {
        public static void main(String[] args) {
            try {
                throw new Exception("Custom exception message");
            } catch (Throwable t) {
                System.out.println("Caught: " + t.getMessage());
            }
        }
    }