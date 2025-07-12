package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class Contato {

    public void adicionarContato(String nome, String telefone, String email) {
        String sql = "INSERT INTO contatos (nome, telefone, email) VALUES (?, ?, ?)";
        try (Connection conn = Conexao.conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nome);
            stmt.setString(2, telefone);
            stmt.setString(3, email);
            stmt.executeUpdate();
            System.out.println("Contato adicionado com sucesso!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void listarContatos(DefaultTableModel modelo) {;;
        String sql = "SELECT * FROM contatos";
        try (Connection conn = Conexao.conectar(); PreparedStatement stmt = conn.prepareStatement(sql); ResultSet rs = stmt.executeQuery()) {

            modelo.setRowCount(0); // Limpa a tabela antes de preencher

            while (rs.next()) {
                modelo.addRow(new Object[]{
                    rs.getInt("id"),
                    rs.getString("nome"),
                    rs.getString("telefone"),
                    rs.getString("email")
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    

    public void excluirContato(int id) {
        String sql = "DELETE FROM contatos WHERE id = ?";
        try (Connection conn = Conexao.conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void editarContato(int id, String nome, String telefone, String email) {
    String sql = "UPDATE contatos SET nome = ?, telefone = ?, email = ? WHERE id = ?";
    try (Connection conn = Conexao.conectar();
         PreparedStatement stmt = conn.prepareStatement(sql)) {
        stmt.setString(1, nome);
        stmt.setString(2, telefone);
        stmt.setString(3, email);
        stmt.setInt(4, id);
        stmt.executeUpdate();
    } catch (Exception e) {
        e.printStackTrace();
    }
}

    
}
