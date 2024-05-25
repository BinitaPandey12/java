
public class Main5 {
    public static void main(String args[]) {  //Floyd's triangle
        int number=1;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }


         for(int i=1;i<=5;i++){
             for(int j=1;j<=i;j++){    //0-1 triangle
                 if((i+j)%2==1){
                     System.out.print("0");
                 } else{
                     System.out.print("1");
                 }
             }
             System.out.println();
         }


        int n = 5;      //spaces
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 5; j++) {   //for  stars
                System.out.print("*");


            }
            System.out.println();
        }


        int n2= 5;
        for (int i = 1; i <= n; i++) {    //number pyramid
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int i1 = 1; i1 <= i; i1++) {
                System.out.print(i + " ");
            }
            System.out.println();


             }

//

//
        int n3=5;  //  number pryamid
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=i;j>=2;j--){ 
                System.out.print(j);
            }
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();

        }
        }
    }

