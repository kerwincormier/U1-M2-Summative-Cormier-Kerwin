import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class CarController {


    private List<CarClass> carList;

    public CarController() {
        carList = new ArrayList<>();
        carList.add(new CarClass("Chevrolet", "Chevelle SS", 1968, "blue", 187000));
        carList.add(new CarClass("Subaru", "Outback", 2015, "maroon", 69000));
        carList.add(new CarClass("Chevrolet", "Silverado", 2002, "blue", 200000));
        carList.add(new CarClass("Nissan", "Altima", 2005, "silver", 203000));
        carList.add(new CarClass("Ford", "Mustang", 1985, "red", 185000));

        carList.remove(3);

        System.out.println(carList);

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter max mileage accepted: ");

        int miles = Scanner.nextInt();
        Boolean isUnder = 100000 < miles;

        if (miles > 0 && miles < 100000)
            System.out.println("Here are your results: ");
        else System.out.println("No cars match your results");

        //I know this if else is not correct; work on getting user input and printing comparison values from list
//Also, find out why nextInt doesn't work here. Do I need to call int miles on this page to use it?


    }
}