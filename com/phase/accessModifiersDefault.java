package com.phase;

//1. Class is having Default access modifier 
class  defAccessSpecifier
{ 
void display() 
 { 
     System.out.println("You are using defalut access specifier"); 
 } 
} 

public class accessModifiersDefault {

	public static void main(String[] args) {
		//default
		System.out.println("Default Access Specifier");
		defAccessSpecifier obj = new defAccessSpecifier(); 		  
    obj.display(); 

	}
}