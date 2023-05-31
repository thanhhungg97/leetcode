package org.example;

import java.util.HashMap;
import java.util.Map;

public class UndergroundSystem {
    static class Trip {
        int time;
        String station;

        public Trip(int time, String station) {
            this.time = time;
            this.station = station;
        }
    }

    static class Pair {
        int count;
        int total;

        public Pair(int count, int total) {

            this.count = count;
            this.total = total;
        }

        Double getAverage() {
            return (double) total / count;
        }
    }

    Map<Integer, Trip> map = new HashMap<>();

    Map<String, Pair> averageTimeMap = new HashMap<>();

    public UndergroundSystem() {

    }

    public void checkIn(int id, String stationName, int t) {
        map.put(id, new Trip(t, stationName));
    }

    public void checkOut(int id, String stationName, int t) {


        Trip trip = map.remove(id);
        String key = trip.station + "," + stationName;
        if (!averageTimeMap.containsKey(key)) {
            averageTimeMap.put(key, new Pair(1, t - trip.time));
        } else {
            Pair pair = averageTimeMap.get(key);
            averageTimeMap.put(key, new Pair(pair.count + 1, pair.total + t - trip.time));
        }

    }

    public double getAverageTime(String startStation, String endStation) {
        return averageTimeMap.get(startStation + "," + endStation).getAverage();
    }

}
