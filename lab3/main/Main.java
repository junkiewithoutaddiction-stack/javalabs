package main;

import fantasy.Creature;
import fantasy.Elf;
import fantasy.Orc;

public class Main {
    public static void main(String[] args) {
        Creature c1 = new Elf("Alleria", 3300);
        Creature c2 = new Orc("Thrall", "Doomhammer");

        c1.showInfo();
        c1.performAction();

        c2.showInfo();
        c2.performAction();
    }
}