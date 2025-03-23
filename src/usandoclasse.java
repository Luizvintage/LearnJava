public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(1000);

        conta.depositarr(500);
        System.out.println("Saldo atual: " + conta.getSaldo());
    }
}