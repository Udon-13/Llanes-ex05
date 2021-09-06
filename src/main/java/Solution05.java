/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Max Llanes
 */

import java.util.Scanner;

public class Solution05 {
/*
ask for numbers twice
computer 4 basic maths
output to 4 variables
 */
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int addN, subN, divN,mltN, firstNum, secondNum;
    System.out.println("What is the first number?");
    firstNum = input.nextInt();
    System.out.println("What is the second number?");
    secondNum = input.nextInt();

    addN = firstNum + secondNum;
    subN = firstNum - secondNum;
    mltN = firstNum * secondNum;
    divN = firstNum / secondNum;

    System.out.println(firstNum + " + " + secondNum + " = " + addN + "\n" + firstNum + " - " + secondNum + " = " + subN + "\n" + firstNum + " * " + secondNum + " = " + mltN + "\n" + firstNum + " / " + secondNum + " = " + divN + "\n");

}
}
