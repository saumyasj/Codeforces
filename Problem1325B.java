import java.util.*;
public class Problem1325B{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt(); //test cases 
        while(t-- >=1){
            int n=sc.nextInt();  //number of elements in array
            long a[]=new long[n];
            Set<Long> elements=new HashSet<>(); //store only distinct elements 
            for(int i=0;i<n;i++){
                a[i]=sc.nextLong();
                elements.add(a[i]);
            }
            System.out.println(elements.size());
        }
    }
}
