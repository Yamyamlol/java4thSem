/* 
      NAME: SANYAM RAWAT
      SECTION: D
      ROLL NO: 58
*/


import java.util.Scanner;

public class q11TW {
      public static void main(String[] args) {
            System.out.println("\t\t\t******INPUT******");
            Result r = new Result();
            r.readinfo();
            System.out.println("\t\t\t******OUTPUT******");
            r.printinfo();
            r.showMarks();
      }
}

class Student{
      int rollno;
      int age;
      String name;
      int marks[] = new int[4];
      public void readinfo(){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your roll number: ");
            rollno = sc.nextInt();
            System.out.print("Enter your age: ");
            age = sc.nextInt();
            System.out.print("Enter your name: ");
            sc.nextLine();
            name = sc.nextLine();
            System.out.println("Enter your marks in the 4 subjects");
            for (int i = 0; i < 4;i++) {
                  marks[i] = sc.nextInt();
            }
            sc.close();
      }
}

interface Info {
      public void printinfo();
}

interface Marks {
      public void showMarks();
}

class Result extends Student implements Marks, Info{
      public void printinfo(){
            System.out.println("Name: "+name);
            System.out.println("Age: "+age);
            System.out.println("Roll Number: "+rollno);
      }
      public void showMarks(){
            System.out.println("Marks: {"+marks[0]+", "+marks[1]+", "+marks[2]+", "+marks[3]+"}");
      }
}
