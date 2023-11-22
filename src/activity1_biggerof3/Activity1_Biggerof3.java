
package activity1_biggerof3;
import java.util.Scanner;
/* El programa presentaba una serie de fallos importantes como por ejemplo, una de las variables estaba mal escrita.
Tambien contaba con una serie de "if" que no hacian nada en el programa, ademas de unos operadores que carecian
de sentido. Lo que hemos hecho ha sido corregir esos errores y comparar las variables de forma correcta.
Así, conseguimos que el programa compare de manera correcta las variables y obtengamos el numero mayor de los 3.
*/
public class Activity1_Biggerof3 {

   
    public static void main(String[] args) {
       int big;
                 
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Write a number");
        int variable_1 = scanner.nextInt();
        
        System.out.println("Write a second number");
        int variable_2 = scanner.nextInt();
        
        
        System.out.println("Write the thrid number");
        int variable_3 = scanner.nextInt();
        
        
        if(variable_1 > variable_2 && variable_1 > variable_3){
            big= variable_1;
            
            System.out.println("El número mayor es: " + big);            
            
        }
        
        if(variable_2 > variable_1 && variable_2 > variable_3){
            big= variable_2;
            
            System.out.println("El número mayor es: " + big );        
            
        }
        
        if(variable_3 > variable_1 && variable_3 > variable_2){
            big= variable_3;
            
            System.out.println("The biggest number is: " + big);        
            
        }    
    }
}

