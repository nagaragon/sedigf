package models

case class Employee(name: String, email: String, companyName: String, position: String, id: Option[Int] = None)

case class Usuario(nombre: String, apellidos: String, email: String, password: String, id: Option[Int] = None)

case class Edan(entrevistador: String, cargo: String, institucion: String, telefono: String, email: String, 
direccion: String, departamento: String, municipio: String, zonaevaluada: String, puntoreferencia: String, evento: String,
vterrestre: String, vaerea: String, vmaritima: String, rutaalterna: String, obstaculos: String, heridos1: String,
heridos2: String, albergados: String, evacuados: String, fallecidos: String, id: Option[Int] = None)

case class Departamento(nombre: String, id: Option[Int] = None)

case class Municipio(departamentoid: Int, nombre: String, id: Option[Int] = None)