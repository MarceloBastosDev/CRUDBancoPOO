import java.util.ArrayList;
import java.util.Iterator;

public class Banco {
    ArrayList<Conta> listaConta = new ArrayList<Conta>();

    public Banco(){
        this.listaConta = new ArrayList<>();
    }
    public void listarContas() {
        for (Conta conta : listaConta) {
            System.out.println(conta.getNome() + " " +  conta.getNumeroConta() + " " + conta.getSaldo());
        }
    }

    public void createConta(String nome, int numeroConta, double saldo){
        Conta newConta = new Conta(nome, numeroConta, saldo);
        listaConta.add(newConta);
        System.out.println("Conta criada: " + newConta);

    }
    public void editConta(String nome, int numeroConta, double newSaldo){
        for (Conta conta : listaConta){
            if (conta.getNumeroConta() == numeroConta){
                conta.setSaldo(newSaldo);
                System.out.println("Conta " + numeroConta + " editada. Novo saldo: " + newSaldo);
                return;
            }
        }
        System.out.println("Conta não encontrada.");
    }
    public void removeConta(int numeroConta){
        Iterator<Conta> iterator = listaConta.iterator();
        while (iterator.hasNext()){
            Conta conta = iterator.next();
            if(conta.getNumeroConta() == numeroConta){
                iterator.remove();
                System.out.println("Conta " + numeroConta + " removida.");
                return;
            }
        }
        System.out.println("Conta não encontrada.");
    }

}
