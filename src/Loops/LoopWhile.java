package Loops;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class LoopWhile {
    public static void main(String[] args) {
        String path = "";

    }

    private static void openFile(String filename) throws IOException {
        Files.readAllLines(Paths.get(filename));
        File file = new File(filename);
        FileReader fileReader = new FileReader(file);
        StringBuilder builder = new StringBuilder();
        while (file.canRead()) {
            int c = fileReader.read();
            builder.append((char) c);
        }
    }
}
