package org.example;

public class GFTTest1 {
    int solution(String s) {
        int[] hash = new int[128];
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i)]++;
        }
        int a = hash['A'];
        int b = hash['B'];
        int c = hash['N'];
        return (int) Math.min(Math.min(Math.floor(a / 3), Math.floor(b)), Math.floor(c / 2));
    }

}
