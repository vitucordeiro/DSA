package com.example;

import com.example.arrays.BSearch;

public class Main {
    public static void main(String[] args) {
        BSearch bSearch = new BSearch();
        int[] array = { 1,2,3,4,5,6,7,8,9,10,11,12};
        int target = 13;
        System.out.println(bSearch.solution(array, target));
        
    }
}