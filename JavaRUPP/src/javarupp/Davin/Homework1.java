package javarupp.Davin;
import java.util.Arrays;
import java.util.Scanner;
public class Homework1 {
    public static void MinMax(){
        int[] tab = {12, 1, 21};
        int min = Arrays.stream(tab).min().getAsInt();
        int max = Arrays.stream(tab).max().getAsInt();
        System.out.println("\nMin = " + min);
        System.out.println("Max = " + max);
    }
    public static void CharArray(){
        String str = "HELLOMYDARLING";
        char[] hello = str.substring(0,5).toCharArray();
        char[] mydarling=str.substring(5,14).toCharArray();
         System.out.println("\n Using Char Array");
        for (char output : hello) {
			System.out.print(output);
	}
        System.out.print("\n");
        for (char out : mydarling) {
			System.out.print(out);
	}
        System.out.print("\n");
        
         System.out.println("\n Using subString");
	System.out.println(str.substring(0,5));
	System.out.println(str.substring(5,14));	
    }
    public static void DoubleArray(){
      double[][] num = new double[3][];  
      num[0]=new double[]{1.1,1.2,1.3};
      num[1]=new double[]{2.1,2.2,2.3,2.4};
      num[2]= new double[]{3.1,3.2};
      System.out.println("Using double array");
       for (double output : num[0]) {
			System.out.print(output+" ");
	}
        System.out.print("\n");
        for (double output : num[1]) {
			System.out.print(output+" ");
	}
        System.out.print("\n");
        for(double output: num[2])
        {
             System.out.print(output+" ");
        }
        System.out.print("\n");
	
				
	


    }
    public static void main(String[] args) { 
        //MinMax();
        //CharArray();
        //DoubleArray();
        Scanner input = new Scanner(System. in);
        System.out.println("Menu");
        System.out.println("1. Show Min & Max");
        System.out.println("2. Show Char Array");
        System.out.println("3. Show Double Array");
        System.out.print("Choose option(1 2 3) or 0 to exit : ");
            int typing;
        menu: 
        while(input.hasNextInt()){
            typing = input.nextInt();
            switch(typing){
                case 0:
                  break menu; 
                    case 1: MinMax();
                            break;
                   case 2:  CharArray();
                            break;
                   case 3:  DoubleArray();
                            break;
                   default: System.out.println("Invalid");
                            break;
            }
        }
            
    }
}
