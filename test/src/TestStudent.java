import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by WLP on 2017/7/3.
 */
public class TestStudent {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();

        List<Student> studentList = new ArrayList<Student>();
        while (i>0){
            int id = in.nextInt();
            String name = in.next();
            int score = in.nextInt();
            Student student = new Student(id,name,score);
            studentList.add(student);
            i--;
        }

        for (Student s:studentList){
            System.out.println(s.getName());
        }
    }
}
class Student implements Comparable{
    private int id;
    private String name;
    private int score;

    public Student(int id, String name, int score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String toString(){
        return id +":"+name+":"+score;
    }

    public int compareTo(Object o){
        Student input = (Student) o;
        int res = score < input.score?1:(score == input.score?0:-1);
        if (res == 0){
            res = name.compareTo(input.name);
        }
        return res;
    }
}