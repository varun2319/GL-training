import java.util.*;

import java.util.Map.Entry;

public class Q3 {

public static void main(String[] args)

{

 Scanner sc=new Scanner(System.in);

 HashMap<String,Integer> map=new HashMap<>();

 map.put("Varun",977111);

 map.put("Hrithik",94728);

 map.put("Shivam",6204090);

 map.put("Ranjan",8340567);

 map.put("Krishna",9871656);

 Set<Entry<String,Integer>> set=map.entrySet();

 Iterator<Entry<String,Integer>> itr=set.iterator();

 System.out.println("Check if a particular key exists or not.");

 String s1=sc.next();

 int d=0;

 while(itr.hasNext())

 {

 Map.Entry<String,Integer> k=itr.next();

 if(k.getKey().equals(s1))

 {

  System.out.println("Key Found");

  System.out.println("Place : "+k.getKey()+" || Dish : "+k.getValue());

  d=1;

 }

 }

 if(d==0)

 {

 System.out.println("Key Not found");

 }

 System.out.println("--------------------For Finding Value------------------------------");

 System.out.println("Enter contact number to search");

 //sc.next();

 int number=sc.nextInt();

 System.out.println(number);

 Set<Entry<String,Integer>> set1=map.entrySet();

 Iterator<Entry<String,Integer>> itr1=set1.iterator();

 d=0;

 while(itr1.hasNext())

 {

 Map.Entry<String,Integer> k=itr1.next();

 if(k.getValue()==number)

 {

  System.out.println("Value Found");

  System.out.println("Number : "+k.getValue()+" "+"Name :"+k.getKey());

  d=1;

 }

 }

 if(d==0)

 {

 System.out.println("Key Not found");

 }

 System.out.println();

 System.out.println("-----------For Iterating All List--------------------");

 Set<Entry<String,Integer>> set3=map.entrySet();

 Iterator<Entry<String,Integer>> itr3=set3.iterator();

 while(itr3.hasNext())

 {

 Map.Entry<String, Integer> k=itr3.next();

 System.out.println(k.getKey() +" "+k.getValue());

 }

}

}