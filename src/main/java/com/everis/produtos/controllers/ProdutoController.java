package com.everis.produtos.controllers;

import com.everis.produtos.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ProdutoController {
    @Autowired
    private ProdutoService service;
}
