-- SQL para que no este completamente vacia cuando se inicia
-- Clientes
INSERT INTO cliente (nombre, apellido, empresa, puesto, direccion, codigo_postal, provincia, telefono, fecha_nac) VALUES ('Juan', 'Pérez', 'TechCorp', 'Desarrollador', 'Calle Falsa 123', 28001, 'Madrid', 912345678, '1990-05-15');
INSERT INTO cliente (nombre, apellido, empresa, puesto, direccion, codigo_postal, provincia, telefono, fecha_nac) VALUES ('Ana', 'Gómez', 'Innovatech', 'Gerente', 'Avenida Real 456', 08001, 'Barcelona', 934567890, '1985-08-22');
INSERT INTO cliente (nombre, apellido, empresa, puesto, direccion, codigo_postal, provincia, telefono, fecha_nac) VALUES ('Luis', 'Martínez', 'SoftWorks', 'Analista', 'Plaza Mayor 789', 41001, 'Sevilla', 955432109, '1992-11-30');
INSERT INTO cliente (nombre, apellido, empresa, puesto, direccion, codigo_postal, provincia, telefono, fecha_nac) VALUES ('Marta', 'López', 'DataSoft', 'Diseñadora', 'Calle Nueva 321', 46001, 'Valencia', 963210987, '1988-03-10');
INSERT INTO cliente (nombre, apellido, empresa, puesto, direccion, codigo_postal, provincia, telefono, fecha_nac) VALUES ('Carlos', 'Sánchez', 'WebSolutions', 'Consultor', 'Paseo del Prado 654', 28002, 'Madrid', 917654321, '1995-07-25');

-- Articulos
INSERT INTO articulo (nombre, descripcion, unidad_precio, unidad_stock, tipo, proveedor, fecha) VALUES('Laptop', 'Laptop de alta gama', 1200.00, 10, 'Electrónica', 'TechCorp', '2025-01-01');
INSERT INTO articulo (nombre, descripcion, unidad_precio, unidad_stock, tipo, proveedor, fecha) VALUES('Smartphone', 'Teléfono inteligente', 800.00, 20, 'Electrónica', 'MobileWorld', '2025-01-02');
INSERT INTO articulo (nombre, descripcion, unidad_precio, unidad_stock, tipo, proveedor, fecha) VALUES('Tablet', 'Tablet de 10 pulgadas', 500.00, 15, 'Electrónica', 'TechCorp', '2025-01-03');
INSERT INTO articulo (nombre, descripcion, unidad_precio, unidad_stock, tipo, proveedor, fecha) VALUES('Monitor', 'Monitor 24 pulgadas', 300.00, 5, 'Electrónica', 'ScreenTech', '2025-01-04');
INSERT INTO articulo (nombre, descripcion, unidad_precio, unidad_stock, tipo, proveedor, fecha) VALUES('Teclado', 'Teclado mecánico', 100.00, 30, 'Accesorio', 'KeyMaster', '2025-01-05');

-- Compras
INSERT INTO compra (cliente_id, articulo_id, fecha, cantidad, total, iva, total_iva) VALUES (1, 1, '2025-02-25', 1, 1200.00, 240.00, 1440.00);
INSERT INTO compra (cliente_id, articulo_id, fecha, cantidad, total, iva, total_iva) VALUES (2, 2, '2025-02-26', 2, 1600.00, 320.00, 1920.00);