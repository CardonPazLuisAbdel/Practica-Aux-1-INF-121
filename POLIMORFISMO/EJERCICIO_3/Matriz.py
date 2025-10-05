class Matriz:
    def __init__(self, matriz=None):
        if matriz is None:
            self.matriz = [[1.0 if i == j else 0.0 for j in range(10)] for i in range(10)]
        else:
            self.matriz = matriz

    def sumar(self, otra):
        resultado = [[self.matriz[i][j] + otra.matriz[i][j] for j in range(10)] for i in range(10)]
        return Matriz(resultado)

    def restar(self, otra):
        resultado = [[self.matriz[i][j] - otra.matriz[i][j] for j in range(10)] for i in range(10)]
        return Matriz(resultado)

    def igual(self, otra):
        for i in range(10):
            for j in range(10):
                if self.matriz[i][j] != otra.matriz[i][j]:
                    return False
        return True

    def mostrar(self):
        for i in range(10):
            print(' '.join(f'{self.matriz[i][j]:.2f}' for j in range(10)))


identidad = Matriz()
print("Matriz Identidad:")
identidad.mostrar()

datos1 = [[i + j for j in range(10)] for i in range(10)]
datos2 = [[i * j for j in range(10)] for i in range(10)]

matriz1 = Matriz(datos1)
matriz2 = Matriz(datos2)

print("\nMatriz 1:")
matriz1.mostrar()

print("\nMatriz 2:")
matriz2.mostrar()

suma = matriz1.sumar(matriz2)
print("\nSuma de matrices:")
suma.mostrar()

resta = matriz1.restar(matriz2)
print("\nResta de matrices:")
resta.mostrar()

print(f"\n¿Matriz1 es igual a Matriz2? {matriz1.igual(matriz2)}")
print(f"¿Matriz1 es igual a sí misma? {matriz1.igual(matriz1)}")
