/*
  Bernal Sánchez Diego Arturo
  Prebe 12
  Tarea Martes2
  14/03/18
*/


/* EJERCICIO a*/
--Con column constraints:
CREATE TABLE Empleado (
  empleado_id NUMERIC(10,0) NOT NULL
    CONSTRAINT e_empleado_id_pk PRIMARY KEY,
  nombre VARCHAR(40) NOT NULL,
  puesto_id_FK NUMERIC(2,0) NOT NULL
);

--Con table constraint:
CREATE TABLE Empleado (
  empleado_id NUMERIC(10,0) NOT NULL,
  nombre VARCHAR(40) NOT NULL,
  puesto_id_FK NUMERIC(2,0) NOT NULL,
  CONSTRAINT e_empleado_id_pk PRIMARY KEY (empleado_id)
);

--Con column constraints:
CREATE TABLE Puesto (
  puesto_id NUMERIC(2,0) NOT NULL
    CONSTRAINT p_puesto_id_pk PRIMARY KEY,
  nivel CHAR(1) NOT NULL,
  clave VARCHAR(3) NOT NULL,
  sueldo NUMERIC(8,2) NOT NULL
);

--Con table constraint:
CREATE TABLE Puesto (
  puesto_id NUMERIC(2,0) NOT NULL,
  nivel CHAR(1) NOT NULL,
  clave VARCHAR(3) NOT NULL,
  sueldo NUMERIC(8,2) NOT NULL,
  CONSTRAINT p_puesto_id_pk PRIMARY KEY (puesto_id)
);

--Para agregar la FK
ALTER TABLE Empleado ADD CONSTRAINT puesto_id_fk FOREIGN KEY (puesto_id_FK) REFERENCES Puesto(puesto_id);
/* FIN DEL EJERCICIO a*/


/* EJERCICIO b*/
ALTER TABLE Empleado RENAME TO Empleado_TC;
ALTER TABLE Puesto RENAME TO Puesto_TC;

ALTER TABLE Empleado_TC RENAME CONSTRAINT e_empleado_id_pk TO e_empleado_id_pk_renombrado;
ALTER TABLE Puesto_TC RENAME CONSTRAINT p_puesto_id_pk TO p_puesto_id_pk_renombrado;
/* FIN DEL EJERCICIO b*/

/* EJERCICIO c*/
CREATE TABLE Pensionada (
  pensionada_id NUMERIC(10,0) NOT NULL
    CONSTRAINT p_pens_id_pk PRIMARY KEY,
  Nombre VARCHAR(40) NOT NULL
);

CREATE TABLE Pensionada_empleado_tc (
  pensionada_id_FK  NUMERIC(10,0) NOT NULL,
  empleado_id_FK NUMERIC(10,0) NOT NULL,
  Porcentaje NUMERIC(5,2) NOT NULL,
  CONSTRAINT pe_pens_emple__pk PRIMARY KEY (pensionada_id_FK, empleado_id_FK)   --Se tiene que crear una PK compuesta ya que está formada por varios campos.
);

--Para crear las FK's
ALTER TABLE Pensionada_empleado_tc ADD CONSTRAINT pe_pensio_id_FK FOREIGN KEY (pensionada_id_FK) REFERENCES Pensionada(pensionada_id);
ALTER TABLE Pensionada_empleado_tc ADD CONSTRAINT pe_emple_id_FK FOREIGN KEY (empleado_id_FK) REFERENCES Empleado_TC(empleado_id);
/* FIN DEL EJERCICIO c*/


/* EJERCICIO d*/
CREATE SEQUENCE MY_SEQ
INCREMENT BY 10
START WITH 100
MAXVALUE 200
MINVALUE 50
CYCLE
CACHE 5;
/* FIN DEL EJERCICIO d*/
