
class Bus:
    pasaje = 1.50

    def __init__(self, capacidad):
        self.capacidad = capacidad
        self.pasajeros = 0
        self.ganancia = 0.0

    def subir_pasajeros(self, cantidad):
        if cantidad <= 0:
            print("No subio ningun pasajero.")
            return
        elif cantidad + self.pasajeros > self.capacidad:
            print("No hay espacio suficiente en el bus.")
            return
        else:
            self.pasajeros += cantidad
            print(f"Subieron: {cantidad} pasajeros")

    def cobrar_pasaje(self):
        total = self.pasajeros * Bus.pasaje
        self.ganancia += total
        return self.ganancia

    def asientos_disponibles(self):
        return self.capacidad - self.pasajeros

    def __str__(self):
        return f"Capacidad: {self.capacidad}, Pasajeros: {self.pasajeros}, Ganancia: {self.ganancia} Bs"



bus = Bus(50)
print("prueba 1")
bus.subir_pasajeros(17)
print("Asientos disponibles:", bus.asientos_disponibles())
print("Ganancia total:", bus.cobrar_pasaje(), "Bs")
print(str(bus) + "\n")
print("prueba 2")
bus.subir_pasajeros(52)


