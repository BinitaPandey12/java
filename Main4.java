import java.sql.SQLOutput;

public class Main4 {
             public static void main(String[] args) {
                 for (int i = 0; i < 5; i++) { //star formation
                     for (int j = 1; j < 11; j++) {
                         System.out.print("*");

                     }
                     System.out.println();
//
                 }
//             }
//         }

                 for (int i = 1; i < 5; i++) {
                     for (int j = 0; j < 5; j++) {
                         if (i == 1 || i == 4 || j == 0 || j == 4) {
                             System.out.print("*");
                         } else {
                             System.out.print(" ");
                         }
                     }
                     System.out.println();
//
                 }

                 for (int i = 1; i < 5; i++) {  //half pyramid
                     for (int j = 1; j < 5; j++){
                         if(j==1||i==2 && j==2|| i==4||i==3 && j!=4) {
                             System.out.print("*");
                         }else{
                             System.out.print(" ");
                         }


                     }
                     System.out.println();

                 }
                 
                 for (int i = 1; i < 5; i++){ //or this method for half pyramid
                     for (int j = 0; j < i; j++){
                         System.out.print("*");
                     }
                     System.out.println();
                 }


                 for (int i = 4; i > 0; i--) { //inverted pyramid
                     for (int j = 0; j < i; j++) {
                         System.out.print("*");
                     }
                     System.out.println();
//
                 }

                  for(int i=1;i<5;i++){       //inverted half pyramid rotated
                      for(int j=1;j<5;j++){
                          if( j==4||i==4|| i==3 && j!=1||j==3 && i!=1) {
                              System.out.print("*");
                          }else{
                              System.out.print(" ");

                          }
                      }
                      System.out.println();
                  }
                 int n=4;    // another method for inverted half pyramid rotated
                 for(int i=1;i<=n;i++){    //for space
                     for(int j=1;j<=(n-i);j++){
                         System.out.print(" ");
                     }
                  for(int j=1;j<=i;j++) {  //for star
                      System.out.print("*");
                  }
                     System.out.println();

                 }
//                 for(int i=1;i<6;i++){    //half pyramid with numbers
//                     for(int j=1;j<=i;j++){
//                         System.out.print(j+" "); //space dina plus garne
//                     }
//                     System.out.println();
//
//                 }

                 for(int i=5;i>0;i--){  //inverted half pyramid with numbers
                     for(int j=1;j<=i;j++){
                         System.out.print(j+" ");
                     }
                     System.out.println();

                 }

                 }
         }

//








//
////
//
//
//
//
//
//
//
//                }
//
//
//
//
//
//
//
//            }
//
//
//
////
//
//
//
//
//
//
//
//
//
//
