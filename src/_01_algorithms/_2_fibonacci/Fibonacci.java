package _01_algorithms._2_fibonacci;

public class Fibonacci {
public static void main(String[] args) {
    int number1 = 0;
    int number2 = 1;
    int sum = number1 + number2;
    System.out.println(number1);
    System.out.println(number2);
    for (int i =9; i>0; i--){
        sum += number1;
        number1 =number2;
        number2 = sum;
        System.out.println(sum);
    }
    

}
}
