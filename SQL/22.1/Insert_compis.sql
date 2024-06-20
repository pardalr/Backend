-- CRUD --


-- CREATE --
CREATE DATABASE IF NOT EXISTS martes;

USE martes;

CREATE TABLE compis(
id_compis INT NOT NULL AUTO_INCREMENT,
nombre VARCHAR(50) NOT NULL,
telefono VARCHAR(50),
comentarios TEXT(250),
PRIMARY KEY(id_compis)
)

SELECT * FROM compis;

-- INSERTAR DATOS --
INSERT INTO compis(nombre, telefono, comentarios)
VALUES ("Pedro", "659-458-326", "Es un gran tipo, el otro día me invitó a un Vermut. Yo lo contrataría");

INSERT INTO compis(nombre, telefono, comentarios)
VALUES ("Roberta", "753-285-245", "Habla 7 idiomas y es muy simpática. Yo la contrataría"), 
("Josema", "854-697-223", "Me cae fatal y es más alto que yo. No lo contrataría"),
("Eva", "648-548-321", "Muy eficiente pero un poco prepotente. No lo contrataría");

-- READ --
SELECT nombre AS candidato, comentarios AS opinion FROM compis;
-- todas las queries con select --


-- UPDATE --
UPDATE compis
SET nombre = "Marta"
WHERE nombre = "Mireia"; -- El UPDATE solo lo hace con el ID por el SAFE MODE. En el WHERE tienes que buscar con el ID, no con el nombre. --

UPDATE compis
SET nombre = "Marta"
WHERE id_compis = 2; -- El UPDATE solo lo hace con el ID por el SAFE MODE. En el WHERE tienes que buscar con el ID, no con el nombre. --

SELECT * FROM compis
ORDER BY nombre;

-- DELETE -- 
-- mismo tema del SAFE MODE --
DELETE from compis
WHERE id_compis = 4; -- este funciona

DELETE from compis
WHERE nombre = "Pedro"; -- este NO funciona


-- para tablas y bases de datos se usa DROP en vez de DELETE --
DROP TABLE compis;

DROP DATABASE martes;

