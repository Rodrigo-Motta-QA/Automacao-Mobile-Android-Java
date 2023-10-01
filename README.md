# Automação-Mobile-Android-Java
Esse é um repositório que contém alguns testes Mobile na plataforma Android, conhecimento adquirido em curso de testes de software criado por Júlio de Lima, os testes foram criados para exercitar os conhecimentos de inserção de produtos em uma aplicação móvel, software criado para treinos para automação, chamado de Lojinha, criado por Júlio de Lima. Os sub-tópicos abaixo descrevem algumas decisões tomadas na estruturação do projeto.

## Tecnologias Utilizadas

- Java (https://www.java.com/pt-BR/)
- Maven (https://maven.apache.org/)
- JUnit(https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-api/5.9.2)
- Appiun(https://mvnrepository.com/artifact/io.appium/java-client)
- Selenium(https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java)


## Testes Automatizados
Testes para validar as partições de equivalência relacionados ao valor do produto na aplicação cadastro de produtos na aplicação mobile, que estão vinculados diretamente a regra de negócio que diz, ''O valor do produto de estar entre R$ 0,01 e R$ 7.000,00.

## Notas Gerais

- Foi utilizado a anotação Before Each para capturar as informações que serão utilizadas posteriormente nos métodos de teste.
- Foram armazenados os dados em classes POJO.
- Nesse projeto fazemos utilização do JUnit5, o que nos dá a possibilidade de usar a anotação DysplayName para dar descrições em português para os testes.
- No final captura e exibe a mensagem apresentada. 