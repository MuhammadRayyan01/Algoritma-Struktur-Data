public class royalGarden {
    
    // Flower prices
    static final int PRICE_AGLONEMA = 75000;
    static final int PRICE_YAM = 50000;
    static final int PRICE_ALOCASIA = 60000;
    static final int PRICE_ROSE = 10000;
    
    // Stock data: rows = branches, columns = [Aglonema, Yam, Alocasia, Rose]
    static int[][] stock = {
        {10, 5, 15, 7},    // RoyalGarden 1
        {6, 11, 9, 12},    // RoyalGarden 2
        {2, 10, 10, 5},    // RoyalGarden 3
        {5, 7, 12, 9}      // RoyalGarden 4
    };
    
    static String[] branchNames = {"RoyalGarden 1", "RoyalGarden 2", 
                                    "RoyalGarden 3", "RoyalGarden 4"};
    
    // Function to calculate income for a specific branch
    public static int calculateBranchIncome(int branchIndex) {
        int income = 0;
        income += stock[branchIndex][0] * PRICE_AGLONEMA;
        income += stock[branchIndex][1] * PRICE_YAM;
        income += stock[branchIndex][2] * PRICE_ALOCASIA;
        income += stock[branchIndex][3] * PRICE_ROSE;
        return income;
    }
    
    // Function to display income of each branch
    public static void displayAllIncome() {
        System.out.println("=== BRANCH INCOME (IF ALL SOLD OUT) ===");
        for (int i = 0; i < branchNames.length; i++) {
            int income = calculateBranchIncome(i);
            System.out.printf("%s: Rp%,d\n", branchNames[i], income);
        }
    }
    
    // Function to display status of each branch
    public static void displayBranchStatus() {
        System.out.println("\n=== BRANCH STATUS ===");
        for (int i = 0; i < branchNames.length; i++) {
            int income = calculateBranchIncome(i);
            String status;
            
            if (income > 1500000) {
                status = "Very Good";
            } else {
                status = "Need Evaluation";
            }
            
            System.out.printf("%s (Rp%,d): %s\n", branchNames[i], income, status);
        }
    }
    
    public static void main(String[] args) {
        displayAllIncome();
        displayBranchStatus();
    }
} 
    

    

