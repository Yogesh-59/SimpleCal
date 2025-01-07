import java.util.*;
class Calculator{
    public static int Addition(int num1, int num2){
        return num1+num2;
    }
    public static void main(String[] args) {
        System.out.println("This is Calculator"); 
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
            System.out.println("Addition"+Addition(num1, num2));
    }
}