/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Makiya Thomas
 */
package com.company;

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many people? ");
        int people = input.nextInt();

        System.out.print("How many pizzas do you have? ");
        int pizzas = input.nextInt();

        System.out.print("How many slices per pizza? ");
        int slices = input.nextInt();

        int tot_slices = pizzas * slices;
        int equ_slices = tot_slices / people;
        int remain = tot_slices % people;

        System.out.printf("%d people with %d pizzas (%d slices)\n", people, pizzas, tot_slices);

        System.out.printf("Each person gets %d pieces of pizza.\n", equ_slices);

        System.out.printf("There are %d leftover pieces.\n", remain);

    }
}