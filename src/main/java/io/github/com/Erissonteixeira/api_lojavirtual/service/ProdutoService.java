package io.github.com.Erissonteixeira.api_lojavirtual.service;

import io.github.com.Erissonteixeira.api_lojavirtual.model.Produto;
import io.github.com.Erissonteixeira.api_lojavirtual.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {
    private final ProdutoRepository produtoRepository;
    public ProdutoService(ProdutoRepository produtoRepository){
        this.produtoRepository = produtoRepository;
    }
    public Produto created(Produto produto){
        return produtoRepository.save(produto);
    }
    public List<Produto> list(){
        return produtoRepository.findAll();
    }
    public Produto update(Produto produto){
        return produtoRepository.save(produto);
    }
    public boolean delete(Long id){
        if (produtoRepository.existsById(id)){
            produtoRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
