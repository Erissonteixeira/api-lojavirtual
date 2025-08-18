package io.github.com.Erissonteixeira.api_lojavirtual.service;

import io.github.com.Erissonteixeira.api_lojavirtual.dto.ProdutoRequestDTO;
import io.github.com.Erissonteixeira.api_lojavirtual.dto.ProdutoResponseDTO;
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

    public ProdutoResponseDTO createdProduct(ProdutoRequestDTO dto) {
        Produto produto = new Produto();
        produto.setNome(dto.getNome());
        produto.setDescricao(dto.getDescricao());
        produto.setQuantidade(dto.getQuantidade());
        produto.setDisponivel(dto.isDisponivel());
        Produto salvo = produtoRepository.save(produto);
        return new ProdutoResponseDTO(
                salvo.getId(),
                salvo.getNome(),
                salvo.getDescricao(),
                salvo.getQuantidade(),
                salvo.isDisponivel()
        );
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
