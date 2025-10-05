class Videojuego:
    def __init__(self, nombre=None, plataforma=None, cantidad_jugadores=None):
        if nombre is None and plataforma is None and cantidad_jugadores is None:
            self.nombre = "Sin nombre"
            self.plataforma = "PC"
            self.cantidad_jugadores = 1
        elif plataforma is None and cantidad_jugadores is None:
            self.nombre = nombre
            self.plataforma = "Multiplataforma"
            self.cantidad_jugadores = 1
        else:
            self.nombre = nombre
            self.plataforma = plataforma
            self.cantidad_jugadores = cantidad_jugadores

    def get_nombre(self):
        return self.nombre

    def set_nombre(self, nombre):
        self.nombre = nombre

    def get_plataforma(self):
        return self.plataforma

    def set_plataforma(self, plataforma):
        self.plataforma = plataforma

    def get_cantidad_jugadores(self):
        return self.cantidad_jugadores

    def set_cantidad_jugadores(self, cantidad):
        self.cantidad_jugadores = cantidad

    def agregar_jugador(self):
        self.cantidad_jugadores += 1
        print(f"Se agregó 1 jugador. Total: {self.cantidad_jugadores}")

    def agregar_jugadores(self, cantidad=None):
        if cantidad is None:
            try:
                cantidad = int(input("Ingrese la cantidad de jugadores a agregar: "))
            except Exception:
                print("Error: Debe ingresar un número válido")
                return
        if cantidad > 0:
            self.cantidad_jugadores += cantidad
            print(f"Se agregaron {cantidad} jugadores. Total: {self.cantidad_jugadores}")
        else:
            print("La cantidad debe ser mayor a 0")

    def mostrar_info(self, formato_corto=False):
        if formato_corto:
            print(f"{self.nombre} | {self.plataforma} | {self.cantidad_jugadores} jugadores")
        else:
            print("=== INFORMACION DEL VIDEOJUEGO ===")
            print(f"Nombre: {self.nombre}")
            print(f"Plataforma: {self.plataforma}")
            print(f"Cantidad de Jugadores: {self.cantidad_jugadores}")
            print("-----------------------------")


print("== INSTANCIACION DE VIDEOJUEGOS == ")
juego1 = Videojuego()
juego1.set_nombre("Minecraft")
juego1.set_plataforma("PC/Consolas/Móvil")
juego1.set_cantidad_jugadores(4)

juego2 = Videojuego("Fornite")
juego2.set_plataforma("PC/PS/Xbox/Switch")
juego2.set_cantidad_jugadores(100)

juego3 = Videojuego("League of Legends", "PC", 10)

print("\nINFORMACIÓN INICIAL DE LOS VIDEOJUEGOS:")
juego1.mostrar_info()
juego2.mostrar_info()
juego3.mostrar_info()

print("\nSOBRECARGA")
print(f"\n--- PROBANDO CON {juego1.get_nombre()} ---")
print(f"Estado inicial: {juego1.get_cantidad_jugadores()} jugadores")
print("\n1. agregar_jugador() - sin parámetros:")
juego1.agregar_jugador()
print("\n2. agregar_jugadores() - con entrada por teclado:")
juego1.agregar_jugadores()
print("\n3. agregar_jugadores(3) - con parámetro:")
juego1.agregar_jugadores(3)
print(f"\nEstado final de {juego1.get_nombre()}: {juego1.get_cantidad_jugadores()} jugadores")

print(f"\n--- PROBANDO CON {juego2.get_nombre()} ---")
print(f"Estado inicial: {juego2.get_cantidad_jugadores()} jugadores")
juego2.agregar_jugador()
juego2.agregar_jugadores(5)
juego2.agregar_jugador()
print(f"Estado final de {juego2.get_nombre()}: {juego2.get_cantidad_jugadores()} jugadores")

print(f"\n--- PROBANDO CON {juego3.get_nombre()} ---")
print(f"Estado inicial: {juego3.get_cantidad_jugadores()} jugadores")
print("\nProbando con cantidad negativa:")
juego3.agregar_jugadores(-5)
print("\nProbando con cantidad cero:")
juego3.agregar_jugadores(0)
juego3.agregar_jugadores(2)
print(f"Estado final de {juego3.get_nombre()}: {juego3.get_cantidad_jugadores()} jugadores")

biblioteca = [juego1, juego2, juego3]
print("\nBIBLIOTECA DE VIDEOJUEGOS (formato corto):")
for juego in biblioteca:
    juego.mostrar_info(True)

print("\n--- SIMULACION DE SISTEMA DE JUEGO ---")
def simular_sistema_juego(juegos):
    print("Iniciando sesiones de juego...")
    for i, juego in enumerate(juegos):
        print(f"\n--- Sesión {i+1}: {juego.get_nombre()} ---")
        if i == 0:
            juego.agregar_jugador()
        elif i == 1:
            juego.agregar_jugadores(3)
        else:
            print(f"Configurando jugadores para {juego.get_nombre()}:")
            juego.agregar_jugadores()
            juego.mostrar_info(True)
print("\n--- RESUMEN FINAL ---")
for juego in biblioteca:
    print(f"{juego.get_nombre()}: {juego.get_cantidad_jugadores()} jugadores activos")
    simular_sistema_juego(biblioteca)
