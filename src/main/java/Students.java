import javax.xml.transform.Source;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


class Students {
    public  String name;
    public String groop;
    public  int course;
    public double assessments;



    public Students(String name, String groop,  int course, double assessments) {
        this.name = name;
        this.groop = groop;
        this.course = course;
        this.assessments = assessments;
    }


    public  String getName() {
        return name;
    }

    public String getGroop() {
        return groop;
    }

    public  int getCourse(){
        return course;
    }

    public double getAssessments() {
        return assessments;
    }

    public  void setName(String name) {
        this.name = name;
    }

    public void setGroop(String groop) {
        this.groop = groop;
    }

    public void setWell(int course) {
        this.course = course;
    }

    public void setAssessments(int assessments) {
        this.assessments = assessments;
    }
    public double getassessments() {
        return assessments;
    }


    @Override
    public String toString() {
        return "Student{name='" + name + "', course=" + course + "}";
    }
    public static void removeFailingStudents(List<Students> students){

        students.removeIf(student -> student.getassessments() < 3.0);
    }


    public static void main(String[] args) {
        List<Students> students = new ArrayList<>();
        Students students1 = new Students("wfwaf","dsad",3,3);
        students.add(new Students("Aleksey", "Full", 3, 3.4));
        students.add(new Students("Vladimir", "Correspondenc", 2, 4.7));
        students.add(new Students("Ivan", "Remote", 4, 5.3));
        students.add(new Students("Semen", "Full-time and part-time", 4, 3.3));
        students.add(new Students("Ekaterina", "Full", 3, 4.7));
        students.add(new Students("Anna", "Correspondence", 2, 4.3));
        students.add(new Students("Liza", "Remote", 3, 3.3));
        students.add(new Students("Masha", "Full-time and part-time", 4, 3.3));
        System.out.println("До удаления: " + students);
        System.out.println("После удаления: " + students);

    }}