import java.util.*;  //enter three number from user and calculate its average
//public class Solution{
//    public static void main(String []args){
//        Scanner scan = new Scanner(System.in);
//        int num1=scan.nextInt();
//        int num2=scan.nextInt();
//        int num3=scan.nextInt();
//        int average=(num1+num2+num3)/3;
//        System.out.println(average);
//
//
//
//    }


//write a function to print the sum of all odd numbers from 1 to n
//public class Solution{
//    int sum=0;  //instance variable
//    public static  void sumPrint(int n) {       //static word vayeko method=static method= cannot access instance variable
//         int sum=0; //local variable              //so  make local variable                  /
//        for (int i = 1; i <= n; i++) {           //non-static method=instance variable is enough
//            if (i % 2 != 0) {
//                sum = sum+i ;
//            }
//        }
//        System.out.println(sum);
//    }
//        public static void main(String args[]) {
//            Scanner sc = new Scanner(System.in);
//            int n = sc.nextInt();
//            sumPrint(n);
//        }
//    }

//
// write a function which takes 2 number and prints the greater one
// public class Solution {
//
//    public static void print(int a,int b) {
//        if (a > b) {
//            System.out.println(a);
//        } else {
//            System.out.println(b);
//        }
//
//    }
//
//         public static void main(String args[]){
//        Scanner sc = new Scanner(System.in);
//        int a= sc.nextInt();
//        int b = sc.nextInt();
//        print(a, b);
//    }
// }



// public class Solution {      //Write a function that takes age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote
////
//    public static void age(int a1) {
//        if (a1 > 18) {
//            System.out.println("you van vote");
//        }else{
//            System.out.println("rejected");
//        }
//    }
//
//    public static void main(String args[]) {
//    Scanner sc = new Scanner(System.in);
//    int a1 = sc.nextInt();
//    age(a1);
//
// }
// }

// public class Solution {    //using static keyword for memory management
//     int id;
//     String name;
//     static String company="BP";
//     Solution(int id,String name){
//     this.id=id;
//     this.name=name;}
//     public void print(){
//         System.out.println(this.id+" "+this.name+" "+company);
//     }
//     public static void main(String args[]){
//         Solution sol1=new Solution(1,"bini");
//         sol1.print();
//         Solution sol2=new Solution(2,"binita");
//         sol2.print();
//
//     }
// }


// TAKE RADIUS AS INPUT AND RETURN CIRCUMFERENCE.
import java.util.*;
public class Solution {    //double datatype=64 bit more more precise data
    public static void Calculate(Double r){
        Double total=2*3.14*r;
        System.out.println(total);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Double r = sc.nextDouble();
        Solution.Calculate( r);


    }
}




























