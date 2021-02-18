package com.javaprogramming.ex1;

import java.util.*;

public class IntegerInput {
    public static Scanner _scanner = new Scanner(System.in);
    public static ArrayList<Integer> _integerList = new ArrayList<Integer>();
    public static int _biggestNumber;

    public static void main(String [] args) {
        entryPoint();
    }

    static void entryPoint() {
        askInteger();

        if (anotherInteger()) {
            entryPoint();
        }

        System.out.println(biggestNumber());
        return;

    }

    static int biggestNumber() {
        for (int i=0;i<_integerList.size();i++) {
            if (i+2 > _integerList.size()) {
                break;
            }
            if (i > 0) {
                _biggestNumber =  _integerList.get(i+1) > _biggestNumber ?
                        _integerList.get(i+1) : _biggestNumber;
            } else {
                _biggestNumber =  _integerList.get(i) > _integerList.get(i+1) ?
                        _integerList.get(i) : _integerList.get(i+1);
            }
        }
        return _biggestNumber;
    }

    static void askInteger() {
        System.out.println("Please enter an integer:");
        try {
            int value = Integer.parseInt(_scanner.nextLine());
            if (value <= 0) {
                return;
            }
            _integerList.add(value);
        } catch (Exception e) {
            System.out.println("Error, not an integer.");
            askInteger();
        }
    }

    static boolean anotherInteger() {
        System.out.println("Would you like to enter another integer? (y/n)");

        String newInteger = _scanner.nextLine();

        if (newInteger.equalsIgnoreCase("y")) {
            return true;
        } else if (newInteger.equalsIgnoreCase("n")) {
            return false;
        } else {
            System.out.println("Your input is incorrect.");
            anotherInteger();
            return false;
        }
    }
}
