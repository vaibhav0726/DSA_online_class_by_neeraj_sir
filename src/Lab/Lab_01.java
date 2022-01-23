package Lab;

// jan_13 basic operations on an array
public class Lab_01 {
    int arr[]=null; // for sake of the compiler that i have not created the array here
    public Lab_01() {
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

//    method to traverse the array
    // to print all the values stored in the array
    public  void traverse(){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
//    method to print a specific index value
    public void indevalue(int index){
        try{
            System.out.println(arr[index]);
        }
        catch (ArrayIndexOutOfBoundsException obj){
            System.out.println("invalid index");
        }
    }
//    method to search a value in the given array
    public void searchInArray(int seachValue) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == seachValue) {
                System.out.println("Value found ");
                return;
            }
        }
        System.out.println("No match found");
    }
//     method to delete a particular value from an array
//      user provide the index
    public void delete(int index){
        try{
            arr[index]=Integer.MIN_VALUE;
        }
        catch (ArrayIndexOutOfBoundsException obj){
            System.out.println("invalid index");
        }
    }
//    delete the complete array
    public void deleteArray(){
        arr=null; //deleted array
    }

    public static void main(String[] args) {
        Lab_01 obj=new Lab_01();
        System.out.println("after insertion");
        obj.insert(10,3);
        obj.traverse();
        System.out.println("after deletion");
        obj.delete(3);
        obj.traverse();
    }


}
