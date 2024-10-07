import java.math.BigDecimal;

public class Funcionario {
    private int id;
    private BigDecimal salario;
    private String cargo;
    private int departamento;

    public Funcionario(int id, BigDecimal salario, String cargo, int departamento){
        this.id = id;
        this.salario = salario;
        this.cargo = cargo;
        this.departamento = departamento;
    }

    public boolean isGerente(){
        return this.cargo.equalsIgnoreCase("gerente");
    }

    public int getDepartamento(){   
        return departamento;
    }

    public String getCargo(){
        return cargo;
    }

    public void setSalario(BigDecimal salario){
        this.salario = salario;
    }

    public BigDecimal getSalario(){
        return salario;
    }

    public int getId() {
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
}