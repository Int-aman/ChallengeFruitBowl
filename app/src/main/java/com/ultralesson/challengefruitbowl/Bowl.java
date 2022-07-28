public class Bowl {
    private List<Fruit> fruits;
    
    public Bowl() {
       this(new ArrayList());
    }

    public Bowl(List<Fruit> fruits) {
        this.fruits = fruits;
    }

    public void addFruit(Fruit fruit) {
        this.fruits.add(fruit);
    }

    public void removeFruit(Fruit fruit){
        this.fruits.remove(fruit);
    }

    public void removeFruitByName(String fruitName){
        //First find fruit which matches the name.
        //Remove it.

    }

    public int getFruitQuanity(Fruit fruit) {

    }

    public int getFruitColors(Fruit fruit) {
        
    }
}