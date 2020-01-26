Feature: Pesquisa por texto

  Background: 
    Given usuario na home page

@PesquisaTexto @Valido
  Scenario: Pesquisa com sucesso
    When usuario pesquisa produto valido
    When usuario escolhe produto

@PesquisaTexto @Invalido
  Scenario: Pesquisa com falha
    When usuario pesquisa produto invalido
    Then verifica pesquisa
