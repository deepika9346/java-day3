 import java.util.*;

public class strmeth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine(); 
        System.out.println("Enter a String:");
        System.out.println("Length = " + str.length());
        System.out.println("UpperCase = " + str.toUpperCase());
        System.out.println("LowerCase = " + str.toLowerCase());
         if (str.length()>3) {
            System.out.println("CharAt(3) = " + str.charAt(3));
        } else {
            System.out.println("String is short for charAt(3)");
        }
    }
}