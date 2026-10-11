package org.example;

public class Elephant extends Animal {

    // constructor
    public Elephant(String name) {
        // super = parent class
        super(name);
    }

    public String speak() {
        return(name + " makes a loud trumpet sound.");
    }

}
