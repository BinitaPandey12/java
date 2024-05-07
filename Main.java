
public class Main {
    public static void main(String[] args) {
//        non-primitive types of java
        String name="binita";
        System.out.println(name.length());
//         FUNCTION OF STRING:concatenate(ADDITION OF TWO STRINGS)
        String name1="binita";
        String name2="bini";
        String name3=name1 + name2;
        System.out.println(name3);
        String name4= name1 + " simran "+ name2;
        System.out.println(name4);
////           ANOTHER FUNCTION:charAt(KUN POSITION MA KUN CHARACTER STORE CHA)
        System.out.println();
        System.out.println(name2.charAt(3));
//               ANOTHER FUNCTION:replace(replaces string)
        String name5="technology";
        String name6 =name5.replace('o','p');
        System.out.println(name6);
        System.out.println();
//                 ANOTHER FUNCTION:substring(immutable)
        String name7= "rajesh and hari";
        System.out.println(name7.substring(1,6));
        System.out.println(name7.substring(0,2));




    }
}