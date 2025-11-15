class Empleado:
    def __init__(self, nombre, puesto, salario):
        self.nombre = nombre
        self.puesto = puesto
        self.salario = salario
    
    def __str__(self):
        return f"Empleado: {self.nombre}, Puesto: {self.puesto}, Salario: ${self.salario:.2f}"
    
    def get_nombre(self):
        return self.nombre
    
    def get_puesto(self):
        return self.puesto
    
    def get_salario(self):
        return self.salario
    
    def set_salario(self, nuevo_salario):
        self.salario = nuevo_salario


class Departamento:
    def __init__(self, nombre):
        self.nombre = nombre
        self.empleados = [] 
    
    def agregar_empleado(self, empleado):
        self.empleados.append(empleado)
    
    def mostrar_empleados(self):
        print(f"\n--- Empleados del Departamento {self.nombre} ---")
        if not self.empleados:
            print("No hay empleados en este departamento")
        for empleado in self.empleados:
            print(f"  - {empleado}")
    
    def cambio_salario(self, porcentaje):
        for empleado in self.empleados:
            nuevo_salario = empleado.get_salario() * (1 + porcentaje / 100)
            empleado.set_salario(nuevo_salario)
        print(f"Salarios actualizados en {porcentaje}% para el departamento {self.nombre}")
    
    def tiene_empleado(self, empleado):
        return empleado in self.empleados
    
    def mover_empleados(self, departamento_destino):
        print(f"\n--- Moviendo empleados de {self.nombre} a {departamento_destino.nombre} ---")
        
        for empleado in self.empleados[:]:
            departamento_destino.agregar_empleado(empleado)
            self.empleados.remove(empleado)
            print(f"  - {empleado.get_nombre()} movido")
        
        print("Transferencia completada")
    
    def get_nombre(self):
        return self.nombre


class Proyecto:
    def __init__(self, nombre, presupuesto):
        self.nombre = nombre
        self.presupuesto = presupuesto
        self.empleados_asignados = [] 
    
    def asignar_empleado(self, empleado):
        if empleado not in self.empleados_asignados:
            self.empleados_asignados.append(empleado)
            print(f"Empleado {empleado.get_nombre()} asignado al proyecto {self.nombre}")
        else:
            print(f"Empleado {empleado.get_nombre()} ya está asignado al proyecto")
    
    def mostrar_empleados_proyecto(self):
        print(f"\n--- Empleados en el Proyecto {self.nombre} ---")
        if not self.empleados_asignados:
            print("No hay empleados asignados a este proyecto")
        for empleado in self.empleados_asignados:
            print(f"  - {empleado}")



depto_ventas = Departamento("Ventas")
depto_marketing = Departamento("Marketing")

empleado1 = Empleado("Ana Garcia", "Vendedor Senior", 3000)
empleado2 = Empleado("Carlos Lopez", "Gerente de Ventas", 5000)
empleado3 = Empleado("María Rodriguez", "Especialista en Marketing", 3500)

print("1. COMPOSICION: Empleados agregados a departamentos")
depto_ventas.agregar_empleado(empleado1)
depto_ventas.agregar_empleado(empleado2)
depto_marketing.agregar_empleado(empleado3)

depto_ventas.mostrar_empleados()
depto_marketing.mostrar_empleados()

proyecto_web = Proyecto("Sitio Web Corporativo", 50000)
proyecto_app = Proyecto("App Móvil", 75000)

print("\n2. AGREGACION: Empleados asignados a proyectos")
proyecto_web.asignar_empleado(empleado1)
proyecto_web.asignar_empleado(empleado3)
proyecto_app.asignar_empleado(empleado2)
proyecto_app.asignar_empleado(empleado1)

proyecto_web.mostrar_empleados_proyecto()
proyecto_app.mostrar_empleados_proyecto()

print("\n3. CAMBIO DE SALARIOS")
depto_ventas.cambio_salario(10)

print("\nDespues del aumento salarial:")
proyecto_web.mostrar_empleados_proyecto()
proyecto_app.mostrar_empleados_proyecto()

print("\n4. MOVER EMPLEADOS ENTRE DEPARTAMENTOS")
print("Estado inicial:")
depto_ventas.mostrar_empleados()
depto_marketing.mostrar_empleados()

depto_ventas.mover_empleados(depto_marketing)

print("Estado final:")
depto_ventas.mostrar_empleados()
depto_marketing.mostrar_empleados()

print("\n5. VERIFICAR RELACIONES")
print(f"¿Ana Garcia está en Ventas? {depto_ventas.tiene_empleado(empleado1)}")
print(f"¿Ana Garcia está en Marketing? {depto_marketing.tiene_empleado(empleado1)}")
print(f"¿Ana Garcia trabaja en el proyecto web? {empleado1 in proyecto_web.empleados_asignados}")