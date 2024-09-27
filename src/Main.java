import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        welcome();
        options();
    }

    //metodo para bienvenida
    static void welcome() {
        // Colores ANSI para la consola (si tu terminal los soporta)
        String ANSI_RESET = "\u001B[0m";
        String ANSI_YELLOW = "\u001B[33m";
        String ANSI_BLUE = "\u001B[34m";
        String ANSI_CYAN = "\u001B[36m";
        String ANSI_GREEN = "\u001B[32m";
        String ANSI_RED = "\u001B[31m";

        // Decoración superior
        System.out.println(ANSI_BLUE + "╔══════════════════════════════════════════════════════╗" + ANSI_RESET);
        System.out.println(ANSI_CYAN + "║" + ANSI_RESET + "                                                      " + ANSI_CYAN + "║" + ANSI_RESET);
        System.out.println(ANSI_CYAN + "║" + ANSI_YELLOW + "        ★☆★ ¡Bienvenido a Banco Klok! ★☆★          " + ANSI_CYAN + "║" + ANSI_RESET);
        System.out.println(ANSI_CYAN + "║" + ANSI_RESET + "                                                      " + ANSI_CYAN + "║" + ANSI_RESET);
        System.out.println(ANSI_BLUE + "╚══════════════════════════════════════════════════════╝" + ANSI_RESET);

        // Mensaje central de bienvenida
        System.out.println(ANSI_GREEN + "\n" + "Estimado cliente, nos complace recibirlo en Banco Klok.");
        System.out.println("Donde su bienestar financiero es nuestra prioridad." + ANSI_RESET);
        // Pausa hasta que el usuario presione "Enter"
        Scanner teclado = new Scanner(System.in);
        System.out.println(ANSI_RED +"\nPresione 'Enter' para continuar..."+ ANSI_RESET);
        teclado.nextLine();  // Espera a que el usuario presione Enter
        System.out.println(ANSI_BLUE + "═══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════" + ANSI_RESET);

    }

    static void options(){
        Scanner teclado = new Scanner(System.in);
        int saldoDisponible = 1000;
        int retiro = 0;
        String ANSI_RESET = "\u001B[0m";
        String ANSI_YELLOW = "\u001B[33m";
        String ANSI_CYAN = "\u001B[36m";

        //AQUI SE REPITE
        System.out.println("Cliente: Williams Caro Galvan");
        System.out.println("Tipo de Cuenta: Ahorros");
        System.out.println("Saldo disponible $DOP:"+ saldoDisponible);
        // Otras informaciones útiles
        System.out.println(ANSI_YELLOW + "\nPor favor, elija una de las siguientes opciones para continuar:" + ANSI_RESET);
        System.out.println(ANSI_CYAN + "1. Consultar Saldo");
        System.out.println("2.Retirar");
        System.out.println("3.Depositar");
        System.out.println("9. Salir" + ANSI_RESET);

        int option = teclado.nextInt();
        switch (option){
            case 1:
                System.out.println("Su saldo es de: $DOP: "+ saldoDisponible);
                options();
                break;


            case 2:
                System.out.println("¿Cuanto desea retirar de su saldo?: ");
                retiro = teclado.nextInt();
                if (retiro > saldoDisponible || saldoDisponible == 0){
                    System.out.println("Saldo Insuficiente");
                }else {
                    int balanceActualizado = saldoDisponible - retiro ;
                    saldoDisponible = balanceActualizado;
                    System.out.println("Retiro de $DOP: "+retiro+". Aplicado. Su nuevo balance ahora es de $DOP: "+saldoDisponible);
                }
                options();
                break;

            case 3:
                System.out.println("Digite el monto a depositar:");
                int deposito = teclado.nextInt();
                saldoDisponible = deposito + saldoDisponible;
                System.out.println("Su nuevo saldo es de: DOP$: "+ saldoDisponible);
                options();
                break;

            case 9:
                System.out.println("Saliendo....");
                break;
            default:
                System.out.println("Umm, Me parece que digitó una opción no valida.");
        }
    }
}