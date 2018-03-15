CREATE TABLE tipoAutomovil(
    id_tipo int AUTO_INCREMENT PRIMARY KEY, 
    nombre VARCHAR(50) NOT NULL 
);

CREATE TABLE marca(
    id_marca int AUTO_INCREMENT PRIMARY KEY, 
    nombre VARCHAR(50) NOT NULL 
);

CREATE TABLE linea(
    id_linea int AUTO_INCREMENT PRIMARY KEY, 
    nombre VARCHAR(50) NOT NULL, 
    marca int,
    FOREIGN KEY (marca) REFERENCES marca(id_marca)
);

CREATE TABLE automovil(
    id_automovil int PRIMARY KEY, 
    tipo_automovil int, 
    cilindraje int,
    color VARCHAR(50) NOT NULL , 
    precio int ,
    linea int , 
    en_venta boolean,
    meses_garantia int , 
    foto Longblob NOT NULL,
    FOREIGN KEY (tipo_automovil) REFERENCES tipoAutomovil(id_tipo),
    FOREIGN KEY (linea) REFERENCES linea(id_linea)
);

CREATE TABLE factura(
    numero_factura int AUTO_INCREMENT PRIMARY KEY, 
    fecha DATETIME NOT NULL, 
    nombre_cliente VARCHAR(50) NOT NULL,
    id_cliente int,
    precio int 
);

CREATE TABLE venta(
    id_venta int AUTO_INCREMENT PRIMARY KEY, 
    numero_factura int , 
    automovil int ,
    FOREIGN KEY (numero_factura) REFERENCES factura(numero_factura),
    FOREIGN KEY (automovil) REFERENCES automovil(id_automovil)
);


