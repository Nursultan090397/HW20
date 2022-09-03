import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Car car = new Car("Matiz");
        System.out.println(car.getNameCar());
        try {
            car.drive();
            throw new IOException();
        } catch (Exception e) {
            car.close();
        }


    }
}