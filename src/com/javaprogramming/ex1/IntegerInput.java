package com.javaprogramming.ex1;

import java.util.*;

public class IntegerInput {
    public static Scanner _scanner = new Scanner(System.in);
    public static ArrayList<Integer> _integerList = new ArrayList<Integer>();
    public static int _biggestInteger;

    // Call entryPoint();
    public static void main(String [] args) {
        entryPoint();
    }

    // The start point of the application its a method that can call itself to
    // allow the user to add as many integer as it wants before performing the
    // final math.
    static void entryPoint() {
        askInteger();

        if (anotherInteger()) {
            entryPoint();
        } else {
            System.out.println("Smallest number is: " + smallestInteger());
            System.out.println("Biggest number is: " + largestInteger());
            System.out.println("Average number is: " + averageInteger());
        }
    }

    // Return the largest integer in the collection by iterating through the list
    // and asking if the number to the right is bigger than the number in the current
    // index. If so, store that one instead and continue until the end.
    static int largestInteger() {
        for (int i=0;i<_integerList.size();i++) {
            if (i+2 > _integerList.size()) {
                break;
            }
            if (i > 0) {
                _biggestInteger =  _integerList.get(i+1) > _biggestInteger ?
                        _integerList.get(i+1) : _biggestInteger;
            } else {
                _biggestInteger =  _integerList.get(i) > _integerList.get(i+1) ?
                        _integerList.get(i) : _integerList.get(i+1);
            }
        }
        return _biggestInteger;
    }

    // Return the smallest integer in the collection by sorting the collection and returning
    // the first item
    static int smallestInteger() {
        Collections.sort(_integerList);

        return _integerList.get(0);
    }

    // Count all the items in the collection and return the average.
    static int averageInteger() {
        int count = _integerList.size();
        int total = 0;

        for (int i = 0; i<count;i++) {
            total += _integerList.get(i);
        }

        return total/count;
    }

    // Prompt the user to input an integer making sure zero and negative numbers are caught as
    // incorrect inputs. The 'catch' block calls the same method again.
    static void askInteger() {
        System.out.println("Please enter an integer:");
        try {
            int value = Integer.parseInt(_scanner.nextLine());
            if (value <= 0) {
                System.out.println("Input cannot be a zero or a negative number.");
                askInteger();
                return;
            }
            _integerList.add(value);
        } catch (Exception e) {
            System.out.println("Error, not an integer.");
            askInteger();
        }
    }

    // Ask the user if he wants to enter another integer, this method only accepts 'y' and 'n' as
    // valid inputs. The 'catch' block calls the same method again.
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
