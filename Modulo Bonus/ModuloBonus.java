import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ModuloBonus {
    public static void main(String[] args) {

        Funcionario func1 = new Funcionario(2, new BigDecimal(140000), "vendedor", 1);
        Funcionario func2 = new Funcionario(1, new BigDecimal(160000), "gerente", 1);
        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(func1);
        funcionarios.add(func2);
        
        List<Departamento> departamentos = new ArrayList<>();
        departamentos.add(new Departamento(1, 50000));
        departamentos.add(new Departamento(2, 20000));

        Controle.aplicarBonus(funcionarios, departamentos);
        
        System.out.println("Salário de func1 com bonus: " + func1.getSalario());
        System.out.println("Salário de func2 com bonus: " + func2.getSalario());
        
    }
}
