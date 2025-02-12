import classes.*;
public class App {
    public static void main(String[] args) throws Exception {
        User client1 = new User("João Costa", "064.955.137-04", "21-01-1999");
        User client2 = new User("Pedro Paulo", "064.123.158-01", "12-05-2002");

        CheckingsAccount cc = new CheckingsAccount(1000.0, 500.0, client1);
        SavingsAccount cp = new SavingsAccount(2000.0, 0.02, client2);
        cc.verifyBalance();
        cp.verifyBalance();

        cc.deposit(5000.0);
        cp.deposit(2000.0);

        System.out.println("Imposto da Conta Corrente: R$" + cc.calcularImposto(0.01));
        System.out.println("Imposto da Conta Poupança: R$" + cp.calcularImposto(0.005));


        cc.verifyBalance();
        cp.verifyBalance();
        cc.applyIncome();
        cp.applyIncome();        
        cc.getUserInfo();
        cp.getUserInfo();
        
    }
}