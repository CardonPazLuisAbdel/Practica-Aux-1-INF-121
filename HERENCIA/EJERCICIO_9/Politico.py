class Politico:
    def __init__(self, profesion: str, años_exp: int):
        self.profesion = profesion
        self.años_exp = años_exp
    
    def mostrar_politico(self):
        print(f"Profesión: {self.profesion} | Años Exp: {self.años_exp}")
    
    def get_profesion(self) -> str:
        return self.profesion
    
    def get_años_exp(self) -> int:
        return self.años_exp
class Partido:
    def __init__(self, nombre_p: str, rol: str):
        self.nombre_p = nombre_p
        self.rol = rol
    
    def mostrar_partido(self):
        print(f"Partido: {self.nombre_p} | Rol: {self.rol}")
    
    def get_nombre_p(self) -> str:
        return self.nombre_p
    
    def get_rol(self) -> str:
        return self.rol

class Presidente(Politico, Partido):
    def __init__(self, nombre: str, apellido: str, profesion: str = "Político", años_exp: int = 0, nombre_p: str = "Sin partido", rol: str = "Candidato"):
        Politico.__init__(self, profesion, años_exp)
        Partido.__init__(self, nombre_p, rol)
        self.nombre = nombre
        self.apellido = apellido
    
    def mostrar(self):
        print(f"Presidente: {self.nombre} {self.apellido}")
        self.mostrar_politico()
        self.mostrar_partido()

    def es_presidente(self, nombre_buscado: str) -> bool:
        return self.nombre.lower() == nombre_buscado.lower()
    
    def get_nombre(self) -> str:
        return self.nombre
    
    def get_apellido(self) -> str:
        return self.apellido
    
    def get_partido_politico(self) -> str:
        return self.get_nombre_p()
    
    def get_profesion_presidente(self) -> str:
        return self.get_profesion()


presidente1 = Presidente("Juan", "Perez", "Abogado", 15, "Partido Liberal", "Líder")
presidente2 = Presidente("Maria", "Gonzalez")
presidentes = [
    presidente1,
    presidente2,
    Presidente("Carlos", "Lopez", "Economista", 20, "Partido Conservador", "Fundador"),
    Presidente("Ana", "Martinez", "Ingeniera", 10, "Partido Verde", "Coordinadora")
]

print("=== LISTA DE PRESIDENTES ===")
for i, presidente in enumerate(presidentes, 1):
    print(f"\nPresidente {i}:")
    presidente.mostrar()

print("\n=== BUSQUEDA DE PRESIDENTE ===")
nombre_buscado = "Carlos"
encontrado = False
for presidente in presidentes:
    if presidente.es_presidente(nombre_buscado):
        print("Presidente encontrado:")
        print(f"Nombre: {presidente.get_nombre()} {presidente.get_apellido()}")
        print(f"Partido Politico: {presidente.get_partido_politico()}")
        print(f"Profesion: {presidente.get_profesion_presidente()}")
        encontrado = True
        break
if not encontrado:
    print(f"Presidente con nombre '{nombre_buscado}' no encontrado.")
    print("\n=== DEMOSTRACIÓN DE HERENCIA MULTIPLE ===")
    print("Metodos heredados de Politico:")
    print(f"Profesion: {presidentes[0].get_profesion()}")
    print(f"Anios experiencia: {presidentes[0].get_años_exp()}")

