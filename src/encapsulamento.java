public class encapsulamento {
    private double saldo;

    // Construtor
    public void ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    // Getter para vizualizar saldo
    public double getSaldo() {
        return saldo;
    }

    // Método para depositar dinheiro
    public void depositar(double valor){
        saldo += valor;
    }
}
