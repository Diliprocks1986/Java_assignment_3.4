// student result processing system for three Students

import java.util.Scanner;

class Student{
	//variable for name and marks
	String name;
    int marks;
	
	public Student(){
		//scanner object for name & marks
		Scanner inputs = new Scanner(System.in); 
		System.out.print("Enter Student Name: ");		
		name = inputs.nextLine();
		// 
		System.out.print("Hi " +name+" Enter Your Number: " );	
		marks = inputs.nextInt();
		
	}
	// method for Marks Calculation
	public void Calc(){
		if(marks>=70){
				System.out.println("Dear "+name+" You have passed with Distinction");
			}else if (marks>=60){
				System.out.println("Dear "+name+" You have passed with First Class");	
			}else if (marks>=50){
				System.out.println("Dear "+name+" You have passed with Second Class");	
			}else if (marks>=40){
				System.out.println("Dear "+name+" You have just passed");	
			}else{
				System.out.println("Dear "+name+" Unfortunately you have Failed");	
			}
	}
	}
	
	
	class Result{
		     
		   public static void main(String[] args){
			   // char variable for flow control
			    char Decide;
			    //First Student Object
			    Student S1 = new Student();
			   S1.Calc();
			   Scanner input = new Scanner(System.in); 			   
			   System.out.print("If You Want To Check Another Student Result Please Enter Y/y Else N/n: ");	 
	   			   Decide = input.next().charAt(0);
			         if(Decide == 'y' || Decide == 'Y'){
				      //Second Student Object
			         Student S2 = new Student();
			         S2.Calc();			         
			         Scanner input1 = new Scanner(System.in); 
			         System.out.print("If You Want To Check Another Student Result Please Enter Y/y Else N/n: ");	 
			         Decide = input1.next().charAt(0);
			         if(Decide == 'y' || Decide == 'Y'){
			       	//Third Student Object
			        Student S3 = new Student();			
			        S3.Calc();	
			        System.out.println("Session Expired: If you want to Keep Checking Result Please Run the Program Again");	
			        }else {System.exit(0);}	
					}else {System.exit(0);}				
					
		}
	}		