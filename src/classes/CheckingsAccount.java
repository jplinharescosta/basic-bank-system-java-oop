package classes;

public class CheckingsAccount extends BankAccount implements Tributable {
    private double limitEspecialCheck;

    public CheckingsAccount(double balance ,double limitEspecialCheck, User user) {
        super(balance, user);
        this.limitEspecialCheck = limitEspecialCheck;
    }

    public double getLimitEspecialCheck() {
        return limitEspecialCheck;
    }

    public void setLimitEspecialCheck(int limitEspecialCheck) {
        this.limitEspecialCheck = limitEspecialCheck;
    }

    @Override
    public double calcularImposto(double percentage) {        
        return getBalance() * percentage;
    }

    @Override
    public void applyIncome(){
        System.out.println("Conta corrente, numero: " + this.getAccountNumber() + " não aplica redimento.");
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
