import java.util.Objects;

public class Student implements Comparable<Student> {

    String name;
    double score;

    public Student(String name, double score){
        this.name = name;
        this.score = score;

    }
    

    @Override
    public int compareTo(Student student) {
        int result = ((Double)student.score).compareTo(this.score);
        if(result == 0){
            result = this.name.compareTo(student.name);
        }
        return result;
    }

    @Override
    public String toString() {
        return name + " -- " + score;
    }
}
