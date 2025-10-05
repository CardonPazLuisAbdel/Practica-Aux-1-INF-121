class Producto:
    def __init__(self, nombre, precio, stock):
        self.nombre = nombre
        self.precio = precio
        self.stock = stock

    def vender(self, cantidad):
        if cantidad <= 0:
            print("No se vendio ningun producto")
            return
        elif 0 < cantidad <= self.stock:
            self.stock -= cantidad
            print(f"Se vendio: {cantidad} unidades del producto: {self.nombre}")
        else:
            print(f"No hay stock suficiente del producto: {self.nombre} para la venta")
            return

    def reabastecer(self, cantidad):
        if cantidad <= 0:
            print("No se reabastecio ningun producto")
            return
        else:
            self.stock += cantidad
            print(f"Se reabastecio: {cantidad} unidades del producto: {self.nombre}")


producto1 = Producto("Leche", 4.5, 20)
producto2 = Producto("Pan", 0.5, 15)

print("Venta de productos")
producto1.vender(5)
producto2.vender(10)
producto1.vender(20)
producto2.vender(-3)

print("\nReabastecimiento de productos")
producto1.reabastecer(10)
producto2.reabastecer(5)
producto1.reabastecer(-4)
