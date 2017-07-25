package com.example;

import com.example.common.Month;

import java.util.List;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> months = new ArrayList<>();

        for (Month a : Month.values()) {
            months.add(a.getEnglishName());
        }
        
        System.out.println("Choose a month from the following: " + months.toString());
        String userMonth = scanner.nextLine();

        removePreviousMonths(months, userMonth);

    }

    public static void removePreviousMonths(List months, String userMonth){
        while (!Objects.equals(months.get(0).toString(), userMonth)) {
                months.remove(0);
        }

        System.out.println(months);

}











}
