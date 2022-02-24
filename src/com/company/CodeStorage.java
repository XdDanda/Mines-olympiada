package com.company;

import java.util.HashMap;

public class CodeStorage {

    public static void drawBoard(HashMap<String, String> cubes){
        System.out.println("|-----|-----|-----|-----|-----|-----|-----|-----|");
        System.out.println("|  " + cubes.get("cube1") + "  |  " + cubes.get("cube2") + "  |  " + cubes.get("cube3") + "  |  " + cubes.get("cube4") + "  |  " + cubes.get("cube5") + "  |  " + cubes.get("cube6") + "  |  " + cubes.get("cube7") + "  |  " + cubes.get("cube8") + "  |");
        System.out.println("|-----| ----|-----|-----|-----|-----|-----|-----|");
        System.out.println("|-----|-----|-----|-----|-----|-----|-----|-----|");
        System.out.println("|  " + cubes.get("cube9") + "  |  " + cubes.get("cube10") + " |  " + cubes.get("cube11") + " |  " + cubes.get("cube12") + " |  " + cubes.get("cube13") + " |  " + cubes.get("cube14") + " |  " + cubes.get("cube15") + " |  " + cubes.get("cube16") + " |");
        System.out.println("|-----| ----|-----|-----|-----|-----|-----|-----|");
        System.out.println("|-----|-----|-----|-----|-----|-----|-----|-----|");
        System.out.println("|  " + cubes.get("cube17") + " |  " + cubes.get("cube18") + " |  " + cubes.get("cube19") + " |  " + cubes.get("cube20") + " |  " + cubes.get("cube21") + " |  " + cubes.get("cube22") + " |  " + cubes.get("cube23") + " |  " + cubes.get("cube24") + " |");
        System.out.println("|-----| ----|-----|-----|-----|-----|-----|-----|");
        System.out.println(" ");
        System.out.println("políčka jsou pro rovinách označená 1-24");
        System.out.println("napiš nějaké z nich pro odkrytí");
    }
}
