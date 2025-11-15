class ExcepcionProductoNoEncontrado(Exception):
    def __init__(self, mensaje):
        super().__init__(mensaje)
        self.mensaje = mensaje
    
    def get_mensaje(self):
        return self.mensaje


class ExcepcionStockInsuficiente(Exception):
    def __init__(self, mensaje):
        super().__init__(mensaje)
        self.mensaje = mensaje
    
    def get_mensaje(self):
        return self.mensaje


class Producto:
    def __init__(self, codigo, nombre, precio, stock):
        self.codigo = codigo
        self.nombre = nombre
        self.precio = precio
        self.stock = stock
    
    def __str__(self):
        return f"Producto[{self.codigo}]: {self.nombre}, Precio: ${self.precio:.2f}, Stock: {self.stock}"
    
    def get_codigo(self):
        return self.codigo
    
    def get_nombre(self):
        return self.nombre
    
    def get_precio(self):
        return self.precio
    
    def get_stock(self):
        return self.stock
    
    def set_stock(self, nuevo_stock):
        self.stock = nuevo_stock


class Inventario:
    def __init__(self):
        self.productos = []
    
    def agregar_producto(self, producto):
        for prod in self.productos:
            if prod.get_codigo() == producto.get_codigo():
                raise ValueError(f"Error: El codigo '{producto.get_codigo()}' ya existe")
        
        if producto.get_precio() < 0:
            raise ValueError("Error: El precio no puede ser negativo")
        
        if producto.get_stock() < 0:
            raise ValueError("Error: El stock no puede ser negativo")
        
        self.productos.append(producto)
        print(f" Producto '{producto.get_nombre()}' agregado exitosamente")
    
    def buscar_producto(self, codigo):
        for producto in self.productos:
            if producto.get_codigo() == codigo:
                return producto
        raise ExcepcionProductoNoEncontrado(f"Producto con codigo '{codigo}' no encontrado")
    
    def vender_producto(self, codigo, cantidad):
        producto = self.buscar_producto(codigo)
        
        if producto.get_stock() < cantidad:
            raise ExcepcionStockInsuficiente(
                f"Stock insuficiente para '{producto.get_nombre()}'. "
                f"Stock actual: {producto.get_stock()}, Solicitado: {cantidad}"
            )
        
        producto.set_stock(producto.get_stock() - cantidad)
        print(f" Venta exitosa: {cantidad} unidades de '{producto.get_nombre()}'")
    
    def mostrar_productos(self):
        print("\n--- INVENTARIO ACTUAL ---")
        if not self.productos:
            print("No hay productos en el inventario")
        for producto in self.productos:
            print(f"  - {producto}")


# MAIN Ejercicio 4
print("\n\n=== SISTEMA DE INVENTARIO CON EXCEPCIONES ===")

inventario = Inventario()

print("\n1. AGREGAR PRODUCTOS EXITOSAMENTE:")
try:
    inventario.agregar_producto(Producto("P001", "Laptop", 1500.0, 10))
    inventario.agregar_producto(Producto("P002", "Mouse", 25.0, 50))
    inventario.agregar_producto(Producto("P003", "Teclado", 45.0, 30))
except ValueError as e:
    print(f"Error al agregar: {e}")

inventario.mostrar_productos()

print("\n2. INTENTAR AGREGAR PRODUCTOS CON ERRORES:")
try:
    inventario.agregar_producto(Producto("P001", "Tablet", 300.0, 5))
except ValueError as e:
    print(f"Error: {e}")

try:
    inventario.agregar_producto(Producto("P004", "Auriculares", -50.0, 10))
except ValueError as e:
    print(f"Error: {e}")

try:
    inventario.agregar_producto(Producto("P005", "Monitor", 200.0, -5))
except ValueError as e:
    print(f"Error: {e}")

print("\n3. VENTAS EXITOSAS:")
try:
    inventario.vender_producto("P001", 2)
    inventario.vender_producto("P002", 5)
except (ExcepcionProductoNoEncontrado, ExcepcionStockInsuficiente) as e:
    print(f"Error en venta: {e}")

inventario.mostrar_productos()

print("\n4. INTENTAR VENTAS CON ERRORES:")
try:
    inventario.vender_producto("P999", 1)
except ExcepcionProductoNoEncontrado as e:
    print(f"Error: {e.get_mensaje()}")

try:
    inventario.vender_producto("P001", 20)
except ExcepcionStockInsuficiente as e:
    print(f"Error: {e.get_mensaje()}")

print("\n5. BUSQUEDA DE PRODUCTOS:")
try:
    producto_encontrado = inventario.buscar_producto("P002")
    print(f"Producto encontrado: {producto_encontrado}")
except ExcepcionProductoNoEncontrado as e:
    print(f"Error: {e.get_mensaje()}")

try:
    inventario.buscar_producto("P999")
except ExcepcionProductoNoEncontrado as e:
    print(f"Error en busqueda: {e.get_mensaje()}")

print("\n6. INVENTARIO FINAL:")
inventario.mostrar_productos()