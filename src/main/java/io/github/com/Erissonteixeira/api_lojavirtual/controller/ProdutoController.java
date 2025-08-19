package io.github.com.Erissonteixeira.api_lojavirtual.controller;

import io.github.com.Erissonteixeira.api_lojavirtual.dto.ProdutoRequestDTO;
import io.github.com.Erissonteixeira.api_lojavirtual.dto.ProdutoResponseDTO;
import io.github.com.Erissonteixeira.api_lojavirtual.service.ProdutoService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v2/produtos")
public class ProdutoController {
    private final ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }
    @PostMapping
    public ResponseEntity<ProdutoResponseDTO> create(@RequestBody ProdutoRequestDTO dto){
        ProdutoResponseDTO produto = produtoService.createdProduct(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(produto);
    }
    @GetMapping
    public ResponseEntity<Page<ProdutoResponseDTO>> list(Pageable pageable){
        Page<ProdutoResponseDTO> produtos = produtoService.lisProducts(pageable);
        return ResponseEntity.ok(produtos);
    }
    @PutMapping("/{id}")
    public ResponseEntity<ProdutoResponseDTO> update(@PathVariable Long id, @RequestBody ProdutoRequestDTO dto){
        ProdutoResponseDTO atualizado = produtoService.updateProduct(id, dto);
        return ResponseEntity.ok(atualizado);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        produtoService.deleteProduct(id);
        return ResponseEntity.noContent().build();
    }

}
