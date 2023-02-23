package main;

public class Grok {
    private final int Default_powerSupply = 50;
    private final int Max_powerSupply = 100;
    private final int Min_powerSupply = 0;
    private int powerSupply;
    private boolean isAlive;

    //sets up grok with a default powerSupply
    public Grok() {

    }

    public Grok(int powerSupply) {

    }

    //Reduces powerLevel by 5
    public void tookHit(){

    }
    /*
    Only sets powerSupply is grok is alive
    powerSupply does not go above 100 or below 0
     */
    public void setPowerSupply(int powerSupply) {

    }
    //returns true if the grok is dead
    public boolean isDead(){
        return false;
    }

    public int getPowerSupply(){
        return powerSupply;
    }


    //DO NOT TOUCH THIS METHOD
    @Override
    public String toString() {
        return ("Power: "+powerSupply+", Alive: "+isAlive);
    }
}
