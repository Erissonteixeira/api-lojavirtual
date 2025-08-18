package io.github.com.Erissonteixeira.api_lojavirtual.dto;

public class ProdutoResponseDTO {
    private Long id;
    private String nome;
    private String descricao;
    private int quantidade;
    private boolean disponivel;
    public ProdutoResponseDTO(Long id, String nome, String descricao, int quantidade, boolean disponivel){
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.disponivel = disponivel;
    }
    public Long getId(){
        return id;
    }
    public String getNome(){
        return nome;
    }
    public String getDescricao(){
        return descricao;
    }
    public int getQuantidade(){
        return quantidade;
    }
    public boolean isDisponivel(){
        return disponivel;
    }
}
