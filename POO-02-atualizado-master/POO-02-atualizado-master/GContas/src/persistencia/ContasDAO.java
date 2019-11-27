/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import modelo.Conta;

/**
 *
 * @author Aluno
 */
public class ContasDAO {
    private final Conexão con = new Conexão();
    private final String INSERTCONTAS = "INSERT INTO CONTAS (CONCESSIONARIA, DESCRICAO, DATA_VENCIMENTO) VALUES (?,?,?)";
    private final String LISTCONTA = "SELECT * FROM CONTAS";

    public boolean insertConta(Conta a) {
        try {
            // CONECTA
            con.conecta();

            PreparedStatement preparaInstrucao;
            preparaInstrucao = con.getConexao().prepareStatement(INSERTCONTAS);

            // SETA OS VALORES DA INSTRUCAO
            // OBS: PASSA OS PARAMETROS NA ORDEM DAS ? DA INSTRUCAO
            preparaInstrucao.setString(1, a.getConcessionaria());
            preparaInstrucao.setString(2, a.getDescricao());
            preparaInstrucao.setDate(3, a.getDataVencimento());

            // EXECUTA A INSTRUCAO
            preparaInstrucao.execute();

            // DESCONECTA
            con.desconecta();

            return true;

        } catch (SQLException e) {
            return false;

        }
    }
    
     public ArrayList<Conta> listConta() {
		ArrayList<Conta> lista = new ArrayList<>(); 

		try {
			// CONECTA
			con.conecta();
			PreparedStatement preparaInstrucao;
			preparaInstrucao = con.getConexao().prepareStatement(LISTCONTA); 
			
			// EXECUTA A INSTRUCAO
			ResultSet rs = preparaInstrucao.executeQuery(); 
			
			//TRATA O RETORNO DA CONSULTA
			while (rs.next()) { //enquanto houver registro
				Conta u = new Conta(Conta.getString("CONCESSIONARIO"), Conta.getString("DESCRICAO"),Conta.getDate("DATAVENCIMENTO"));
				lista.add(u); 
			}
			// DESCONECTA
			con.desconecta();
		} catch (SQLException e) {
                     System.out.println(e.getMessage());
		}
		Collections.sort(lista);
		return lista;
	}
 
    
    
}





