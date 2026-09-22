import java.util.Scanner;

public class operators {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //voting 
        
        System.out.println("enter ur age ");
        int age = sc.nextInt(System.in);
        if (age >= 18) {
            System.out.println("ur eligible for vote");

        } else {
            System.out.println("ur not eligible for vote");
        }
        //student pass/fail
        System.out.println("enter ur mark");
        int mark =sc.nextInt(System.in);
        if (mark>=35) {
            System.out.println("pass");
        }else{
            System.out.println("fail");
        }
        //withdrawal
        int bankbalance=5000;
        System.out.println("withdrawal amount");
       int withdrawal=sc.nextInt(System.in);

        if (withdrawal >=bankbalance) {
            System.out.println("withdrawal success");
        }else{
            System.out.println("invalid balance");
        }
        sc.close();
    }
}
