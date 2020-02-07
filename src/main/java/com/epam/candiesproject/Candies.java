package com.epam.candiesproject;

import java.util.Scanner;
class Candies
{
    public static void main (String[] args) 
   {

        int w,w1=0,w2=0,count=0,cost,i,j;
Scanner s=new Scanner(System.in);
System.out.println("The list of chocolates is:");
        Chocolates c=new Chocolates(200,"FiveStar",10);
      // declares an Array of integers. 
        Chocolates[] arr; 
  
        // allocating memory for 5 objects of type Chocolates. 
        arr = new Chocolates[5]; 
int arr2[]={25,15,35,45,15};
  
        // initialize the first elements of the array 
        arr[0] = new Chocolates(250,"FiveStar",10); 
  
        // initialize the second elements of the array 
        arr[1] = new Chocolates(150,"DairyMilk",20); 
  
        // so on... 
        arr[2] = new Chocolates(350,"Snikers",30); 
        arr[3] = new Chocolates(450,"Munch",40); 
        arr[4] = new Chocolates(560,"Perk",50); 
  
        // accessing the elements of the specified array 
        for ( i = 0; i < arr.length; i++) 
System.out.println("the chocolates at position"+ i+ " : " + "\n"+"cost:"+
                        arr[i].cost+" \n"+"name:"+ arr[i].name+" \n"+"weight:"+arr[i].weight);  


// declares an Array of integers. 
        
Sweets d=new Sweets(350,"Jaamun",30);
System.out.println("\n\nThe list of Sweets is :");

  int arr3[]={40,50,45,35,20};


        // allocating memory for 5 objects of type Sweets 
       Sweets[] arr1= new Sweets[5]; 
  
        // initialize the first elements of the array 
        arr1[0] = new Sweets(40,"jaamun",30); 
  
        // initialize the second elements of the array 
        arr1[1] = new Sweets(50,"Barfi",110); 
  
        // so on... 
        arr1[2] = new Sweets(45,"Halwa",120); 
        arr1[3] = new Sweets(35,"laddu",300); 
        arr1[4] = new Sweets(20,"kalakan",240); 
  
        // accessing the elements of the specified array 
        for (  j = 0; j< arr1.length; j++) 
System.out.println("the Sweets at position"+ j+ " : " + "\n"+"cost:"+
                        arr1[j].cost+" \n"+"name:"+ arr1[j].name+" \n"+"weight:"+arr1[j].weight); 
//sorting
c.bubbleSort(arr2);
System.out.println("\nSorted chocolates according to the cost are:");
        c.printArray(arr2);

for ( i = 0; i < arr.length; i++) 
w1=w1+arr[i].weight;
for ( j = 0; j< arr1.length; j++)
 w2=w2+arr1[j].weight;
w=w1+w2;
System.out.println("\nweight of the gift is:" +w);
 
System.out.println("\nenter the required candie cost");
   cost=s.nextInt(); 
for ( i = 0; i < arr.length; i++) 
for ( j = 0; j< arr1.length; j++)
if((cost==arr[i].cost)||(cost==arr1[j].cost))
{
count=count+1;
//break;
}
if(count==0)
System.out.println("the  candie is not found..please enter the valid cost");

else 
System.out.println("the  candie is  found");
}

} 
 class Chocolates extends Candies
{
public int cost; 
    public String name; 
public int weight;
  Chocolates(int cost, String name,int weight) 
    { 
        this.cost = cost; 
        this.name = name;
        this.weight=weight;
 
    } 
 public void bubbleSort(int arr2[])
    {
        int n = arr2.length;
        for (int i = 0; i < n-1; i++)
            for (int k = 0; k < n-i-1; k++)
                if (arr2[k] > arr2[k+1])
                {
                    // swap temp and arr2[i]
                    int temp = arr2[k];
                    arr2[k]= arr2[k+1];
                    arr2[k+1]= temp;
                }
    }
/* Prints the array */
    void printArray(int arr2[])
    {
        int n = arr2.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr2[i] + " ");
        System.out.println();
    }

}  
class Sweets extends Candies
{
public int cost; 
    public String name; 
public int weight;
  Sweets(int cost, String name,int weight) 
    { 
        this.cost = cost; 
        this.name = name;
        this.weight=weight;

    } 
 public int binarySearch(int[] arr3, int key) {
         
        int start = 0;
        int end = arr3.length - 1;
        while (start <= end)
      {
            int mid = (start + end) / 2;
            if (key == arr3[mid]) 
	{
                return mid;
                }
            if (key < arr3[mid])
	 {
                end = mid - 1;
                } 
	else 
	 {
                start = mid + 1;
                }
        }
        return -1;
    }
    
}  




