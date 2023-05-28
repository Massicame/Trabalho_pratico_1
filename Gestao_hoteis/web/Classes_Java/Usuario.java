package Classes_Java;


import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Usuario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nome;
    
    private int idade;
    
    private String morada;
    
    @Temporal(TemporalType.DATE)
    private Date dataEntrada;
    
    @Temporal(TemporalType.DATE)
    private Date dataSaida;

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * @return the morada
     */
    public String getMorada() {
        return morada;
    }

    /**
     * @param morada the morada to set
     */
    public void setMorada(String morada) {
        this.morada = morada;
    }

    /**
     * @return the dataEntrada
     */
    public Date getDataEntrada() {
        return dataEntrada;
    }

    /**
     * @param dataEntrada the dataEntrada to set
     */
    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    /**
     * @return the dataSaida
     */
    public Date getDataSaida() {
        return dataSaida;
    }

    /**
     * @param dataSaida the dataSaida to set
     */
    public void setDataSaida(Date dataSaida) {
        this.dataSaida = dataSaida;
    }
    
}


