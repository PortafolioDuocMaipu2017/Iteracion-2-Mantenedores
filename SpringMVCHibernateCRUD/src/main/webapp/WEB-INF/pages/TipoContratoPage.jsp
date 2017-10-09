<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Pantalla de Tipo de Contratos</title>
</head>
<body>
<jsp:include page="_menu.jsp" />
	<div align="center" class="container">
		<h1>Lista de Tipo Contratos</h1>

		<table border="1" class="table">
			<th class="success" >Codigo</th>
			<th class="success" >Tipo de Contrato</th>
			<th class="success" >Descripcion</th>
			<th class="success">Accion</th>

			<c:forEach var="tipoContrato" items="${listTipoContrato}">
				<tr>
				    <td>${tipoContrato.id}</td>
					<td>${tipoContrato.nombreTipo}</td>
					<td>${tipoContrato.descripcion}</td>
					<td>
					<div class="btn-group">
  					<button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown">
   					 <span class="caret"></span>
 					 </button>
  						<ul class="dropdown-menu" role="menu">
    				<li><a type="button" href="editarTipoContrato?id=${tipoContrato.id}" class="btn btn-warning">Editar</a></li>
    				<li><a type="button" href="borrarTipoContrato?id=${tipoContrato.id}" class="btn btn-danger">Eliminar</a></li>
  						</ul>
  					</div>
  					</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>