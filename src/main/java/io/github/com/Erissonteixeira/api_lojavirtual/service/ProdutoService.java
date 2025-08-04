package io.github.com.Erissonteixeira.api_lojavirtual.service;

import io.github.com.Erissonteixeira.api_lojavirtual.repository.ProdutoRepository;
import org.springframework.stereotype.Service;
@Service
public class ProdutoService {
    private final ProdutoRepository produtoRepository;
    public ProdutoService(ProdutoRepository produtoRepository){
        this.produtoRepository = produtoRepository;
    }
}
