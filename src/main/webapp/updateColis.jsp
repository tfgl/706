<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <title>Voir les colis</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
  </head>
  <header class="p-3 mb-2 bg-info text-white mx-auto" >
    <div class="container">
      <div class="row" style="margin-left: 100px;">
        <div class="col-sm ">
          <a class="btn btn-primary" href="Register" role="button">Enregistrer un colis</a>
        </div>
        <div class="col-sm mx-auto">
          <a  href="/" role="button">
            <img src="ssp.png" style="height: 60px;"/>

          </a>
        </div>
        <div class="col-sm">
          <a class="btn btn-primary" href="Progression" role="button">Voir les colis</a>
        </div>
      </div>
    </div>
  </header>
<body>
	
    <form class="mx-auto" style="width:800px" method="post" action="Update">
      <input type="hidden" name="id" value="${colis.id}">
      <div class="form-group">
        <label>Emplacement</label>
        <input type="text" class="form-control" id="emplacement" name="emplacement" value="${colis.emplacement}">
      </div>
      <div class="form-row">
        <div class="form-group col-md-6">
          <label>Latitude</label>
          <input type="text" class="form-control" id="latitude" name="latitude" value="${colis.latitude}">
        </div>
        <div class="form-group col-md-6">
          <label>Longitude</label>
          <input type="text" class="form-control" id="longitude" name="longitude" value="${colis.longitude}">
        </div>
      </div>
      <button type="submit" class="btn btn-primary">Enregistrer</button>
    </form>


    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</body>
</html>