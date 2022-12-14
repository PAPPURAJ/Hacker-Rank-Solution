import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        char[] in=sc.next().toCharArray();
        int len=in.length;
        
        for(int i=0;i<len/2;i++){
            if(in[i]!=in[len-1-i]){
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
        
    }
}



