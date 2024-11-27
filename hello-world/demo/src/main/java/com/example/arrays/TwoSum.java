package com.example.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
 * TwoSum
 * dado um array e um valor-alvo, encontre todos os pares em que a soma seja igual ao valor-alvo
 * array = { 2, 7, 11, 15}
 * valor-alvo = 9
 * return {2, 7}
 */
public class TwoSum {
    public HashMap<Integer,Integer> map = new HashMap<>();
    public List<int[]> pairListByIndex = new ArrayList<>();
    public List<int[]> pairListByInts = new ArrayList<>();

    public void solution(int[] array, int target){
        for(int i = 0; i < array.length; i ++){
            int complement = target - array[i];

            if(map.containsKey(complement)){
                pairListByIndex.add(new int[] {map.get(complement), i});
                pairListByInts.add(new int[]{complement, array[i]});
            }
            map.put(array[i], i);
        }

    }

    public void getPairsByIndex(){
        for(int[] pair: this.pairListByIndex){
            System.out.println("Par encontrado: " + pair[0] + ", " + pair[1]);
        }
    }
    public void getPairsByInts(){
        for(int[] pair: this.pairListByInts){
            System.out.println("Par encontrado: " + pair[0] + ", " + pair[1]);
        }
    }
}
