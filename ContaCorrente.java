public class ContaCorrente extends Conta {

    public void atualiza(double taxaselic){
        super.atualiza(taxaselic * 2) ;
        this.saldo -= 15;


    }
}
