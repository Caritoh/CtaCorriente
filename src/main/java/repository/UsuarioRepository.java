package repository;

import models.UsuarioEntity;
import connection.MysqlDBCon;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author glady
 */
public class UsuarioRepository implements IUsuarioRepository {

    private final static String QUERY_LOGIN = new StringBuilder()
            .append("SELECT id, nombre, password from Usuario WHERE nombre = '%s' AND password = '%s'")
            .toString();

    @Override
    public UsuarioEntity getByLogin(String user, String password) throws SQLException {
        UsuarioEntity response = new UsuarioEntity();
        try (MysqlDBCon db = MysqlDBCon.getInstance()) {
            ResultSet result = db.executeQuery(String.format(QUERY_LOGIN, user, password));
            while (result.next()) {
                response.setId(result.getInt("id"));
                response.setNombre(result.getString("nombre"));
                response.setPassword(result.getString("password"));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return response;
    }
}
