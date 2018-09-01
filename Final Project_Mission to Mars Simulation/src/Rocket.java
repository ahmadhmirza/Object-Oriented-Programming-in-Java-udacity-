public class Rocket implements SpaceShip {

    //class fields
    private int rocketCost;
    private int rocketWeight;
    private int maxWeight;

    private int currentWeight;

    double chanceLaunchExplosion;
    double chanceLandingCrash;
    int rocketType;  //1,2





    public Rocket(){
        //ID++;
    }
    //methods
    public boolean launch(){
    return true;
    }


    public boolean land(){
        return true;
    }

    public boolean canCarry(Item item){

        int projectedWeight = currentWeight+item.getWeight();
        if (projectedWeight>maxWeight){
            return false;
        }
        else
            return true;
    }

    public void carry(Item item){
        updateCurrentWeight(item);
    }

    public void updateCurrentWeight(Item item){
        currentWeight=currentWeight+item.getWeight();
    }


    //Getter and Setter Methods
    public int getRocketCost() {
        return rocketCost;
    }

    public void setRocketCost(int rocketCost) {
        this.rocketCost = rocketCost;
    }

    public int getRocketWeight() {
        return rocketWeight;
    }

    public void setRocketWeight(int rocketWeight) {
        this.rocketWeight = rocketWeight;
    }

    public int getMaxWeight() {
        return maxWeight;
    }
    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public int getCurrentWeight() {
        return currentWeight;
    }

    public void setCurrentWeight(int currentWeight) {
        this.currentWeight = currentWeight;
    }

}
