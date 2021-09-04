Public class order
{
Private Scanner Sc=New Scanner();
TrackOrder TO=new TrackOrder();
Private String title;
public void Payment()
{
System.out.println ("Please Confirm If the payment Method \n 1. Paytm\n2.Google ");
int Payment = sc.nextIn();
if (Payment=1)
{
TO.Update("Payment Is done Through "+Payment) ;
Return 1;
}
Else if (Payment=2){
TO.Update("Payment Is done Through "+Payment) ;
Return 1;
}
else {
TO.Update("No Payment so Order is cancelled ");
Return 0;
}
}
public void PlaceOrder(Name,Details)
{
This.title=Name

Systemout.println("Hello "+Name+" Your order is Placed Please refer the details\n "+ Details)
TO.TrackDetails(Name);

}

}