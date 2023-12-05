public class HotDrink extends Drink{
    private int temperature;
    public HotDrink(String name, int volume, int temperature) {
        super(name, volume);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return "BottleOFWater{" +
                "Name = " + super.getName() +
                ", Volume = " + super.getVolume() +
                ", Temperature = " + temperature +
                '}';
    }
}
