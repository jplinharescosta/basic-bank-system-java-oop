package classes;
public class SavingsAccount extends BankAccount implements Tributable {
    private double mounthlyIncomePercentage;


    public SavingsAccount(double balance ,double mounthlyIncomePercentage, User user) {
        super(balance, user);
        this.mounthlyIncomePercentage = mounthlyIncomePercentage;
    }

    public double getMounthlyIncome() {
        return mounthlyIncomePercentage;
    }

    public void setMounthlyIncome(int mounthlyIncomePercentage) {
        this.mounthlyIncomePercentage = mounthlyIncomePercentage;
    }

    @Override
    public double calcularImposto(double percentage) {
        return this.getBalance() * percentage;
    }

    @Override
    public void applyIncome(){
        double redimento = this.getBalance() * mounthlyIncomePercentage;
        deposit(redimento);
        System.out.println("Redimento aplicado: R$" + redimento + " a conta: " + this.getAccountNumber());
    }

    @Override
    public void getUserInfo(){        
        System.out.println("Conta: " + this.getAccountNumber());
        System.out.println("Nome: " + this.getUser().getName());
        System.out.println("CPF: " + this.getUser().getCpf());
        System.out.println("Data de nascimento: " + this.getUser().getBirthDay());
        System.out.println("Saldo: " + this.getBalance());
        System.out.println(" ");
    }

}
