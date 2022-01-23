//data structure:-
//1:- physical DS
//1.1.linkedlist
//1.2 array
//2:- logical DS
//2.1 stack
//2.2 queue
//2.3 tree
//2.4 graph
//2.5 hashing


import java.util.*;
//1st program(using local variable)

//public class jan_12 {
//    public static void main(String[] args) {
//
//        int arr[]=new int[5];  //local array(accessible only in the main block)
////        int arr[];
////        arr=new int[5];
//        Scanner s=new Scanner(System.in);
//        for (int i = 0; i < arr.length; i++) {
//            arr[i]=s.nextInt();
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//
//    }
//}


//2nd way for same thing (using the constructor)(using instance variable):-

//public class jan_12{
//    int arr[]; //instance variable(which are declared inside the class)
////    int arr[]=new int[5]; //wrong method (should be initialized in the constructor)
////    space allcated by the object not the class
//
//    public jan_12(){ // constructor
////        after creating an object it invokes the constructor and declare the array as given below:-
//        arr = new int[5]; // Right way to declaration of an array
//        //        to initialise the array we should initialise in the constructor
//        Scanner s=new Scanner(System.in);
//        for (int i = 0; i < arr.length; i++) {
//            arr[i]=s.nextInt();
//        }
//    }
//    public static void main(String[] args) {
////        creating an object:-
//        jan_12 obj=new jan_12();
//        //        we can't access the non static array inside the static area
////        to get access of the non static array inside the static area we should initialize the object first as shown above
//
//        for (int result : obj.arr) {
//            System.out.println(result);
//        }
//    }
//}

//3rd way:-(using static variable)
//public class jan_12{
//    static int arr[]; //class variable  // declaration
//
//    static {
////        it execute before the main method
//        arr =new int[5]; // creation
//        System.out.println("inside the static block executes before the main method");
//    }
//
//    public static void main(String[] args) {
////        arr=new int[5];  // creation of the array
////        array are considered as reference data type
////        and by default array the initialized with null so without creation it will show null pointer exception
//        Scanner s=new Scanner(System.in);
////      initialisation given below
//        for (int i = 0; i < arr.length; i++) {
//            arr[i]=s.nextInt();
//        }
//        for (int result : arr) {
//            System.out.println(result);
//        }
//    }
//}


//another way:-
public class jan_12 {
    int arr[]=null; // for sake of the compiler that i have not created the array here
    public jan_12() {
        arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=Integer.MIN_VALUE; // concept of wrapper class to initialize the array with the INT_MIN value

        }
    }

    public void insert(int value, int index){
        try{
            // use if user give invalid index
            if(arr[index]==Integer.MIN_VALUE){
                arr[index]=value;
            }
            else
            {
                System.out.println("already filled");
            }
        }
        catch (ArrayIndexOutOfBoundsException obj){
            System.out.println("invalid index");
        }
    }

}