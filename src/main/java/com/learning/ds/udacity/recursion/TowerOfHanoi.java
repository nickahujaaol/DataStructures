package com.learning.ds.udacity.recursion;

public class TowerOfHanoi {
    public static void main(String[] args) {
        tower(3, 'S', 'A', 'D');
    }

    private static void tower(int number, char source, char auxiliary, char destination) {
        if (number == 1) {
            System.out.println(source + " -> " + destination);
            return;
        }

        tower(number - 1, source, destination, auxiliary);
        System.out.println(source + " -> " + destination);
        tower(number - 1, auxiliary, source, destination);
    }
}
