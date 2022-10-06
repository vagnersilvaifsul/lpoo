package controller;

import model.Funcionario;

import java.util.*;
import java.util.stream.Collectors;

public class ProgramacaoFuncional_com_Collectors {
    public static void main(String[] args) {
        //Cria uma Collection do tipo List de Funcionarios
        List<Funcionario> values= getFuncionarioCollection();

        //Collectors.toList()
        //Acumula os nomes dos Funcionários em um Collection do tipo List
        System.out.print("\nExemplo de aplicação da operação Collectors.toList(): ");
        List<String> list = values.stream()
            .map(Funcionario::getNome)
            .collect(Collectors.toList());
        System.out.println(list);

        //Collectors.toCollection()
        //Acumula os nomes em uma TreeSet (Set onde os elementos são ordenados usando sua ordenação natural)
        System.out.print("\nExemplo de aplicação da operação Collectors.toCollection(): ");
        Set<String> set = values.stream()
            .map(Funcionario::getNome)
            .collect(Collectors.toCollection(TreeSet::new));
        System.out.println(set);

        //Collectors.joining
        //Converte os elementos em strings e as concatena, separados por vírgula (bom para gerar arquivos para as planilhas eletrônicas abrirem)
        System.out.print("\nExemplo de aplicação da operação Collectors.joining(): ");
        String joined = values.stream()
            .map(funcionario -> Double.toString(funcionario.getSalario()))
            .collect(Collectors.joining(", "));
        System.out.println(joined);

        //Collectors.summingDouble
        //Calcula o total da folha de pagamento (total dos salários de cada funcionario)
        System.out.print("\nExemplo de aplicação da operação Collectors.summingDouble(): ");
        double total = values.stream()
            .collect(Collectors.summingDouble(Funcionario::getSalario));
        System.out.printf("Total da folha de pagamento: %,.2f", total);

        //Collectors.groupingBy
        //Agrupa os funcionários por departamento
        System.out.print("\n\nExemplo de aplicação da operação Collectors.groupingBy(): ");
        Map<String, List<Funcionario>> groupedPorDepartmento =
            values.stream()
                .collect(Collectors.groupingBy(Funcionario::getDepartamento));
        groupedPorDepartmento.forEach((departamento, funcionariosPorDepartamento) -> {
            System.out.print("\nDEPARTAMENTO: " + departamento);
            funcionariosPorDepartamento.forEach(  f -> System.out.printf("%s", f));
        });

        System.out.println();
    }

    private static List<Funcionario> getFuncionarioCollection() {
        List<Funcionario> funcionariosList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            if(i % 2 == 0){
                funcionariosList.add(new Funcionario(i+1, "a" + (i+1), (i+1) * 1000, "Desenvolvimento"));
            } else {
                funcionariosList.add(new Funcionario(i+1, "a" + (i+1), (i+1) * 1000, "Administrativo"));
            }
        }
        System.out.println("\nList Criada (Dados Originais)");
        System.out.println(funcionariosList);
        return funcionariosList;
    }
}
