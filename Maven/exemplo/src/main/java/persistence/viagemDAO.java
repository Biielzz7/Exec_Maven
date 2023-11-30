package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.viagem;

public class viagemDAO implements IviagemDAO {
GenericDAO gen = new GenericDAO();

public viagemDAO (GenericDAO gen) {
	this.gen = gen;
}
	@Override
	public viagem buscar(viagem vi) throws ClassNotFoundException, SQLException {
		Connection Con = gen.getConnection();
		String SQL = "SELECT * FROM v_descricao_onibus WHERE codigo = ?";
		PreparedStatement ps = Con.prepareStatement(SQL);
		ps.setInt(1, vi.getCodigoViagem());
		ResultSet rs = ps.executeQuery();
		if (rs.next()){
			vi.setCodigoViagem(rs.getInt("codigo"));
			vi.setAno(rs.getInt("ano"));
			vi.setDescricao(rs.getString("descricao"));
			vi.setMarca(rs.getString("marca"));
			vi.setNome(rs.getString("nome"));
			vi.setPlaca(rs.getString("placa"));
			System.out.println(vi.toString());
		}
		rs.close();
		ps.close();
		Con.close();
		return vi;
	}

}
