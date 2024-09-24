# Sistema de Gerenciamento de Contas Bancárias

Este projeto é um sistema simples de gerenciamento de contas bancárias, desenvolvido em Java, com o intuito de demonstrar os princípios da programação orientada a objetos (POO). O sistema permite que clientes criem contas, realizem operações como depósitos, saques e transferências, além de autenticar usuários com um sistema de senha.

## Funcionalidades

- **Cadastro de Clientes**: Os clientes podem ser criados com nome e senha.
- **Autenticação de Clientes**: Um sistema de autenticação que permite acesso às contas com base na senha.
- **Gerenciamento de Contas**: Clientes podem criar contas correntes e contas poupança.
- **Operações Bancárias**: Os clientes podem realizar operações de depósito, saque e transferência entre contas.
- **Exibição de Extrato**: Possibilidade de visualizar extratos das contas.

## Estrutura do Projeto

### Classes Principais

- `Banco`: Representa a instituição bancária, contendo informações sobre o nome do banco e as contas gerenciadas.
  
- `Cliente`: Representa um cliente do banco, contendo informações como nome e senha. Implementa um método de autenticação.

- `Conta`: Classe abstrata que define as operações comuns para as contas (como depósito, saque e transferência) e contém atributos comuns (agência, número da conta, saldo e cliente).

- `ContaCorrente`: Extensão da classe `Conta`, representando contas correntes. Inclui a implementação do método `imprimirExtrato`.

- `ContaPoupanca`: Extensão da classe `Conta`, representando contas poupança. Também inclui a implementação do método `imprimirExtrato`.

- `Main`: Classe que contém o método `main`, onde a execução do programa começa. Responsável pela interação com o usuário, autenticação e operações de conta.

## Implementação do Sistema de Autenticação

Uma das principais melhorias implementadas neste projeto foi a adição de um sistema de autenticação para os clientes. As alterações realizadas incluem:

- **Adição de Senha**: A classe `Cliente` foi atualizada para incluir um atributo de senha, permitindo que cada cliente tenha sua própria senha.

- **Método de Autenticação**: Foi implementado um método `autenticar(String senha)` na classe `Cliente`, que verifica se a senha fornecida corresponde à senha armazenada.

- **Fluxo de Autenticação**: Na classe `Main`, um fluxo de autenticação foi adicionado, solicitando a senha ao usuário antes de permitir operações nas contas.

## Objetivo do Projeto

O objetivo deste projeto é demonstrar os conceitos de programação orientada a objetos, como encapsulamento, herança e polimorfismo, em um contexto prático e aplicável ao mundo real.

### Observações

- Essa versão do `README.md` destaca o objetivo educacional do projeto, que é mostrar a programação orientada a objetos, além de apresentar o sistema de gerenciamento de contas bancárias.
