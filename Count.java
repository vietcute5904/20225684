import java.util.Scanner;
public class Count {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 
        System.out.print("Hay nhap so thu nhat: ");
        double a = sc.nextDouble();
        System.out.print("Hay nhap so thu hai: ");
        double b = sc.nextDouble();
        System.out.println("____________________");
        System.out.println("Tong cua hai so la: " +(a+b));
        System.out.println("Hieu cua hai so la: " +(a-b));
        System.out.println("Tich cua hai so la: " +(a*b));
        System.out.println("Thuong cua hai so la: " +(a/b));
    }
}
