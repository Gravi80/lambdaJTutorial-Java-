
public class Car {
 String brand;
 String model;
 int year;
 Double originalValue;

    public Car(String brand, String model, int year, Double originalValue) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.originalValue = originalValue;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public Double getOriginalValue() {
        return originalValue;
    }
}
