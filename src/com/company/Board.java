package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Board {

    private static ArrayList<Integer> bombs = new ArrayList<>();
    private static ArrayList<Integer> history = new ArrayList<>();
    private static HashMap<Integer, Boolean> showed = new HashMap<>();
    private static HashMap<String, String> cubes = new HashMap();
    private static int helper = 0;

    public static void create(){

        helper = 1;

        for (int i = 1; i <= 24; i++){
            showed.put(i, false);
        }

        for (int i = 1; i <= 24; i++){
            if(i >= 10){
                cubes.put("cube" + i, (showed.get(i)) ? "✔ " : String.valueOf(i));
            } else {
                cubes.put("cube" + i, (showed.get(i)) ? "✔" : String.valueOf(i));
            }
        }
        CodeStorage.drawBoard(cubes);
        //aby jsem neporovnával "null"
        history.add(25);
    }

    public static void play(int num){

        /*boolean checker = false;
        history.add(num);

        for (int tah : history){
            if (tah == num){
                checker = true;
                //System.out.println("Toto pole jsi si liž v minulosti zvolil! Zkus jiné");
            }
        }

        if (checker){
            System.out.println("Toto pole jsi si liž v minulosti zvolil! Zkus jiné");
        }*/

        //if (!checker) {

            helper++;

            showed.put(num, true);
            if (num >= 10) {
                cubes.put("cube" + num, (showed.get(num)) ? "✔ " : String.valueOf(num));
            } else {
                cubes.put("cube" + num, (showed.get(num)) ? "✔" : String.valueOf(num));
            }
            for (int position : bombs) {
                if (position == num) {
                    System.out.println("Hra skončila vybouchl jsi jsi");
                    System.exit(0);
                }
            }
            CodeStorage.drawBoard(cubes);
        }
    //}

    public static void generateMines(){

        Random rd = new Random();
        ArrayList<Integer> list = new ArrayList<>();

        while (true){
            list.removeAll(list);
            for (int i = 1; i <= 8; i++){
                list.add(rd.nextInt(1, 24));
            }
            break;
        }

        for (Integer num : list){
            bombs.add(num);
        }

        //System.out.println(bombs);
    }
}
