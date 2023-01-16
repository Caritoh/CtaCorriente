package repository;
import java.sql.SQLException;
import models.UsuarioEntity;

/**
 *
 * @author glady
 */
public interface IUsuarioRepository {
    UsuarioEntity getByLogin(final String user, final String pass) throws SQLException;
}
