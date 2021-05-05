/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

/**
 *
 * @author k_zeb
 */
public class Main {
    public static void main(String args[]){
    
        
        Scanner in = new Scanner(System.in); 
    int choice;  
    int PerimeterOfRectangle=1;
    int AreaOfRectangle=2;
    int PerimeterOfCircle=3;
    int AreaOfCircle=4;
    int Terminate=5;
    
    String MainMenu=("Welcome to the Geometric Calculator. Please type:\n'"+PerimeterOfRectangle+"' for perimeter of rectangle\n'"+AreaOfRectangle+"' for area of rectangle\n'"+PerimeterOfCircle+"' for circumference of circle\n'"+AreaOfCircle+"' for area of circle\n'"+Terminate+"' to exit calculator");
   
    do{
    System.out.println(MainMenu);
    choice=in.nextInt();
    
                
    if(choice==1){System.out.println("Enter length:");
    double length1=in.nextDouble();
    System.out.println("Enter width:");
    double width1=in.nextDouble();
    double PerimeterR=(length1+width1)*2;
    System.out.println("The perimeter of your rectangle is "+PerimeterR+" cm.\n--------------------\n");
    
    } 
            
    else if(choice==2){System.out.println("Enter length:");
    double length2=in.nextDouble();
    System.out.println("Enter width:");
    double width2=in.nextDouble();
    double AreaR=(length2*width2);
    System.out.println("The area of your rectanle is "+AreaR+" cm^2.\n--------------------\n");

    }
    
    else if(choice==3){System.out.println("Enter radius:");
    double radius1=in.nextDouble();
    double PerimeterC=(2*radius1*Math.PI);
    System.out.println("The circumference of your circle is "+PerimeterC+" cm.\n--------------------\n");

    }
    else if(choice==4){System.out.println("Enter radius:");
    double radius2=in.nextDouble();
    double AreaC=(Math.PI*(radius2*radius2));
    System.out.println("The area of your circle is "+AreaC+" cm^2.\n--------------------\n");
        }
    else if(choice==5){System.out.println("Exit calculator."); 
    
    }
    else{System.out.println("Sorry that is not an option.");} 
    
     
    }while(choice!=5);
    in.close(); 
    }
}