public class Main {
    public static void main(String[] args){
        StudentService service = new StudentService();

        // Create students
        Student s1 = service.createStudent("Huseyn", 20, new int[]{90, 85, 78});
        Student s2 = service.createStudent("Ayla", 22, new int[]{88, 92, 80});
        Student s3 = service.createStudent("Banu", 21, new int[]{70, 75, 68});

        // Store in array
        Student[] students = {s1, s2, s3};

        // Print all students
        System.out.println("All students:");
        service.printAllStudents(students);

        // Find top student
        Student top = service.getTopStudent(students);
        System.out.println("\nTop student:");
        System.out.println(top);

        // Class average
        double classAvg = service.getClassAverage(students);
        System.out.println("\nClass average: " + String.format("%.2f", classAvg));

        // Example of method overloading
        double aliceAvgFromArray = service.calculateAverage(s1.getGrades());
        double aliceAvgFromObject = service.calculateAverage(s1);
        System.out.println("\nHuseyn average from grades array: " + String.format("%.2f", aliceAvgFromArray));
        System.out.println("Huseyn average from Student object: " + String.format("%.2f", aliceAvgFromObject));
    }
}
