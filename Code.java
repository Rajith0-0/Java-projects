
static String AssignTier(char size,double weight) {

     if ( size == 'S' && weight<=1.0)return "SMALL";
     if (size == 'M'|| weight <=5.0)return "MEDIUM";
}
static double ComputeFees(String tier) {
    switch (tier) {
    case "MEDUIM":return 35.0;
    case "LARGE":return 50.0;
    default:     return 20.0;
}
}
 static void printReceipt(String tier, double fee) {
     System.out.println("Tier: "+ tier);
     System.out.println("Fee: %.2f%n", fee);

 }  
 public static void main(String args[]) {
    String tier = assignTier('L', 3.2);
    printReceipt(tier, coputerFee(tier));
 }

 