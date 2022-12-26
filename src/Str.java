import java.util.Scanner;

public class Str {
    public void spacerem(){
        System.out.println("enter String for remove all whitespaces");
        Scanner sc=new Scanner(System.in);
        String str= sc.nextLine();
        char  withspace[]=str.toCharArray();
        StringBuffer sb=new StringBuffer();
        String withoutspace="";
        for(char p:withspace){
            if(p!=' '){
                sb.append(p);

            }
        }
        System.out.println(sb.toString());
    }
}

