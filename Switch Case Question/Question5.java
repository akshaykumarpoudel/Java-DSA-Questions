public class Question5 {
    public static void main(String[] args) {
        String currentColor = "Red"; // Initial state

        System.out.println("Simple Traffic Light Simulator");

        for (int i = 0; i < 5; i++) { // Simulate a few state transitions
            System.out.println("Current light is " + currentColor);

            switch (currentColor) {
                case "Red":
                    System.out.println("Stop!");
                    currentColor = "Green";
                    break;
                case "Yellow":
                    System.out.println("Prepare to stop!");
                    currentColor = "Red";
                    break;
                case "Green":
                    System.out.println("Go!");
                    currentColor = "Yellow";
                    break;
                default:
                    System.out.println("Invalid state");
            }

            try {
                Thread.sleep(2000); // Pause for 2 seconds to simulate the light changing
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}