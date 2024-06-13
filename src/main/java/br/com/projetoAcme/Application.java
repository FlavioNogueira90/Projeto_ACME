package br.com.projetoAcme;

import br.com.projetoAcme.entities.Funcionario;
import br.com.projetoAcme.entities.FuncionarioTerceirizado;
import br.com.projetoAcme.entities.enums.Cargo;
import br.com.projetoAcme.entities.enums.Setor;
import br.com.projetoAcme.service.ReajusteSalarial;
import br.com.projetoAcme.service.impl.ReajusteSalarialImpl;

public class Application {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("João");
        funcionario.setSalario(2000);
        funcionario.setCargo(Cargo.JUNIOR);
        funcionario.setSetor(Setor.DESENVOLVIMENTO);

        FuncionarioTerceirizado terceirizado = new FuncionarioTerceirizado();
        terceirizado.setNome("Maria");
        terceirizado.setSalario(3000);
        terceirizado.setCargo(Cargo.PLENO);
        terceirizado.setSetor(Setor.DEVOPS);
        terceirizado.setEmpresaContratada("Empresa XYZ");
        terceirizado.setTempoPrevistoPermanencia(12);

        ReajusteSalarial reajusteSalarial = new ReajusteSalarialImpl();

        // Reajustando salário de um funcionário
        reajusteSalarial.reajustarSalario(funcionario, 10);
        System.out.println("Novo salário de " + funcionario.getNome() + ": " + funcionario.getSalario());

        // Tentando reajustar salário de um funcionário terceirizado
        try {
            reajusteSalarial.reajustarSalario(terceirizado, 10);
        } catch (UnsupportedOperationException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}