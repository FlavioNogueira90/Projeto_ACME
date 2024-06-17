package br.com.projetoAcme.observer;

import br.com.projetoAcme.entities.Funcionario;

public interface FuncionarioObserver {
    void atualizar(Funcionario funcionario);
}
