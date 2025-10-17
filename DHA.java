import java.util.*;
public class DHA{
 static int gcd(int x, int y){
  if(y == 0)
    return x;
  else
    return gcd(y,x%y);
  }  
 public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a prime number:");
    int a = sc.nextInt();

    System.out.println("enter a prime number less than previous entered number:");
    int b = sc.nextInt();

    int xa = 0; 

    for(int i=1;i<b; i++){
      if(gcd(i,b)==1){
       xa = i;
      }
    }

    System.out.println("the value of xa:"+xa);
    int xb = 7;
    System.out.println("the value of xb:"+xb);
    
    double ya = (Math.pow(b,xa))%a;
    System.out.println("value of ya:"+ya);
    double yb = (Math.pow(b,xb))%a;
    System.out.println("value of yb:"+yb);
    
    double k1 = (Math.pow(yb,xa))%a;
    System.out.println("value of shared secretkey k1:"+k1);
    double k = (Math.pow(ya,xb))%a;
    System.out.println("value of shared secretkey k:"+k);
    
    if(k1==k)
      System.out.println("shared keys values are same");
    else
      System.out.println("shared keys value are different");
    }
   }
    


