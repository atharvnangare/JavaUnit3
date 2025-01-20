package Unit3;

class Vehicle
{
    public int engine_no;
    public double Amount;
    public String color;
    public int speed;
    public String Brand;

    void Start()
    {
        System.out.println("Vehicle");
    }
    /*Vehicle(int engine_no, double Amount, String color, int speed, String Brand)
    {
        this.engine_no = engine_no;
        this.Amount = Amount;
        this.color = color;
        this.speed = speed;
        this.Brand = Brand;
    }
    public void print()
    {
        System.out.println("Engine No"+ engine_no);
        System.out.println("Amount"+ Amount);
        System.out.println("Color"+ color);
        System.out.println("Speed"+ speed);
        System.out.println("Brand"+ Brand);
    }*/

}
class Two_Wheeler extends Vehicle
{
    /*public boolean ABS;
    public int gears;
    public int seats;*/

    void ride()
    {
        System.out.println("Bike");
    }

}
class Car extends Two_Wheeler{
    public int Air_Conditioner;
    public int Airbags;
    public boolean drift;
    void drive()
    {
        System.out.println("Drive");
    }

}
class Truck extends Vehicle{
    String Truck_type;
    int truck_capacity;
    void method()
    {
        System.out.println("This is Truck");
    }
}
public class Hierrarchical_Inheritance {
    public static void main(String[] args) {
        Car obj = new Car();
        obj.Start();
        obj.ride();
        obj.drive();
        Truck obj1 = new Truck();
        obj1.method();
    }
}
