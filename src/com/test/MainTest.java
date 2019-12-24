package com.test;

import com.zxjte9411.Main;
import org.junit.Before;
import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Rule
    public ExpectedException expectedException = ExpectedException.none();
    @Test
    void main() throws IOException {
        String data = "80";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        expectedException.expect(IOException.class);
        Main.main(new String[0]);
        Main.main(new String[0]);
    }
}