package dominio;

//importações hibernate
import javax.persistence.*;
import java.io.Serializable;

@Entity //mapeamento de entidade
public class Pessoa implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //indicação que a chave primaria sera gerada automaticamente
    private Integer id;

    //@Column(name="nomecompleto") //anotação do JPA para nomeamento de tabela diferente do nome do atributo da classe (opcional)
    private String name;
    private String email;

    public Pessoa() {
    }

    public Pessoa(Integer id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
