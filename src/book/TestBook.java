/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book;

import java.util.Scanner;

/**
 *
 * @author mydev
 */
public class TestBook {
    public static void main(String []args)
    {
        Book b =new Book();
        System.out.println("Book name"+b.getBookName());
        System.out.println("Quantity"+b.getQuantity());
        System.out.println("Book Price"+b.getPrice());
        System.out.println("totalPrice"+b.totalPrice());
    
     Scanner s=new Scanner(System.in);
     System.out.println("Enter bookname=");
     String n=s.nextLine(); 
    
     System.out.println("Enter Quantity=");
     int q=s.nextInt();
     
     System.out.println("Enter price=");
     double r=s.nextDouble();
     Book c=new Book(n,q,r);
        
       System.out.println("Book name"+c.getBookName());
       System.out.println("Book Price"+c.getPrice());
       System.out.println("Book Quantity"+c.getQuantity());
       System.out.println("Book TotalPrice"+c.totalPrice());
       
       
}