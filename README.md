# springboot-backend-apirest-

Ejercicio Url de endpoints requeridos en la capa REST:

Crear cliente:
POST, http://localhost:8000/api/clientes
{
  "codigo": "",
  "nombre": "Juan",
  "apellido": "Garcia",
  "direccion": "Car 10",
  "email": "juan@gmail.com",
  "telefono": "5203060"
}

Consultar Clientes:
GET, http://localhost:8000/api/clientes

ActuaLizar clientes:
PUT, http://localhost:8000/api/clientes
{
        "codigo": 1,
        "nombre": "Juan",
        "apellido": "Garcia",
        "direccion": "Car 15",
        "telefono": "5203090",
        "email": "juan12@gmail.com"
    }

Eliminar clientes: 
DELETE, http://localhost:8000/api/cuentacorriente/{id}

Crear Producto:
POST, http://localhost:8000/api/productos
{
  "codigo": "",
  "descripcion": "Producto1",
  "precio": "150000",
  "numero_existencias": 50
}

Consultar Productos:
GET, http://localhost:8000/api/productos

ActuaLizar productos:
PUT, http://localhost:8000/api/productos
{
  "codigo": "1",
  "descripcion": "Producto1",
  "precio": "180000",
  "numero_existencias": 40
}

Eliminar productos: 
DELETE, http://localhost:8000/api/productos/{id}

Crear Tarjetas:
POST, http://localhost:8000/api/tarjetas
{
  "codigo": "",
  "descripcion": "platino visa",
  "franquicia": "visa",
  "cupo": 20000000
}

Consultar Tarjetas:
GET, http://localhost:8000/api/tarjetas

ActuaLizar Tarjetas:
PUT, http://localhost:8000/api/tarjetas
{
  "codigo": "1",
  "descripcion": "platino visa",
  "franquicia": "visa",
  "cupo": 25000000
}

Eliminar tarjetas: 
DELETE, http://localhost:8000/api/tarjetas/{id}

