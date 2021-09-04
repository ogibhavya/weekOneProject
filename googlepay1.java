Package com.Event;
import java.util.Scanner;
Public class Youtube
{
Public static void main (String [] Atgs )
{
Scanner scanner = new Scanner(System. in);
Private String State;
Do
{
Order O = new Order();
System.out.println("Please enter Your name");
String Name = scanner. nextLine();
System.out.println("Please enter Your order details");
String Details= scanner. nextLine();
int  Pay=O.Payment();
If(Pay=1)
{
  O.PlaceOrder(Name,Details);
System.out.println("If you Wanna Place the order again Press Y  or Press any other Charecter");
State= scanner. nextLine();
}
}
While(State='Y')


}
}