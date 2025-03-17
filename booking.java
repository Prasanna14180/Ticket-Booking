package project2;

import java.util.Scanner;

public class booking {
public static void main(String[] args) {
data r=new data();
int a=1;
while(a!=0){
Scanner sc=new Scanner(System.in);
System.out.println("=========================================================");
System.out.println("|             Welcome to IPCS Bus travels               |");
System.out.println("=========================================================");
System.out.println("|         Bus             |          Passenger          | ");
System.out.println("|Enter 1 for Add Bus      |Enetr 3 for Book Ticket      |");
System.out.println("|Enter 2 for bus details  |Enter 4 for passenger details|");
System.out.println("|Enter 5 for Search bus   |                             |");
System.out.println("*********************************************************");
System.out.println();
System.out.println(" Enter the number :");
a=sc.nextInt();
if(a==1){
r.badd();
}
else if(a==2){
r.bdisplay();
}
else if(a==3){
r.tbook();
}
else if(a==4){
r.pdisplay();
}
else if(a==5){
r.searchbus();
}
else if(a==0){
System.out.println("-----------------Thank you visit Again------------");
}
}
}
}
