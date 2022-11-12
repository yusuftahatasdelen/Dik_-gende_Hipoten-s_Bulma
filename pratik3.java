import java.util.Scanner;
public class pratik3 {
    public static void main(String[] args) {
        double a, b, c;

        Scanner girdi = new Scanner(System.in);
        System.out.print("Birinci Kenarı Giriniz : ");
        a = girdi.nextInt();
        System.out.print("İkinci Kenarı Giriniz : ");
        b = girdi.nextInt();
        System.out.print("Üçüncü Kenarı Giriniz : ");
        c = girdi.nextInt();

        double u = (a + b + c)/2 , alan ;
        alan = Math.sqrt(u * (u-a)* (u-b) * (u-c));

        System.out.println(alan);



    }
}
