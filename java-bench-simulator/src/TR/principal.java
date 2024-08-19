package TR;
import java.util.LinkedList;
import java.util.Scanner;
public class principal {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner under = new Scanner(System.in);
		String dni,usuario,contra,op;
		int contador = 0;
		int intentos = 3;
		LinkedList<Banco> cuentas = new LinkedList<>();
		cuentas.add(new Banco("admin","admin","admin"));
		while (true) {
			contador = 0;
			System.out.println("¡Nuevo Perú Bank!");
			System.out.println("\n\n\n");
			System.out.println("[1] Crear Cuenta.  [2] Iniciar sesión. [3] Salir");
			op = under.nextLine();
			if (op.equals("1")) {
				System.out.println("Ingresa el DNI:");
				dni = under.nextLine();
				System.out.println("Ingresa el usuario:");
				usuario = under.nextLine();
				System.out.println("Ingresa la contraseña: ");
				contra = under.nextLine();
				System.out.println("");
				if (usuario == "" || contra == "" || dni == "") {
					System.out.println("Cliente no Registrado. Uno de los campos no fue rellenado.\n\n\n ");
					System.out.println("Pulsa Enter para continuar");
					under.nextLine();
					continue;
				}else {
					System.out.println("Cliente Registrado\n\n\n");
					cuentas.add(new Banco(dni, usuario, contra));
					System.out.println("Pulsa Enter para continuar");
					under.nextLine();
					continue;
				}
			} else if (op.equals("2")) {
				while (true) {
					intentos = 3;
					contador = 0;
					System.out.println("Ingresa el DNI:");
					dni = under.nextLine();
					//Bucle para entrar en las cuentas (usuario).
					for (int t = 0; t < cuentas.size();t++) {
						Banco x = cuentas.get(t);
						//Verificando si usuario existe en la lista.
						if (dni.equals(x.getDni())) {
							for (int c = 3; c > 0;c--) {
								System.out.println("Ingresa la contraseña: Intento " + c);
								intentos--;
								contra = under.nextLine();
								System.out.println("");
								if (contra.equals(x.getContra())) {
										System.out.println("Se a ingresado con Exito");
										intentos = 0;
										break;
								}
								else {
									System.out.println("Contraseña incorrecta. Te quedam " + intentos + " intentos");
									continue;
								}
								
							}
						} else if (intentos == 0){
							break;
						} else {
							contador++;
						}
					}

					if (contador == cuentas.size()) {
						System.out.println("No se encontró la cuenta");
						System.out.println("Pulse Enter para continuar...\n\n\n");
						under.nextLine();
						break;
					} else if (intentos == 0) {
						System.out.println("Número de intentos superado, Saliendo de cagero.");
						break;
					} else {
						break;
					}
				}
				while (contador != cuentas.size()) {
					double monto;
					System.out.println(contador);
					System.out.println(cuentas.get(contador).getUsuario());
					System.out.println("Operaciones: ");
					System.out.println("[1] Depósito");
					System.out.println("[2] Retiro");
					System.out.println("[3] Consulta de Saldo");
					System.out.println("[4] Salir del sistema");
					op = under.nextLine();
					if (op.equals("1")) {
						System.out.println("Monto a depositar.");
						monto = under.nextDouble(); 
						under.nextLine();
						cuentas.get(contador).deposito(monto);
					}
					else if (op.equals("2")) {
						System.out.println("Monto a retirar.");
						monto = under.nextDouble();
						under.nextLine();
						cuentas.get(contador).retiro(monto);
					}
					else if (op.equals("3")) {
						cuentas.get(contador).mostrarSaldo();
						System.out.println("Pulse Enter para continuar...\n\n\n");
						under.nextLine();
					}
					else if (op.equals("4")) {
						System.out.println("Fin");
						contador=0;
						break;
					}
				}
			} else if(op.equals("3")){
				System.out.println("\n\n\n\nFin del programa...");
				break;
			}
			else {
				System.out.println("\n\n\n\nError al encontrar la opción. Pulsa enter para continuar.");
			}
		}
		

	}

}
