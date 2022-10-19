public class BankAbstraction {
    public static void main(String[] args) {
        centralBank cb = new centralBank("Sangeetha", 24681357,"Savings","Hosur");
        cb.withdraw();
        cb.deposit();
        cb.getinterest();
    }
}
