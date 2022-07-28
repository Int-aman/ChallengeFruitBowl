public class Segregator {

    private Bowl mixedBowl;
    private MultiLayerBowl multiLayerBowl;

    public Segregator(Bowl bowl, MultiLayerBowl multiLayerBowl) {
            this.mixedBowl = bowl;
            this.multiLayerBowl = multiLayerBowl;
    }

    public MultiLayerBowl segregateByName() {
        return multiLayerBowl;
    }

    public MultiLayerBowl segregateByColor() {
        return multiLayerBowl;
    }

    public MultiLayerBowl segregateByType() {
        return multiLayerBowl;
    }
}