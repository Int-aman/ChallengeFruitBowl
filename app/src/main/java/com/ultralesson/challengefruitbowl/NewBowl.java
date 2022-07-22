package com.ultralesson.challengefruitbowl;

import java.util.ArrayList;

public class NewBowl {
    private OldBowl oldBowl;

    // oldBowl fruits will be sorted in three arraylist based on size (size 1,2,3)
    private ArrayList<Fruit> fruitsSize1 = new ArrayList<>();
    private ArrayList<Fruit> fruitsSize2 = new ArrayList<>();
    private ArrayList<Fruit> fruitsSize3 = new ArrayList<>();

    //sorting function based on size

    public void sortOldBowlFruitsToNewBowl(){
        ArrayList<Fruit> oldBowlFruits = new ArrayList<>(oldBowl.getFruits());
        for(Fruit fruit: oldBowlFruits){
            if(fruit.getSize() == 1){
                fruitsSize1.add(fruit);
            }
            if(fruit.getSize() == 2){
                fruitsSize2.add(fruit);
            }
            if(fruit.getSize() == 3){
                fruitsSize3.add(fruit);
            }
        }
    }


    // getters and setters
    public OldBowl getOldBowl() {
        return oldBowl;
    }

    public void setOldBowl(OldBowl oldBowl) {
        this.oldBowl = oldBowl;
    }

    public ArrayList<Fruit> getFruitsSize1() {
        return fruitsSize1;
    }

    public void setFruitsSize1(ArrayList<Fruit> fruitsSize1) {
        this.fruitsSize1 = fruitsSize1;
    }

    public ArrayList<Fruit> getFruitsSize2() {
        return fruitsSize2;
    }

    public void setFruitsSize2(ArrayList<Fruit> fruitsSize2) {
        this.fruitsSize2 = fruitsSize2;
    }

    public ArrayList<Fruit> getFruitsSize3() {
        return fruitsSize3;
    }

    public void setFruitsSize3(ArrayList<Fruit> fruitsSize3) {
        this.fruitsSize3 = fruitsSize3;
    }
}
