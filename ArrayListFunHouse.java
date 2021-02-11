//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Brian Milian
//Unit 7 Lab 3
//Period 2

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ArrayListFunHouse
{
 public static ArrayList<Integer> getListOfFactors(int number)
 {
   //creating ArrayList
   ArrayList<Integer> nums1 = new ArrayList<Integer>();
   //for loop to loop through entire ArrayList
   //getting factors of numbers from data
   for(int x = 2; x < number; x = x + 1)
   {
     //using if statement to add factors
     if(number % x == 0)
     {
       //adding factor
       nums1.add(x);
     }
   }
   //returning ArrayList of factors
  return nums1;
 }
 
 public static void keepOnlyCompositeNumbers( List<Integer> nums )
 {
   //using for loop to keep only composite numbers
   //starting at end of ArrayList because removing values
   for(int y = nums.size()-1; y > -1; y = y - 1)
   {
     //using if statement to remove non-composite values
     if(getListOfFactors(nums.get(y)).size() == 0)
     {
       //removing non-composite number
       nums.remove(y);
     }
   }
 }
}