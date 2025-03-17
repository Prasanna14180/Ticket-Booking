package project2;

import java.util.Scanner;

public class bus {

String bname;
String route;
int number;
int seatno;

bus(){
Scanner sc=new Scanner(System.in);
System.out.println("Enter bus name");
this.bname=sc.next();
System.out.println("Route");
this.route=sc.next();
System.out.println("Enter bus number :");
this.number=sc.nextInt();
System.out.println("Total seat :");
this.seatno=sc.nextInt();
}
public String getbname() {
    return bname;
}
public void setbname(String bname) {
    this.bname = bname;
}

public String getroute() {
    return route;
}
public void setroute(String route) {
    this.route = route;
}
public int getNumber() {
    return number;
}
public void setNumber(int number) {
    this.number = number;
}
public int getSeatno() {
    return seatno;
}
public void setSeatno(int seatno) {
    this.seatno = seatno;
}
}
