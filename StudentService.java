public class StudentService {
    //Create Student
    public Student createStudent(String name, int age, int[] grades) {
        return new Student(name, age, grades);
    }

    //Printing them seperately
    public void printAllStudents(Student[] students){
        for (Student s : students){
            System.out.println(s);
        }
    }

    //TOP
    public Student getTopStudent(Student[] students){
        Student top = students[0];
        for (Student s : students){
            if (s.calculateAverage() > top.calculateAverage()){
                top = s;
            }
        }
        return top;
    }

    //Class Average
    public double getClassAverage(Student[] students){
        double sum = 0;
        for(Student s: students){
            sum += s.calculateAverage();
        }
        return sum/ students.length;
    }

    // Method overloading examples
    public double calculateAverage(int[] grades) {
        double sum = 0;
        for (int g : grades) {
            sum += g;
        }
        return (sum / grades.length);
    }

    public double calculateAverage(Student student) {
        return student.calculateAverage();
    }
}
