package com.paulo.rh.service;

import com.paulo.rh.exception.ValidacaoException;
import com.paulo.rh.model.Cargo;
import com.paulo.rh.model.Funcionario;

public class PromocaoService {

    public void promover(Funcionario funcionario, boolean metaBatida) {
        Cargo cargo = funcionario.getCargo();
        if (Cargo.GERENTE == cargo) {
            throw new ValidacaoException("Gerentes não podem ser promovidos!");
        }

        if (metaBatida) {
            Cargo novoCargo = cargo.getProximoCargo();
            funcionario.promover(novoCargo);
        } else {
            throw new ValidacaoException("Funcionário não bateu a meta!");
        }
    }
}
