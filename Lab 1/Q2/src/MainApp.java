/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shoojan
 */
public class MainApp {
    public static void main(String arg[]){
        
        Author author =new Author("Sujan","sujan@gmail.com",'M');
//        System.out.println( "Name = " + author.getName() +
//                            "\nEmail = " + author.getEmail() + 
//                            "\nGender = " + author.getGender()
//                          );
        Book bk = new Book("RainbowSix 9th Edition", author,799.99,50);
        
        System.out.println("Book Details: \n\tBook Name = " + bk.getName());
        System.out.println("\tPrice = Rs." + bk.getPrice());
        System.out.println("\tQuantity = " + bk.getQty());
        
        System.out.println("Author Details : \n\tName = " + bk.getAuthor().getName()+ 
                                            "\n\tEmail = " + bk.getAuthor().getEmail()+
                                            "\n\tGender = " + bk.getAuthor().getGender());
    }
}
