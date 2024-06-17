package br.com.projetoAcme.observer.rhObserver;

import br.com.projetoAcme.entities.Funcionario;
import br.com.projetoAcme.observer.FuncionarioObserver;

public class RhObserver implements FuncionarioObserver {

    @Override
    public void atualizar(Funcionario funcionario) {
        System.out.println("RH notificado sobre a atualização do funcionário " + funcionario.getNome());
    }
}
