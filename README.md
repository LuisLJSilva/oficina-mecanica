# Sistema de Agendamento de Serviços para Oficinas Mecânicas

## Descrição

Este projeto é um sistema de agendamento de serviços para oficinas mecânicas. Ele permite aos usuários agendar diferentes tipos de serviços para seus veículos e gerencia informações sobre ordens de serviço, clientes e diferentes tipos de serviços disponíveis (Manutenção, Pintura, Alinhamento).

## Entidades e Campos

### OrdemServico

- **urgente** (_boolean_): Indica se o agendamento é urgente ou não.
- **dataAgendamento** (_LocalDateTime_): Data e hora da ordem de serviço.
- **status** (_String_): Status da ordem de serviço (Em andamento, Concluído, Agendado).

### Cliente

- **nome** (_String_): Nome do cliente.
- **cpf** (_String_): CPF do cliente.
- **email** (_String_): E-mail para contato com o cliente.

### Servico

- **tipoServico** (_String_): Descrição do tipo de serviço (Manutenção, Pintura, Alinhamento).
- **preco** (_float_): Preço do serviço.
- **codigoServico** (_int_): Código para identificação do serviço.

#### Manutencao (subtipo de Servico)

- **necessitaPeca** (_boolean_): Indica se o veículo necessita de peças adicionais.
- **tempoTrabalho** (_float_): Tempo estimado de trabalho, em horas, para concluir a manutenção.
- **tipoManutencao** (_String_): Tipo de manutenção a ser realizada (Preventiva, Corretiva, Estética).

#### Pintura (subtipo de Servico)

- **intensidadeBrilho** (_float_): Índice de brilho da pintura após a aplicação, em uma escala de 0 a 100.
- **tintaEcologica** (_boolean_): Indica se a tinta usada é ecológica.
- **cor** (_String_): Cor da pintura que será aplicada (Azul, Vermelho, Preto).

#### Alinhamento (subtipo de Servico)

- **ajusteCambagem** (_float_): Ajuste de cambagem em graus.
- **freiosVerificados** (_boolean_): Indica se os freios foram verificados durante o alinhamento.
- **condicaoPneus** (_String_): Condição dos pneus (Novo, Usado, Desgastado).

---

## Dependências do Projeto

Este projeto utiliza várias dependências, incluindo:

- **Spring Boot Data JPA**: Para a camada de persistência.
- **Hibernate EntityManager e Core**: ORM para manipulação do banco de dados.
- **MySQL Connector**: Driver JDBC para MySQL.
- **Taglibs Standard**: Para usar JSTL em páginas JSP.
- **JSTL**: Biblioteca de tags para JSP.
- **Tomcat Jasper**: Para renderização de páginas JSP.
- **Spring Boot Starter Web**: Para a criação de uma aplicação web com Spring Boot.
- **Spring Boot DevTools**: Ferramentas para desenvolvimento.
- **Spring Boot Starter Test**: Para testes unitários e de integração.
