package com.zxjte9411;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        int score;
        System.out.print("Enetr the score = ");
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            score = Integer.parseInt(br.readLine());
            char grade = LetterGrade.letterGrade(score);
            System.out.println("The grade of " + score + " is " + grade);
        } catch (NumberFormatException ex) {
            System.out.println("Not an integer!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
