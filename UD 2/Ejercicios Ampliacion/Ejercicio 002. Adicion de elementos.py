tareas = ["Comprar leche", "Llamar al médico"]
print("Lista de tareas:", tareas)

#Añadimos
tareas.append("Estudiar Python")

#Insertamos
tareas.insert(0,"Revisar Email")

#Extendemos
subTareas = ["Pagar factura", "Enviar informe"]
tareas.extend(subTareas)

print("\nTareas modificadas:", tareas)