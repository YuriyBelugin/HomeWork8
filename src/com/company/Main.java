package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();

        Map<Integer,Integer> letters=new HashMap<>();

        ArrayList<Integer> nums = new ArrayList<>();

        for (int i=0; i<201; i++) {
            nums.add(random.getRandom());
        }

        for (int i = 0; i < nums.size(); i++) {
            Integer tempInt = nums.get(i);

            if(letters.containsValue(3)) {
                break;
            }
            else if (!letters.containsKey(tempInt)) {
                letters.put(tempInt,1);
            }
            else if(letters.containsValue(1)){
                letters.put(tempInt, letters.get(tempInt)+1);
            }
            else if(letters.containsValue(2)){
                letters.put(tempInt, letters.get(tempInt)+1);
            }

            System.out.println(nums.get(i));


        }
    }
}






