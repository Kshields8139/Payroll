import java.util.Scanner;
import java.text.NumberFormat;

public class Payroll {
            
        public static void main(String[] args) {
            //_____________________________________________________________________________________________________________________
                    //NUMBERS
                    final double TAX_RATE = 0.10;
                    int quantity;
                    byte age;
                    double subtotal, tax, totalCost, payRate;

                        Scanner scan = new Scanner (System.in);
                        NumberFormat fmt1 = NumberFormat.getCurrencyInstance ();
                        NumberFormat fmt2 = NumberFormat.getPercentInstance ();
                        String line = new String(new char[48]).replace('\0', '*');
                        String line2 = new String(new char[15]).replace('\0', '-');
                        String line3 = new String(new char[48]).replace('\0', '-');
                        
                        
         //_____________________________________________________________________________________________________________________
         
                        System.out.println("Welcome to the IS147 Payroll System in JAVA" +
                                "\nPlease follow the instructions provided on the screen");
         
                                System.out.println ("\n" + line3);
         
                        //NAME (QUESTION)
                        Scanner input = new Scanner(System.in);
                        System.out.print("What is your name?: ");
                        String value = input.nextLine();
         
                        //AGE
                        System.out.print("What is your age?: ");
                        age = scan.nextByte ();
         
         
                        //FULL-TIME OR PART-TIME (QUESTION)
                        System.out.print("Press F for full time or P for part time ?: ");
                        String value2 = input.nextLine();
         
         
                        //VACATION REQUEST
                        boolean done = true;
         
         
                        //HOURS WORKED
                        System.out.print ("How many hours did you work this week?: ");
                        quantity = scan.nextInt ();
         
                        //HOURLY RATE
                        System.out.print ("What is your hourly pay rate?: ");
                        payRate = scan.nextDouble ();
         
                        subtotal = quantity * payRate;
               tax = subtotal * TAX_RATE;
                        totalCost = subtotal - tax;
         
                        System.out.println ("\n" + line);
         
         //_____________________________________________________________________________________________________________________
                        //OUTPUT
                        System.out.println ("\n" +"Hello, " + value + " You are: " + age + " years old"); //NAME & AGE
         
                        System.out.println ("Your Employment Status is: " + value2); //EMPLOYMENT STATUS
         
                        System.out.println ("Vacation Request: " + done); //VACATION REQUEST
         
                        System.out.println ("Your Tax Rate :" + fmt2.format(TAX_RATE)); //YOUR TAX RATE
         
                        System.out.println ("Pay Rate Per Hour: " + fmt1.format (payRate)); //PAY RATE PER HOUR
         
                        System.out.println ("Hours Worked: " + quantity); //HOUR WORKED
         
                        System.out.println ("Gross Pay: " + fmt1.format (subtotal)); //GROSS PAY
         
                        System.out.println ("Tax Paid : " + fmt1.format (tax)); //TAX PAID
         
                        System.out.println ("\n" + line2);
         
                        System.out.println ("Net Pay: " + fmt1.format (totalCost)); //NET PAY
                    
                        System.out.println ("\n" + line + "\n");
            
            
                } 
                
            }
        
            
    
