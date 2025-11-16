// class FirstClass {
//     public static void main(String args[]){
//         System.out.println("hello java");
//     }
// }

// class FirstClass {
//     public static void main(String[] args){
//         System.out.println("hello world");
        
//     }
// }
import java.util.*;
// public class conditions{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int age = sc.nextInt();

//         if(age>18){
//             System.out.println("Adult");
//         }
//         else{
//             System.out.println("Not adult");
//         }

        
//     }
// }

// public class conditions{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int x = sc.nextInt();

//         if(x%2==0){
//             System.out.println("x is an even number");
//         }
//         else{
//             System.out.println("x is odd");
//         }
//     }
// }

// public class conditions{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         if(a > b){
//             System.out.println("greater");
        
//         }
//         else if(a < b){
//             System.out.println("smaller");
//         }
//         else{
//             System.out.println("equal");
//         }
//     }

// }

// public class button{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int button = sc.nextInt();

//         if(button==1){
//             System.out.println("Hello");
//         }
//         else if(button==2){
//             System.out.println("Namaste");
//         }
//         else if(button==3){
//             System.out.println("Bonjour");
//         }
//         else{
//             System.out.println("invalid button");
//         }
//     }
// }

// loops in java 
// public class loops{
//     public static void main(String[] args){
//         for(int i =0; i<11; i++){
//             System.out.println(i);
//         }
//     }
// }

// public class loops{
//     public static void main(String[] args){
//         int i = 0;
//         while (i<=10) {
//             System.out.println(i);
//             i++;
//         }
//     }
// }

// print the sum of n arbitrary numbers 
// public class loops{
//     public static void main(String[] args){
//         int n = 3;
//         int sum = 0;
//         for(int i = 1; i<=n; i++){
//             sum = sum+i;
//         }
//         System.out.println(sum);
//     }
// }

// print the table of a number input by the user.
// public class loops{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int number = sc.nextInt();
//         for(int i=1;i<=10;i++){
//             System.out.println(i*number);
//         }
//     }
// }

// public class pattern{
    
//     public static void main(String[] args){
//         int n = 4;
//         int m = 5;
//         for(int i = 1; i<=n; i++){
//             for(int j = 1; j<=m; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
           
//         }
//     }
// }

// public class patterns{
//     public static void main(String[] args){
//         int n = 4;
//         int m = 5;
//         for (int i = 1; i<=n; i++){
//             for (int j = 1; j<=m; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// public class pattern{
//     public static void main(String[] args){
//         int n = 4;
//         int m = 5;
//         for(int i=1;i<=n;i++){
//             for(int j=1; j<=m;j++){
//                 if(i==1 || j==1 || i==n || j==m){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
                

//             }
//             System.out.println();
//         }

//     }
// }

// public class pattern{
//     public static void main(String[] args){
//         int n = 4;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
        
//     }
// }

// public class pattern{
//     public static void main(String[] args){
//         int n = 4;
//         for(int i =n;i>=1;i--){
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// inverted half pyramid

// public class pattern{
//     public static void main(String[] args){
//         int n = 4;
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=n-1 ;j++){
//                 System.out.print(" ");
//             }

//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// public class pattern{
//     public static void main(String[] args){
//         int n = 5;
//         for(int i = 1;i<=n;i++){
//             for(int j = 1;j<=i;j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }

// public class pattern{
//     public static void main(String[] args){
//        int n = 5;
//        for(int i =1;i<=n;i++){
//         for(int j = 1;j<=n-1+1;j++){
//             System.out.print(j);

//         }
//         System.out.println();
//        } 
//     }
// }


// functions and methods
// public class pattern{
//     public static void main(String[] args){
//         int n = 5;
//         for(int i = 1;i<=5;i++){
//             for(int j = 1;j<=i;j++){
//                 System.out.print(j+" ");
//             }
//             System.out.println();
//         }

//     }
// }

// public class pattern{
//     public static void main(String[] args){
//         int n = 5;
//         for(int i = 1;i<=n;i++){
//             for(int j = 1; j<=n-i+1;j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }

// floyds triangle 
// public class pattern{
//     public static void main(String[] args){
//         int n = 5;
//         int number = 1;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(number+" ");
//                 number++;
//             }
//             System.out.println();
//         }
//     }
// }

// 0-1 triangle 
// public class pattern{
//     public static void main(String[] args){
//         int n = 5;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 int sum = i+j;
//                 if(sum%2==0){
//                     System.out.print("1 ");
//                 }else{
//                     System.out.print("0 ");
//                 }

//             }
//             System.out.println();
//         }
//     }
// }

// advanced pattern 
// Butterfly pattern 

// Functions and methods 
// public class Functions{
//     public static void printMyName(String name){
//         System.out.println(name);
//         return;
//     }
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         String name = sc.nextLine();

//         // function call
//         printMyName(name);
//     }

//     }

// public class Functions{
//     public static void printMyName(String name){
//         System.out.println(name);
//         return;
//     }
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         String name = sc.nextLine();
//         sc.close();

//         printMyName(name);
//     }
// }

// public class Functions{
//     public static int sum(int a,int b){
//         int sum = a+b;
//         return sum;
//     }
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         sc.close();
        

//         int sum= sum( a,  b);
//         System.out.println(sum);

//     }


    
// }

// make a function to multiply twoo numbers and return the product
// public class Product{
//     public static int Multiplication(int a,int b){
//         int result = a*b;
//         return result;
//     }
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
        

//         int product= Multiplication(a, b);
//         System.out.println(product);
//     }
// }

// find the factorial of a number
// public class Funct{
//     public static void Factorial(int n){
//         if(n<0){
//             System.out.println("Invalid number");
//             return;
//         }
//         int fact = 1;
//         for(int i = n; i>=1;i--){
//               fact = fact*i;
//         }
//         System.out.println(fact);
//         return;
            
            
        
//     }
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         Factorial(n);
//     }
// }

// public class shivansh{
//     public static void printFactorial(int n){
//         int factorial = 1;
//         if(n<1){
//             System.out.println("Invalid input");
//             return;
//         }
//         for(int i = n;i>=1;i--){
//             factorial = factorial*i; 
//         }
//         System.out.println(factorial);
//         return;
//     }

//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         printFactorial(n);
//     }
// }

//  enter three number from the user and make a function to print the average .
// public class shivansh{
//     public static void calculateAverage(double a,double b,double c){
//         double average = (a+b+c)/3;
//         System.out.println(average);
//         return;
//     }
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         double a = sc.nextInt();
//         double b = sc.nextInt();
//         double c = sc.nextInt();

//         calculateAverage(a, b, c);
//     }
// }

// write a function which takes in 2 numbers and returns the greater of those
// public class shivansh{
//     public static void greatestOfTwo(int a,int b){
//         if(a>b){
//             System.out.println("a is greater thn b");
//             return;
//         }
//         else{
//             System.out.println("b is greater than a");
//             return;
//         }
//     }
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         greatestOfTwo(a, b);
//     }
// }

// write a finction that takes in the radius as input and returns the circumference of a circle.
// public class shivansh{
//     public static void calculateCircumference(double r){
//         double circumference = 2*3.14*r;
//         System.out.println(circumference);
//         return;
//     }
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         double r = sc.nextDouble();

//         calculateCircumference(r);
//     }
// }

// write the function to print the sum of all odd numbers from 1 to n

// public class shivansh{
//     public static void calculateSum(int n){
//         int sum = 0;
//         for(int i = 1;i<=n;i++){
//             if(i%2 != 0){
//                 sum = sum+i;
                
                
//             }
            
//         }
//          System.out.println(sum);
//         return;
//     }
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         calculateSum(n);
//     }
// }

//  write a function that takes in age as input and returns if that person is eligible to vote or not.

// public class shivansh{
//     public static void eligibilityDecider(int age){
//         if(age<=0){
//             System.out.println("Invalid input");
//         }
//         else if(age>=18){
//             System.out.println("Eligible to cast vote");
//         }
//         else{
//             System.out.println("Not eligible");
//         }
//     }
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int age = sc.nextInt();

//         eligibilityDecider(age);
//     }
// }

// write an infinite loop using do while condition
// public class shivansh {
//     public static void main(String[] args) {
        
//         // This is an infinite loop using do-while
//         do {
//             System.out.println("This will print forever");
            
//             // You can add a break condition if you want
//             // for example: if (someCondition) break;

//         } while (true); // The condition is always true
//     }
// }

// // write a program to enter the numbers till the user wants and at the end it should display the count of positive negative and zeros entered

// two numbers are entered by the user , x and n. write a function to find the value of one number raised to the power another x to the power n.

        

    


