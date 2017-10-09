<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>	
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</head>
<body>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">Mantenedores</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="/">Inicio</a></li>
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Tipo Actividades <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="nuevoTipoActividad">Nueva Actividad</a></li>
          <li><a href="tipoActividad">Lista de Actividades</a></li>
        </ul>
      </li>
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Tipo Clientes <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="nuevoTipoCliente">Nuevo Tipo de Cliente</a></li>
          <li><a href="tipoCliente">Lista de Actividades</a></li>
        </ul>
      </li>
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Tipo Contratos <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="nuevoTipoContrato">Nuevo Tipo de Contrato</a></li>
          <li><a href="tipoContrato">Lista de Contratos</a></li>
        </ul>
      </li>
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Tipo Servicio <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="nuevoTipoServicio">Nuevo Tipo de Servicio</a></li>
          <li><a href="tipoServicio">Lista de Servicios</a></li>
        </ul>
      </li>
      <li><a href="#">Page 3</a></li>
    </ul>
  </div>
</nav> 
	<div class="container"> 
</div>

</body>
</html>