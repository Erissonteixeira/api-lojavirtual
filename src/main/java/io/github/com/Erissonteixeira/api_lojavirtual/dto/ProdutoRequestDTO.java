package io.github.com.Erissonteixeira.api_lojavirtual.dto;

public class ProdutoRequestDTO {
    private String nome;
    private String descricao;
    private int quantidade;
    private boolean disponivel;

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getDescricao(){
        return descricao;
    }
    public void  setDescricao(String descricao){
        this.descricao = descricao;
    }
    public int getQuantidade(){
        return quantidade;
    }
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
    public boolean isDisponivel(){
        return disponivel;
    }
    public void  setDisponivel(boolean disponivel){
        this.disponivel = disponivel;
    }
}
