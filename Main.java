import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    String name;
    int age;
    String Bloodgroup;
    
   Scanner scanner = new Scanner(System.in);
  System.out.println("enter your name=");
    name = scanner.nextLine();
    System.out.println(name);
    System.out.println("fill your age=");
    age=scanner.nextInt();
    System.out.println(age);
    System.out.println("enter your Bloodgroup=");
    Bloodgroup=scanner.next();
    System.out.println(Bloodgroup);
    scanner.close();
System.out.println(name+"\n"+age+"\n"+Bloodgroup);
    if(age>=20){
      String Group="RED";
         System.out.println(Group);
    }
    else if(age>=15 && age<20){
      String Group="Blue";
      System.out.println(Group);
    }
    else if(age>=10 && age<15){
      String Group="Yellow";
      System.out.println(Group);
      
    }
    else{
      System.out.println("invalid group");
    }
  
          
  }
}