package Task_4;

public class car {
    private String model;
    private double price;
    private int maxSpeed;
    private int countOfWheels;

    private car(Builder builder) {
        this.model = builder.model;
        this.price = builder.price;
        this.maxSpeed = builder.maxSpeed;
        this.countOfWheels = builder.countOfWheels;
    }
    public static class Builder {
        private String model;
        private double price;
        private int maxSpeed;
        private int countOfWheels;

        public Builder setModel(String model) {
            this.model = model;
            return this;
        }

        public Builder setPrice(double price) {
            this.price = price;
            return this;
        }

        public Builder setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public Builder setCountOfWheels(int countOfWheels) {
            this.countOfWheels = countOfWheels;
            return this;
        }

        // Метод финального создания объекта Car
        public car build() {
            return new car(this);
        }
    }
    @Override
    public String toString() {
        return  "Car {" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", maxSpeed=" + maxSpeed +
                ", countOfWheels=" + countOfWheels +
                '}';
    }
}
