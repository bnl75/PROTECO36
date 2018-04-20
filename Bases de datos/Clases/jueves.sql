--Ejercico del rango de la fecha de nacimiento hecho con algebra relacional
SELECT NOMBRE, RFC, FECHA_NACIMIENTO
FROM PROFESOR
WHERE FECHA_NACIMIENTO >= TO_DATE('1950/01/01', 'yyyy/mm/dd')
INTERSECT
SELECT NOMBRE, RFC, FECHA_NACIMIENTO
FROM PROFESOR
WHERE FECHA_NACIMIENTO <= TO_DATE('1955/01/01', 'yyyy/mm/dd')
UNION
SELECT NOMBRE, RFC, FECHA_NACIMIENTO
FROM PROFESOR
WHERE FECHA_NACIMIENTO >= TO_DATE('1960/01/01', 'yyyy/mm/dd')
INTERSECT
SELECT NOMBRE, RFC, FECHA_NACIMIENTO
FROM PROFESOR
WHERE FECHA_NACIMIENTO <= TO_DATE('1965/01/01', 'yyyy/mm/dd')
ORDER BY FECHA_NACIMIENTO;

--Ejercico que nos dio neto para el sorteo del profesor
SELECT * FROM PROFESOR
WHERE (FECHA_NACIMIENTO > TO_DATE('1970', 'YYYY'))
INTERSECT
SELECT * FROM PROFESOR
WHERE NOMBRE IN ('LUISA', 'JUAN', 'LENIN')
INTERSECT
SELECT * FROM PROFESOR
WHERE APELLIDO_PATERNO LIKE '%R%';


--Ejercicio de los grupos eliminados
SELECT CURSO_ID, CLAVE_GRUPO
FROM CURSO
WHERE CUPO_MAXIMO = 30
MINUS
SELECT CURSO_ID, CLAVE_GRUPO
FROM CURSO
WHERE CLAVE_GRUPO = 001;
