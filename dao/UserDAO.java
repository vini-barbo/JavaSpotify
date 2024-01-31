package dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import projprogllant.User;
import java.sql.ResultSet;

public class UserDAO {
    private Conexao conexao;
    private Connection conn;
    
     public UserDAO() {
        this.conexao = new Conexao();
        this.conn = this.conexao.getConexao();
    }
    //metodo para cadastrar usuario
    public void adicionar(User user) {
         String sql = "INSERT INTO USUARIOS(CPF, username, password, name, email) VALUES "
                + "(?, ?, ?, ?, ?)";
         try {
        PreparedStatement stmt = this.conn.prepareStatement(sql);
        stmt.setString(1, user.getCPF().trim());
        stmt.setString(2, user.getUsername().trim());
        stmt.setString(3, user.getPassword().trim());
        stmt.setString(4, user.getName().trim());
        stmt.setString(5, user.getEmail().trim());
        ///acima é a estruturação dos parâmetros da query
        stmt.execute(); //comando executar
        
    } catch(Exception e) {
            System.out.println("Erro ao inserir conta" + e.getMessage());
      }
    }
    public boolean verificarLogin(String email, String senha) {
    String sql = "SELECT * FROM usuarios WHERE email=? AND password=?";
    try {
        PreparedStatement stmt = this.conn.prepareStatement(sql);
        stmt.setString(1, email);
        stmt.setString(2, senha);
        ResultSet rs = stmt.executeQuery();
        return rs.next();
    } catch (Exception e) {
        System.out.println("Erro ao verificar login: " + e.getMessage());
        return false;
    }
}
    //metodo para editar informações do usuario
    public void editar(User user) {
        String sql = "UPDATE usuarios SET username=?, password=?, name=?, email=? WHERE cpf=?";
                try{                 
                    PreparedStatement stmt = this.conn.prepareStatement(sql);
                    stmt.setString(1, user.getUsername().trim());
                    stmt.setString(2, user.getPassword().trim());
                    stmt.setString(3, user.getName().trim());
                    stmt.setString(4, user.getEmail().trim());
                    stmt.setString(5, user.getCPF());
                    stmt.execute();
                    
                } catch(Exception e) {
                    System.out.println("Erro ao editar conta" + e.getMessage());
                }
    }
    
    public void excluir(String CPF) {
        String sql = "DELETE FROM usuarios WHERE cpf=? ";
        try{
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, CPF);
            stmt.execute();
        } catch(Exception e) {
            System.out.println("Erro ao excluir conta" + e.getMessage());
        }
    }
    public User getUser(String CPF) {
        String sql = "SELECT * FROM usuarios WHERE CPF = ?";
        try{
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, CPF);
            ResultSet rs = stmt.executeQuery();
            
            User user = new User();
            
            rs.first();
            user.setCPF(CPF);
            user.setUsername(rs.getString("username"));
            user.setPassword(rs.getString("password"));
            user.setName(rs.getString("name"));
            user.setEmail(rs.getString("email"));
            return user;
        } catch(Exception e) {
           return null;      
        }
    }
}
