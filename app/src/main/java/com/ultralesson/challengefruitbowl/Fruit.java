package com.ultralesson.challengefruitbowl;

public class Fruit {
    private String name;
    private String colour;
    private String taste;
    private int size;

    public Fruit(String name, String colour, String taste, int size){
        this.name = name;
        this.colour = colour;
        this.taste = taste;
        this.size = size;
    }
    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
