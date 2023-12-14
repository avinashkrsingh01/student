import java.util.HashMap;
import java.util.Scanner;
 class Student{
    public String name;
    public int rollNo;
    public int age;
    public int marks;
   // contructor are the method those heve same name as class and they do not have return type.@interface
   public Student(String name, int rollNo , int age , int marks){
      this.name = name;
      this.rollNo = rollNo;
      this.age = age;
      this.marks = marks;
 
   }
   public int display(){
    return rollNo;
   }
   public void viewStudent(){
    System.out.println("Name:"+name);
    System.out.println("RollNo:"+rollNo);
    System.out.println("Age:"+age);
    System.out.println("Marks:"+marks);
   }

}

public class Studentbase {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        HashMap<Integer,Student> database = new HashMap<>();
        while(true){

            System.out.println("1.Add Student");
            System.out.println("2.View Student");
            System.out.println("3.search student");
            System.out.println("4.Calculator average");
            System.out.println("5.exit");
            System.out.print("2.Enter your choice");
            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice){
                   case 1: System.out.print("Enter your name:");
                   String name = sc.nextLine();
                   System.out.print("Enter your roll number:");
                   int rollNo = sc.nextInt();
                   System.out.print("Enter your age:");
                   int age = sc.nextInt();
                   System.out.print("Enter your marks:");
                   int marks = sc.nextInt();
                   Student std = new Student(name,rollNo,age,marks);
                   database.put(rollNo,std);
                   System.out.println("Student added successfuly");
                    break;

                    case 2: System.out.println("List of students:");
                    for(Student i:database.values()){
                        i.viewStudent();
                        
                    }
                    break;


                    case 3: System.out.println("Enter your roll number");
                    int roll = sc.nextInt();
                    Student data = database.get(roll);
                    if(data!= null){
                        data.viewStudent(); 
                    }
                    else{
                               System.out.println("Student not found");
                        }
                    
                    System.out.println("--------------------------");
                    break;

                    case 4:
                    int totalStudent = database.size();
                    int totalMarks=0;
                    for(Student j:database.values()){
                        totalMarks=totalMarks+j.marks;

                    }
                    double average = (double)totalMarks/totalStudent;
                    System.out.println("Average marks:"+average);
                    break;

                    case 5:
                    System.exit(0);
                    break;
                    default: System.out.println("Invalid Output");

            }

        }
    
    }
}