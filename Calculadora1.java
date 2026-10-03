import java.util.ArrayList;
importar java.util.List;
importar java.util.Scanner;
 
clase pública Calculadora {
empty estático público main(String[] args) {
Entrada de escáner = nuevo Escáner(System.in);
List<String> historial = nuevo ArrayList<String>();
Título de la cadena="=Calculadora de consola===";
 
mientras (verdadero) {
System.out.println("\n" + título);
System.out.println("1. Sumar");
System.out.println("2. Restar");
System.out.println("3. Multiplicar");
System.out.println("4. Dividir");
System.out.println("5. Ver historial");
System.out.println("0. Salir");
 
int option = readOption(entrada);
si (opción == 0) {
System.out.println ("¡Nos vemos luego!");
pausa;
}
si (opción == 5) {
si (historial.isEmpty()) {
System.out.println ("Aún no hay operaciones.");
} si no, {
para (Operación de cadenas : historia) {
System.out.println(operación);
}
}
continúa;
}
si (opción < 1 || opción > 4) {
system.out.println ("Opción inválida.");
continúa;
}
 
doble a = readNumber(entrada, "Primer número: ");
double b = readNumber(entrada, "Segundo número: ");
doble resultado;
Símbolos de cadena;
 
switch (opción) {
Caso 1:
resultado = a + b;
simbolo = "+";
pausa;
Caso 2:
Resultado = A - B;
simbolo = "-";
pausa;
Caso 3:
resultado = a * b;
simbolo = "×";
pausa;
Por defecto:
si (b == 0) {
System.out.println ("No se puede dividir entre cero.");
continúa;
}
resultado = a/b;
simbolo = "÷";
}
 
Detalle de la cadena = a + " " + símbolo + " " + b + " = " + resultado;
System.out.println ("Resultado: " + detalle);
history.add(detalle);
}
entrada.close();
}
 
private static int leerOpcion(Scanner entrada) {
System.out.print ("Elige una opción: ");
try {
return Integer.parseInt(entrada.nextLine().trim());
} catch (error NumberFormatException) {
retorno -1;
}
}
 
private static double leerNumero(Scanner entrada, String pregunta) {
mientras (verdadero) {
System.out.print(pregunta);
try {
double numero = Double.parseDouble(entrada.nextLine().trim());
si (Double.isFinite(numero)) {
número de retorno;
}
} catch (error NumberFormatException) {
Te pedimos el número de nuevo abajo.
}
System.out.println ("Escribe un número válido (usa un punto para decimales).");
}
}
}