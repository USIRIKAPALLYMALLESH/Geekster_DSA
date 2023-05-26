import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int firstNo=scn.nextInt();
        int secNo=scn.nextInt();
        int a=firstNo%10;
        int b=secNo%10;
        System.out.println(a+b);
    }
}
