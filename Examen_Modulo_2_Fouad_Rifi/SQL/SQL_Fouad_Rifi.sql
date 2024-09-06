/*
Crear la Base de Datos:
*/
CREATE DATABASE inmobiliaria;
USE inmobiliaria;

/*
Crear la tabla Propiedades
*/
CREATE TABLE PROPIETARIOS (
    id_propietario INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50),
    apellido VARCHAR(50),
    email VARCHAR(100)
);


/*
Crear la tabla Casas
*/
CREATE TABLE CASAS (
    id_casa INT AUTO_INCREMENT PRIMARY KEY,
    direccion VARCHAR(100),
    precio DECIMAL(10,2),
    anio_construccion YEAR,
    id_propietario INT,
    FOREIGN KEY (id_propietario) REFERENCES PROPIETARIOS(id_propietario)
);

/*
Insertar al menos 5 registros para cada tabla
*/

INSERT INTO PROPIETARIOS (nombre, apellido, email)
VALUES 
('Carlos', 'Pérez', 'carlos.perez@mail.com'),
('Ana', 'García', 'ana.garcia@mail.com'),
('Mario', 'Gonzalez', 'gonzalez.mario@mail.com'),
('Sebas', 'Radu', 'sebi.radu@mail.com'),
('Jose', 'Maria', 'jose.maria@mail.com');

/*
INSERT INTO CASAS (direccion, precio, anioConstruccion, id_propietario)
VALUES
('Calle Falsa 123', 250000.00, 2005, 1),
('Avenida Siempre Viva 742', 300000.00, 2010, 1),
('C/ Real 456', 400000.00, 2015, 3),
('C/ Ciudad Mayor 6', 130000.00, 2015, 5),
('Calle Arquitecto Jujol 7', 60000.00, 1994, 2),
('C/ St.Antoni 12', 150000.00, 2010, 4);
*/

INSERT INTO CASAS (direccion, precio, anio_construccion, id_propietario)
VALUES 
('Calle Falsa 123', 250000.00, 2005, 1),
('Avenida Siempre Viva 742', 300000.00, 2010, 3),
('Calle Real 456', 400000.00, 2015, 2),
('C/ Ciudad Mayor 6', 130000.00, 2015, 5),
('Calle Arquitecto Jujol 7', 60000.00, 1994, 2),
('C/ St.Antoni 12', 150000.00, 2010, 4);


/*
Contar el número total de propietarios
*/

SELECT COUNT(*) AS total_propietarios FROM PROPIETARIOS;

/*
Seleccionar propietarios cuyo apellido es "Pérez"
*/
SELECT * FROM PROPIETARIOS WHERE apellido = 'Pérez';

/*
Obtener el email de todos los propietarios
*/
SELECT email FROM PROPIETARIOS;

/*
Seleccionar propietarios cuyo nombre empiece por "C"
*/
SELECT * FROM PROPIETARIOS WHERE nombre LIKE 'C%';

/*
Seleccionar casas construidas entre 1990 y 2020, ambos incluidos
*/
SELECT * FROM CASAS WHERE anio_construccion BETWEEN 1990 AND 2020;


/*
Seleccionar casas ordenadas por precio, de más cara a más barata.
*/
SELECT * FROM CASAS ORDER BY precio DESC;


/*
Obtener el precio promedio de las casas
*/
SELECT AVG(precio) AS precio_promedio FROM CASAS;


/*
Mostrar la casa más barata de todas
*/
SELECT * FROM CASAS ORDER BY precio ASC LIMIT 1;

/*
Seleccionar todas las casas junto con el nombre y el apellido del propietario
*/
SELECT 
    p.nombre, p.apellido, c.direccion, c.precio, c.anio_construccion
FROM 
    CASAS c
JOIN 
    PROPIETARIOS p ON c.id_propietario = p.id_propietario;


/*
Seleccionar el nombre del propietario y el precio de sus casas (solo casas de más de 180.000€)
*/
SELECT 
    p.nombre, p.apellido, c.precio
FROM 
    CASAS c
JOIN 
    PROPIETARIOS p ON c.id_propietario = p.id_propietario
WHERE 
    c.precio > 180000;















