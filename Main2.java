 import java.util.*;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main2 {
//    normal multiplication
    public static void main(String[] args) {
        int a=20;
        int b=10;
        int mul=a*b;
        System.out.println(mul);
//         print int
      Scanner sc=new Scanner(System.in);
//       [ Creates a new Scanner object (instance) and assigns it to the variable sc.(read input from the keyboard)

        int name=sc.nextInt();
////       next=one word matra print garcha
////       nextLine=lekheko sabai line print garcha
////
        System.out.println(name);
//          print sum
        Scanner sc1=new Scanner(System.in);
        int a1=sc1.nextInt();
        int b1=sc1.nextInt();
        int sum=a1+b1;
        System.out.println(sum);


        Scanner sc2 = new Scanner(System.in);
        int button=sc2.nextInt();
//        ::IF ELSE CONDITION
        if(button==1){
            System.out.println("hello");}
             else if (button==2){
                System.out.println("namaste");}
             else{
                    System.out.println("bonjour");}
//        ::switch condition
//        (EASIER THAN IF ELSE CODE DHERAI LEKHNA PARDAINA).
        Scanner sc3 = new Scanner(System.in);
        int button1=sc3.nextInt();
        switch(button1){
            case 4:
                System.out.println("hello");
                break;
            case 5:
                System.out.println("namaste");
                break;
            case 6:
                System.out.println("bonjour");

        }

//         MAKING A CALCULATOR:
          Scanner sc4=new Scanner(System.in);
          int a2=sc4.nextInt();
          int b2=sc4.nextInt();
          int sum1=a2+b2;
          int sub=a2-b2;
          int mul1=a2*b2;
          int div=a2/b2;
          int mod=a2%b2;
        System.out.println(sum1);
        System.out.println(sub);
        System.out.println(mul1);
        System.out.println(div);
        System.out.println(mod);





        Scanner sc5 = new Scanner(System.in);
        System.out.print("enter the number of the month");
        int month = sc4.nextInt();

        switch (month) {
                case 12:
                    System.out.println("december");
                break;
                case 11:
                    System.out.println("novem");
                break;
                case 10:
                    System.out.println("oct");

        }





        }
    }
















