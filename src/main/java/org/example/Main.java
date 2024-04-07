package org.example;

import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> person = new HashMap<>();
        person.put("name", "Volodymyr");
        person.put("lastName", "Khalin");

        System.out.println(new Gson().toJson(person));
    }
}