import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      while ((true)){
            System.out.println("for question 1 entersd As/a for Question 2 Enter b/B");
          Scanner sc=new Scanner(System.in);
          char input=sc.next().charAt(0);
          if(input=='a'||input=='A'){
new NumConter().number();
          }
          if(input=='b'||input=='B'){
new Str().spacerem();
          }
        }
    }
}
