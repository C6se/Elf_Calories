package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;

public class CalCalc {

    public static String elf(String filePath, int howManyElves) {

        BufferedReader reader;

        int cals = 0;
        try {
            reader = new BufferedReader(new FileReader(filePath));
            String line = reader.readLine();

            // create a list to store elves
            ArrayList<Integer> elves = new ArrayList<>();

            while (line != null) {
                if (line.equals("")) {
                    elves.add(cals);
                    cals = 0;
                } else {
                    cals = Integer.parseInt(line) + cals;
                }

                // read next line
                line = reader.readLine();
            }

            elves.sort(Collections.reverseOrder()); // Sort in descending order

            // close the scanner
            reader.close();

            if (howManyElves == 0) {
                // Return the elf carrying the most calories
                return NumberFormat.getIntegerInstance().format(elves.get(0));

            } else if (howManyElves == -1) {
                // Get length of the array and total all the calories carried by all the elves
                int counter = 0;
                int allElves = elves.size();
                for (int i = 0; i < allElves; i++) {
                    counter = counter + elves.get(i);
                }
                return NumberFormat.getIntegerInstance().format(counter);

            } else {
                // Used the passed in 'howManyElves' value to total that many calories
                int counter = 0;
                for (int i = 0; i < howManyElves; i++) {
                    counter = counter + elves.get(i);
                }
                return NumberFormat.getIntegerInstance().format(counter);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return NumberFormat.getIntegerInstance().format(0);

    }

}