/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9;
import ec.edu.espe.lab9.model.Operation;
import ec.edu.espe.lab9.model.Person;
import ec.edu.espe.lab9.utils.FileManager;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 * 
 * @author Josselyne Gutierrez / Maria Fernanda Galarraga
 */
public class Lab9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
     
        int option=0; String op="";
        do{
            try{
        op=JOptionPane.showInputDialog("Select an option: \n"
                + "1. AGE\n"
                + "2. OPERATION\n"
                + "3.SALIR");
        option=Integer.parseInt(op);
        switch(option){
            case 1:  
                int option2=0; String op2="";
                do{
                    try{
                       op2=JOptionPane.showInputDialog("Select an operation: \n"
                + "1. Save\n"
                + "2. Read\n"
                + "3. Search\n"
                + "4. Salir");      
        option2=Integer.parseInt(op2); 
        switch(option2){
            case 1:
                FileManager file =new FileManager("Age.csv","");
                String text;
                text=file.convert();
                file.save(file.getName(), text);
                break;
            case 2:
                 FileManager file1 =new FileManager("Age.csv","");
                 ArrayList person = new ArrayList<>();
                 
                 file1.read(file1.getName(), person);
                 break;
            case 3:
                FileManager file2 =new FileManager("Age.csv","");
                file2.search(file2.getName());
            case 4:

                JOptionPane.showMessageDialog(null,"Salir");
                break;
             default:JOptionPane.showMessageDialog(null, "Error Option End of program");    
            }
                    }catch(NumberFormatException n){
                      JOptionPane.showMessageDialog(null, "Error "+ n.getMessage());
                  }
                }while(option2!=4);
        break;
            case 2: 
                System.out.println("OPERATIONS");
                int operand1;
                int operand2;
         System.out.println("Enter the first number");
        Scanner wc = new Scanner(System.in);
        operand1 = wc.nextInt();
                System.out.println("Enter the second number");
                Scanner sc = new Scanner(System.in);
                operand2 = sc.nextInt();
              int option1=0; String op1="";
              do{
                  try{
              op1=JOptionPane.showInputDialog("Select an operation: \n"
                + "1. Add\n"
                + "2. Substraction\n"
                + "3. Multiplicaction\n"
                + "4. Division\n"
                + "5. Salir");      
        option1=Integer.parseInt(op1);
        switch(option1){
            case 1:
                int result;
             Operation operation= new Operation(0,0,0);
             result=operation.add(operand1, operand2);
             System.out.println("The result is: " + result);
             break;
            case 2:
                Operation operation1= new Operation(0,0,0);
                result=operation1.substract(operand1, operand2);
                System.out.println("The result is: " + result);
             break;
            case 3:
                Operation operation2= new Operation(0,0,0);
                result=operation2.mult(operand1, operand2);
                System.out.println("The result is: " + result);
            break;
            case 4: 
                Operation operation3= new Operation(0,0,0);
                result=operation3.div(operand1, operand2);
                System.out.println("The result is: " + result);
             break;
            case 5:
                JOptionPane.showMessageDialog(null,"Salir");
                break;
             default:JOptionPane.showMessageDialog(null, "Error Option End of program");
        }
                  }catch(NumberFormatException n){
                      JOptionPane.showMessageDialog(null, "Error "+ n.getMessage());
                  }
        }while(option1!=5); 
            case 3:
               JOptionPane.showMessageDialog(null,"Salir");
                break; 
             default:JOptionPane.showMessageDialog(null, "Error Option End of program");
        }  
        
      }catch(NumberFormatException n){
                      JOptionPane.showMessageDialog(null, "Error "+ n.getMessage());
                  }
        }while(option!=3); 
    }
    
}
