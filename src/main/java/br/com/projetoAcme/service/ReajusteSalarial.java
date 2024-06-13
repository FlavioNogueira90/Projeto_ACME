package br.com.projetoAcme.service;

import br.com.projetoAcme.entities.Funcionario;

public interface ReajusteSalarial {
    void reajustarSalario(Funcionario funcionario, double percentual);
}
