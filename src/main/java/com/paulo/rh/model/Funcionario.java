package com.paulo.rh.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Funcionario extends DadosPessoais {

    private DadosPessoais dadosPessoais;
    private LocalDate dataUltimoReajuste;

    public LocalDate getDataUltimoReajuste() {
        return dataUltimoReajuste;
    }

    public void setDataUltimoReajuste(LocalDate dataUltimoReajuste) {
        this.dataUltimoReajuste = dataUltimoReajuste;
    }

    public DadosPessoais getDadosPessoais() {
        return dadosPessoais;
    }

    public void setDadosPessoais(DadosPessoais dadosPessoais) {
        this.dadosPessoais = dadosPessoais;
    }

    public void atualizarSalario(BigDecimal novoSalario) {
        this.getDadosPessoais().setSalario(novoSalario);
        this.dataUltimoReajuste = LocalDate.now();
    }

    public void promover(Cargo novoCargo) {
        this.getDadosPessoais().setCargo(novoCargo);
    }
}
