import java.util.List;
public class Subscriber implements Observer{
 String firstName;
 String lastName;

 public Subscriber(String firstName,String lastName){
   this.firstName=firstName;
   this.lastName=lastName;
 }

 @Override
 public void handleEvent(List<String> vacancies){
  System.out.println("Dear"+ firstName + lastName + "\nWe have some changes in vacancies:\n"+vacancies
          +"\n======================\n");
 }
}
