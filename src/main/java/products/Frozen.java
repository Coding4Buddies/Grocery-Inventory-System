package products;

public class Frozen extends Product{

    private double minimum_temperature;
    private double maximum_temperature;

    @Override
    public void category_name() {
        System.out.println("Frozen Foods");
    }

    public double getMinimum_temperature() {
        return minimum_temperature;
    }

    public void setMinimum_temperature(double minimum_temperature) {
        this.minimum_temperature = minimum_temperature;
    }

    public double getMaximum_temperature() {
        return maximum_temperature;
    }

    public void setMaximum_temperature(double maximum_temperature) {
        this.maximum_temperature = maximum_temperature;
    }
}
