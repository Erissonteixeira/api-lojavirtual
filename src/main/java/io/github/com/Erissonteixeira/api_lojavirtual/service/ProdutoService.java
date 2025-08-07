package io.github.com.Erissonteixeira.api_lojavirtual.service;

import io.github.com.Erissonteixeira.api_lojavirtual.model.Produto;
import io.github.com.Erissonteixeira.api_lojavirtual.repository.ProdutoRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {
    private final ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public Produto created(Produto produto) {
        return produtoRepository.save(produto);
    }

    public List<Produto> list() {
        return produtoRepository.findAll();
    }
    public Optional<Produto> getById(Long id) {
        return produtoRepository.findById(id);
    }

    public Produto update(Produto produto) {
        Optional<Produto> existente = produtoRepository.findById(produto.getId());
        if (existente.isPresent()) {
            return produtoRepository.save(produto);
        } else {
            throw new RuntimeException("Produto com ID " + produto.getId() + " não encontrado.");
        }

    }

    public boolean delete(Long id) {
        if (produtoRepository.existsById(id)) {
            produtoRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
