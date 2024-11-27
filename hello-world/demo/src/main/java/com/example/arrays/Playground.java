package com.example.arrays;



public class Playground {
    String reserveString;

    public Playground(){}
    
    public String solution(String string){
        char[] charArray = string.toCharArray();
        int left = 0;
        int right = charArray.length - 1; // to prevent index out of bounds
        while (left < right){
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }
        return new String(charArray);
    }

    public String anotherSolution(String string){
        return new StringBuilder(string).reverse().toString();
    } 

}
