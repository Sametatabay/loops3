import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	int j;
    Scanner inp =new Scanner(System.in);

    System.out.println("Number Enter :");
    j=inp.nextInt();
    for (int i=1;i<=j;i*=4 ){
        System.out.println(i);
    }
        System.out.println("4'ün Katları  ");

    for(int i=1;i<=j;i*=5){
        System.out.println(i);
    }
        System.out.println("5'in Katları ");
    }
}
