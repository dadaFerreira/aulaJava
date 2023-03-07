package modelo;

public class Produto {

    private Long id;
    private String descricao;
    private String codigo;
    private String unidadeMedida;
    private Double valorUnitario;
    private Boolean ativoInativo;

    public Produto () {
        ativoInativo = true;
    }

    public Produto(Long id, String descricao, String codigo, String unidadeMedida, Double valorUnitario) {
        this.id = id;
        this.descricao = descricao;
        this.codigo = codigo;
        this.unidadeMedida = unidadeMedida;
        this.valorUnitario = valorUnitario;
        this.ativoInativo = true;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getUnidadeMedida() {
        return unidadeMedida;
    }

    public void setUnidadeMedida(String unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }

    public Double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(Double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public Boolean getAtivoInativo() {
        return ativoInativo;
    }

    public void setAtivoInativo(Boolean ativoInativo) {
        this.ativoInativo = ativoInativo;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                ", codigo='" + codigo + '\'' +
                ", unidadeMedida='" + unidadeMedida + '\'' +
                ", valorUnitario=" + valorUnitario +
                ", ativoInativo=" + ativoInativo +
                '}';
    }
}
