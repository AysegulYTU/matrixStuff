package matrixStuff;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;


public class PrimeNumberCalculations {


    public static void main(String[] args) {
 
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        
        System.out.println("Enter n: ");
        int n = s.nextInt();
        
        System.out.println("Enter range: ");
        int range = s.nextInt();
        
        System.out.printf("A=\n");
        
        int matrix[][] = new int[n][n];
        
        int temp=0;
        int counter = 0;
        
        String Otherprimes="";
        int[] copy = new int[range];
        
        ArrayList copyList = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
           for (int j = 0; j < matrix.length; j++) {
                matrix[i][j]=r.nextInt(range)+1;
                System.out.printf("%d\t",matrix[i][j]);  }
                System.out.println();  }
        System.out.printf("-------------\n");
        
        for (int a = 0; a < matrix.length; a++) {
            for (int b = 0; b < matrix.length; b++) {
                for (int i = 3; i <= matrix[a][b]; i++) {
            temp = 0;
            for (int j = i; j >= 1; j--) {
                if (i%j==0) {
                    temp++;  } }
                if (temp==2 && i==matrix[a][b]) {
                counter = counter + 1;
                Otherprimes = Otherprimes + i + " ";
                copy[counter-1] = copy[counter+1] + i; }  }  }}
        
        System.out.println("With String: "+Otherprimes);
        System.out.print("Counter is: "+counter+"\n");
        System.out.printf("-----------\n");
        
        for (int i = 0; i < counter; i++) {
            copyList.add(copy[i]);
            Collections.sort(copyList);    }  
            
        System.out.println("With Sorted ArrayList: "+copyList);
            for (int i = 0; i < copyList.size(); i++) {
                for (int j = i+1; j < copyList.size(); j++) {
                    if (copyList.get(i)==copyList.get(j)) {
                    copyList.remove(i); }  }   }   
            
            System.out.println("Removed Duplication and Sorted List: "+ copyList);
            System.out.println("Maximum two numbers of primes: " + copyList.get(copyList.size()-1) +", "+copyList.get(copyList.size()-2));
            int first = (int) copyList.get(copyList.size()-1);
            int second = (int) copyList.get(copyList.size()-2);
            int sum = first + second;
            System.out.println("Sum of the max two primes: "+sum);  
            }
            
        }
