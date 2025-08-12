
import java.util.Scanner;
public class BIllCalculator
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Give an amount : Saudi Riyal:");
        
        int x = in.nextInt();
        
        int amount = x;
        
        int nb_500= amount /500;
        
        amount = amount - nb_500 *500;
        
        int nb_100= amount /100;
        
        amount = amount - nb_100 *100;
        
        int nb_50= amount /50;
        
        amount = amount - nb_50 *50;
        
        int nb_10= amount /10;
        
        amount = amount - nb_10 *10;
        
        int nb_5= amount /5;
        
        amount = amount - nb_5 *5;
        
        
        int nb_1 = amount;
        
        int totalPaper = nb_500 + nb_100 + nb_50 + nb_10 + nb_5 + nb_1;
        
        System.out.println(" The minimum number of bills require for the amount"
        + x + "is" + totalPaper );
        
        System.out.println(" 500 SR " + nb_500);
        System.out.println(" 100 SR " + nb_100);
        System.out.println(" 50 SR " + nb_50);
        System.out.println(" 10 SR " + nb_10);
        System.out.println(" 5 SR " + nb_5);
        System.out.println(" 1 SR " + nb_1); 
    }
}
