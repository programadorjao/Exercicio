public class ContaPoupanca extends Conta{

    public void atualiza(double taxaselic){
        super.atualiza(taxaselic * 0.75);
    }

}
