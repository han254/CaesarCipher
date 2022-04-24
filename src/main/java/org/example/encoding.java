package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class encoding {
    private String plaintext = "";

    public static void setPlaintext(String plaintext) {
        this.plaintext = plaintext;
    }

    public String getPlaintext() {
        return this.plaintext;
    }

    public String cText() {
        try {
            InputStreamReader streamReader = new InputStreamReader(System.in);
            BufferedReader bufferedReader = new BufferedReader(streamReader);
            String plaintext = bufferedReader.readLine();
        } catch (Exception e) {

        }
    }
}

