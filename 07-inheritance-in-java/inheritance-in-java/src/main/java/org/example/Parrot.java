package org.example;

public class Parrot extends Animal{

    // constructor
    public Parrot(String name) {
       super(name);
    }

    public String speak() {
        return(name + " says '" + name + " wants a cracker!'");
    }

    public String eat() {
        return(name + " is eating a cracker.");
    }

    public String fly() {
        return(name + " is flying around the zoo.");
    }

}
