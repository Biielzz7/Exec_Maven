<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Viagem</title>
</head>
<body>
	<div>
		<jsp:include page = "menu.jsp"/>
	</div>
	<br />
        <div align="center" class="container">
           <form action="viagem" method="post">
              <p class="title">
                  <b>Viagens</b>
              </p>
              <table>
                  <tr>
                      <td colspan="3">
                          <input class="id_input_data" type="number" min="0"
                          step="1" id="cod" name="cod" placeholder="Codigo da viagem"
                          value='<c:out value="${viagem.codigoViagem }"></c:out>'>
                      </td>
                      <td>
                          <input type="submit" id="botao" name="botao" value="Buscar">
                      </td>    
                  </tr>
                  <tr>
                      <td colspan="4">
                          <input class="input_data" type="text" id="placa" name="placa"
                          placeholder="Placa de Onibus"
                          value='<c:out value="${viagem.placa }"></c:out>'>
                      </td>    
                  </tr>
                  
                                    <tr>
                      <td colspan="4">
                          <input class="input_data" type="number" 
                           id="ano" name="ano" placeholder="Ano do Onibus"
                          value='<c:out value="${viagem.ano }"></c:out>'>
                      </td>    
                  </tr>
                                    <tr>
                      <td colspan="4">
                          <input class="input_data" type="text" 
                           id="marca" name="marca" placeholder="Marca do Onibus"
                          value='<c:out value="${viagem.marca }"></c:out>'>
                      </td>    
                  </tr>
                                    <tr>
                      <td colspan="4">
                          <input class="input_data" type="text" id="nome" name="nome"
                          placeholder="Nome do Motorista" 
                          value='<c:out value="${viagem.nome }"></c:out>'>
                      </td>    
                  </tr>
                  
                                    <tr>
                      <td colspan="4">
                          <input class="input_data" type="text" id="des" name="des"
                          placeholder="Descricao da Viagem"
                          value='<c:out value="${viagem.descricao }"></c:out>'>
                      </td>    
                  </tr>
                  
              </table>
              
           </form>
        </div>
</body>
</html>