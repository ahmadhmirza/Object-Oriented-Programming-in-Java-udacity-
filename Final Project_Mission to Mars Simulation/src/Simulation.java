import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Simulation {

    public int totalBudget=0;
    ArrayList<Item> itemList = new ArrayList<Item>();
    ArrayList<U2> u2List = new ArrayList<U2>();


    public ArrayList<Item> loadItems(String itemsListPath) {
        File inputFile = new File(itemsListPath);
        String[] itemData = new String[2];
        try {
            Scanner scanner = new Scanner(inputFile);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                itemData = line.split("=");
                Item item = new Item(itemData[0], Integer.parseInt(itemData[1]));
                itemList.add(item);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File Not Found!");
        }
        return itemList;
    }

    public void showItems(ArrayList<Item> itemList){
        for(Item item:itemList){
            System.out.println("Item Name: " + item.getName() + ", Weight: "+item.getWeight());
        }

    }
    public void showRockets(ArrayList<Rocket> rocketList){
        for(Rocket rocket:rocketList){
            System.out.println("Rocket " + rocket.rocketType );
        }

    }
    public ArrayList<Rocket> loadU1(ArrayList<Item> itemList) {
        ArrayList<Rocket> u1List = new ArrayList<Rocket>();
        //ArrayList<Item> itemList = new ArrayList<Item>();
        //itemList = loadItems(itemsListPath);



        for (int i = 0; i < itemList.size(); i++) {
            U1  u11= new U1();
            u1List.add(i,u11);

            while (u1List.get(i).getCurrentWeight() <= u1List.get(i).getMaxWeight()) {

                u1List.get(i).updateCurrentWeight(itemList.get(i));
            }

        }
        return u1List;
    }


    public ArrayList<Rocket> loadU2(ArrayList<Item> itemList) {
        ArrayList<Rocket> u2List = new ArrayList<Rocket>();
        //ArrayList<Item> itemList = new ArrayList<Item>();
        //itemList = loadItems(itemsListPath);

        for (int i = 0; i < itemList.size(); i++) {
            U2  u22= new U2();
            u2List.add(i,u22);

            while (u2List.get(i).getCurrentWeight() <= u2List.get(i).getMaxWeight()) {

                u2List.get(i).updateCurrentWeight(itemList.get(i));
            }

        }
        return u2List;
    }

    public int runSimulation(ArrayList<Rocket> rocketList,int rocketType) {
            boolean launchStatus;
            boolean landStatus;
            boolean rocketSuccess=false;
            int rocketNumber=0;

            for(Rocket rocket:rocketList){
                rocketNumber++;
                if (rocketType==1){
                    while (rocketSuccess!=true){

                        launchStatus=((U1) rocket).launch();
                        System.out.println("Rocket U1 ID "+rocketNumber+" carrying "+rocket.getCurrentWeight()+"kg cargo launched!");
                        landStatus=((U1) rocket).land();

                        if(launchStatus==false || landStatus==false) {
                            totalBudget=totalBudget+rocket.getRocketCost();
                            System.out.println("Crash detected");
                            rocketSuccess=false;
                        }
                        else{
                            totalBudget=totalBudget+rocket.getRocketCost();
                            rocketSuccess=true;
                            System.out.println("Rocket U1 ID "+rocketNumber+" carrying "+rocket.getCurrentWeight()+"kg cargo landed!");
                        }
                    }
                }


                else if (rocketType==2){
                    while (rocketSuccess!=true){
                        launchStatus=((U2) rocket).launch();
                        landStatus=((U2) rocket).land();

                        if(launchStatus==false || landStatus==false) {
                            totalBudget=totalBudget+rocket.getRocketCost();
                            System.out.println("Crash detected");
                            rocketSuccess=false;
                        }
                        else{
                            totalBudget=totalBudget+rocket.getRocketCost();
                            rocketSuccess=true;
                        }
                    }
                }
                else {
                    System.out.println("Unknown Rocket Type!");
                }
                rocketSuccess=false;
            }

        return totalBudget;
    }
}
