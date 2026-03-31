public class Main {
    public static void main(String[] args) {
        //Criando a conta para testar o metodo Selic
        System.out.println("TESTE DA FUNÇAO SELIC:");
        Conta c = new Conta();
        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca cp = new ContaPoupanca();
        c.depositar(1000);
        cc.depositar(1000);
        cp.depositar(1000);
        c.atualiza(0.01);
        cc.atualiza(0.01);
        cp.atualiza(0.01);
        System.out.println(c.getSaldo());
        System.out.println(cc.getSaldo());
        System.out.printf("%.2f\n", cp.getSaldo());

        //Utilizando o atualizacontas
        System.out.println("TESTE DO ATUALIZADOR DE CONTAS:");
        AtualizadorDeContas a = new AtualizadorDeContas(0.08);
        Conta c2 = new Conta();
        Conta cc2 = new Conta();
        Conta cp2 = new Conta();
        c2.depositar(1000);
        cc2.depositar(1000);
        cp2.depositar(1000);
        a.roda(c2);
        a.roda(cc2);
        a.roda(cp2);
        System.out.printf("%.2f\n", a.getSaldoTotal());

        //Inserir contas na classe banco
        System.out.println("TESTE DA CLASSE BANCO:");
        Banco banco = new Banco();

        Conta c3 = new Conta();
        Conta cc3 = new Conta();
        Conta cp3 = new Conta();
        c3.depositar(1000);
        cc3.depositar(1000);
        cp3.depositar(1000);
        banco.adiciona(c3);
        banco.adiciona(cc3);
        banco.adiciona(cp3);

        for (int i = 0; i < banco.getTotalDeContas(); i++) {
            Conta lista = banco.pega(i);
            //System.out.println("numero da conta: " + lista.getNumero());
            a.roda(lista);
        }

    }
}