package main;

import pcbuild.Computer;

public class Main {
    public static void main(String[] args) {
        Computer myPC = new Computer();
        myPC.bootUp();
        myPC.shutDown();
    }
}