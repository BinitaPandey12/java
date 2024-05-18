import java.util.*;
public class Main3
{
    public static void main (String args[]) {
//       :: for loop
        for (int i = 0; i < 5; i++) {
            System.out.println("hello");

        }

//           ::while loop
        int i1=0;
        while(i1<5){
            System.out.println("binita");
            i1++;
        }

//        ::do while loop
        int i2=9;
        do{
            System.out.println("pandey");

        } while(i2<10);


//            ::sum of natural numbers
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=0;i<n;i++){

            sum=sum+i;}
            System.out.println(sum);
//        (loop bahira vayeko le final sum execute huncha )

//
//        :: multiplication of 2
//
//        int mul;
//        for(int i=1;i<n;i++){
//           mul=2*i;
//            System.out.println(mul);
//        }

//
////        ::printing  even number
//        int i=0;
//        while(i<21){
//            if(i%2==0){
//                System.out.println(i);
//            }
//            i++;


                Scanner sc = new Scanner(System.in);
                int input;

                do {

                    int marks = sc.nextInt();
                    if (marks >= 90) {
                        System.out.println("this is good");
                    } else if (marks >= 89 && marks >= 60) {
                        System.out.println("this is also good");
                    } else if (marks >= 59 && marks >= 0) {
                        System.out.println("this is good as well");
                    } else {
                        System.out.println("invalid");
                    }

                    System.out.println("want to continue?if yes(1) or no(0)");
                    input = sc.nextInt();

                }
                while(input==1);





                }







            }



//










