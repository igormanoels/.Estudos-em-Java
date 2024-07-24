# Projeto - Publicando Sua API REST na Nuvem Usando Spring Boot 3, Java 17 e Railway
- DIO - Bootcamp Santander 2024
## Diagrama de Classe




``` mermaid
classDiagram
    class Account {
        +String number
        +String agency
        +float balance
        +float limit
        +Feature[] features
    }

    class Feature {
        +String icon
        +String description
    }

    class Card {
        +String number
        +float limit
    }

    class News {
        +String icon
        +String description
    }

    class User {
        +String name
        +Account account
        +Card card
        +News[] news
    }

    User "1" --> "1" Account
    User "1" --> "1" Card
    User "1" --> "0..*" News
    User "1" --> "0..*" Feature
``` 
