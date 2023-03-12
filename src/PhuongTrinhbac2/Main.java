package PhuongTrinhbac2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a");
        double a= sc.nextDouble();
        System.out.println("Enter b");
        double b= sc.nextDouble();
        System.out.println("Enter c");
        double c= sc.nextDouble();
        QuadraticEquation ptb2=new QuadraticEquation(a,b,c);
        System.out.println("delta : "+ptb2.Discriminant());
        if (a==0){
            if (b==0){
                System.out.println("Phương trình vô nghiệm");
            }else {
                System.out.println("Phương trình có 1 nghiệm : x= "+ -c/b);
            }
        }
        double x1;
        double x2;
//         ptb2.Discriminant();
        if ( ptb2.Discriminant()>0){
            x1= ((-b+Math.sqrt( ptb2.Discriminant()))/(2*a));
            x2= ((-b-Math.sqrt( ptb2.Discriminant()))/(2*a));
            System.out.println("Phuơng trình có 2 nghiệm là: "+"x1= "+x1 +";" +"x2= " +x2);
        } else if ( ptb2.Discriminant()==0) {
            x1=-b/(2*a);
            System.out.println("Phương trình có nghiệm kép là: x= " + x1);
        }else {
            System.out.println("Phương trình vô nghiệm");
        }
    }


}
