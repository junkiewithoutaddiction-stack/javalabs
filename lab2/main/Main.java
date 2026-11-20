package main;

import coffee.CoffeeMachine;

public class Main {
    public static void main(String[] args) {
        CoffeeMachine myMachine = new CoffeeMachine("Baristik", 8, 200);
        myMachine.displayStatus();
    }
}