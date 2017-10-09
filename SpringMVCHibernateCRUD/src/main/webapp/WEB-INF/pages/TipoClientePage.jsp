<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Pantalla de Tipo de Clientes</title>
</head>
<body>
<jsp:include page="_menu.jsp" />
	<div align="center" class="container">
		<h1>Lista de Tipo Clientes</h1>

		<table border="1" class="table">
			<th class="success" >Codigo</th>
			<th class="success" >Tipo de Cliente</th>
			<th class="success" >Descripcion</th>
			<th class="success">Accion</th>

			<c:forEach var="tipoCliente" items="${listTipoCliente}">
				<tr>
				    <td>${tipoCliente.id}</td>
					<td>${tipoCliente.nombreTipo}</td>
					<td>${tipoCliente.descripcion}</td>
					<td>
					<div class="btn-group">
  					<button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown">
   					 <span class="caret"></span>
 					 </button>
  						<ul class="dropdown-menu" role="menu">
    				<li><a type="button" href="editarTipoCliente?id=${tipoCliente.id}" class="btn btn-warning">Editar</a></li>
    				<li><a type="button" href="borrarTipoCliente?id=${tipoCliente.id}" class="btn btn-danger">Eliminar</a></li>
  						</ul>
  					</div>
  					</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>