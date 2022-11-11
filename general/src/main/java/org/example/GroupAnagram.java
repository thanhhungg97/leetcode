package org.example;

import java.util.*;

public class GroupAnagram {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> hashTable = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] s = strs[i].toCharArray();
            Arrays.sort(s);
            String tmp = String.valueOf(s);
            if (hashTable.containsKey(tmp)) {
                hashTable.get(tmp).add(strs[i]);
            } else {
                List<String> tmpList = new LinkedList<>();
                tmpList.add(strs[i]);
                hashTable.put(tmp, tmpList);
            }
        }

        return hashTable.values().stream().toList();
    }

    public List<List<String>> groupAnagramsBetterSolution(String[] strs) {
        Map<String, List<String>> result = new HashMap<>();
        int[] hashTable = new int[26];


        for (int i = 0; i < strs.length; i++) {
            char[] s = strs[i].toCharArray();
            Arrays.fill(hashTable, 0);
            for (int j = 0; j < s.length; j++) {
                hashTable[s[j] - 'a']++;
            }
            StringBuffer stringBuffer = new StringBuffer();
            for (int j = 0; j < hashTable.length; j++) {
                stringBuffer.append(hashTable[j]);
                stringBuffer.append("#");
            }
            String key = stringBuffer.toString();
            if (result.containsKey(stringBuffer.toString())) {
                result.get(key).add(strs[i]);
            } else {
                List<String> tmpList = new LinkedList<>();
                tmpList.add(strs[i]);
                result.put(key, tmpList);
            }
        }

        return result.values().stream().toList();
    }
}
