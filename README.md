# Quarkus--serverless-knative-exemplo
Projeto exemplo para estudo do Kafka com Knative, ferramenta para gerenciamento de aplicações serverless no Kubernetes.


## Tecnologias

- Java 17
- Quarkus 2.16.6.Final
- Gradle 7.5.1
- MySQL


## Projeto Java
Para a utilização do Java como Serverless, foi utilizado a dependencia Funqy para o desenvolvimento das funções, onde automaticamente é criado
rotas HTTP para cada função, podendo ser personalizadas para sua execução

Para o teste, foi utilizado o banco de dados de um projeto pessoal chamado [Quarkus-projeto-CRUD](https://github.com/lucas-silvs/Quarkus-projeto-CRUD), onde foi desenvolvido nesse projeto serverless para exemplo, função para busca de usuário e atualização de telefone.

### Teste local
Para testar a aplicação local, será necessário ter iniciado o banco de dados utilizado na aplicação seguindo os passos desse [README.md](https://github.com/lucas-silvs/Quarkus-projeto-CRUD/blob/main/README.md#iniciar-banco-de-dados-mysql) do projeto  Quarkus-projeto-CRUD citado anteriormente, e com isso, executar o projeto localmente com o comando abaixo na raiz do projeto java:

```shell
./gradlew --console=plain quarkusDev
```

Com o projeto iniciado, deve somente executar o comando curl abaixo para buscar o usuario cadastrado pelo terminal, ou importa-lo para o Postman:

```shell
curl --location 'http://localhost:5000/usuario?cpf=23634689889'
```

É também possivel atualizar o número de telefone do usuário:

```shell
curl --location 'http://localhost:5000/usuario/telefone' \
--header 'Content-Type: application/json' \
--data '{
    "cpf": "23634689889",
    "telefone": "11943692079"
}'

```

## Referências
- [Quarkus Documentation - Funqy](https://quarkus.io/guides/funqy)
- [Quarkus Documentation - Hibernate Reactive Panache](https://quarkus.io/guides/hibernate-reactive-panache)
- [Red Hat - Build your first Java serverless function using a Quarkus quick start](https://developers.redhat.com/articles/2022/03/28/build-your-first-java-serverless-function-using-quarkus-quick-start#)



