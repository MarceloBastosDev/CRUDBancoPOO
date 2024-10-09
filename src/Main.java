import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();

        banco.createConta("Marcelo", 1, 50.00);
        banco.createConta("Joao", 2, 10.00);

        banco.listarContas();

        banco.editConta("Marcelo Bastos", 1, 30);
        banco.listarContas();

        banco.removeConta(2);
        banco.listarContas();
    }
}