<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Agregar/Editar Tipos de Contratos</title>
</head>
<body>
<jsp:include page="_menu.jsp" />
	<div align="center"  class="container">
		<h1>Nuevo/Editar Tipo Contrato</h1>
		<form:form action="guardarTipoContrato" method="post"
			modelAttribute="tipoContrato">
			<div>
			<table class="table">
				<form:hidden path="id" />
				<tr >
					<td>Tipo de Contrato:</td>
					<td><form:input path="nombreTipo" /></td>
				</tr>
				<tr>
					<td>Descripcion:</td>
					<td><form:input path="descripcion" /></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit"
						value="Guardar Cambios"></td>
				</tr>
			</table>
			</div>
		</form:form>
	</div>
</body>
</html>