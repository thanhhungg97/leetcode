package org.example.contest.contest105;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ExtraCharactersinaString {

    static class Pair {
        Integer startIndex;
        Integer endIndex;
        String dict;

        public Pair(Integer startIndex, Integer endIndex, String dict) {

            this.startIndex = startIndex;
            this.endIndex = endIndex;
            this.dict = dict;
        }

        Boolean isOverLap(Pair other) {
            if (endIndex < other.startIndex || other.endIndex < this.startIndex) {
                return false;
            }
            return true;

        }

        Integer getLength() {
            return endIndex - startIndex + 1;
        }

        @Override
        public String toString() {
            return "Pair{" +
                    "startIndex=" + startIndex +
                    ", endIndex=" + endIndex +
                    " dict = " + dict +
                    '}';
        }
    }

    public int minExtraChar(String s, String[] dictionary) {
        List<Pair> listDictionaryIndex = new LinkedList<>();

        for (String data : dictionary) {
            int startIndex = s.indexOf(data);
            while (startIndex != -1) {
                int endIndex = startIndex + data.length() - 1;
                listDictionaryIndex.add(new Pair(startIndex, endIndex, data));
                startIndex = s.indexOf(data, startIndex + 1);
            }
        }
        List<List<Pair>> result = new ArrayList<>();
        dfs(listDictionaryIndex, 0, result, new LinkedList<>());
        return s.length() - result
                .stream()
                .map(item -> item.stream().map(Pair::getLength)
                        .reduce(0, Integer::sum))
                .max(Integer::compareTo)
                .orElse(0);
    }

    public boolean isOverlap(List<Pair> cur, Pair par) {
        return cur.stream().anyMatch(item -> item.isOverLap(par));

    }

    private void dfs(List<Pair> listDictionaryIndex, int i, List<List<Pair>> result, List<Pair> cur) {
        if (i == listDictionaryIndex.size()) {
            result.add(List.copyOf(cur));
        } else {
            for(  int j = i ; j < listDictionaryIndex.size(); j ++){
                if (!isOverlap(cur, listDictionaryIndex.get(i))){
                    cur.add(listDictionaryIndex.get(i));
                    dfs(listDictionaryIndex, j + 1, result, cur);
                    cur.remove(cur.size() - 1);
                }
            }
        }
    }
}
