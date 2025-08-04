package io.github.com.Erissonteixeira.api_lojavirtual.repository;

import io.github.com.Erissonteixeira.api_lojavirtual.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
