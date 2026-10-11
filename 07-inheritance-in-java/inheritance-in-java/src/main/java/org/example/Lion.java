package org.example;

public class Lion extends Animal {

    // constructor
    public Lion(String name) {
        super(name);
    }

    public String speak() {
        return(name + " lets out a loud ROAR!");
    }

    public String sleep() {
        return(super.sleep() + " " + name + " dreams of a delicious steak.");
    }
}
