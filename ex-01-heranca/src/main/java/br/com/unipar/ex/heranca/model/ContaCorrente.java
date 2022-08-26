
package br.com.unipar.ex.heranca.model;

/**
 *
 * @author andersonbosing
 */
public class ContaCorrente extends ContaBancaria {
    
    private double vlLimite;

    public double getVlLimite() {
        return vlLimite;
    }

    public void setVlLimite(double vlLimite) {
        this.vlLimite = vlLimite;
    }
    
    @Override
    public void sacar(double valorSaque) {
        
        if (valorSaque > (super.getSaldo() + vlLimite)) {
            System.out.println("Não foi possivel sacar pois o saldo será "
                    + "negativo. Valor disponivel :" + super.getSaldo());
        } else {
            super.setSaldo(super.getSaldo() - valorSaque);
            System.out.println("Valor Sacado. Novo Saldo: " + super.getSaldo());
        }
        
    }
    
}
