import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Controle {
    public static double encontraMaiorVenda(List<Departamento> departamentos) {
        double maiorVenda = 0;
        for (Departamento departamento : departamentos) {
            if (departamento.getTotalVendas() > maiorVenda) {
                maiorVenda = departamento.getTotalVendas();
            }
        }
        return maiorVenda;
    }

    public static List<Integer> departamentosComMaiorVenda(List<Departamento> departamentos, double maiorVenda) {
        List<Integer> idsDepartamentos = new ArrayList<>();
        for (Departamento departamento : departamentos) {
            if (departamento.getTotalVendas() == maiorVenda) {
                idsDepartamentos.add(departamento.getId());
            }
        }
        return idsDepartamentos;
    }

    
    public static void aplicarBonus(List<Funcionario> funcionarios, List<Departamento> departamentos) {
        try{
        if (funcionarios.isEmpty() || departamentos.isEmpty()) {
            throw new Exception("Funcionários ou departamentos não podem ser vazios.");
        }
    }catch(Exception e){
        System.out.println("Codigo 1: " + e.getMessage());
    }


        double maiorVenda = encontraMaiorVenda(departamentos);
        List<Integer> departamentosComMaiorVenda = departamentosComMaiorVenda(departamentos, maiorVenda);

        boolean temFuncionarioElegivel = false;

        for (Funcionario funcionario : funcionarios) {
            if (departamentosComMaiorVenda.contains(funcionario.getDepartamento())) {
                temFuncionarioElegivel = true;
                break;
            }
        }

        if (!temFuncionarioElegivel) {
            System.out.println("Código 2: Nenhum funcionário elegivel nos departamentos");
            return;
        }

        for (Funcionario funcionario : funcionarios) {
            if (departamentosComMaiorVenda.contains(funcionario.getDepartamento())) {
                if (funcionario.getSalario().compareTo(new BigDecimal(150000)) < 0 && !funcionario.isGerente()) {
                    funcionario.setSalario(funcionario.getSalario().add(new BigDecimal(2000)));
                } else {
                    funcionario.setSalario(funcionario.getSalario().add(new BigDecimal(1000)));
                }
            }
        }
    }
}