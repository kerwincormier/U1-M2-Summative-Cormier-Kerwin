public class CarClass {


    //create variables
    private String make;
    private String model;
    private int year;
    private String color;
    private int miles;


    //create empty set
    public CarClass() { }


    //create array string
    public CarClass(String make, String model, int year, String color, int miles) {
        this.make = make;
        this.model = model;
        this.year=year;
        this.color=color;
        this.miles = miles;
    }

    //getters and setters

    public String getMake() {
        return this.make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return this.model = model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return this.year = year;
    }

    public void setYear(int year) {
        this.year= year;
    }

    public int getMiles() {
        return this.miles;
    }

    public void setMiles(int miles) {
        this.miles = miles;
    }
}