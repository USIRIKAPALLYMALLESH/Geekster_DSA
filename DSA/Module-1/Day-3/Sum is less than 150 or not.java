import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int x = scn.nextInt();
        int y =scn.nextInt();
        int z= scn.nextInt();
        int ans=x+y+z;
        if(ans<150)
            System.out.println(true);
        else
            System.out.println(false);
    }
}
