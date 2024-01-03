package javapractise;

import java.util.Scanner;

public class Chemistrymissproblem

{

public static int missedLectures(int numChapters,int b,int e)

{

 return Math.min(e-b+1,numChapters);

}

public static void main(String[] args)

{

               Scanner sc = new Scanner(System.in);

 System.out.println(missedLectures(5,5,6));   //2

 System.out.println(missedLectures(4,3,5));     //3

}

}
