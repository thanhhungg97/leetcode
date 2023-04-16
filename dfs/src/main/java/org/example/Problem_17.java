package org.example;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Problem_17 {
    public List<String> letterCombinations(String digits) {
        Map<Integer, List<Character>> mapChar = new HashMap<>();

        mapChar.put(2, List.of('a', 'b', 'c'));
        mapChar.put(3, List.of('d', 'e', 'f'));
        mapChar.put(4, List.of('g', 'h', 'j'));
        mapChar.put(5, List.of('j', 'k', 'l'));
        mapChar.put(6, List.of('m', 'n', 'o'));
        mapChar.put(7, List.of('p', 'q', 'r', 's'));
        mapChar.put(8, List.of('t', 'u', 'v'));
        mapChar.put(9, List.of('w', 'x', 'y', 'z'));

        if( digits.isEmpty()){
            return List.of();
        }

        List<String> result = new LinkedList<>();

        result.add("");
        for (int i = 0; i < digits.length(); i++) {
            int integer = digits.charAt(i) - '0';

            List<Character> characters = mapChar.get(integer);
            int size = result.size();
            for (int k = 0; k < size; k++) {
                String remove = result.remove(0);
                for (Character character : characters) {
                    result.add(remove + character);
                }


            }
        }


        return result.stream().toList();
    }

}
