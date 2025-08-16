import java.util.*;
public class StrongNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        while(temp!=0){
            int fact = 1;
             int last = temp%10;
             for(int i=1;i<=last;i++) {
                 fact = fact*i;
             }
             sum = fact+sum;
             temp/=10;
        }

        if(n==sum){
            System.out.print("Strong num");
        }else{
            System.out.println("Not a Strong num");
        }
    }
}

/*

OUTPUT:
145
Strong num

  */
