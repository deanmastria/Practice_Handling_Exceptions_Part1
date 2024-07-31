package org.example;

    public class Person {
        private String name;
        private int age;

        //Constructor to instantiate Person
        public Person(String name, int age) {

            if (name == null || name.isEmpty() || name.length() > 40) {
                throw new IllegalArgumentException("Name cannot be null or empty, must be greater than 40 char.");
            }
            if (age < 0 || age > 120) {
                throw new IllegalArgumentException("Age must be between 0 and 120.");
            }
            this.name = name;
            this.age = age;
        }

        //Getters for name and age
        public String getName() {
            return name;
        }
        public int getAge() {
            return age;
        }

    }

