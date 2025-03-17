package project2;

import java.time.LocalDate;
import java.util.Scanner;

public class data {
LocalDate trip=LocalDate.now();
bus m[]=new bus[4];
int r=0;

passenger g[]=new passenger[10];
int u=0;

void badd(){
bus b=new bus();
m[r]=b;
r=r+1;
}
void bdisplay(){
System.out.println("-----------------------------------------------------------------------");
System.out.println("| Bus Name |  Route  |  Bus number   |   Total seat    |    Date       |" );
for(bus i:m){
if(i!=null){
System.out.println("| "+i.getbname()+" |  "+i.getroute()+" |  "  +i.getNumber()+"   |"+i.getSeatno()+"  |  "+trip+"  |");
}
System.out.println();
}
}

void pdisplay(){
    System.out.println("-------------------------------------------------");
    System.out.println("| Passenger Name |  Gender |  AGE  |Bus Number  |");
    for(passenger i:g){
    if(i!=null){
    System.out.println("| "+i.getpname()+" |"+i.getgender()+"  |"+i.getage()+"|"+i.getNumber()+" |");
    }
}
}

void searchbus(){
Scanner sc=new Scanner(System.in);
String j;
System.out.println("Enter route :");
j=sc.next();
System.out.println("Current Bus Available in This Route  ");
System.out.println("Bus Name | seat Availabe");
for(bus i:m){
if(i!=null){
if(i.getroute().equals(j)){
System.out.println(i.getbname()+"|"+i.getSeatno());
}
}
}
}
void tbook(){
Scanner sc=new Scanner(System.in);
System.out.println("!!!You can only book One ticket At a Time!!!");
String x;
System.out.println("Enter Bus Name :");
x=sc.next();
for(bus i:m){
if(i!=null){
if(i.getbname().equals(x)){
if(i.getSeatno()>0){
    passenger v=new passenger();
    v.setNumber(i.getNumber());
    g[u]=v;
    u=u+1;
System.out.println("Ticket Has Been Booked");
System.out.println("Enjoy The Journey With Us :)");
i.setSeatno(i.getSeatno()-1);
}
else{
System.out.println("-------No Seat Available------");
}
}
}
}
}
}
