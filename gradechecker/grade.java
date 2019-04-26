import java.util.Scanner;
import term;
class grade{
  private term storeArray[] = new term[1];

  public set(String n, int w){
    int sl = storeArray.length+1;
    double newG[] = new double[gl]
    for(i=0;i<sl-2;i++){
      newG[i] = storeArray[i];
    }
    storeArray = newG;
    storeArray[sl-1] = v;
  }
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Welcome to the grade system!");
    System.out.println("what do you want to do?");
    System.out.println("----------------------------");
    System.out.println("1: check existing catergory with its weight");
    System.out.println("2: add catergory with its weight");
    System.out.println("3: add grade to the catergory");
    System.out.println("Now you need to type this type assignment or quizs name.");
    System.out.println("Name: ")
    String name = scanner.nextLine();
    System.out.println("How much does it weight?")
    double w = scanner.nextDouble()

  }
}
