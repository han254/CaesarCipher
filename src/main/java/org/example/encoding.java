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

    public void userInput() {
        String cipherText = "";
        try {
            System.out.print("Enter plaintext>>");
            InputStreamReader streamReader = new InputStreamReader(System.in);
            BufferedReader bufferedReader = new BufferedReader(streamReader);
            String plaintext = bufferedReader.readLine();
            this.setPlaintext(plaintext);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public String cText(){
        System.out.println(this.getPlaintext());
    }
    }


