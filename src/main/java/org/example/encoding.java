package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class encoding {
    private String plaintext = "";
    public Integer cKey;
    public String cText="";

    public void setPlaintext(String plaintext) {
        this.plaintext = plaintext.toLowerCase();
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

            System.out.print("Enter a key>>");
            String cKey = bufferedReader.readLine();
            this.cKey = Integer.parseInt(cKey);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String cText() {
        String[] letters = {
                "A", "B", "C", "D", "E", "F", "G",
                "H", "I", "J", "K", "L", "M", "N",
                "O", "P", "Q", "R", "S", "T", "U",
                "V", "W", "X", "Y", "Z"
        };
        List<String> arrList = new ArrayList<String>(List.of(letters));
        this.setPlaintext(plaintext);

        for (int i = 0; i < this.getPlaintext().length(); i++) {
            Character myalphabet= this.getPlaintext().charAt(i);
            Integer currentIndex =arrList.indexOf(myalphabet);
            Integer cKey =currentIndex + this.cKey;
            String cLetter = letters[cKey];
            this.cText =this.cText +""+ cLetter;
            System.out.println(this.cKey);
        }
        return "";
    }
}


