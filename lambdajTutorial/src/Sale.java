public class Sale {
    Person buyer;
    Person seller;
    Car car;
    Double cost;

    public Sale(Person buyer, Person seller, Car car, Double cost) {
        this.buyer = buyer;
        this.seller = seller;
        this.car = car;
        this.cost = cost;
    }

    public Person getBuyer() {
        return buyer;
    }

    public Person getSeller() {
        return seller;
    }

    public Car getCar() {
        return car;
    }

    public Double getCost() {
        return cost;
    }
}
