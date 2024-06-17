package br.com.projetoAcme.observer.financeiroObserver;

import br.com.projetoAcme.entities.Funcionario;
import br.com.projetoAcme.observer.FuncionarioObserver;

public class FinanceiroObserver implements FuncionarioObserver {
    @Override
    public void atualizar(Funcionario funcionario) {
        System.out.println("Financeiro noficado sobre a atualização do funcionário " + funcionario.getNome());
    }
}
