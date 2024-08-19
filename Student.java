public class Student implements Comparable<Student> {

    String name;
    double score;

    public Student(String name, double score){
        this.name = name;
        this.score = score;

    }

    @Override
    public int compareTo(Student student) {
        return ((Double)student.score).compareTo(this.score);
    }

    @Override
    public String toString() {
        return name + " -- " + score;
    }
}
