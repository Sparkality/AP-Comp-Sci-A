import java.util.Scanner;
import java.util.Random;

public class PromTickets {

   // instance variables
   private String firstName;
   private String lastName;
   private String classification;
   private int guestNumber;
   private int price;
   
   private String confirmationNum;
   
   final String source = "ABCDEFGHIJKLMNOPQRSTUVWXYXZabcdefghijklmnopqrstuvwxyz0123456789";
    
   
   public PromTickets() { //default constructer
      firstName = "";
      lastName = "";
      classification = "";
      guestNumber = 0;
      price = 0;
      
   }
   
   public PromTickets(String fName, String lName, String classification1, int guestNumber1) { //constructer - changes variables
      firstName = fName;
      lastName = lName;
      classification = classification1;
      guestNumber = guestNumber1;
   }
   
   public void generateConfirmationNum() { //generate the confirmation/ID number for the party
   
      String ID = "";
      
      for (int i = 0; i < 6; i++) {
      
         int randomSourceVal = (int)(Math.random() * (62 - 0 + 1) + 0);   
         char sourceVal = source.charAt(randomSourceVal);
      
         ID = ID + sourceVal;
      
      }
   
      setConfirmationNum(ID);
   }
   
   public void calculatePrice() { //calculate price of all guests in the party
      
      int price = 0;
      
      if (classification.equalsIgnoreCase("freshman")){
      
         if (guestNumber == 1) {
            price = 65;
         }
         else if (guestNumber == 2) {
            price = 98;
         }
         else if (guestNumber >= 3) {
            price = 163;
         }
         
      }
      else if (classification.equalsIgnoreCase("sophomore")){
      
         if (guestNumber == 1) {
            price = 55;
         }
         else if (guestNumber == 2) {
            price = 83;
         }
         else if (guestNumber >= 3) {
            price = 138;
         }
         
      }
      else if (classification.equalsIgnoreCase("junior")){
      
         if (guestNumber == 1) {
            price = 45;
         }
         else if (guestNumber == 2) {
            price = 68;
         }
         else if (guestNumber >= 3) {
            price = 113;
         }
         
      }
      else if (classification.equalsIgnoreCase("senior")){
      
         if (guestNumber == 1) {
            price = 40;
         }
         else if (guestNumber == 2) {
            price = 60;
         }
         else if (guestNumber >= 3) {
            price = 100;
         }
         
      }
      
      setPrice(price);
   }


   // get and set methods

   public void setConfirmationNum (String confirmNumber) {
   
      confirmationNum = confirmNumber;
   }
   
   public String getConfirmationNum() {
   
      return confirmationNum;
   }


   public void setfirstName (String n1) {
   
      firstName = n1;
   }
   
   public String getFirstName() {
   
      return firstName;
   }


   public void setPrice (int p1) {
   
      price = p1;
   }
   
   public int price() {
   
      return price;
   }


   //output function
   public void displayMessage() {

      System.out.println(firstName + " " + lastName + ", a "+ classification + ", purchased " + guestNumber + " ticket(s) for " + price + " dollars. " + confirmationNum + " is the guest's ID." );
   
   }

}