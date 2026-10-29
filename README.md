# Exercícios e pequenos sistemas em Java

Coleção de programas independentes de console para praticar lógica, entrada de dados, coleções, validações e orientação a objetos. O repositório reúne exercícios básicos e exemplos de controle de gastos, vendas, estoque, notas e produtos.

## Programas disponíveis

| Classe ou pacote | O que pratica |
| --- | --- |
| `controleDeGastos.Main` | Menu para registrar receitas, despesas e categorias e exibir um resumo |
| `exerciciosgpt.AnalisadorDeNumeros` | Pares, ímpares, maior, menor e soma de dez inteiros |
| `exerciciosgpt.AnalisadorDeVendas` | Total, média, maior venda e contagem de vendas acima de 100 |
| `exerciciosgpt.ControleDeEstoque` | Total de itens e identificação de estoques baixos |
| `exerciciosgpt.ControleFinanceiro` | Total, média, maior gasto e gastos acima de 100 |
| `exerciciosgpt.SistemaDeCadastroProdutos` | Cadastro de quatro produtos, validação de nome e preço e estatísticas |
| `exerciciosgpt.SistemaDeNotasAlunos` | Cadastro de cinco alunos, notas e resumo da turma |
| `exerciciosgpt.Ex1`, `Ex2`, `Ex3`, `ex4`, `Ex5` e `Main` | Condicionais, repetição, tabuada, somas e comparação de números |
| `Desafios` | Tipos, conversão, formatação e cálculos com valores fixos |

O nome do pacote `exerciciosgpt` faz parte da organização atual do código.

## Requisitos

Use **JDK 21 ou superior** para compilar o conjunto: alguns exercícios utilizam `ArrayList.getFirst()`. Não há gerenciador de dependências; os programas usam a biblioteca padrão Java.

## Como executar

Na raiz do repositório:

```sh
git clone https://github.com/JoaoAlencar00/desafiosJava.git
cd desafiosJava
mkdir build
javac -encoding UTF-8 -d build src/controleDeGastos/Main.java src/exerciciosgpt/*.java Desafios_Java/Desafios.java
java -cp build controleDeGastos.Main
```

O menu do controle de gastos permite registrar receitas, registrar despesas, consultar um resumo e sair. As despesas são agrupadas pela categoria informada.

Outros exemplos, executados individualmente após a compilação:

```sh
java -cp build exerciciosgpt.AnalisadorDeVendas
java -cp build exerciciosgpt.SistemaDeCadastroProdutos
java -cp build exerciciosgpt.SistemaDeNotasAlunos
java -cp build Desafios
```

O separador decimal aceito nas leituras depende da configuração regional usada pelo `Scanner`.

## Estrutura

- `src/controleDeGastos/`: programa com menu de receitas e despesas.
- `src/exerciciosgpt/`: exercícios de lógica e pequenos sistemas.
- `Desafios_Java/`: exercício de tipos e cálculos.

## Escopo e pontos de evolução

Os programas funcionam de forma independente e armazenam os dados em memória, sem API HTTP ou banco de dados. Há validações em alguns fluxos, mas várias leituras numéricas ainda não tratam texto inválido.

O controle de gastos apresenta um resumo da sessão; não armazena datas ou períodos mensais. O cadastro de produtos calcula os índices do item mais caro e do mais barato, mas a mensagem final imprime referências de objetos porque `Produto` ainda não sobrescreve `toString()`.

Não há testes automatizados no repositório.
