public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 27.0;

        if(valorSolicitado < saldo ){
            saldo = saldo - valorSolicitado;

            System.out.println("R$ " + saldo);
        }
        else{
            System.out.println("Saldo Insuficiente. Saldo Atual: R$ " + saldo + ". Valor Solicitado: R$ "  + valorSolicitado);
        }
    }
}
