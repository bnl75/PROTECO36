/*
  Bernal Sánchez Diego Arturo
  Prebe 12
  Tarea Jueves2
  16/03/18
*/


/* EJERCICIO a*/
SELECT ASIGNATURA_ID, NOMBRE, PLAN_ESTUDIOS_ID, CREDITOS
FROM ASIGNATURA
WHERE PLAN_ESTUDIOS_ID IN (1, 2)
MINUS
SELECT ASIGNATURA_ID, NOMBRE, PLAN_ESTUDIOS_ID, CREDITOS
FROM ASIGNATURA
WHERE CREDITOS >= 9;
/* FIN DEL EJERCICIO a*/


/* EJERCICIO b.1*/
SELECT NOMBRE, APELLIDO_PATERNO, APELLIDO_MATERNO
FROM ESTUDIANTE
WHERE ESTUDIANTE_ID IN 21
UNION
SELECT TO_CHAR(NUM_EXAMEN) AS NUM_EXAMEN, TO_CHAR(CALIFICACION) AS CALIFICACION, TO_CHAR(ASIGNATURA_ID) AS ASIGNATURA_ID
FROM ESTUDIANTE_EXTRAORDINARIO
WHERE ESTUDIANTE_ID IN 21;

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

SELECT ESTUDIANTE.NOMBRE, ESTUDIANTE.APELLIDO_PATERNO, ESTUDIANTE.APELLIDO_MATERNO, ESTUDIANTE_EXTRAORDINARIO.NUM_EXAMEN, ESTUDIANTE_EXTRAORDINARIO.CALIFICACION, ESTUDIANTE_EXTRAORDINARIO.ASIGNATURA_ID
FROM ESTUDIANTE, ESTUDIANTE_EXTRAORDINARIO
WHERE ESTUDIANTE_EXTRAORDINARIO.ESTUDIANTE_ID = 21 AND ESTUDIANTE.ESTUDIANTE_ID = 21;
/* FIN DEL EJERCICIO b.1*/


/* EJERCICIO b.2*/
SELECT DISTINCT ESTUDIANTE.NOMBRE, ESTUDIANTE_INSCRITO.CALIFICACION
FROM ESTUDIANTE, ESTUDIANTE_INSCRITO
WHERE (ESTUDIANTE.NOMBRE = 'JUAN') AND (ESTUDIANTE_INSCRITO.ESTUDIANTE_ID = 1);
/* FIN DEL EJERCICIO b.2*/