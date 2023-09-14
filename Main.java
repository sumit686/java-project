import java.util.Scanner;



public class Main {
   static boolean linearSearch(int arr[],int key){
        for(int element :arr){
            if(element==key){
                return true;


            }

        }
              return false;


    }
    static void print(int arr[]){
       for(int element:arr){
           System.out.print(element+" ");
       }
    }
    public static void main(String[] args) {
int arr[]={6,8,9,10,67};
Scanner sc=new Scanner(System.in);
int key=sc.nextInt();
boolean found=linearSearch(arr,key);
if(found){
    System.out.println("value is present in array ");
}
else{
    System.out.println("Value of array absent");
}
print(arr);

    }}