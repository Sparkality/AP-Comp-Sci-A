public class PromTicketsTest{
  
  public static void main(String[] args){
     
     PromTickets firstStudent = new PromTickets("Ben","Chang","Senior",3); //create object
     firstStudent.generateConfirmationNum(); // generate the confirmation number
     firstStudent.calculatePrice(); // calculate total
     firstStudent.displayMessage(); //display the message at the end
     
     PromTickets secondStudent = new PromTickets("Alex","Osbourne","Freshman",2); //create object
     secondStudent.generateConfirmationNum(); // generate the confirmation number
     secondStudent.calculatePrice(); // calculate total
     secondStudent.displayMessage();
     
     PromTickets thirdStudent = new PromTickets("Craig","Pelton","Junior",1); //create object
     thirdStudent.generateConfirmationNum(); // generate the confirmation number
     thirdStudent.calculatePrice(); // calculate total
     thirdStudent.displayMessage();
     
     PromTickets fourthStudent = new PromTickets("Annie","Edison","Sophomore",3); //create object
     fourthStudent.generateConfirmationNum(); // generate the confirmation number
     fourthStudent.calculatePrice(); // calculate total
     fourthStudent.displayMessage();
     
  }
  
}