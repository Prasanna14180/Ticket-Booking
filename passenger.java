package project2;
import java.util.*;
public class passenger {

String pname;
String gender;
int age;
int Number;


passenger(){
Scanner sc=new Scanner(System.in);
System.out.println("Enter your name :");
this.pname=sc.next();
System.out.println("Gender :");
this.gender=sc.next();
System.out.println("AGE :");
this.age=sc.nextInt();
System.out.println("Enter Bus Number");
this.Number=sc.nextInt();
}
public String getpname(){
return pname;
}
public void setpname(String pname){
this.pname=pname;
}
public String getgender(){
return gender;
}
public void setroute(String gender){
this.gender= gender;
}
public int getage(){
return age;
}
public void setage(int age){
this.age= age;
}
public int getNumber(){
    return Number;
    }
    public void setNumber(int age){
    this.Number=Number;
    }
}


