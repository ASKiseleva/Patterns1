package ru.netology.delivery.data;

import com.github.javafaker.Faker;
import lombok.Value;
import lombok.val;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Random;

public class DataGenerator {
    static Faker faker = new Faker(new Locale("ru"));

    public static String generateDate(long addDays, String pattern) {
        return LocalDate.now().plusDays(addDays).format(DateTimeFormatter.ofPattern(pattern));

    }

    public static String generateName() {
        return faker.name().name();
    }

    public static String generatePhoneNumber() {
        return faker.numerify("+###########");

    }

    public static final List<String> cities = Arrays.asList(
            "Москва", "Санкт-Петербург", "Псков", "Воронеж", "Великий Новгород", "Смоленск", "Краснодар");

    public static String generateCity() {

        return cities.get(faker.random().nextInt(cities.size()));
    }


}
