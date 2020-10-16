/**
 *
 * @author Cole Girling
 */
public class Main {

  public static void examGrade(int examPercentage){
   
   if(examPercentage <= 100 && examPercentage >= 80){
     System.out.println("A");
   }else if(examPercentage <= 79 && examPercentage >= 70){
     System.out.println("B");
   }else if(examPercentage <= 69 && examPercentage >= 60){
     System.out.println("C");
   }else if(examPercentage <= 59 && examPercentage >= 50){
     System.out.println("D");
   }else{
     System.out.println("F");
    }
   }
  

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
   int examPercentage = 67;
   examGrade(examPercentage);

 }
}