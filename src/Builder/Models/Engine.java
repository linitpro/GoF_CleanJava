package Builder.Models;

public class Engine {
    public Engine() {}

    public Engine(Float power) {
        this.power = power;
    }

    public Float getPower() {
        return this.power;
    }
    public void setPower(Float power) { this.power = power; }
    public String getFuel() {return this.fuel;}
    public void setFuel(String fuel) { this.fuel = fuel; }

    private Float power;
    private String fuel;
}
