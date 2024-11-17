import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//  todo  Автосалон деген класс ачабыз анын полелери(name, address, country, numberCar)
//        болсун, аны мурастаган 2-3 класс
//        болсун жана (model,price, color,год выпуска) ушулар созсуз болсун жана main маани
//        беребиз 4 аз болбосун !!

        Avtosalon avtosalon = new Avtosalon("Fuchika 90", "KG", "CTO", "3443kg");
        System.out.println(avtosalon);

        Car bmw = new Car("Munhen", "Germany", "BMW", "54g4r", "Black", "2009", "x5", "30 000$");
        Car kia = new Car("Busan", "South Korea", "KIA", "202u", "Blue", "2023", "K5", "16 000$");
        Car Huinday = new Car("Seoul", "South Korea", "Huinday", "474t", "Grey", "2021", "solaris", "12 000$");

        Car[] cars1 = new Car[]{bmw, kia, Huinday};
        for (Car car : cars1) {
            System.out.println(car);

        }


        Car2 Mers = new Car2("Berlin", "Germany", "Mersedes", "4542h", "black", "1999", "Amg", "5000$");
        Car2 Mers2 = new Car2("Berlin", "Germany", "Mersedes", "4857u", "purple", "2017", "Amg1", "7000$");
        Car2 Toyota = new Car2("Tokio", "Japan", "Toyota", "5745t", "blue", "2020", "yaris", "7000$");

        Car2[] car2s = new Car2[]{Mers, Mers2, Toyota};
        for (Car2 car2 : car2s) {
            System.out.println(car2);

        }


        Car3 Porter2 = new Car3("Ansan", "South Korea", "porter2", "487r", "blue", "2020", "2", "20 000$");
        Car3 Porter1 = new Car3("Ansan", "South Korea", "porter1", "990r", "white", "2010", "1", "10 000$");

        Car3[] Porters = new Car3[]{Porter1, Porter2};
        System.out.println(Arrays.toString(Porters));

    }
}