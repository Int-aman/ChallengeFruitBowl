
public class MultiLayerBowl {
    private List<Bowl> bowls;
    private int numOfLayers = 3;

    public MultiLayerBowl() {
        this(numOfLayers);
    }

    public MultiLayerBowl(List<Bowl> bowls) {
        this.bowls = bowls;
    }

    public MultLayerBowl(int numOfLayers) {
        this.bowls = new ArrayList(numOfLayers);
    }

    public void addBowl(Bowl bowl) {
        this.bowls.add(bowl);
    }

    public void removeABowl(Bowl bowl) {
        this.bowls.remove(bowl);
    }

    //override tostring

    public void addFruit(Fruit fruit, Bowl bowl) {
        //Find the bowl which matches
        //Add fruit to that bowl
        //Add bowl back to the list
    }

    public void removeFruit(Fruit fruit, Bowl bowl) {
        //Find the bowl which matches
        //Remove fruit to that bowl
        //Add bowl back to the list
    }
}