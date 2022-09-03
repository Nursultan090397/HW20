public class Car {
    private String nameCar;

    public Car(String nameCar) {
        this.nameCar = nameCar;
    }

    public String getNameCar() {
        return nameCar;
    }

    public  void close (){
        System.out.println("Mashina jabylyp jatat");
    }
    public void drive () {
        System.out.println("Mashina jurup jatat");
    }
}
