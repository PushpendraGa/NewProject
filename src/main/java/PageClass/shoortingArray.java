package PageClass;

import java.util.*;  
public class shoortingArray  
{  
public static void main(String[] args)   
{  
List<Integer> sList = new ArrayList<Integer>();  
sList.add(1);  
sList.add(9);  
sList.add(8);  
sList.add(6);  
sList.add(2); 

  Collections.sort(sList);
  System.out.println("list");
  for (Integer list : sList) 
	
	  
    System.out.println(list);




//Collections.sort(sList);    //sorts array list  
//for(Integer str: sList)   
//System.out.print(" "+str);  
}  
}  