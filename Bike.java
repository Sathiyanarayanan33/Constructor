public class Bike{

int price;
String bikemodel;
int emi;
String engine;

public static void main(String ar [])
{
Bike Sathiya=new Bike(100000,"Pulsar",2000);
Bike yuga=new Bike("Yamaha");
Sathiya.Display();
yuga.Display();
}
Bike()
{
engine="TVS";
}

Bike(int price, String bikemodel, int emi)
{
this();

this.price=price;
this.bikemodel=bikemodel;
this.emi=emi;

}

Bike(String bikemodel)
{
this.bikemodel=bikemodel;
}

public void Display()
{
System.out.println("price:"+" "+price + " bikemodel:" +" "+ bikemodel + " emi:"+" "+ emi+ " engine:"+" "+engine);
}
}
