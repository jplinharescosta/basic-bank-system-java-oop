package classes;

public class User {
    private String name;
    private String cpf;
    private String birthDay;

    public User(String name, String cpf, String birthDay) {
        this.birthDay = birthDay;
        this.cpf = cpf;
        this.name = name;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
