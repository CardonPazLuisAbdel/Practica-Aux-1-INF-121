class ExcepcionNumeroInvalido(Exception):
    def __init__(self, mensaje):
        super().__init__(mensaje)
        self.mensaje = mensaje
    
    def get_mensaje(self):
        return self.mensaje


class Calculadora:
    @staticmethod
    def sumar(a, b):
        return a + b
    
    @staticmethod
    def restar(a, b):
        return a - b
    
    @staticmethod
    def multiplicar(a, b):
        return a * b
    
    @staticmethod
    def dividir(a, b):
        if b == 0:
            raise ArithmeticError("Error: División por cero no permitida")
        return a / b
    
    @staticmethod
    def convertir_a_entero(texto):
        try:
            return int(texto)
        except ValueError:
            raise ExcepcionNumeroInvalido(f"Error: '{texto}' no es un número valido")


# MAIN Ejercicio 2
print("=== CALCULADORA CON MANEJO DE EXCEPCIONES ===")

print("\n1. OPERACIONES EXITOSAS:")
resultado_suma = Calculadora.sumar(10, 5)
print(f"10 + 5 = {resultado_suma}")

resultado_resta = Calculadora.restar(10, 5)
print(f"10 - 5 = {resultado_resta}")

resultado_multiplicacion = Calculadora.multiplicar(10, 5)
print(f"10 * 5 = {resultado_multiplicacion}")

resultado_division = Calculadora.dividir(10, 5)
print(f"10 / 5 = {resultado_division}")

numero_convertido = Calculadora.convertir_a_entero("123")
print(f"'123' convertido a entero: {numero_convertido}")

print("\n2. PRUEBAS CON EXCEPCIONES:")
try:
    Calculadora.dividir(10, 0)
except ArithmeticError as e:
    print(f"Division por cero: {e}")

try:
    Calculadora.convertir_a_entero("abc")
except ExcepcionNumeroInvalido as e:
    print(f"Conversión inválida: {e.get_mensaje()}")

try:
    Calculadora.convertir_a_entero("12.5")
except ExcepcionNumeroInvalido as e:
    print(f"Conversion decimal: {e.get_mensaje()}")

print("\n3. USO EN BUCLE CON MANEJO DE ERRORES:")
numeros = ["10", "20", "treinta", "40", "50.5"]

for num in numeros:
    try:
        valor = Calculadora.convertir_a_entero(num)
        print(f"'{num}' convertido correctamente: {valor}")
    except ExcepcionNumeroInvalido as e:
        print(f" Error con '{num}': {e.get_mensaje()}")