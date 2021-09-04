Public Class TrackOrder
{
Public void TrackDetails(Name)
{
Update(Name+"Restaurant Accepted ur order");
TimeUnit.SECONDS.sleep(10);
Update(Name+" Ur Agent Is on the way to resturent");
Update(Name+" Food is being prepared");
TimeUnit.SECONDS.sleep(10);
Update(Name+"Agent Is Waiting at the resturent to pick the order");
Update(Name+" Order is picked By Agent");
Update(Name+"Your order is on the way");
TimeUnit.SECONDS.sleep(10);
Update(Name+"Your order is Delivered");
}
Public void update (Statement)
{
System.out.println(Statement);
}
}