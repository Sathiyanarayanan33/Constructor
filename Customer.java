public class Customer{ //constructor
int addaharno;
long mobileno;
String name;

public static void main(String ar [])
{
Customer sathiya=new Customer(12345,7094549316l,"sathiya");
Customer deva=new Customer(54321);
sathiya.applay();
deva.applay();


}
public Customer(int addaharno, long mobileno, String name)
{
this.addaharno=addaharno;
this.mobileno=mobileno;
this.name=name;
}

public Customer(int addaharno)
{
this.addaharno=addaharno;
}

public void applay()
{
System.out.println("addaharno"+" "+ addaharno +"  mobileno"+" "+ mobileno +" name"+" "+ name);

}
}
/*addaharno 12345  mobileno 1234567890 name sathiya
addaharno 54321  mobileno 0 name null*/

