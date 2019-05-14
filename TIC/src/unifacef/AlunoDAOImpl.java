/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unifacef;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author vsued
 */
public class AlunoDAOImpl implements AlunoDAO {

    @Override
    public boolean insere(Aluno aluno) {
        Connection con = BancoDados.conecta();
        if (con == null) {
            return false;
        } else {
            String sql = "insert into aluno(nome, sexo, estado) values (?, ?, ?)";
            try {
                PreparedStatement canal = con.prepareStatement(sql);
                canal.setString(1, aluno.getNomeAluno());
                canal.setString(2, aluno.getSexoAluno());
                canal.setString(3, aluno.getEstadoAluno());
                canal.execute(sql);
                return true;

            } catch (SQLException e) {
                System.out.println(e.getMessage());
                return false;
            }
        }

    }

    @Override
    public boolean remove(Aluno aluno) {
        Connection con = BancoDados.conecta();
        if (con == null) {
            return false;
        } else {
            String sql = "delete from aluno where codigo = ?";
            try {
                PreparedStatement canal = con.prepareStatement(sql);
                canal.setInt(1, aluno.getCodigo());
                canal.execute(sql);
                return true;

            } catch (SQLException e) {
                System.out.println(e.getMessage());
                return false;
            }
        }
    }

    @Override
    public boolean atualiza(Aluno aluno) {
        Connection con = BancoDados.conecta();
        if (con == null) {
            return false;
        } else {
            String sql = "update aluno set nome = ?, sexo = ?, estado = ? where codigo = ?";
            try {
                PreparedStatement canal = con.prepareStatement(sql);
                canal.setString(1, aluno.getNomeAluno());
                canal.setString(2, aluno.getSexoAluno());
                canal.setString(3, aluno.getEstadoAluno());
                canal.setInt(4, aluno.getCodigo());
                canal.execute(sql);
                return true;

            } catch (SQLException e) {
                System.out.println(e.getMessage());
                return false;
            }
        }
    }

    @Override
    public ArrayList<Aluno> consulta() {
        Connection con = BancoDados.conecta();
        if (con == null) {
            return null;
        } else {
            String sql = "select * from aluno";
            try {
                Statement canal = con.createStatement();
                ResultSet ponteiro = canal.executeQuery(sql);
                ArrayList<Aluno> alunos = new ArrayList();

                while (ponteiro.next()) {
                    Aluno aluno = new Aluno();
                    aluno.setCodigo(ponteiro.getInt("codigo"));
                    aluno.setNomeAluno(ponteiro.getString("nome"));
                    aluno.setSexoAluno(ponteiro.getString("sexo"));
                    aluno.setEstadoAluno(ponteiro.getString("estado"));
                    alunos.add(aluno);
                }

            } catch (SQLException e) {
                System.out.println(e.getMessage());
                return null;
            }
        }
        return null;
    }

}
