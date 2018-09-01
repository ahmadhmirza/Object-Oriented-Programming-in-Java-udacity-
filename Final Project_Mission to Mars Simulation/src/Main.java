import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    int totalBudget=0;
    public static void main(String[] args){
        Simulation newSimulation = new Simulation();
        newSimulation.loadItems("phase-1.txt");
        newSimulation.loadItems("phase-2.txt");
        //newSimulation.showItems(newSimulation.itemList);
        ArrayList<Rocket> u1List = new ArrayList<Rocket>();
        u1List=newSimulation.loadU1(newSimulation.itemList);
        //newSimulation.showRockets(u1List);
        newSimulation.runSimulation(u1List,1);
        System.out.println("Total budget For Phase 1 and 2 with Rocket U1= $"+ newSimulation.totalBudget + " million");

        Simulation newSimulationU2 = new Simulation();
        newSimulationU2.loadItems("phase-1.txt");
        newSimulationU2.loadItems("phase-2.txt");
        //newSimulation.showItems(newSimulation.itemList);
        ArrayList<Rocket> u2List = new ArrayList<Rocket>();
        u2List=newSimulation.loadU2(newSimulationU2.itemList);
        //newSimulation.showRockets(u1List);
        newSimulationU2.runSimulation(u2List,2);
        System.out.println("Total budget For Phase 1 and 2 with Rocket U2= $"+ newSimulationU2.totalBudget + " million");
    }
}
