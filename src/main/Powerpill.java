package main;

public class Powerpill {
    private int power;
    public Powerpill(){
        power = 50;
    }
    public Powerpill(int power){
        this.power = power;
    }

    public int power() {
        return power;
    }

    public Powerpill setPower(int power) {
        this.power = power;
        return this;
    }
}
