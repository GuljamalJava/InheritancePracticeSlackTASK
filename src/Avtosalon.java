public class Avtosalon {
    private String name;
    private String address;
    private String country;
    private String numberCar;


    public Avtosalon(String address, String country, String name, String numberCar) {
        this.address = address;
        this.country = country;
        this.name = name;
        this.numberCar = numberCar;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumberCar() {
        return numberCar;
    }

    public void setNumberCar(String numberCar) {
        this.numberCar = numberCar;
    }

    public void getInfo(){

    }



    @Override
    public String toString() {
        return "Avtosalon{" +
                "address='" + address + '\'' +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", numberCar='" + numberCar + '\'' +
                '}';
    }




}
