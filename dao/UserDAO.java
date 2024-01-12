package dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import projprogllant.User;

public class UserDAO {
    private Conexao conexao;
    private Connection conn;
    
     public UserDAO() {
        this.conexao = new Conexao();
        this.conn = this.conexao.getConexao();
    }

    public void adicionar(User user) {
         String sql = "INSERT INTO USUARIOS(username, password, name, email) VALUES "
                + "(?, ?, ?, ?)";
         try {
        PreparedStatement stmt = this.conn.prepareStatement(sql);
        stmt.setString(1, user.getUsername());
        stmt.setString(2, user.getPassword());
        stmt.setString(3, user.getName());
        stmt.setString(4, user.getEmail());
        ///acima é a estruturação dos parâmetros da query
        stmt.execute(); //comando executar
        
    } catch(Exception e) {
            System.out.println("Erro ao inserir curso" + e.getMessage());
      }
    }
}
