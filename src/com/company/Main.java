package com.company;

import javax.lang.model.type.ArrayType;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] myArray1 = new int[]{1, 2, 3};
        double[] myArray2 = {-1.57, 7.654, 9.986};
        int[] myArray3 = {1, 5, 4, 8, 7};
        for (int i = 0; i < myArray1.length; i++) {
            if (i == myArray1.length - 1) {
                System.out.print(myArray1[i]);
            } else {
                System.out.print(myArray1[i] + ", ");
            }
        }
        System.out.println();
        for (int i = 0; i < myArray2.length; i++) {
            if (i == myArray2.length - 1) {
                System.out.print(myArray2[i]);
            } else {
                System.out.print(myArray2[i] + ", ");
            }
        }
        System.out.println();
        for (int i = 0; i < myArray3.length; i++) {
            if (i == myArray3.length - 1) {
                System.out.print(myArray3[i]);
            } else {
                System.out.print(myArray3[i] + ", ");
            }
        }
        System.out.println();
        for (int i = myArray1.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(myArray1[i]);
            } else {
                System.out.print(myArray1[i] + ", ");
            }
        }
        System.out.println();
        for (int i = myArray2.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(myArray2[i]);
            } else {
                System.out.print(myArray2[i] + ", ");
            }
        }
        System.out.println();
        for (int i = myArray3.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(myArray3[i]);
            } else {
                System.out.print(myArray3[i] + ", ");
            }
        }
        System.out.println();
        for (int i = 0; i < myArray1.length; i++) {
            if (myArray1[i] % 2 == 0) {
                if (i == myArray1.length - 1) {
                    System.out.print(myArray1[i] + " ");
                } else {
                    System.out.print(myArray1[i] + ", ");
                }} else {
                    if (i==myArray1.length-1) {
                        myArray1[i] += 1;
                        System.out.print(myArray1[i] + " ");
                    } else {
                        myArray1[i] += 1;
                        System.out.print(myArray1[i] + ", ");
                    }
                }
            }
        }
    }


