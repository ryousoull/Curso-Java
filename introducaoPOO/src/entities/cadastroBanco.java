package entities;

public class cadastroBanco {
    private int numberAccont;
    private String name;
    private double deposit;

    public cadastroBanco(int numberAccont, String name, double initialdeposit) {
        this.numberAccont = numberAccont;
        this.name = name;
        enterDeposit(initialdeposit);
    }


    public cadastroBanco (int numberAccont, String name){
        this.numberAccont = numberAccont;
        this.name = name;
    }


    public int getNumberAccont() {
        return numberAccont;
    }

    public void setNumberAccont(int numberAccont) {
        this.numberAccont = numberAccont;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public void enterDeposit(Double value) {
        this.deposit += value;
    }

    public void withdrawValue(Double value) {
        this.deposit -= value + 5.0;
    }

    public String toString() {
        return "Accont " +
                numberAccont +
                ", Holder: " + name
                + ", Balance: "
                + "$ "
                + String.format("%.2f", deposit);
    }
}
