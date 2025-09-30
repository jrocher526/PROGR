# Se solicita al usuario dos numeros
n1 = int(input("Ingresa el primer numero:"))
n2 = int(input("ingresa el segundo numero:")

        
while n2 != 0:
    resto = n1 % n2
    n1 = n2
    n2 = resto
print("El mcd es:", n1)
