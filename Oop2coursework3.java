package oop2coursework3;
import java.util.ArrayList;
public class Oop2coursework3 {
        public static void main(String[] args) {
        ArrayList<String>vat = new ArrayList();
       Student std = new Student();
       int s = 1;
       for(;true;){
           System.out.println("Enter Student(or exit when done)"+ s +": ");
           std.a = new java.util.Scanner(System.in).nextLine();
           if(std.a.toLowerCase().equals("exit"))
               break;
           else
           {
               System.out.println("Enter " + std.a + "'s Registration N");
               std.x = new java.util.Scanner(System.in).nextLine();
               System.out.println("Enter " + std.a + "'s Year of Birth");
               std.y = new java.util.Scanner(System.in).nextLine();
       Courseunit crs1 = new Courseunit();
       System.out.println("Enter SUBJECT 1: ");
       crs1.setB(new java.util.Scanner(System.in).nextLine());
       Marks mrk1 = new Marks();
       for(;mrk1.getD() <= 0 || mrk1.getD() > 100;){
       System.out.println("Enter " + crs1.getB() + " results: ");
       mrk1.setD(new java.util.Scanner(System.in).nextInt());
       }
       Courseunit crs2 = new Courseunit();
       System.out.println("Enter SUBJECT 2: ");
       crs2.setC(new java.util.Scanner(System.in).nextLine());
       Marks mrk2 = new Marks();
       for(;mrk2.getE() <= 0 || mrk2.getE() > 100;){
       System.out.println("Enter " + crs2.getC() + " results: ");
       mrk2.setE(new java.util.Scanner(System.in).nextInt());
       }
       Courseunit crs3 = new Courseunit();
       System.out.println("Enter SUBJECT 3: ");
       crs3.setG(new java.util.Scanner(System.in).nextLine());
       Marks mrk3 = new Marks();
       for(;mrk3.getF() <= 0 || mrk3.getF() > 100;){
       System.out.println("Enter " + crs3.getG() + " results: ");
       mrk3.setF(new java.util.Scanner(System.in).nextInt());
       }
       Courseunit crs4 = new Courseunit();
       System.out.println("Enter SUBJECT 4: ");
       crs4.setH(new java.util.Scanner(System.in).nextLine());
       Marks mrk4 = new Marks();
       for(;mrk4.getL() <= 0 || mrk4.getL() > 100;){
       System.out.println("Enter " + crs4.getH() + " results: ");
       mrk4.setL(new java.util.Scanner(System.in).nextInt());
       }
       Courseunit crs5 = new Courseunit();
       System.out.println("Enter SUBJECT 5: ");
       crs5.setI(new java.util.Scanner(System.in).nextLine());
       Marks mrk5 = new Marks();
       for(;mrk5.getM() <= 0 || mrk5.getM() > 100;){
       System.out.println("Enter " + crs5.getI() + " results: ");
       mrk5.setM(new java.util.Scanner(System.in).nextInt());
       }
       Courseunit crs6 = new Courseunit();
       System.out.println("Enter SUBJECT 6: ");
       crs6.setJ(new java.util.Scanner(System.in).nextLine());
       Marks mrk6 = new Marks();
       for(;mrk6.getN() <= 0 || mrk6.getN() > 100;){
       System.out.println("Enter " + crs6.getJ() + " results: ");
       mrk6.setN(new java.util.Scanner(System.in).nextInt());
       }
       double z = ((mrk1.getD()+mrk2.getE()+mrk3.getF()+mrk4.getL()+mrk5.getM()+mrk6.getN())*100)/600;
       System.out.println("Average is "+z+"%");
       vat.add(std.a);
       s++;
           }
       }
    } 
}
