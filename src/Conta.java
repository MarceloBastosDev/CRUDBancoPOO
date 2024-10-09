public class Conta {
    private String nome;
    private double saldo;
    private int numeroConta;

    public Conta(String nome, int numeroConta, double saldo){
        this.nome = nome;
        this.numeroConta = numeroConta++;
        this.saldo = saldo;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "nome='" + nome + '\'' +
                ", saldo=" + saldo +
                ", numeroConta=" + numeroConta +
                '}';
    }
}
