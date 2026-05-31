import java.util.Arrays;

public class Student {
    private String name;
    private int age;
    private int[] grades;

    // Default constructor
    public Student(){
        this.name = "Unknown";
        this.age = 0;
        this.grades = new int[]{0};
    }

    // Constructor with parameters
    public Student(String name, int age, int[] grades){
        this.name = name;
        this.age = age;
        this.grades = grades;
    }

    // Getters and Setters
    public String getName() { return name;  }
    public int getAge() {
        return age;
    }
    public int[] getGrades() {
        return grades;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    // Average grade
    public double calculateAverage(){
        double sum = 0;
        for (int grade : this.grades){
            sum += grade;
        }
        return (sum / grades.length);
    }

    // Max grade
    public int getMaxGrade() {
        int max = this.grades[0];
        for(int g : grades){
            if(g > max)
                max = g;
        }
        return max;
    }

    // Min grade
    public int getMinGrade() {
        int min = this.grades[0];
        for(int g : grades){
            if(g < min)
                min = g;
        }
        return min;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age:" + age + ", Average:" + String.format("%.2f", calculateAverage());
    }

    @Override
    public boolean equals(Object obj) {
        Student s = (Student) obj;
        return this.name.equals(s.name) && this.age == s.age;
    }

    @Override
    public int hashCode() {
        return name.hashCode() + age;
    }
}



