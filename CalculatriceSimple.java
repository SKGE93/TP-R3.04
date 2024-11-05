import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatriceSimple {
    public static void main(String[] args) {
        try 
        {
            Nombres six = new Nombres(6);// Met un float pour soulever l'erreur
            Nombres dix = new Nombres(10);
            Nombres zero = new Nombres(0);

            Operation addition = new Addition(dix, six);
            System.out.println(addition + " = " + addition.valeur()); // 10 + 6 = 16

            //Operation soustraction = new Soustraction(dix, six);
            //System.out.println(soustraction + " = " + soustraction.valeur()); //  10 - 6 = 4

            Operation multiplication = new Multiplication(dix, six);
            System.out.println(multiplication + " = " + multiplication.valeur()); //  10 * 6 = 60

            Operation division = new Division(dix, six);
            System.out.println(division + " = " + division.valeur()); // 10 / 6 = 1

            // Test de la division par zéro pour vérifier la gestion des exceptions
            Operation divisionParZero = new Division(dix, zero);
            System.out.println(divisionParZero + " = " + divisionParZero.valeur()); // doit lancer une exception

            try 
            {
                Scanner scan = new Scanner(System.in);
                int nb1 = scan.nextInt();
                int nb2 = scan.nextInt();
                Expression nw = new Nombres(nb1);
                Expression nx = new Nombres(nb2);
                scan.close();
                Operation soustraction = new Soustraction(nw, nx);
                System.out.println(soustraction + " = " + soustraction.valeur());

            }
            catch(InputMismatchException i)
            {
            System.out.println("Erreur Input : " + i);
            }
            

            




        } 
        catch (ArithmeticException e) 
        {
            System.out.println("Erreur arithmétique : " + e);
        } 
        
        
        
        
        
    }
}
