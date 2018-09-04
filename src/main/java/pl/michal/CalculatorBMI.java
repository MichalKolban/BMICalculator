package pl.michal;

import java.util.Scanner;

public class CalculatorBMI {

    public static void main(String[] args) {

        System.out.println("Enter your weight");

        Scanner scanner = new Scanner(System.in);

        float weight = scanner.nextFloat();

        System.out.println("Enter your height");

        float height = scanner.nextFloat();

        float height2 = height / 100;

        float score = weight / (height2 * height2);


        if(score <18.5){
            System.out.println("Your score : " + score + " You are underweight");
        }
        if(score >= 18.5 && score <=24.9){
            System.out.println("Your score : " + score + " You have the right weight");
        }
        if(score >=24.9 && score <= 29.9){
            System.out.println("Your score : " + score + " You are overweight");
        }
        if(score > 30){
            System.out.println("Your score : " + score + " You have obesity");
        }
    }
}
