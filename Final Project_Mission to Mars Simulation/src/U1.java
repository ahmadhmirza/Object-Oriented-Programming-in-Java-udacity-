public class U1 extends Rocket {
    private int ID=0;

    public U1(){
        this.setRocketWeight(10000); //10Tonnes
        this.setMaxWeight(18000); //18Tonnes
        this.rocketType=1;
        this.setCurrentWeight(getRocketWeight());
        this.setRocketCost(100);  //$100Million
        ID++;
    }

    public boolean launch(){
        chanceLaunchExplosion= 0.05 *(getCurrentWeight()/getMaxWeight());
        if (chanceLaunchExplosion>0.7) {
            return false;
        }
        else{
            return true;
        }

    }


    public boolean land(){
        chanceLandingCrash= 0.01 *(getCurrentWeight()/getMaxWeight());
        if (chanceLandingCrash>0.7){
            return false;
        }
        else{
            return true;
        }
    }


}


   // Chance of launch explosion = 5% * (cargo carried / cargo limit)
   // Chance of landing crash = 1% * (cargo carried / cargo limit)