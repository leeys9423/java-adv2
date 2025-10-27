package io.streams;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamEtcMain {

    public static void main(String[] args) throws FileNotFoundException {
        FileOutputStream fos = new FileOutputStream("temp/print.txt");
        PrintStream pos = new PrintStream(fos);

        pos.println("hello java!");
        pos.println(10);
        pos.println(true);
        pos.printf("hello %s", "world");
        pos.close();
    }
}
