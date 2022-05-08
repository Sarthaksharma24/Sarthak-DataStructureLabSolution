package glfsdDataStructureLabSolution2;

import java.util.Arrays;
import java.util.Scanner;


public class Main {
	public static int totalFloors;
    public static int[] totalFloorSize;

    
    public static void main(String[] args) {
        Construct myConstructObj = new Construct();
        myConstructObj.getInputs();
        myConstructObj.calculateAndPrintOrderOfConstruction(myConstructObj.totalFloorSize);
    }
}
