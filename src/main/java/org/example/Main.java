package org.example;

import netscape.javascript.JSObject;
import org.json.JSONObject;
import com.google.gson.Gson;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //Створюю обєкт класу для збереження інформації
        Person person = new Person ("Alyona", "Belova");

        //Створюю обєкт json
        Gson gson = new Gson();

        //Конвертуємо обєкт у JSON рядок
        String json = gson.toJson(person);

        //Виводжу JSON рядок у консоль
        System.out.println(json);


    }}