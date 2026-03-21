public class SafetyFirst {
    public static void main(String[] args) {
        
        System.out.println("--- SYSTEM STARTING ---");
        System.out.println("1. App is running perfectly.");

        // 🛡️ THE BLAST SHIELD 🛡️
        try {
            System.out.println("2. Attempting highly dangerous math...");
            
            // This is the bomb. It will explode instantly.
            int result = 10 / 0; 
            
            // This line will NEVER print because Java instantly ejects when the line above explodes.
            System.out.println("MATH SUCCESSFUL! Result is: " + result);
            
        } catch (Exception e) {
            // Java lands safely down here on the crash pad.
            System.out.println("🔴 CAUGHT AN ERROR: You tried to divide by zero!");
        }

        // The ultimate proof that the app survived the explosion.
        System.out.println("3. App is STILL running safely. The shield held.");
        System.out.println("--- SYSTEM SHUTDOWN ---");
    }
}