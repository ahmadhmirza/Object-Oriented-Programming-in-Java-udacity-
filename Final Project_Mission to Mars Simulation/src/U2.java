public class U2 extends Rocket {

    public U2(){
        this.setRocketWeight(18000); //10Tonnes
        this.setMaxWeight(29000); //29Tonnes
        this.rocketType=2;
        this.setCurrentWeight(getRocketWeight());
        this.setRocketCost(120);  //$120Million
    }

    public boolean launch(){
        chanceLaunchExplosion= 0.04 *(getCurrentWeight()/getMaxWeight());
        if (chanceLaunchExplosion>0.7) return false;
        else return true;

    }


    public boolean land(){
        chanceLandingCrash= 0.08 *(getCurrentWeight()/getMaxWeight());
        if (chanceLandingCrash>0.7) return false;
        else return true;
    }


}


    //  Chance of launch explosion = 4% * (cargo carried / cargo limit)
    //   Chance of landing crash = 8% * (cargo carried / cargo limit)