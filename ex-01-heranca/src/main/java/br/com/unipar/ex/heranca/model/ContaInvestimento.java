package br.com.unipar.ex.heranca.model;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author andersonbosing
 */
public class ContaInvestimento extends ContaBancaria {
    
    private int diaRendimento;

    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }
    
    
    public void calcularNovoSaldo(double pcInvestimento) {
        
        Date date = new Date();// Pega o dia de hoje
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int dia = calendar.get(Calendar.DAY_OF_MONTH);
        
        if (dia == diaRendimento) {
            
            super.setSaldo(
                    super.getSaldo() + (super.getSaldo() * (pcInvestimento/100))
            );
            System.out.println("Rendimento Calculado. Novo saldo : "+ super.getSaldo());
        } else {
            System.out.println("Saldo mantido pois não é o dia do rendimento");
        }

        
    }
    
    
}
