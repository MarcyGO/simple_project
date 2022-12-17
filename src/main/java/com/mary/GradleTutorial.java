package com.mary;

import java.util.HashSet;
import java.util.Set;

public class GradleTutorial {
    public static void main(String[] args) {
        System.out.println("Gradle 4tw!");
        Set<String> s1 = new HashSet<String>();
        s1.add("monday");
        s1.add("Chicago");
        s1.add("Plato");
        for (String ele : s1) {
            System.out.print(ele + " ");
        }
    }
}