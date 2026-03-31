public class AtualizadorDeContas {
    private static double saldoTotal = 0;
    private double selic;

    public AtualizadorDeContas(double selic) {
        this.selic = selic;
    }
    public void roda(Conta c){
        double saldoAnterior = c.saldo;
        System.out.printf("Saldo anterior: R$%.2f\n",saldoAnterior);
        c.atualiza(this.selic);
        double saldoAtualizado = c.saldo;
        System.out.printf("Saldo atualizado: R$%.2f\n", saldoAtualizado);
        this.saldoTotal += saldoAtualizado;
    }
    public double getSaldoTotal(){
        return this.saldoTotal;
    }
}
