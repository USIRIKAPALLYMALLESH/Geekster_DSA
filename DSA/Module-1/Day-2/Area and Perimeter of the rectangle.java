import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int length=scn.nextInt();
        int breadth=scn.nextInt();
        int paremeter=2*(length+breadth);
        System.out.println(length*breadth);
        System.out.println(paremeter);
    }
}
