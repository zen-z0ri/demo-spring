package com.example.demospring.newj17.c20generic.l1;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

import java.io.FileNotFoundException;
import java.io.FileReader;

@Slf4j
public class Te {
    public static void main(String[] args) {
            ForRecord s = new ForRecord("fds", 2, new Object());

            readFile("dijosdfij");
    }

    @SneakyThrows(FileNotFoundException.class)
    private static void readFile(String fileName) {
        FileReader fred = new FileReader(fileName);
    }

}
