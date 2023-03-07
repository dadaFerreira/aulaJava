package modelo;

public class Cliente {

    // sao atributos ou parametros
    private Long id;
    private String nome;
    private String email;
    private Integer idade;
    private String tipo;
    private String documento;

    //Construtor, primeiro o vazio e depois com os atributos
    public Cliente() {
    }

    public Cliente(Long id, String nome, String email, Integer idade, String tipo) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.tipo = tipo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    //    public String transformarNomeMaiusculo() {
//        return this.nome.toUpperCase();
//    }
//
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getIdade() {
        return idade;
    }

    public Cliente(Long id, String nome, String email, Integer idade, String tipo, String documento) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.tipo = tipo;
        this.documento = documento;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    //sobre escrita muda a classe mãe


    public Integer calcularIdade(Integer numero) {
        return this.idade + numero;
    }

    public String sobrenome(String sobrenome) {
        return this.nome + " " + sobrenome;
    }

    public String email() {
        return this.email.trim();
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", idade=" + idade +
                ", tipo='" + tipo + '\'' +
                ", documento='" + documento + '\'' +
                '}';
    }
}
