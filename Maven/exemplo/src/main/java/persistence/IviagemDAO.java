package persistence;

import java.sql.SQLException;

import model.viagem;

public interface IviagemDAO {
public viagem buscar(viagem vi) throws ClassNotFoundException, SQLException;
	

}
