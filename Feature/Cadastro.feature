Feature: Cadastro

  Background: 
    Given usuario na home page
    When usuario navega ate a pagina de cadastro

@Cadastro @Valido
  Scenario: Cadastro válido
    When usuario insere os dados da conta
    When usuario insere os dados pessoais
    When usuario insere os dados de endereco
    Then usuario conclui o cadastro

@Cadastro @Invalido
  Scenario: Cadastro inválido
    When usuario insere os dados pessoais invalidos
    When usuario insere os dados pessoais
    When usuario insere os dados de endereco
    Then usuario conclui o cadastro
