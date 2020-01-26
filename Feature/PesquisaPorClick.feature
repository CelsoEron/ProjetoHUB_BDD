Feature: Pesquisa de produto
    Pesquisa por determinado produto por clicks na página

  Background: 
    Given usuario na home page

@PesquisaClick @Valido
  Scenario: Pesquisa por click com sucesso
    When Clicar na categoria
   	Then escolher o produto

@PesquisaClick @Invalido
  Scenario: Pesquisa por click com falha
    When usuario clica no produto

