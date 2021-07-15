package com.everis.produtos.services;

import com.everis.produtos.model.Produto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProdutoService {

    public List<Produto> findAll() {
        ArrayList<Produto> produtos = new ArrayList<>();
        return produtos;
    }
}
