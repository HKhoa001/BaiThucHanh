import java.util.Scanner;

public class demo {
	public static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {

        String str=input.nextLine();
        int letterCount=0,So=0,wordCount=0;
        for(int i=0;i<str.length();i++){
            if(Character.isLetter(str.charAt(i))) letterCount++;
            else if(Character.isDigit(str.charAt(i))) So++;                         
        }
        String[] strArr = str.split("\\s",0);
        for (String strArr1 : strArr) {
            if (!strArr1.isEmpty()) 
                wordCount++;         
        }
        System.out.println("So ky tu: "+letterCount);
        System.out.println("So chu so: "+So);
        System.out.println("So tu: "+wordCount);
    }   
}