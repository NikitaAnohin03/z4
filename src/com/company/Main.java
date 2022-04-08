package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

            final double v = 1234.8; //скорость звука
            double t, s;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the time interval between a lightning flash and thunder (seconds):");
            t = scanner.nextDouble();
            s = t * v;
            System.out.println("Distance to lightning strike: " + s + " meters");
        }
    }


