# Projeto de Gerenciamento de Locação de Veículos

Este projeto consiste em um software de gerenciamento de locação de veículos desenvolvido em Java, seguindo os princípios da Orientação a Objetos. A aplicação permite cadastrar clientes, carros, realizar locações e calcular os valores de aluguel de acordo com as regras especificadas.

## Funcionalidades

- Cadastrar clientes com informações como nome, CPF e telefone.
- Cadastrar carros com informações como modelo, marca e valor por Km.
- Iniciar uma locação, associando um cliente a um carro e registrando a quantidade de dias e o Km inicial.
- Fechar uma locação, registrando o Km final e calculando o valor total do aluguel.
- Exibir um resumo detalhado de uma locação, incluindo informações do cliente, carro e aluguel.

## Implementação

O projeto é composto pelas seguintes classes:

- `Carro`: Representa um carro, com atributos como id, modelo, marca e valorPorKm. Possui métodos para cadastrar um carro e mostrar seus dados.

- `Cliente`: Representa um cliente, com atributos como id, nome, CPF e telefone. Possui métodos para cadastrar um cliente e mostrar seus dados.

- `Aluguel`: Representa uma locação, com atributos como id, carro, cliente, qtdDias, kmInicial, kmFinal e valorTotalAluguel. Possui métodos para iniciar e fechar uma locação, além de exibir um resumo detalhado.

- `Main`: Classe para execução do programa. Instancia objetos e executa os métodos para testar as funcionalidades.

## Uso

1. Clone ou baixe o repositório para o seu ambiente local.
2. Abra o projeto em uma IDE (por exemplo, NetBeans).
3. Execute a classe `Main` para testar as funcionalidades.

## Demonstração

Aqui está um exemplo de como usar o programa para realizar uma locação:

1. Execute a classe `Main` no ambiente de desenvolvimento (por exemplo, NetBeans).
2. No menu inicial, escolha a opção "Cadastrar Cliente" e siga as instruções para inserir os detalhes do cliente:
   - Nome: João da Silva
   - CPF: 123.456.789-01
   - Telefone: (11) 98765-4321

3. Em seguida, escolha a opção "Cadastrar Carro" e insira as informações do carro:
   - Modelo: Gol
   - Marca: Volkswagen
   - Valor por Km: 0.50

4. Agora, selecione a opção "Iniciar Locação" e associe o cliente "João da Silva" ao carro "Gol". Insira os detalhes da locação:
   - Quantidade de dias: 3
   - Km Inicial: 200

5. Depois, escolha "Fechar Locação" e insira o Km final da locação:
   - Km Final: 450

6. A aplicação calculará o valor total do aluguel de acordo com as regras:
   - Valor por Km: R$0.50
   - Quantidade de dias: 3
   - Km Percorridos: 250 (450 - 200)
   - Valor Total: R$125.00 (0.50 * 250)

7. Um resumo detalhado será exibido com todas as informações da locação:
   - Cliente: João da Silva (CPF: 123.456.789-01, Telefone: (11) 98765-4321)
   - Carro: Gol (Volkswagen)
   - Locação: Quantidade de dias: 3, Km Inicial: 200, Km Final: 450, Valor Total: R$125.00

8. O programa encerrará a execução.

Lembre-se de adaptar os valores e detalhes de acordo com os dados do seu programa e também incluir outros cenários de teste para cobrir todas as funcionalidades.

## Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para abrir um pull request com melhorias, correções de bugs ou novas funcionalidades.