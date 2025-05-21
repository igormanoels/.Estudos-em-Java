# Notações do Hibernate

| Notação           | Descrição | Como Usar |
|-------------------|-----------|-----------|
| `@Entity` | Define que a classe é uma entidade persistente | `@Entity public class Produto { ... }` |
| `@Table` | Especifica detalhes da tabela no banco de dados | `@Table(name = "produtos", schema = "estoque")` |
| `@Id` | Indica o campo que é a chave primária da entidade | `@Id private Long id;` |
| `@GeneratedValue` | Define a estratégia de geração de valores para a chave primária | `@GeneratedValue(strategy = GenerationType.IDENTITY)` |
| `@Column` | Mapeia um atributo para uma coluna da tabela | `@Column(name = "nome_produto", length = 100, nullable = false)` |
| `@Transient` | Indica que um campo não deve ser persistido | `@Transient private String campoCalculado;` |
| `@Temporal` | Especifica o tipo de dados para campos de data/hora | `@Temporal(TemporalType.DATE) private Date dataNascimento;` |
| `@Enumerated` | Mapeia um enum para o banco de dados | `@Enumerated(EnumType.STRING) private Status status;` |
| `@Lob` | Mapeia campos grandes (BLOB/CLOB) | `@Lob private byte[] arquivo;` |
| `@OneToOne` | Define um relacionamento um-para-um | `@OneToOne(mappedBy = "pessoa") private Endereco endereco;` |
| `@OneToMany` | Define um relacionamento um-para-muitos | `@OneToMany(mappedBy = "pedido") private List<Item> itens;` |
| `@ManyToOne` | Define um relacionamento muitos-para-um | `@ManyToOne @JoinColumn(name = "cliente_id") private Cliente cliente;` |
| `@ManyToMany` | Define um relacionamento muitos-para-muitos | `@ManyToMany @JoinTable(name = "aluno_curso") private List<Curso> cursos;` |
| `@JoinColumn` | Especifica a coluna de junção para relacionamentos | `@JoinColumn(name = "departamento_id")` |
| `@JoinTable` | Define detalhes da tabela de junção para relacionamentos muitos-para-muitos | `@JoinTable(name = "user_role", joinColumns = @JoinColumn(...))` |
| `@Embedded` | Indica que um atributo é uma classe embutida | `@Embedded private Endereco endereco;` |
| `@Embeddable` | Define uma classe que pode ser embutida em outra entidade | `@Embeddable public class Endereco { ... }` |
| `@NamedQuery` | Define uma consulta nomeada para a entidade | `@NamedQuery(name = "Produto.findByNome", query = "SELECT p FROM Produto p WHERE p.nome = :nome")` |
| `@DynamicUpdate` | Habilita atualização dinâmica (apenas campos modificados) | `@Entity @DynamicUpdate public class Produto { ... }` |
| `@NaturalId` | Marca um campo como identificador natural (não PK) | `@NaturalId private String codigo;` |
| `@Version` | Usado para controle de concorrência otimista | `@Version private int versao;` |
| `@CreationTimestamp` | Automaticamente define a data/hora de criação | `@CreationTimestamp private Date dataCriacao;` |
| `@UpdateTimestamp` | Automaticamente atualiza a data/hora de modificação | `@UpdateTimestamp private Date dataModificacao;` |

## Exemplo Completo

```java
@Entity
@Table(name = "clientes")
@NamedQuery(name = "Cliente.findByNome", 
           query = "SELECT c FROM Cliente c WHERE c.nome = :nome")
public class Cliente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "nome_completo", nullable = false, length = 100)
    private String nome;
    
    @Enumerated(EnumType.STRING)
    private TipoCliente tipo;
    
    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    private List<Pedido> pedidos;
    
    @Embedded
    private Endereco endereco;
    
    @Version
    private int versao;
    
    // getters e setters
}

@Embeddable
public class Endereco {
    private String rua;
    private String cidade;
    private String cep;
    // getters e setters
}