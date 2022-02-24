package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class Main {

    public static void main(String[] args) throws IOException {
        int helper = 0;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Messaging.start();
        Board.create();

        while (true){
            Messaging.input();
            String input = reader.readLine();
            int num;

            try {
                num = Integer.parseInt(input);

                boolean checker = false;
                for (int i = 1; i <= 24; i++){
                    if (i == num){
                        checker = true;
                        break;
                    }
                }

                if (checker){
                    System.out.println("číslo: " + num + " bylo úspěšně zaznamenáno! ;)");
                    Board.play(num);
                    if (helper == 0) {
                        Board.generateMines();
                        helper++;
                    }
                    } else {
                    System.out.println("Asi jsi zadal špatné číslo!");
                    System.out.println("Zkus to znovu!");
                }
            } catch (Exception ex){
                System.out.println("Zkus to znovu");
            }
        }
    }
}
