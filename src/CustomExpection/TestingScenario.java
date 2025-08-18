package CustomExpection;

public class TestingScenario {
    public static void main(String[] args) {
        String name = "Amol";

        try {
            if (!name.equals("AMOL")) {
                throw new OminiDeployementException("Name mismatch Exception");
            }
        } catch (Exception e) {
            if (e instanceof VaultLoginException) {
                System.out.println("Caught VaultLoginException: " + e.getMessage());
            } else {
                e.printStackTrace();
            }
        }
    }
}