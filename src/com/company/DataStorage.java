package com.company;

import java.util.Locale;

public class DataStorage {

    private static String DIFFICULTY = null;

    public static String getDIFFICULTY(){
        return DIFFICULTY;
    }

    public static void setDIFFICULTY(String diff){
        switch (diff.toUpperCase(Locale.ROOT)){
            case "HARD" -> DIFFICULTY = "HARD";

            case "MEDIUM" -> DIFFICULTY = "MEDIUM";

            case "EASY" -> DIFFICULTY = "EASY";

            default -> DIFFICULTY = null;
        }
    }
}
