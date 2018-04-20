/*
  Bernal Sánchez Diego Arturo
  Prebe 12
  Tarea Lunes2
  13/03/18
*/


/* EJERCICIO a*/
CREATE TABLE calculo_sueldo (
  fecha_calculo DATE NOT NULL,
  sueldo_mensual NUMERIC(10,2) NOT NULL,
  sueldo_quincenal NUMERIC(10,2) NOT NULL,
  iva AS ( sueldo_mensual * 0.16) VIRTUAL NOT NULL
);
--INSERT INTO calculo_sueldo (fecha_calculo, sueldo_mensual) VALUES (TO_DATE('13/03/2018 00:55:00', 'dd/mm/yyyy hh24:mi:ss'), 54260.00);
/* FIN DEL EJERCICIO a*/


/* EJERCICIO b*/
/*¿Qué se observa?
  Si ponemos todos los atributos con sus respectivos valores al insertar,
  no nos genera errores y crea la fila.
  Si nos hace falta algún atributo o valor, no nos dejará insertar la
  fila ya que no puede haber valores nulos (en este caso no puse
  sueldo_mensual).*/
/* FIN DEL EJERCICIO b*/


/* EJERCICIO c*/
CREATE TABLE incidencia (
  descripcion VARCHAR(40) NOT NULL,
  fecha_registro DATE DEFAULT SYSDATE NOT NULL,  --¿Lleva NOT NULL si ya tiene DEFAULT?
  tipo CHAR(1) DEFAULT 'N' NOT NULL,
  descuento NUMERIC(5,2) DEFAULT 5.5 NOT NULL
);
/* FIN DEL EJERCICIO c*/


/* EJERCICIO d*/
INSERT INTO incidencia (descripcion, fecha_registro, tipo, descuento) VALUES ('Material defectuoso', TO_DATE('19/08/2002 15:38:00', 'dd/mm/yyyy hh24:mi:ss'), 'B', 17.00);
INSERT INTO incidencia (descripcion) VALUES ('Duplicado');
/* FIN DEL EJERCICIO d*/


/* EJERCICIO e*/
/*¿Qué se observa?
  Podemos ver que cuando insertamos valores en todos los atributos
  se hace la asignación de forma correcta, es decir, se crea la fila
  con todos los valores que le dimos y no marca error.

  En el segundo INSERT solo puse el atributo "descripcion" y su valor,
  omitiendo el resto de atributos. De igual forma se creó la fila de
  forma exitosa pero ahora se pusieron los valores DEFAULT en el resto
  de columnas.*/
/* FIN DEL EJERCICIO e*/


/* EJERCICIO f*/
CREATE TABLE puesto (
  puesto_id NUMERIC(2,0) NOT NULL
    CONSTRAINT puesto_pk PRIMARY KEY,
  nivel CHAR(1) NOT NULL
    CONSTRAINT p_nivel_chk CHECK (
      nivel IN ('a', 'b', 'c')),
  clave VARCHAR(3) NOT NULL
    CONSTRAINT p_clave_uk UNIQUE,
  sueldo NUMERIC(8,2) NOT NULL
    CONSTRAINT p_sueldo_chk CHECK (
      sueldo <= 100000)
);

----------------------------------------

/*CREATE TABLE puesto_constraint NOT NULL (
  puesto_id NUMERIC(2,0)
    CONSTRAINT puesto_pk PRIMARY KEY,
  nivel CHAR(1)
    CONSTRAINT p_nivel_chk CHECK (
      nivel IN ('a', 'b', 'c')),
  clave VARCHAR(3)
    CONSTRAINT p_clave_uk UNIQUE,
  sueldo NUMERIC(8,2)
    CONSTRAINT p_sueldo_chk CHECK (
      sueldo <= 100000)
);*/
          --Pensé que se podía poner un constraint a nivel
          --de tabla para no estar poniendo de uno por uno
          --si es que todas las columnas deben llevar esa
          --restricción (en este caso NOT NULL) pero solo
          --encuentro referencias de CONSTRAINTS a nivel
          --de columna.

--INSERT INTO puesto (puesto_id, nivel, clave, sueldo) VALUES (1, 'd', 'G40', 25000);
--INSERT INTO puesto (puesto_id, nivel, clave, sueldo) VALUES (45, 'a', 'G40', 90000);
--INSERT INTO puesto (puesto_id, nivel, clave, sueldo) VALUES (87, 'c', 'A90', 250000);
--INSERT INTO puesto (puesto_id, nivel, clave, sueldo) VALUES (7, 'b', 'S70', 70000);
--INSERT INTO puesto (puesto_id, nivel, clave, sueldo) VALUES (7, 'a', 'K95', 15000);
/* FIN DEL EJERCICIO f*/


/* Ejercicio que nos dejó Julio*/
CREATE TABLE concepto_pago (
  concepto_id NUMERIC(10, 0)
    CONSTRAINT concepto_pago_pk PRIMARY KEY,
  tipo_concepto CHAR(1) NOT NULL
    CONSTRAINT cp_tipo_concepto_chk CHECK (
      tipo_concepto IN ('A', 'B', 'C')),
  clave VARCHAR(3) NOT NULL
    CONSTRAINT cp_clave_uk UNIQUE,
  descripcion VARCHAR(255),
  importe NUMERIC(8, 2) NOT NULL
);
/* Fin del ejercicio que nos dejó Julio*/
