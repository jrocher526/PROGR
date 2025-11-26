import re

def validacion(codigo):
    # paton a usar seria:
    #2 mayus, guion, 2 minus, 3 digitos
    
    patron = r"^[A-Z]{2}-[a-z]{2}\d{3}$"
    return bool(re.match(patron, codigo))

prueba = ["AB-xy123", "A B-xy123", "ZX-aBc555", "XY-ab99"]

# recorremos el array prueba y lo imprimimos con su cadena y su validacion
for cadena in prueba:
    print(f"{cadena} es: {validacion(cadena)}")
