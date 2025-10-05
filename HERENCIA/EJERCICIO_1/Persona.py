class Persona:
    def __init__(self, nombre, apellido, ci):
        self.nombre = nombre
        self.apellido = apellido
        self.ci = ci

    def mostrar_datos(self):
        print(f"CI: {self.ci} | Nombre: {self.nombre} {self.apellido}")

    def get_nombre(self):
        return self.nombre

    def get_apellido(self):
        return self.apellido


    def get_ci(self):
        return self.ci


class Cliente(Persona):
    def __init__(self, nombre, apellido, ci, nro_compra, id_cliente):
        super().__init__(nombre, apellido, ci)
        self.nro_compra = nro_compra
        self.id_cliente = id_cliente

    def mostrar_datos(self):
        super().mostrar_datos()
        print(f"ID Cliente: {self.id_cliente} | Nro Compra: {self.nro_compra}")

    def get_nro_compra(self):
        return self.nro_compra

    def get_id_cliente(self):
        return self.id_cliente


class Jefe(Persona):
    def __init__(self, nombre, apellido, ci, sucursal, tipo):
        super().__init__(nombre, apellido, ci)
        self.sucursal = sucursal
        self.tipo = tipo

    def mostrar_datos(self):
        super().mostrar_datos()
        print(f"Sucursal: {self.sucursal} | Tipo: {self.tipo}")

    def get_sucursal(self):
        return self.sucursal

    def get_tipo(self):
        return self.tipo



cliente = Cliente("Juan", "Perez", "1234567", "COMP001", "CLI001")
jefe = Jefe("Maria", "Gomez", "7654321", "Centro", "Gerente")

print("=== DATOS DEL CLIENTE ===")
cliente.mostrar_datos()

print("\n=== DATOS DEL JEFE ===")
jefe.mostrar_datos()

print("\n=== ERRORES EN EL DIAGRAMA ORIGINAL ===")
print("1. FALTA HERENCIA: No hay relacion de herencia entre las clases")
print("2. DUPLICACION DE ATRIBUTOS:")
print("   - 'nombre' aparece en Persona y Cliente")
print("   - 'ci' aparece en Persona y Jefe")
print("3. NOMBRES INCORRECTOS:")
print("   - Clases en minuscula (deben ser PascalCase)")
print("   - Metodo generico 'method(type): type' sin proposito claro")
print("4. FALTAN CONSTRUCTORES: No se especifican constructores")
print("5. FALTAN METODOS ESPECIFICOS: No hay metodos utiles")

print("\n=== CoMO EVITAR ESTOS ERRORES ===")
print("1. ESTABLECER HERENCIA: Usar flechas de herencia cuando hay relacion 'es-un'")
print("2. EVITAR DUPLICACION: Los atributos comunes van en la clase base")
print("3. USAR CONVENCIONES:")
print("   - Clases en PascalCase: Persona, Cliente, Jefe")
print("   - Metodos con nombres descriptivos")
print("4. INCLUIR CONSTRUCTORES: Especificar constructores con parametros")
print("5. DEFINIR METODOS RELEVANTES: Metodos que representen comportamientos reales")
print("6. USAR super(): Llamar al constructor de la clase base en subclases")
print("7. SOBRESCRIBIR METODOS: Usar override para personalizar comportamientos")

