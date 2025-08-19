import org.w3c.dom.ls.LSOutput;

public class Conta {

    private String titular;
    private double saldo;
    private double chequeEspecial;
    private double limite;


    public Conta (){
    }
    public Conta (String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
        if (saldo <= 500){
            this.chequeEspecial = 50.00;
        }else{
            this.chequeEspecial = saldo * 0.5;
        }
        this.limite = saldo + chequeEspecial;
    }
    public String getTitular(){
        return titular;
    }
    public double getLimite(){
        return limite;
    }
    public double getSaldo(){
        return saldo;
    }
    private void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public double getChequeEspecial(){
        return chequeEspecial;
    }
    public void setChequeEspecial(double chequeEspecial){
        this.chequeEspecial = chequeEspecial;
    }

    public String deposito(double valor){

        this.saldo = saldo + valor;
        return mensagem(saldo);
    }

    public String saque(double valor){
        if (valor <= limite){
            this.saldo = saldo - valor;
            return mensagem(saldo);
        }
        else {
            var valorIndiponível = System.out.printf("Transação não autorizada, seu limite é de: %d", limite).toString();
            return valorIndiponível;
        }
    }

    public String pagarBoleto(double valor){
        this.saldo = saldo - valor;
        return mensagem(saldo);
    }

    public String mensagem(double valor){
        valor = valor;
        var mensagem = System.out.printf("Transação realizada com sucesso, seu saldo atual é: %s", valor).toString();
        return mensagem;
    }
    public String validaSeUsaChequeEspecial(){

        return "Não implementado ainda";
    }







}
