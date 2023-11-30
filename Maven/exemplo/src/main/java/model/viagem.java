package model;

//import lombok.Getter;
//import lombok.Setter;
//import lombok.ToString;

//@Getter
//@Setter
//@ToString

public class viagem {
 private String nome;
 private String placa;
 private String marca;
 private int codigoViagem;
 private int ano;
 private String descricao;
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getPlaca() {
	return placa;
}
public void setPlaca(String placa) {
	this.placa = placa;
}
public String getMarca() {
	return marca;
}
public void setMarca(String marca) {
	this.marca = marca;
}
public int getCodigoViagem() {
	return codigoViagem;
}
public void setCodigoViagem(int codigoViagem) {
	this.codigoViagem = codigoViagem;
}
public int getAno() {
	return ano;
}
public void setAno(int ano) {
	this.ano = ano;
}
public String getDescricao() {
	return descricao;
}
public void setDescricao(String descricao) {
	this.descricao = descricao;
}
@Override
public String toString() {
	return "viagem [nome=" + nome + ", placa=" + placa + ", marca=" + marca + ", codigoViagem=" + codigoViagem
			+ ", ano=" + ano + ", descricao=" + descricao + "]";
}
 
 
}
