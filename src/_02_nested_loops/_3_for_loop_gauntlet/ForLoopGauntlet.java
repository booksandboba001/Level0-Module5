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
        for (int f=0;f<=77;f+=7){
            System.out.println(f);
        }
        int age=0;
        for (int g=2012;g<=2025;g++){
            age++;
            System.out.println("In "+g+" I was "+age);
            if(age==14&&g==2025){
                System.out.println("It is "+g+", and I am "+age);
            }
        }
        for (int h=0;h<=1;h+=2){
            for (int i=0;i<=1;i+=2){
                System.out.println(i);
            }
        } 
        for (int j=0;j<9;j+=3){
            for(int k=1;k<=3;k++){
                System.out.print(" "+(k+j)+", ");
            }
            System.out.println();
        }
        for (int l=0;l<100;l+=10){
            for(int m=1;m<=10;m++){
                System.out.print(" "+(l+m)+", ");
            }
            System.out.println();
        }
        for (int n=0;n<6;n++){
            for(int o=1;o<=(n+1);o++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
