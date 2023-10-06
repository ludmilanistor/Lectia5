package ex2;

public class Main {
    public static void  main (String[] arg) {
        System.out.println("Un șir de numere de la 100 pina la 1000, divizibile la 5 și 6");
        int div5 = 5;
        int div6 = 6;
        for (int i = 100; i<=1000; i++) {
            if (i%div5 == 0 && i%div6==0){
                System.out.print(i);
                System.out.print(" ");}
        }
    }
}
