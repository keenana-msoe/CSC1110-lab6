/*
 * Course: CS-1110
 * Fall 2023
 * Lab 6 - Simple Class
 * Name: Andrew Keenan
 * Created: 09/27/16
 * Modified: 10/02/23
 */
package keenana;

/**
 * This class is used to define a house
 * It sets the size, amount of bathrooms, amount of bedrooms,
 * amount of windows and amount of garages.
 * Then it uses these values to estimate the cost to build the house.
 */
public class BuildingCostEstimator {
    private int cost;
    private int squareFeet;
    private int numFullBaths;
    private int numHalfBaths;
    private int numBedrooms;
    private int numWindows;
    private double numGarages;
    public void setSquareFeet(int squareFeet){
        this.squareFeet = squareFeet;
    }
    public void setNumFullBaths(int numFullBaths){
        this.numFullBaths = numFullBaths;
    }
    public void setNumHalfBaths(int numHalfBaths){
        this.numHalfBaths = numHalfBaths;
    }
    public void setNumBedrooms(int numBedrooms){
        this.numBedrooms = numBedrooms;
    }
    public void setNumWindows(int numWindows){
        this.numWindows = numWindows;
    }
    public void setNumGarages(double numGarages){
        this.numGarages = numGarages;
    }
    public int getSquareFeet(){
        return squareFeet;
    }
    public int getNumFullBaths(){
        return numFullBaths;
    }
    public int getNumHalfBaths(){
        return numHalfBaths;
    }
    public int getNumBedrooms(){
        return numBedrooms;
    }
    public int getNumWindows(){
        return numWindows;
    }
    public double getNumGarages(){
        return numGarages;
    }

    /**
     * This method looks at the size and atributes of the house and uses them
     * to estimate what the price to build the house would be.
     * @return estimate
     */
    public double costToBuild(){
        double estimate = 0;
        final int valuePerFoot = 185;
        final int valuePerFullBath = 30000;
        final int valuePerHalfBath = 12000;
        final int valuePerBedroom = 5000;
        final int valuePerWindow = 1300;
        final int valuePerGarage = 12000;
        estimate = estimate + squareFeet * valuePerFoot;
        estimate = estimate + numFullBaths * valuePerFullBath;
        estimate = estimate + numHalfBaths * valuePerHalfBath;
        estimate = estimate + numBedrooms * valuePerBedroom;
        estimate = estimate + numWindows * valuePerWindow;
        estimate = estimate + numGarages * valuePerGarage;
        return estimate;
    }
}
