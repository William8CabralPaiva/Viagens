package com.example.viagens.dao;

import com.example.viagens.model.Pacote;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class PacoteDAO {

    public List<Pacote> lista() {
        List<Pacote> pacotes = new ArrayList<>(Arrays.asList(
                new Pacote("São Paulo", "sao_paulo_sp", 2, new BigDecimal(100.99)),
                new Pacote("Belo Horizonte", "belo_horizonte_mg", 3, new BigDecimal(500.50)),
                new Pacote("Recife", "recife_pe", 4, new BigDecimal(120.20)),
                new Pacote("Rio de Janeiro", "rio_de_janeiro_rj", 6, new BigDecimal(50.55)),
                new Pacote("Salvador", "salvador_ba", 5, new BigDecimal(250.99)),
                new Pacote("Foz do Iguaçu", "foz_do_iguacu_pr", 1, new BigDecimal(300.90))));
        return pacotes;
    }

}