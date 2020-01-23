/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book;

/**
 *
 * @author mydev
 */
public class Book {

    /**
     * @param args the command line argument
     */
   String bookname;
   private int bookquantity;
   private double  bookprice;

   public Book() {
       bookname = "java";
       bookquantity=10;
       bookprice=50.5;
    }
   public Book(String bookname,int bookquantity,double bookprice)
   { 
      this.bookname=bookname;
     this.bookquantity=bookquantity;
     this.bookprice=bookprice;
   }
   public String getBookName()
   {
       return bookname;
   }
   public int getQuantity()
   {  
       return bookquantity;
   }
   public double getPrice(){
       return bookprice;
   }
   
   public double totalPrice(){
       return bookquantity*bookprice;
   }
         
  }
