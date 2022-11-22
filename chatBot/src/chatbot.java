//KEVIN MARTIN MARTÍNEZ FAUSTO-21/11/2022
import java.time.LocalDate;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class chatbot {
    // Scanner global
    final static Scanner entrada = new Scanner(System.in);


    public static void main(String[] args) throws Exception {
        System.out.println("Holaa, elige un nombre para mí");
        String nombreBot = entrada.nextLine();//SERÁ EL NOMBRE DEL "BOT"
        saludar(nombreBot, LocalDate.now().getYear());//MÉTODO SALUDAR(RECIBE EL NOMBRE ASIGNADO Y EL AÑO)
        nombreUsuario();//METODO nombreUsuario, NO ES NECESARIO RECIBIR NADA
        adivinaredad();//NOMBRE DE adivinaredad(calculará la edad del usuario usando un truco matemático)
        contar();//Metodo contar(Contará hasta el número que yo eliga)
        prueba();//Método prueba(Un test)
    }

    /*
     El siguiente método será para recibir el nombre que tendrá nuestro bot
     */
    static void saludar(String nombreBot, int year) {
        System.out.println("Gracias por asignarme el nombre: " + nombreBot);
        try {
            TimeUnit.SECONDS.sleep(1);//Se esperará un segundo
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("He sido creado en el año: " + year);
        System.out.println("Ahora dime, ¿Cómo te llamas?");
    }

    // METODO PARA OBTENER EL NOMBRE DEL USUARIO
    static void nombreUsuario() {
        String nombre = entrada.nextLine();
        System.out.println("Recordando nombre...");
        try {
            TimeUnit.SECONDS.sleep(3);//Se esperará 3 Segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("¡Gran nombre! " + nombre);
    }
//METODO PARA CALCULAR LA EDAD DE UN USUARIO(No está del todo bien)
/*
 Leerá 3 datos y hará una operación al final, se supone que regresará la edad correcta
 */
    private static void adivinaredad() {
        System.out.println("Déjame adivinar tu edad");
        System.out.println("¿Cuál es el resultado de dividir tu edad entre 3?");
        int resultado1 = entrada.nextInt();
        System.out.println("¿Cuál es el resultado de dividir tu edad entre 5?");
        int resultado2 = entrada.nextInt();
        System.out.println("¿Cuál es el resultado de dividir tu edad entre 7?");
        int resultado3 = entrada.nextInt();
        System.out.println("Adivinando tu edad...");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int edad = (resultado1 * 70 + resultado2 * 21 + resultado3 * 15) % 105;
        System.out.println("Tu edad es: " + edad);
    }
//ES UN MÉTODO USANDO IN CICLO FOR
/*
 Le proporcionamos un número que este servirá para saber cuantas veces se repetirá el ciclo
 */
    static void contar() {
        System.out.println("Ahora te demostraré que también puedo contar");
        System.out.println("Dame un número para contar");
        int numero = entrada.nextInt();
        System.out.println("-------------------------------");
        for (int i = 0; i <= numero; i++) {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }
/*
 El siguiente método es una pregunta en la que hay una validación que sirve
 para verificar la respuesta correcta
 */
    static void prueba() {
        System.out.println("\nAhora, unas preguntas de cultura general");
        System.out.println("Si queremos utilizar números enteros, ¿Qué tipo de dato en java deveríamos usar?");
        int opcion;
        do {
            System.out.println("1) Double" + "\n2) Entero" + "\n3) boolean" + "\n4) Maruchan");
            System.out.println("Ingresa la opción cirrecta");
            opcion = entrada.nextInt();
        } while (!verificarPrueba(opcion));
    }
//SIRVE PARA VERIFICAR LA RESPUESTA DE LA PREGUNTA ANTERIOR
    static boolean verificarPrueba(int opcion) {
        if (opcion == 2) {
        System.out.println("CORRECTO");
        return true;
        }
        else{
        System.out.println("INCORRECTO");
        return false;
        }
    }
}
