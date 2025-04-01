# Ordenação de Funcionários com Interface Comparable

Este projeto em Java demonstra a leitura de um arquivo CSV contendo informações de funcionários (nome e salário), armazenando-os em uma lista e ordenando-os alfabeticamente usando a interface `Comparable`.

## Tecnologias Utilizadas
- Java
- Manipulação de Arquivos (`BufferedReader`, `FileReader`)
- Collections Framework (`ArrayList`, `Collections.sort()`)
- Interface `Comparable`

## Estrutura do Projeto

O projeto consiste em duas classes principais:

### `Program.java`
Esta classe principal realiza as seguintes operações:
1. Lê um arquivo CSV contendo nomes e salários de funcionários.
2. Armazena os dados em uma lista de objetos `Employee`.
3. Ordena a lista de funcionários em ordem alfabética pelo nome.
4. Exibe os funcionários ordenados no console.

### `Employee.java`
A classe `Employee` implementa a interface `Comparable` para definir a lógica de ordenação com base no nome do funcionário.

## Como Executar o Projeto
1. Certifique-se de que possui o Java instalado.
2. Clone este repositório ou copie os arquivos-fonte.
3. Edite a variável `path` na classe `Program` para apontar para o arquivo CSV com os dados dos funcionários.
4. Compile e execute o programa:
   ```sh
   javac application/Program.java entities/Employee.java
   java application.Program
   ```

## Exemplo de Entrada (Arquivo CSV)
```
Maria,5000.0
Carlos,4000.0
Ana,6000.0
```

## Exemplo de Saída
```
Ana, 6000.0
Carlos, 4000.0
Maria, 5000.0
```

## Autores e Reconhecimentos

- **Alan Kay**: Pioneiro da Programação Orientada a Objetos (POO).
- **Erich Gamma, Richard Helm, Ralph Johnson e John Vlissides (Gang of Four - GoF)**: Autores de *Design Patterns*, influenciaram o uso de interfaces e classes abstratas.
- **Robert C. Martin ("Uncle Bob")**: Popularizou os conceitos de *Clean Code*, que foram seguidos ao longo do desenvolvimento deste projeto.
- **Professor Nélio Alves**: Responsável pelo curso que forneceu os conhecimentos fundamentais para a implementação dos conceitos de POO e Design Patterns utilizados neste projeto.
- **Ronaldo Rodrigues**: Estudante que está se especializando em programação, aplicando os conhecimentos adquiridos no curso.

## Licença
Este projeto é de uso livre para fins educacionais.

