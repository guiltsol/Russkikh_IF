import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Car> listCar = Arrays.asList(new Audi(2006, "mechanics", "Q7", 80, 250, "Black"),
                new Bmw(2002, "automatic", "X6", 70, 230, "Green"),
                new Toyota(2003, "mechanics", "Yaris", 55, 240, "White"),
                new Suzuki(2016, "mechanics", "Vitara", 65, 220, "Green"),
                new Volvo(2012, "automatic", "S60", 70, 300, "Black"),
                new Bmw(2001, "automatic", "X5", 75, 180, "Pink"),
                new Toyota(2004, "mechanics", "Crown", 62, 200, "Green"),
                new Suzuki(2008, "mechanics", "Jimny", 90, 210, "Red"),
                new Volvo(2010, "automatic", "S90", 72, 190, "White"),
                new Audi(2014, "mechanics", "A7", 65, 255, "Blue")
        );

        System.out.println("------------------------------Вывод информации о машинах!------------------------------");
        carInfo(listCar, 2006);
        System.out.println("-----------------------------Проверка метода смены цвета автомобиля!-----------------------------");
        changeColor(listCar,"Green","Red");
        System.out.println("-----------------------------------Проверка собственного метода!-----------------------------------");
        refill(listCar);
    }

    private static void carInfo(List<Car> list, int year){
       for (Car car: list){
           if (car.getYearOfRelease() <= year){
               System.out.println("устаревший авто");
           } else {
               System.out.println(car);//сработал из-за переопределения toString
           }
       }
    }

    private static void changeColor(List<Car> list, String oldColor, String newColor){
        for (Car car: list){
            if (car.getColor().toLowerCase().equals(oldColor.toLowerCase())){
                car.setColor(newColor);
            }
            System.out.println(car);
        }
    }

    private static void refill(List<Car> list){
        for (Car car: list){
            if (car.getTransmissionType().equals("automatic") || car.getEnergyCapacity() < 75){
                System.out.println(car + " - заправлять авто придется часто!");
            } else {
                System.out.println(car + " - авто можно долго не заправлять!");
            }
        }
    }
}
