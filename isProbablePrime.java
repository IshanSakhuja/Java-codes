//https://www.hackerrank.com/challenges/java-primality-test/problem
//To check a number with digits 1 to 100 is prime or not
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String n = scanner.nextLine();
        BigInteger ishan = new BigInteger(n);
        boolean result = ishan.isProbablePrime(1);
        if(result == true)
        {
            System.out.println("prime");
        }
        else
        {
            System.out.println("not prime");
        }
        scanner.close();
    }
}