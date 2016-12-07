# --- !Ups

CREATE TABLE "usuario"("id" SERIAL PRIMARY KEY ,"nombre" varchar(50) , "apellidos" varchar(50)  , "email" varchar(50), "password" varchar(50));
INSERT INTO "usuario" values (1,'Juan', 'Perez','mail@mail.com','1234');
INSERT INTO "usuario" values (2,'Arnoldo', 'Matamoros','au@mail.com','1234');
INSERT INTO "usuario" values (3,'Pedro', 'Perez','pmail@mail.com','1234');
INSERT INTO "usuario" values (4,'Miguel', 'Ulloa','mu@mail.com','1234');
INSERT INTO "usuario" values (5,'Marcos', 'Martinez','mm@mail.com','1234');

--CREATE TABLE "departamento"("id" SERIAL PRIMARY KEY, "nombre" varchar(25));
--INSERT INTO "departamento" values(1, 'La Union');

CREATE TABLE "edan"("id" SERIAL PRIMARY KEY ,"entrevistador" varchar(75) , "cargo" varchar(30), "institucion" varchar(50), "telefono" varchar(10),"email" varchar(50),
"direccion" varchar(75) , "departamento" varchar(25), "municipio" varchar(75), "zonaevaluada" varchar(100), "puntoreferencia" varchar(100), "evento" varchar(30),
"vterrestre" varchar(20) , "vaerea" varchar(20), "vmaritima" varchar(20), "rutaalterna" varchar(100), "obstaculos" varchar(100),
"heridos1" varchar(10), "heridos2" varchar(10), "albergados" varchar(10), "evacuados" varchar(10), "fallecidos" varchar(10));

INSERT INTO "edan" values (1,'Juan', 'Perez','Alcaldia','7890-1212', 'mail@mail.com', 'Calle la joya', 'San Salvador', 'San Salvador', 'Colonia San Mateo', 'Redondel Masferrer',
'Huracan', 'Transitable', 'Afectado', 'Destruido', 'No hay ruta alterna', 'Hubo un desbordamiento en la unica calle de acceso', '12', '20', '504', '2080', '3');

INSERT INTO "edan" values (2,'Henry', 'Gutierrez','Alcaldia de SS','7895-1212', 'fg@mail.com', 'Calle al volcan', 'San Salvador', 'San Salvador', 'Todo el centro de San Salvador', 'Alcalia municipal',
'Terremoto', 'Transitable', 'Afectado', 'Destruido', 'No hay ruta alterna', 'Hay grietas en la calle', '1', '20', '5', '20', '3');

INSERT INTO "edan" values (3,'Roger', 'Nieto','Alcaldia','7890-1211', 'rn@mail.com', 'Calla la mascota', 'San Salvador', 'San Salvador', 'Colonia escalon', 'Redondel Masferrer',
'Huracan', 'No Transitable', 'Afectado', 'Destruido', 'No hay ruta alterna', 'Calles inundadas', '2', '20', '5033', '2080', '3');

INSERT INTO "edan" values (4,'Erick', 'Bonillas','Alcaldia','7190-1212', 'eb@mail.com', 'Calle la joya', 'San Salvador', 'San Salvador', 'Colonia San Mateo', 'Redondel Masferrer',
'Huracan', 'Transitable', 'Afectado', 'Destruido', 'No hay ruta alterna', 'Hubo un desbordamiento en la unica calle de acceso', '12', '20', '504', '2080', '3');

INSERT INTO "edan" values (5,'Milton', 'Aragon','Alcaldia','7845-1212', 'ma@mail.com', 'Avenida la sultana', 'San Salvador', 'San Salvador', 'Residencial la sultana', 'Redondel Masferrer',
'Huracan', 'Transitable', 'Afectado', 'Destruido', 'No hay ruta alterna', 'Hubo un desbordamiento en la unica calle de acceso', '12', '20', '54', '20', '3');

INSERT INTO "edan" values (6,'Marcos', 'Rodriguez','Alcaldia','7890-1612', 'mr@mail.com', 'Calle la joya', 'San Salvador', 'San Salvador', 'Colonia San Mateo', 'Redondel Masferrer',
'Terremoto', 'Transitable', 'Afectado', 'Destruido', 'No hay ruta alterna', 'Hubo un desbordamiento en la unica calle de acceso', '12', '20', '504', '200', '3');

INSERT INTO "edan" values (7,'Luis', 'Murillo','Alcaldia','7907-1212', 'lm@mail.com', 'Calle al volcan', 'San Salvador', 'San Salvador', 'Residencial universitaria', 'Las 3 torres',
'Huracan', 'No Transitable', 'Afectado', 'Destruido', 'No hay ruta alterna', 'Arboles caidos', '12', '20', '4', '20', '3');

INSERT INTO "edan" values (8,'Jose', 'Chavez','Alcaldia','7000-1212', 'jc@mail.com', 'Calle ilamatepec', 'Santa Ana', 'San Ana', 'Canton el volcan', 'Falda del volcan',
'Erupcion', 'Transitable', 'Afectado', 'Destruido', 'No hay ruta alterna', 'Cenizas y rocas esparcidas en todo el camino', '132', '203', '5044', '20380', '39');

INSERT INTO "edan" values (9,'Juan', 'Perez','Alcaldia','7890-1212', 'mail@mail.com', 'Calle la joya', 'San Salvador', 'San Salvador', 'Colonia San Mateo', 'Redondel Masferrer',
'Huracan', 'Transitable', 'Afectado', 'Destruido', 'No hay ruta alterna', 'Hubo un desbordamiento en la unica calle de acceso', '12', '20', '504', '2080', '3');

INSERT INTO "edan" values (10,'Juan', 'Perez','Alcaldia','7890-1212', 'maiddl@mail.com', 'Calle la joya', 'San Salvador', 'San Salvador', 'Colonia San Mateo', 'Redondel Masferrer',
'Huracan', 'Transitable', 'Afectado', 'Destruido', 'No hay ruta alterna', 'Hubo un desbordamiento en la unica calle de acceso', '12', '20', '504', '2080', '3');

INSERT INTO "edan" values (11,'Henry', 'Gutierrez','Alcaldia de SS','7895-1212', 'fgf@mail.com', 'Calle al volcan', 'San Salvador', 'San Salvador', 'Todo el centro de San Salvador', 'Alcalia municipal',
'Terremoto', 'Transitable', 'Afectado', 'Destruido', 'No hay ruta alterna', 'Hay grietas en la calle', '1', '20', '5', '20', '3');

--CREATE TABLE "municipio"("id" SERIAL PRIMARY KEY, departamentoid integer references departamento(id), "nombre" varchar(50));
--INSERT INTO "municipio" values(1, 1, 'Olomegua');

# --- !Downs

DROP TABLE "usuario";
DROP TABLE "edan";
--DROP TABLE "departamento";
--DROP TABLE "municipio";
