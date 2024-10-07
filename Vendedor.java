import java.math.BigDecimal;

public class Vendedor extends Funcionario {
    private int vendas;
    
    public Vendedor(int id, BigDecimal salario, String cargo, int departamento, int vendas){
        super(id, salario, cargo, departamento);
        this.vendas = vendas;
    }

    public int getVendas(){
        return vendas;
    }
}
