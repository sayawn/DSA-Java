package sayan;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String reverse = "";
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            reverse = ch + reverse;
        }
        System.out.println(reverse);
    }
}
