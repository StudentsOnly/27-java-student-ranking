import java.util.Scanner;
import java.util.TreeSet;

public class Main{
    public static void main(String[] args) {
        TreeSet<Student> students = new TreeSet<>();
        menu(students);

    }
    public static void menu(TreeSet<Student> students){
        Scanner scan = new Scanner(System.in);

        int input = 0;
        while(input >= 0){
            System.out.println("\nMenu:");
            System.out.println("* Add student - enter '1'");
            System.out.println("* Display student rankings '2'");
            System.out.println("* Exit - enter '3'");


            input = scan.nextInt();
            scan.nextLine();

            switch(input){
                case 1:
                    addStudent(students, scan);
                    break;
                case 2:
                    displayRanking(students);
                    break;
                case  3:
                    System.exit(0);

                default:
                    System.out.println("Invalid input, try again!\n");
                    break;

            }

        }
        scan.close();
    }

    public static void addStudent(TreeSet<Student> students, Scanner scan){
        String name = "";
        double score = 0.0;

        System.out.println("'Add student': Enter name");
        name = scan.nextLine();
        System.out.println("'Add student': Enter score");
        score = scan.nextDouble();
        scan.nextLine();

        if(students.add(new Student(name, score))){
            System.out.println("\nStudent '" + name + "' is added!");
        }else {

            System.out.println("\nStudent '" + name + "' is already in the list!");
        }
    }
    public static void displayRanking(TreeSet<Student> students){
        System.out.println("\nStudent ranking:");
        if(students.isEmpty()){
            System.out.println("list is empty!");
        }else {
            for (Student student : students) {
                System.out.println( "* " + student);
            }
        }
    }
}
