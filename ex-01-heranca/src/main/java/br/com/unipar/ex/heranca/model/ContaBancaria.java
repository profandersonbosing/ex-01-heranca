package br.com.unipar.ex.heranca.model;

/**
 *
 * @author andersonbosing
 */
public class ContaBancaria {
    
    private String nomeCliente;
    private Integer numeroConta;
    private double saldo;

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public Integer getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(Integer numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void sacar(double valorSaque){
        
        if (valorSaque > saldo) {
            System.out.println("Não foi possivel sacar pois o saldo será "
                    + "negativo. Valor disponivel :" + saldo);
        } else {
            saldo = saldo - valorSaque;
        }
        
    }
    
    
    public void depositar(){
      
    }
    
}
