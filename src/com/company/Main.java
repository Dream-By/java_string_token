package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        String[] wordlist = s.trim().split("[ !,?.\\_'@]+");
        System.out.println(wordlist.length);
        for (int i=0; i<wordlist.length;i++){
            System.out.println(wordlist[i]);
        }

        // Write your code here.
        scan.close();
    }
}
