package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("Elf with the most calories is carrying " + CalCalc.elf("cals.txt", 0) + " calories.");
        System.out.println("Top 3 elves are carrying " + CalCalc.elf("cals.txt", 3) + " calories.");
        System.out.println("Top 10 elves are carrying " + CalCalc.elf("cals.txt", 10) + " calories.");
        System.out.println("Top 100 elves are carrying " + CalCalc.elf("cals.txt", 100) + " calories.");
        System.out.println("All elves carrying a total of " + CalCalc.elf("cals.txt", -1) + " calories.");

    }
}