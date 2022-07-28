package com.ultralesson.challengefruitbowl;

import java.util.ArrayList;

public class Runner {

    public void displayFruitArrayList(ArrayList<Fruit> fruitArrayList){
        for(Fruit fruit : fruitArrayList){
            System.out.println("Name: "+fruit.getName()+" Size: "+fruit.getSize());
        }
    }

    public static void main(String[] args) {
        // OldBowl oldBowl = new OldBowl();
        // NewBowl newBowl = new NewBowl();

        // ArrayList<Fruit> oldBowlFruits = new ArrayList<>();
        // // adding fruits in oldBowl
        // oldBowlFruits.add(new Fruit("apple","red","sweet",3));
        // oldBowlFruits.add(new Fruit("peach","orange","tarty sweet",2));
        // oldBowlFruits.add(new Fruit("grape","purple","sour sweet",1));
        // oldBowlFruits.add(new Fruit("cherry","red","sour",1));
        // oldBowlFruits.add(new Fruit("pomegranate","pink","musty",3));
        // oldBowlFruits.add(new Fruit("guava","green","sweet",2));

        // oldBowl.setFruits(oldBowlFruits);
        // newBowl.setOldBowl(oldBowl);
        // newBowl.sortOldBowlFruitsToNewBowl();

        // // printing sorted fruits
        // Runner run = new Runner();
        // System.out.println("  Fruits in top-bowl");
        // run.displayFruitArrayList(newBowl.getFruitsSize1());
        // System.out.println("  Fruits in middle-bowl");
        // run.displayFruitArrayList(newBowl.getFruitsSize2());
        // System.out.println("  Fruits in bottom-bowl");
        // run.displayFruitArrayList(newBowl.getFruitsSize3());


        Bowl mixedBowl = new Bowl();
        mixedBowl.addFruit(new Fruit("apple","red","sweet",3));
        mixedBowl.addFruit(new Fruit("peach","orange","tarty sweet",2));
        mixedBowl.addFruit(new Fruit("grape","purple","sour sweet",1));
        mixedBowl.addFruit(new Fruit("cherry","red","sour",1));

        MultiLayerBowl multiLayerBowl = new MultiLayerBowl(3);

        Segregator segregator = new Segregator(mixedBowl, multiLayerBowl);
        multiLayerBowl = segregator.segregateByName();

        multiLayerBowl.getFruitQuanity()
    }
}
