import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String number1 = reader.readLine();
        int y = Integer.parseInt(number1);
        String number2 = reader.readLine();
        int m = Integer.parseInt(number2);
        String number3 = reader.readLine();
        int d = Integer.parseInt(number3);
        System.out.println("Меня зовут " + name+ "."+ "\n" + "Я родился "+ d +"."+m+"."+y);


    }
}
