class Ropa:
    def __init__(self, tipo, material):
        self.tipo = tipo
        self.material = material
    
    def __str__(self):
        return f"Ropa: {self.tipo}, Material: {self.material}"
    
    def get_tipo(self):
        return self.tipo
    
    def get_material(self):
        return self.material


class Ropero:
    def __init__(self, material):
        self.material = material
        self.ropas = []  
        self.nro_ropas = 0
    
    def adicionar_ropa(self, ropa):
        self.ropas.append(ropa)
        self.nro_ropas += 1
        print(f"Prenda '{ropa.get_tipo()}' agregada al ropero")
    
    def eliminar_ropa(self, material, tipo):
        ropas_eliminadas = 0
        for ropa in self.ropas[:]:
            if ropa.get_material() == material and ropa.get_tipo() == tipo:
                self.ropas.remove(ropa)
                self.nro_ropas -= 1
                ropas_eliminadas += 1
                print(f"Prenda '{ropa.get_tipo()}' de material '{material}' eliminada")
        
        if ropas_eliminadas == 0:
            print(f"No se encontraron prendas de material '{material}' y tipo '{tipo}'")
    
    def mostrar_ropas(self, material=None, tipo=None):
        if material and tipo:
            print(f"\n--- Ropas de material '{material}' y tipo '{tipo}' ---")
            encontradas = False
            for ropa in self.ropas:
                if ropa.get_material() == material and ropa.get_tipo() == tipo:
                    print(f"  - {ropa}")
                    encontradas = True
            if not encontradas:
                print("  No se encontraron prendas con esas características")
        else:
            print(f"\n--- Todas las ropas en el ropero ({self.nro_ropas} prendas) ---")
            for ropa in self.ropas:
                print(f"  - {ropa}")
    
    def get_material(self):
        return self.material
    
    def get_nro_ropas(self):
        return self.nro_ropas

ropero_madera = Ropero("Madera")

camisa_algodon = Ropa("Camisa", "Algodon")
pantalon_jean = Ropa("Pantalon", "Jean")
camisa_seda = Ropa("Camisa", "Seda")
chaqueta_cuero = Ropa("Chaqueta", "Cuero")
pantalon_algodon = Ropa("Pantalon", "Algodon")
blusa_seda = Ropa("Blusa", "Seda")

print("1. ADICIONAR PRENDAS AL ROPERO")
ropero_madera.adicionar_ropa(camisa_algodon)
ropero_madera.adicionar_ropa(pantalon_jean)
ropero_madera.adicionar_ropa(camisa_seda)
ropero_madera.adicionar_ropa(chaqueta_cuero)
ropero_madera.adicionar_ropa(pantalon_algodon)
ropero_madera.adicionar_ropa(blusa_seda)

print("\n2. MOSTRAR TODAS LAS ROPAS")
ropero_madera.mostrar_ropas()

print("\n3. MOSTRAR ROPAS ESPECIFICAS")
ropero_madera.mostrar_ropas("Algodon", "Camisa")
ropero_madera.mostrar_ropas("Seda", "Blusa")

print("\n4. ELIMINAR PRENDAS")
ropero_madera.eliminar_ropa("Jean", "Pantalon")
ropero_madera.eliminar_ropa("Cuero", "Chaqueta")

print("\n5. MOSTRAR ROPERO DESPUÉS DE ELIMINACIONES")
ropero_madera.mostrar_ropas()

print("\n6. MOSTRAR ROPAS POR MATERIAL")
ropero_madera.mostrar_ropas("Algodon", None)
ropero_madera.mostrar_ropas("Seda", None)

print(f"\n7. INFORMACION FINAL DEL ROPERO")
print(f"Material del ropero: {ropero_madera.get_material()}")
print(f"Numero total de prendas: {ropero_madera.get_nro_ropas()}")