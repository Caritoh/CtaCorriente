package models;
import java.io.Serializable;
/**
 *
 * @author glady
 */
public class UsuarioEntity implements Serializable{
	private Integer id;
	private String nombre;
	private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
