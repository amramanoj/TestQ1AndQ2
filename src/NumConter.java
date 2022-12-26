import java.util.Scanner;

public class NumConter {
    public void number(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter for Number operation");
        int number=sc.nextInt();
        int result=0;
        for(int i=1;i<=number;i++){
            int num=(""+i+"").length();
            if(num%2==1){
               result+=num*2;
            }else if
            (num%4==0){
                result+=num/4;
            }else {
                result+=num*3;
            }


        }
        System.out.println(result);
        int ipl=1;
        int finalresult=0;
        while (ipl!=0){
           ipl=result%10;
           finalresult+=ipl;
           ipl=result/10;
           result=ipl;
        }
        System.out.println(finalresult);
    }
}
