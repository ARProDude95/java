public class StudentManagementSystem {

    public static double calculatePercentage(
            int physics,
            int chemistry,
            int maths) {

        int total = physics + chemistry + maths;

        return total / 3.0;
    }

    public static void main(String[] args) {

        String name = "Aaryaman Tiwari";
        int age = 18;

        int physics = 95;
        int chemistry = 96;
        int maths = 98;

        double percentage =
                calculatePercentage(
                        physics,
                        chemistry,
                        maths);

        System.out.println("================================");
        System.out.println("STUDENT MANAGEMENT SYSTEM");
        System.out.println("================================");

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

        System.out.println();

        System.out.println("Physics: " + physics);
        System.out.println("Chemistry: " + chemistry);
        System.out.println("Maths: " + maths);

        System.out.println();

        System.out.println("Percentage: " + percentage);

        System.out.println("Passed: true");
    }
}