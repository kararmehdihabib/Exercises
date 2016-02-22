
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write here the main program

 ArrayList<Student> list = new ArrayList<Student>();//assigning arraylist which contains student objects
        Scanner reader = new Scanner(System.in);
        String name = ""; //holds the name of students
        String studentNumber = ""; //holds the student number
        //implementing while loop so that the program asks to enter name and student number until an empty name string is inputted
        while (true) {
            System.out.println("name: ");
            name = reader.nextLine();
            //if empty string of name is given then the while loop breaks and shows the executes other codes
            if (name.isEmpty()) {
                break;
            }
            System.out.println("studentnumber: ");
            studentNumber = reader.nextLine();
            list.add(new Student(name,studentNumber));//add student objects to the arraylist
        }
        //printing all student objects in the arraylist
        for (Student st : list) {
            System.out.println(st);
        }
        //functionality to search students according to search term
        System.out.println("");
        System.out.println("Give search term: ");
        String term = reader.nextLine();
        System.out.println("Result:");
        for (Student student : list) {
            //if the name of any student contains the search term as a part of the name then it prints only the students which contains that part
            if (student.getName().contains(term)) {
                System.out.println(student);
            }
        }

    }
}
