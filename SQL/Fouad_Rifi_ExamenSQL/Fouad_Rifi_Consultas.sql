-- Crear tabla LIBROS
CREATE TABLE LIBROS (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(255) NOT NULL,
    autor VARCHAR(200) NOT NULL,
    ano_publicacion INT NOT NULL
);

-- Crear tabla CLIENTES
CREATE TABLE CLIENTES (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(200) NOT NULL,
    email VARCHAR(200) NOT NULL
);

-- Relacionar tablas.

ALTER TABLE Libros ADD COLUMN cliente_id INT;
ALTER TABLE Libros ADD CONSTRAINT fk_cliente
FOREIGN KEY (cliente_id) REFERENCES clientes(id);

-- CONSULTAS: --
-- 5.1- Obtener los libros publicados después de 2005
SELECT * FROM LIBROS WHERE ano_publicacion > 2005;

-- 5.2- Obtener los clientes cuyo nombre contiene la letra “e”
SELECT * FROM CLIENTES WHERE nombre LIKE '%e%';

-- 5.3- Contar el número total de libros
SELECT COUNT(*) AS total_libros FROM LIBROS;

-- 5.4- ¿Cuál es el título del libro con el ID 3?
SELECT titulo FROM LIBROS WHERE id = 3;

-- 5.5- ¿Cuántos clientes tienen una dirección de correo electrónico que termina en “@gmail.com”?
SELECT COUNT(*) AS total_clientes_gmail FROM CLIENTES WHERE email LIKE '%@gmail.com';

-- 5.6- ¿Cuál es el título del libro más antiguo?
SELECT titulo FROM LIBROS ORDER BY ano_publicacion ASC LIMIT 1;

-- 5.7- JOIN: Obtener los libros junto con los nombres de los clientes que los poseen
SELECT LIBROS.titulo, CLIENTES.nombre FROM LIBROS LEFT JOIN CLIENTES ON LIBROS.cliente_id = CLIENTES.id;

-- 5.8- JOIN: Obtener los clientes que no tienen libros
SELECT CLIENTES.nombre FROM CLIENTES LEFT JOIN LIBROS ON CLIENTES.id = LIBROS.cliente_id WHERE LIBROS.id IS NULL;








