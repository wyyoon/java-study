package com.etc;

public class StringCalculator {
    public String[] split(String s) {
        if(s == null){
            return new String[]{};
        }

        return s.split(",|\n");
    }

    public int[] toInt(String[] strings) {
        if(strings == null){
            return new int[]{};
        }

        int[] numbers = new int[strings.length];
        for(int i=0; i < strings.length; i++){
            numbers[i] = Integer.parseInt(strings[i]);
        }
        return numbers;
    }
}
