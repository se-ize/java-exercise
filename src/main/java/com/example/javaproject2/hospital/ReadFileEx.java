package com.example.javaproject2.hospital;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class ReadFileEx {
    public List<String> getLines(String fileName) {
        List<String> lines = new LinkedList<>();

        try (BufferedReader br = Files.newBufferedReader(
                Paths.get(fileName), StandardCharsets.UTF_8)) {
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
        }
    } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return lines;
    }
        public static void main(String[] args) throws IOException {

    }
}
