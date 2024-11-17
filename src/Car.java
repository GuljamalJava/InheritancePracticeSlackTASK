public class Car extends Avtosalon  {

    private  String model;
    private  String price;
    private  String color;
    private  String dateOfPr;

    public Car(String address, String country, String name, String numberCar, String color, String dateOfPr, String model, String price) {
        super(address,country,name,numberCar);
        this.color = color;
        this.dateOfPr = dateOfPr;
        this.model = model;
        this.price = price;
    }




    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDateOfPr() {
        return dateOfPr;
    }

    public void setDateOfPr(String dateOfPr) {
        this.dateOfPr = dateOfPr;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +super.toString()+
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", dateOfPr=" + dateOfPr +
                '}';
    }
}
