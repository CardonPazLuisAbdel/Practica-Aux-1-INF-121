class Nadador:
    def __init__(self, estilo_natacion: str):
        self.estilo_natacion = estilo_natacion
    
    def nadar(self):
        print(f"Nadando estilo {self.estilo_natacion}")

class Ciclista:
    def __init__(self, tipo_bicicleta: str):
        self.tipo_bicicleta = tipo_bicicleta
    
    def pedalear(self):
        print(f"Pedaleando en bicicleta tipo {self.tipo_bicicleta}")

class Corredor:
    def __init__(self, distancia_preferida: float):
        self.distancia_preferida = distancia_preferida
    
    def correr(self):
        print(f"Corriendo una distancia de {self.distancia_preferida} km")

class Triatleta(Nadador, Ciclista, Corredor):
    def __init__(self, nombre: str, edad: int, estilo_natacion: str, tipo_bicicleta: str, distancia_preferida: float):
        Nadador.__init__(self, estilo_natacion)
        Ciclista.__init__(self, tipo_bicicleta)
        Corredor.__init__(self, distancia_preferida)
        
        self.nombre = nombre
        self.edad = edad
    
    def mostrar_acciones(self):
        print(f"\n=== ACCIONES DEL TRIATLETA {self.nombre.upper()} ===")
        self.nadar()
        self.pedalear()
        self.correr()
    
    def get_nombre(self) -> str:
        return self.nombre
    
    def get_edad(self) -> int:
        return self.edad
    
    def mostrar_info_completa(self):
        print(f"\n*** INFORMACIÓN DEL TRIATLETA ***")
        print(f"Nombre: {self.nombre}")
        print(f"Edad: {self.edad} años")
        print(f"Estilo de natacion: {self.estilo_natacion}")
        print(f"Tipo de bicicleta: {self.tipo_bicicleta}")
        print(f"Distancia preferida en carrera: {self.distancia_preferida} km")


triatleta1 = Triatleta(
    nombre="Carlos Rodríguez",
    edad=28,
    estilo_natacion="crol",
    tipo_bicicleta="carretera",
    distancia_preferida=10.0
)

triatleta1.mostrar_info_completa()
triatleta1.mostrar_acciones()
print("\n" + "="*50)

triatleta2 = Triatleta(
    nombre="Ana Martinez",
    edad=25,
    estilo_natacion="mariposa",
    tipo_bicicleta="montaña",
    distancia_preferida=5.0
)
    
triatleta2.mostrar_info_completa()
triatleta2.mostrar_acciones()
print("\n" + "="*50)
print("=== DEMOSTRACION DE HERENCIA MULTIPLE ===")
print(f"¿Triatleta es Nadador? {isinstance(triatleta1, Nadador)}")
print(f"¿Triatleta es Ciclista? {isinstance(triatleta1, Ciclista)}")
print(f"¿Triatleta es Corredor? {isinstance(triatleta1, Corredor)}")
print(f"\nMRO de Triatleta:")
for i, clase in enumerate(Triatleta.__mro__, 1):
    print(f"  {i}. {clase.__name__}")

print("\n--- Metodos individuales ---")
print("Solo nadar:")
triatleta1.nadar()
print("\nSolo pedalear:")
triatleta1.pedalear()
print("\nSolo correr:")
triatleta1.correr()