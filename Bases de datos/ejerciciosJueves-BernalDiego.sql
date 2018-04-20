/*
  Bernal Sánchez Diego Arturo
  Prebe 12
  Tarea Miércoles2
  15/03/18
*/


/* EJERCICIO a*/
SELECT * FROM PLAN_ESTUDIOS WHERE PLAN_ESTUDIOS_ID = 3;
/* FIN DEL EJERCICIO a*/


/* EJERCICIO b*/
SELECT TO_DATE('31/12/2018', 'dd/mm/yyyy') - SYSDATE dias_restantes FROM DUAL;
/* FIN DEL EJERCICIO b*/


/* EJERCICIO c*/
  /*
    DESC DUAL;
    Muestra la estructura de la tabla DUAL:
    tiene una sola columna llamada "DUMMY" de tipo VARCHAR2 de longitiud 1: DUMMY VARCHAR2(1).

    SELECT * FROM DUAL;
    Muestra la columna DUMMY y el valor que tiene registrado: 'X'.

    SELECT 1+1 FROM DUAL;
    En la parte de arriba muestra la operación '1+1' y abajo su resultado (2).

    SELECT 1+1 FROM ESTUDIANTE;
    Muestra la operación pero se repite tan veces como tuplas tenga la tabla ESTUDIANTE;
    en este caso mostró tres veces '1+1' y veintidós veces el numero '2' como resultado
    de la operación... La tabla ESTUDIANTE tiene 23 tuplas.

    SELECT lower(DUMMY) FROM DUAL;
    Muestra en la parte de arriba 'L' y en la parte de abajo el valor de la columna 'x'.
    No entiendo bien qué es lo que pasa al ejecutar esta sentencia ya que busqué para
    qué sirve la función lower y es para mostrar una cadena en minúsculas...Pero solo
    muestra una 'L', en mayúscula.
  */
/* FIN DEL EJERCICIO c*/


/* EJERCICIO d*/
SELECT DISTINCT NOMBRE, RFC, FECHA_NACIMIENTO
FROM PROFESOR
WHERE FECHA_NACIMIENTO
BETWEEN TO_DATE('1950/01/01', 'yyyy/mm/dd') AND TO_DATE('1955/01/01', 'YYYY/MM/DD')
ORDER BY FECHA_NACIMIENTO;


SELECT DISTINCT NOMBRE, RFC, FECHA_NACIMIENTO
FROM PROFESOR
WHERE FECHA_NACIMIENTO
BETWEEN TO_DATE('1960/01/01', 'yyyy/mm/dd') AND TO_DATE('1965/01/01', 'YYYY/MM/DD')
ORDER BY FECHA_NACIMIENTO;
/* FIN DEL EJERCICIO d*/
