import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter hours, minutes, seconds:");
        int h = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();
        Time a = new Time(h,m,s);
        System.out.println("v minutah: " + a.perevod());
        System.out.println("pribavit secund:  ");
        int p = sc.nextInt();
        a.slozhenie(p);
        System.out.println("vychest secund:  ");
        int v = sc.nextInt();
        a.vychitanie(p);
        System.out.println("sravnit s:  ");
        int h1 = sc.nextInt();
        int m1 = sc.nextInt();
        int s1 = sc.nextInt();
        Time b = new Time(h1,m1,s1);
        a.sravn(b);
    }
}