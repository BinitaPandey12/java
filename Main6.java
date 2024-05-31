public class Main6 {
    String name;
    int age;

//    public void printInfo() {
//        System.out.println(name);
//        System.out.println(age);
//    }

//    public Main5() {       //non parametrized
//        System.out.println("constructor called");
//
//    }
//
//    public static void main(String args[]) {
//        Main5 info = new Main5();
//        info.name = "shrimpo";
//        info.age = 10;
//        info.printInfo();
//     }
//
//      Main5(String name,int age){   //parametrized
//          this.name=name;
//          this.age=age;
//      }
//    public String toString() {  //To print an object's contents in a meaningful way, you can create a toString() method within your class.
//        return "Name: " + this.name + ", Age: " + this.age; //return=gives output
//    }
//
//    public static void main(String args[]) {
//        Main5 info = new Main5("shrimpi",20);
//        System.out.println(info); //w/o Tostring prints the object's reference and hash code
////
////
//
//
//     }
    public void printInfo(String name){    //function overloading same function used for varies purpose.
        System.out.println(name);}

        public void printInfo(String name,int age){
            System.out.println(name+" "+ age);}

            public void printInfo(int age){
                System.out.println(age);
            }


    public static void main(String args[]) {
        Main6 main=new Main6();
        main.name="xnsjn";
        main.age=35;
        main.printInfo(main.name,main.age);

    }
    }




