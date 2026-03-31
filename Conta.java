public class Conta {
    private int numero;
    protected double saldo;
    private static int cont = 0;
    private Cliente cliente;

    public Conta(){
        this.saldo = 0;
        Conta.cont++;
        this.numero = cont;
    }

    public  Conta(Cliente cliente){
        this.saldo = 0;
        Conta.cont++;
        this.numero = cont;
        this.cliente = cliente;

    }
    public double getSaldo(){
        return this.saldo;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }
    public int getNumero(){
        return this.numero;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Cliente getCliente(){
        return this.cliente;
    }
    boolean sacar(double valor){
        if (this.saldo>= valor){
            this.saldo -= valor;
            System.out.println("Saque feito com sucesso!");
            return true;
        }else {
            System.out.println("Saldo insuficiente.");
            return false;

        }
    }
    public boolean transferir(Conta destino, double valor){
        if (this.saldo>= valor){
            this.saldo -= valor;
            destino.depositar(valor);
            System.out.println("Transferênçia feita com sucesso!");
            return true;
        }else {
            System.out.println("Saldo insuficiente para realizar transação.");
            return false;
        }
    }
    public boolean depositar(double valor){
        if (valor > 0){
            this.saldo += valor;
            return true;
        }else {
            return false;
        }
    }
    public void atualiza(double taxaselic){
        this.saldo +=  this.saldo *  taxaselic;
    }

    public static int getQuantidadeDeContas(){
        return Conta.cont;
    }


}