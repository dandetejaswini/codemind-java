import java.util.*;
public class DaysIntoYears{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = a/365;
        int c = (a - (b*365))/7;
        System.out.println(b);
        System.out.println(c);
    }
}