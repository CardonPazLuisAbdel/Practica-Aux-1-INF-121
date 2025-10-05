class Animal:
    def __init__(self, nombre, edad):
        self.nombre = nombre
        self.edad = edad

    def desplazarse(self):
        print(f"{self.nombre} se esta desplazando")

    def get_nombre(self):
        return self.nombre

    def get_edad(self):
        return self.edad

class Leon(Animal):
    def desplazarse(self):
        print(f"{self.get_nombre()} el leon esta caminando ")

class Pinguino(Animal):
    def desplazarse(self):
        print(f"{self.get_nombre()} el pinguino esta nadando ")

class Canguro(Animal):
    def desplazarse(self):
        print(f"{self.get_nombre()} el canguro esta saltando ")


animales = [
    Leon("Simba", 5),
    Pinguino("Pingu", 3),
    Canguro("Saltarin", 4),
    Leon("Mufasa", 8)
]

print("=== DESPLAZAMIENTO DE ANIMALES ===")
for animal in animales:
    animal.desplazarse()

print("\n=== INFORMACION DE LOS ANIMALES ===")
for animal in animales:
    print(f"{animal.get_nombre()} - {animal.get_edad()} anios")

