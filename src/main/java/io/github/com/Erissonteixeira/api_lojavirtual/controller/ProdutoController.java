package io.github.com.Erissonteixeira.api_lojavirtual.controller;

import io.github.com.Erissonteixeira.api_lojavirtual.model.Produto;
import io.github.com.Erissonteixeira.api_lojavirtual.service.ProdutoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
    private final ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }
    @GetMapping
    public ResponseEntity<List<Produto>> list(){
        List<Produto> produtos = produtoService.list();
    return ResponseEntity.ok(produtos);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Produto> getById(@PathVariable Long id){
        return produtoService.getById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
    @PostMapping
    public ResponseEntity<Produto> create(@RequestBody Produto produto){
        Produto novoProduto = produtoService.created(produto);
        return ResponseEntity.ok(novoProduto);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        boolean deletado = produtoService.delete(id); // Retorna true/false
        if (deletado){
            return ResponseEntity.noContent().build(); // 204 No Content
        } else {
            return ResponseEntity.notFound().build(); // 404 caso não exista
        }
    }
        }
