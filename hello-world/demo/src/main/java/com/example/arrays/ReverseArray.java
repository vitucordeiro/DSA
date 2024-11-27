package com.example.arrays;

public class ReverseArray {
    public ReverseArray(){}

    public String solutionByStringBuilder(String input){
        return new StringBuilder(input).reverse().toString();
    }

    public String solutionByPointers(String input){
        char[] charArray = input.toCharArray();

        int left = 0;
        int right = input.length() - 1;
        while(left < right){
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }
        return new String(charArray);
    }
}
