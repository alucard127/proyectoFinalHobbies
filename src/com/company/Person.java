package com.company;

public class Person {
    private String name;
    private String lastName;
    private String city;
    private int age;
    private int ci;


    public Person(String name, String lastName, String city, int age, int ci) {
        this.name = name;
        this.lastName = lastName;
        this.city = city;
        this.age = age;
        this.ci = ci;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCity() {
        return city;
    }

    public int getAge() {
        return age;
    }

    public int getCi() {
        return ci;
    }
    public String displayDataPerson(){
        return "the name user is : "+getName()+ " "+getLastName()+ " city : "+getCity()+" the age is: "+getAge();
    }
}


