/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
class GradeCalc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); 
        float x,s=0;
        System.out.println("Enter the number obtained in Maths :");
        x=sc.nextFloat();
        s+=x;
        System.out.println("Enter the number obtained in English :");
        x=sc.nextFloat();
        s+=x;
        System.out.println("Enter the number obtained in Hindi:");
        x=sc.nextFloat();
        s+=x;
        System.out.println("Enter the number obtained in Science :");
        x=sc.nextFloat();
        s+=x;
        System.out.println("Enter the number obtained in Computer :");
        x=sc.nextFloat();
        s+=x;
        System.out.println("TOTAL MARKS OBTAINED OUT OF 500 : "+s);
        s=s/5;
        System.out.println("PERCENTAGE OBTAINED : "+s);
        if(s>=90)
        System.out.println("GRADE : A");
        else if(s<90 && s>=80)
        System.out.println("GRADE : B");
        else if(s<80 && s>=70)
        System.out.println("GRADE : c");
        else if(s<70 && s>=60)
        System.out.println("GRADE : D");
        else if(s<60 && s>=50)
        System.out.println("GRADE : E");
        else
        System.out.println("GRADE : F");
    }
}
