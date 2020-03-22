//print nth even length palindrome 
//11,22,33,..,99,1001,1111,1221
//print (n+ mirror of n) and that is the palindrome


import java.util.*;
public class Problem688B{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        StringBuilder num=new StringBuilder(sc.next()); //this is mutable and strings are immutable
        
        System.out.println(num.toString()+""+num.reverse());
        
    }
}
