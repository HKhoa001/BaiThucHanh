package Demo;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class mainclass{
public static Scanner sc = new Scanner(System.in);
    public static void main (String[] args) {
        Map <String,Student> Sv = new HashMap<>();
        Student St = new Student();
        int n;
        n = sc.nextInt();
        St.nhap(Sv, sc, n);
    }
}