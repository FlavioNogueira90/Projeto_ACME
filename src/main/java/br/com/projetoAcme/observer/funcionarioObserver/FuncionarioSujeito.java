package br.com.projetoAcme.observer.funcionarioObserver;

import br.com.projetoAcme.entities.Funcionario;
import br.com.projetoAcme.observer.FuncionarioObserver;

import java.util.ArrayList;
import java.util.List;

public class FuncionarioSujeito {
    private List<FuncionarioObserver> observers = new ArrayList<>();

    public void adicionarObserver(FuncionarioObserver observer){
        observers.add(observer);
    }

    public void removerObserver(FuncionarioObserver observer){
        observers.remove(observer);
    }

    public void notificarObservers(Funcionario funcionario){
        for(FuncionarioObserver observer : observers){
            observer.atualizar(funcionario);
        }
    }
}
