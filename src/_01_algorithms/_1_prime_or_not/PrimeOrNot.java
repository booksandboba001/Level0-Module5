package _01_algorithms._1_prime_or_not;


import javax.swing.JOptionPane;
public class PrimeOrNot {
    public static void main(String[] args) {
        String numbers = JOptionPane.showInputDialog("What is your number?");
        int number = Integer.parseInt(numbers);
        for (int repeat = 2; repeat<(number/2); repeat++){
            if (number % repeat ==0){
                JOptionPane.showMessageDialog(null, "Your number is not prime.");
                System.exit(0);
            }
            else{
                JOptionPane.showMessageDialog(null, "Your number is prime.");
                System.out.println(numbers);
                System.exit(0);
            }
        }
    }
}
