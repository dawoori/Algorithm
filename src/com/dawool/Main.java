package com.dawool;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        ThePalindrome thePalindrome = new ThePalindrome();
        int a = thePalindrome.find("abdfhdyrbdbsdfghjkllkjhgfds");
        System.out.println(a);
    }
}