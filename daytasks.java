public class daytasks {
    public static void main(String[] args) {
        boolean physicsPass = true;
        boolean chemistryPass = true;
        boolean mathsPass = false;

        boolean passed = physicsPass && chemistryPass;
        System.out.println("Passed: " + passed);
        passed = physicsPass && mathsPass;
        System.out.println("Passed: " + passed);
        passed = physicsPass || mathsPass;
        System.out.println("Passed: " + passed);
        passed = !mathsPass;
        System.out.println("Passed: " + passed);
    }
}
