import java.util.Scanner;

class Student 
{
      public static void main(String args[])
      {
            String name;
            int rollNo;
            String department;
            String university;
            float marks[] = new float[5];
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your name: ");
            name = sc.nextLine();
            System.out.print("Enter your roll number: ");
            rollNo = sc.nextInt();
            System.out.print("Enter your department: ");
            department = sc.nextLine();
            sc.nextLine();
            System.out.print("Enter your university: ");
            university = sc.nextLine();
            // sc.nextLine();
            System.out.print("Enter your marks in the 5 subjects: ");
            for(int i = 0;i<5;i++)
                  marks[i] = sc.nextInt();
            System.out.println("\t\t\t******OUTPUT******");
            System.out.println("Student Name: "+ name);
            System.out.println("University: "+ university);
            System.out.println("Roll No: "+ rollNo);
            float totalMarks = marks[0]+marks[1]+marks[2]+marks[3]+marks[4];
            float percentage = totalMarks/5;
            System.out.println("Percentage: "+percentage+"%");
      }
      
}