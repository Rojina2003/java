import java.util.Scanner;
class Student {
    String name;
    int rollNumber;
    double mark1, mark2, mark3;
    void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Roll Number: ");
        rollNumber = sc.nextInt();
        System.out.print("Enter Marks for 3 subjects: ");
        mark1 = sc.nextDouble();
        mark2 = sc.nextDouble();
        mark3 = sc.nextDouble();
    }
    double calculateTotal() {
        return mark1 + mark2 + mark3;
    }
    double calculateAverage() {
        return (mark1 + mark2 + mark3) / 3;
    }
    void displayData() {
        System.out.println("\nStudent Details");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + mark1 + ", " + mark2 + ", " + mark3);
        System.out.println("Total Marks: " + calculateTotal());
        System.out.println("Average Marks: " + calculateAverage());
    }
    public static void main(String[] args) {
        Student s = new Student();
        s.getData();
        s.displayData();
    }
}
