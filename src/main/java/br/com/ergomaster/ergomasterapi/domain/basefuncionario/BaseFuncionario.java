package br.com.ergomaster.ergomasterapi.domain.basefuncionario;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "base_funcionario")
public class BaseFuncionario {
    private Integer id;
    private String matricula;
    private String dv;
    private String nome;
    private String cargoDescricao;
    private String centroCusto;
    private String centroCustoDescricao;
    private String sexo;
    private String idFederal;
    private String identidade;
    private LocalDate dataNascimento;
    private String nomeMae;
    private LocalDate dataAdmissao;
    private String maoDeObraDescricao;
    private String endereco;
    private String nEndereco;
    private String cep;
    private String bairro;
    private String estadoCivil;
    private String telefone;
    private String pis;
    private String turnoDescricao;
    private String grauInstrucao;
    private String classifOcupacao;
    private String email;
    private LocalDate terminoContrato;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "matricula")
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Column(name = "dv")
    public String getDv() {
        return dv;
    }

    public void setDv(String dv) {
        this.dv = dv;
    }

    @Column(name = "nome")
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Column(name = "cargo_descricao")
    public String getCargoDescricao() {
        return cargoDescricao;
    }

    public void setCargoDescricao(String cargoDescricao) {
        this.cargoDescricao = cargoDescricao;
    }

    @Column(name = "centro_custo")
    public String getCentroCusto() {
        return centroCusto;
    }

    public void setCentroCusto(String centroCusto) {
        this.centroCusto = centroCusto;
    }

    @Column(name = "centro_custo_descricao")
    public String getCentroCustoDescricao() {
        return centroCustoDescricao;
    }

    public void setCentroCustoDescricao(String centroCustoDescricao) {
        this.centroCustoDescricao = centroCustoDescricao;
    }

    @Column(name = "sexo")
    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Column(name = "id_federal")
    public String getIdFederal() {
        return idFederal;
    }

    public void setIdFederal(String idFederal) {
        this.idFederal = idFederal;
    }

    @Column(name = "identidade")
    public String getIdentidade() {
        return identidade;
    }

    public void setIdentidade(String identidade) {
        this.identidade = identidade;
    }

    @Column(name = "data_nascimento")
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Column(name = "nome_mae")
    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    @Column(name = "data_admissao")
    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    @Column(name = "mao_de_obra_descricao")
    public String getMaoDeObraDescricao() {
        return maoDeObraDescricao;
    }

    public void setMaoDeObraDescricao(String maoDeObraDescricao) {
        this.maoDeObraDescricao = maoDeObraDescricao;
    }

    @Column(name = "endereco")
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Column(name = "n_endereco")
    public String getnEndereco() {
        return nEndereco;
    }

    public void setnEndereco(String nEndereco) {
        this.nEndereco = nEndereco;
    }

    @Column(name = "cep")
    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    @Column(name = "bairro")
    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    @Column(name = "estado_civil")
    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    @Column(name = "telefone")
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Column(name = "pis")
    public String getPis() {
        return pis;
    }

    public void setPis(String pis) {
        this.pis = pis;
    }

    @Column(name = "turno_descricao")
    public String getTurnoDescricao() {
        return turnoDescricao;
    }

    public void setTurnoDescricao(String turnoDescricao) {
        this.turnoDescricao = turnoDescricao;
    }

    @Column(name = "grau_instrucao")
    public String getGrauInstrucao() {
        return grauInstrucao;
    }

    public void setGrauInstrucao(String grauInstrucao) {
        this.grauInstrucao = grauInstrucao;
    }

    @Column(name = "classif_ocupacao")
    public String getClassifOcupacao() {
        return classifOcupacao;
    }

    public void setClassifOcupacao(String classifOcupacao) {
        this.classifOcupacao = classifOcupacao;
    }

    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "termino_contrato")
    public LocalDate getTerminoContrato() {
        return terminoContrato;
    }

    public void setTerminoContrato(LocalDate terminoContrato) {
        this.terminoContrato = terminoContrato;
    }
}
