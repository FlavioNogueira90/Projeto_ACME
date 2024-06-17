package br.com.projetoAcme.entities;

import br.com.projetoAcme.entities.enums.Cargo;
import br.com.projetoAcme.entities.enums.Setor;
import lombok.Data;

import java.util.List;

@Data
public class Funcionario {
    private String nome;
    private List<String> telefones;
    private String endereco;
    private double salario;
    private Setor setor;
    private Cargo cargo;
}
