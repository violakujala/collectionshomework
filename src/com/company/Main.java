package com.company;

import ibadts.*;
import ibadts.Collection;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // Homework 1
       /* Collection <String> Names = new Collection<>();
        Names.add(new String[] {"John", "Marie"});
        for(int Count = 0; Count <3; Count++)
        {
            Names.resetNext();
            while(Names.hasNext())
                System.out.println(Names.getNext());
        }*/
        // Homework 2

       /* boolean Flag = true;
        int T = 0;
        int Number;
        Collection<Integer> input = new Collection<>();
        Collection<Integer> numbers = new Collection<>();
        input.add(new Integer[]{11, 2, 7, -1, 3});
        while (Flag) {
            Number = input.getNext();
            if (Number <= 0)
                Flag = false;
            else {
                numbers.addItem(Number);
                T = Number;
            }
        }
        while (numbers.hasNext()) {
            Number = numbers.getNext();
            if (Number > T)
                System.out.println(Number);
        }*/

        // Homework 3

       /* Scanner input = new Scanner(System.in);
        Collection<Integer> userin = new Collection<>();
        while (input.hasNext())
        {
            int next = input.nextInt();
            if (next < 0)
                break;
            userin.addItem(next);
        }
        int sum = 0;
        int counter = 0;
        while (userin.hasNext()) {
            sum += userin.getNext();
            counter++;
        }
        userin.resetNext();
        double mean = (double) sum / counter;
        while (userin.hasNext()) {
            int next = userin.getNext();
            if (next / mean < 0.5 || next / mean > 1.5)
                System.out.println(next);
        }*/
    }


}
