Algoritmo CalcularMediaYEstado
	
    Definir cal1, cal2, cal3, media Como Real
	
    Escribir "Ingrese la primera calificaci�n:"
    Leer cal1
	
    Escribir "Ingrese la segunda calificaci�n:"
    Leer cal2
	
    Escribir "Ingrese la tercera calificaci�n:"
    Leer cal3
	
    media = (cal1 + cal2 + cal3) / 3
	
    Escribir "La media es: ", media
	
    Si media >= 5 Entonces
        Escribir "El alumno est� aprobado."
    Sino
        Escribir "El alumno no est� aprobado."
    FinSi
	
FinAlgoritmo
