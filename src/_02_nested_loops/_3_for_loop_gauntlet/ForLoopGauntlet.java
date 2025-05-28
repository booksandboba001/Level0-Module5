package _02_nested_loops._3_for_loop_gauntlet;

public class ForLoopGauntlet {
    public static void main(String[] args) {
        for (int a=0; a<=100; a++){
            System.out.println(a);
        }
        for (int b =100; b>=0; b--){
            System.out.println(b);
        }
        for (int c=2;c<=100;c+=2){
            System.out.println(c);
        }
        for (int d=1; d<=99; d+=2){
            System.out.println(d);
        }
        for (int e=0;e<=500;e++){
            if (e%2==0){
                System.out.println(e+" is even");
            }
            else{
                System.out.println(e+" is odd");
            }
        }

    }
}
