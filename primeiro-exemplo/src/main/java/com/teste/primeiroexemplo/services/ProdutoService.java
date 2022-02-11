package com.teste.primeiroexemplo.services;

import java.util.List;
import java.util.Optional;

import com.teste.primeiroexemplo.model.Produto;
import com.teste.primeiroexemplo.repository.ProdutoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {

  @Autowired
  private ProdutoRepository produtoRepository;

  /**
   * Metodo para retornar uma lista de produtos
   * 
   * @return Lista de produtos.
   */
  public List<Produto> obterTodos() {
    return produtoRepository.obterTodos();
  }

  /**
   * Metodo que retorna o produto encontrado pelo seu Id.
   * 
   * @param id do produto que será localizado.
   * @return Retorna um produto casa tenha seja encontrado.
   */
  public Optional<Produto> obterPorId(Integer id) {
    return produtoRepository.obterPorId(id);
  }

  /**
   * Metodo para adicionar produto na lista.
   * 
   * @param produto que será adicionado.
   * @return Retorna o produto que foi adicionado na lista.
   */
  public Produto adicionar(Produto produto) {
    return produtoRepository.adicionar(produto);
  }

  /**
   * Metodo para atualizar o produto na lista
   * 
   * @param produto que será atualizado.
   * @return Retorna o produto após atualizar a lista
   */
  public Produto atualizar(Integer id, Produto produto) {
    produto.setId(id);

    return produtoRepository.atualizar(produto);
  }

  /**
   * Metodo para deletar o produto por id.
   * 
   * @param id do produto a ser deletado.
   */
  public void deletar(Integer id) {
    produtoRepository.deletar(id);
  }
}