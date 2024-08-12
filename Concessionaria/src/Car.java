public class Car {
    private int ageCar;
    private String nameCar;
    private String modelCar;
    private double valueCar;

    Car(String nameCar, String modelCar, int ageCar, double valueCar){
        this.nameCar = nameCar;
        this.modelCar = modelCar;
        this.ageCar = ageCar;
        this.valueCar = valueCar;
    }

    public int getAgeCar() {
        return ageCar;
    }
    public String getModelCar() {
        return modelCar;
    }
    public String getNameCar() {
        return nameCar;
    }
    public double getValueCar() {
        valueCar = valueCar + (valueCar*.1);
        return valueCar;
    }

    public void setAgeCar(int ageCar) {
        this.ageCar = ageCar;
    }
    public void setNameCar(String nameCar) {
        this.nameCar = nameCar;
    }
    public void setModelCar(String modelCar) {
        this.modelCar = modelCar;
    }
    public void setValueCar(double valueCar) {
        this.valueCar = valueCar;
    }
}
