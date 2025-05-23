**JDBC**
- Faz parte do JavaSE, é a forma nativa/pura de integrar aplicações java com bancos de dados relacionais.


**JPA**
- Significa Java Persistence API
- Define um conjunto de regras, convenções e interfaces que provedores de implementação devem seguir.

**Hibernate**
- Implementa a especificação JPA através das notações e da unidade de persistencia dada pelo arquivo "persistence.xml"


**Spring Data JPA**
- Framework ORM do ecossistema Spring que tem como a finalidade de abstrair a especificação JPA. Já trazendo consigo por padrão a implementação que é o Hibernate mais com um conjunto de configurações pré-configuradas e métodos já implementados através das interfaces repositories.
- Configuramos nossa conexão através do application.properties

```

MODELO DE PERSISTENCE

<?xml version="1.0" encoding="UTF-8"?>
<persistence version="2.0" xmlns="http://java.sun.com/xml/ns/persistence" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://java.sun.com/xml/ns/persistence         http://java.sun.com/xml/ns/persistence/persistence_2_0.xsd">
  <!-- Unidade de persistencia -->
  <persistence-unit name="seuPU">
    <!-- Implementação do JPA -->
    <provider>org.hibernate.jpa.HibernatePersistenceProvider</provider>
    <!-- Lista de entidades -->
    <class>suaClasse</class>
    <properties>
      <!-- Propriedades JDBC -->
      <property name="javax.persistence.jdbc.driver" value="com.mysql.jdbc.Driver"/>
      <property name="javax.persistence.jdbc.url" value="jdbc:mysql://localhost/seuBanco"/>
      <property name="javax.persistence.jdbc.user" value="root"/>
      <property name="javax.persistence.jdbc.password" value=""/>
      <!-- Configurações específicas do Hibernate -->
      <property name="hibernate.dialect" value="org.hibernate.dialect.MySQL5InnoDBDialect"/>
      <property name="hibernate.hbm2ddl.auto" value="update"/>
      <property name="hibernate.show_sql" value="true"/>
      <property name="hibernate.format_sql" value="true"/>
    </properties>
  </persistence-unit>
</persistence>

```