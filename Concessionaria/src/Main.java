//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Car car = new Car("BMW", "X6", 2024, 100000);

        car.setValueCar(125000);

        System.out.println("Marca: " + car.getNameCar());
        System.out.println("Modelo: " + car.getModelCar());
        System.out.println("Ano: " + car.getAgeCar());
        System.out.println("Valor: " + car.getValueCar());
    }
}