package org.example;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RequestClass {

    /*
     * Complete the 'bestRestaurant' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING city
     *  2. INTEGER cost
     * API URL: https://jsonmock.hackerrank.com/api/food_outlets?page={page_no}
     */


    public static void main(String[] args) {

        FoodClient foodClient = new FoodClient(HttpClient.newHttpClient());

        List<FoodOutlet> seattle = foodClient.getFood("Seattle", 1);
        System.out.println(seattle);

    }

    public String bestRestaurant(String city, int cost) {


        return "";
    }

}

class FoodClient {
    private final HttpClient httpClient;

    private final JsonProcessor jsonProcessor = new JsonProcessor();

    public FoodClient(HttpClient httpClient) {

        this.httpClient = httpClient;
    }


    public List<FoodOutlet> getFood(String city, Integer page) {
        URI uri = URI.create("https://jsonmock.hackerrank.com/api/food_outlets?city=%s&page=%d".formatted(city, page));
        HttpRequest httpRequest = HttpRequest.newBuilder()
                .uri(uri)
                .GET()
                .build();

        try {
            HttpResponse<String> send = httpClient.<String>send(httpRequest, HttpResponse.BodyHandlers.ofString());

            Map<String, Object> process = jsonProcessor.process(send.body());
            System.out.println(process);
        } catch (IOException e) {
            return List.of();
        } catch (InterruptedException e) {
            return List.of();
        } catch (ScriptException e) {
            return  List.of();
        }
        return List.of();
    }
}

class JsonProcessor {
    private final ScriptEngine engine;

    JsonProcessor() {
        ScriptEngineManager sem = new ScriptEngineManager();
        this.engine = sem.getEngineByName("JavaScript");
    }


    Map<String, Object> process(String json) throws ScriptException {


        String script = "Java.asJSONCompatible(" + json + ")";
        Map<Object, Object> contents = (Map) this.engine.eval(script);

        Map<String, Object> result = new HashMap<>();

        contents.entrySet().forEach(item -> {
            result.put((String) item.getKey(), item.getValue());
        });
        return result;

    }
}

class FoodOutletDto {
    Integer page;
    Integer perPage;

    Integer total;

    Integer totalPages;

    List<FoodOutlet> data;
}

class FoodOutlet {
    Integer id;
    String name;
    String city;
    Double estimatedCost;

    public FoodOutlet(Integer id, String name, String city, Double estimatedCost) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.estimatedCost = estimatedCost;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setEstimatedCost(Double estimatedCost) {
        this.estimatedCost = estimatedCost;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public Double getEstimatedCost() {
        return estimatedCost;
    }
}


class UserRating {
    String averageRating;
    String votes;

    public UserRating(String averageRating, String votes) {
        this.averageRating = averageRating;
        this.votes = votes;
    }

    public String getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(String averageRating) {
        this.averageRating = averageRating;
    }
}
