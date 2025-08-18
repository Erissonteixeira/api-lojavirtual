package io.github.com.Erissonteixeira.api_lojavirtual.exception;

public class ProdutoNotFoundException extends RuntimeException{
    public ProdutoNotFoundException(Long id){
        super("Produto com ID " + id + " não encontrado.");
    }
}
