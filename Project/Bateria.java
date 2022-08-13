
import java.util.Scanner;

public class examenArrays {

	public static void Sleep(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		System.out.println("\n" 
				+ "  ████████████████████████████████████  \r\n"
				+ "  ██                                ██  \r\n" 
				+ "  ██  ████  ████  ████  ████  ████  ████\r\n"
				+ "  ██  ████  ████  ████  ████  ████  ████\r\n" 
				+ "  ██  ████  ████  ████  ████  ████  ████\r\n"
				+ "  ██  ████  ████  ████  ████  ████  ████\r\n" 
				+ "  ██  ████  ████  ████  ████  ████  ████\r\n"
				+ "  ██                                ██  \r\n" 
				+ "  ████████████████████████████████████  ");

		int espacio = 10;
		int opcio = 0;
		int caracters;
		int consumir = 0;

		double total = 0;
		double mitjana;

		int[] bateria = new int[espacio];
		int[] sumatorio = new int[3];
		int[] que = new int[3];

		char pregunta;
		char letra = 0;
		char[] vocales = { 'a', 'e', 'i', 'o', 'u' };
		char[] consonantes = { 'q', 'w', 'r', 't', 'y', 'p', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'ñ', 'z', 'x', 'c', 'v', 'b', 'n', 'm' };

		
		do {
			
			System.out.println("\n==================================\n");
			System.out.println("1. Vaciar batería");
			System.out.println("2. Cargar batería");
			System.out.println("3. Imprimir el estado actual de la batería");
			System.out.println("4. Escribe [ n ] carácteres");
			System.out.println("5. Mostrar estadistica");
			System.out.println("6. Salir");
			
			System.out.print(">> ");
			opcio = entrada.next().charAt(0);
			
			System.out.println("\n==================================\n");
			
			
			switch (opcio) {

				case '1': /* O P C I Ó N 1 */
	
					System.out.println("_____________________________________________________________\n");
					System.out.println("Has seleccionado la opción 1: 'Vaciar batería'\n");
	
					System.out.println("Estas seguro que deseas vaciar la batería ?\n");
					System.out.println("- Sí, estoy seguro. Introduce [ S ]");
					System.out.println("- No, deseo continuar con la simulación. Introduce [ N ]");
					System.out.print(">> ");
					pregunta = entrada.next().toLowerCase().charAt(0);
	
					System.out.print("\n");
	
					if (pregunta == 's') {
						
						System.out.print("Vaciando la batería");
	
						for (int d = 0; d < 3; d++) {
							
							Sleep(600);
							System.out.print(".");
							
						}
	
						System.out.println("\n");
	
						for (int i = 0; i < bateria.length; i++) {
							
							bateria[i] = 0;
							
						}
						
					}
					
	
					if (pregunta == 'n') {
						
						System.out.println("No has hecho ningún cambio en la batería.");
						
					}
	
					System.out.println("_____________________________________________________________\n");
					break;
	
					
				case '2': /* O P C I Ó N 2 */
	
					System.out.println("_____________________________________________________________\n");
					System.out.println("Has seleccionado la opción 2: 'Cargar batería'\n");
					System.out.print("Cargando la batería");
	
					for (int d = 0; d < 3; d++) {
						Sleep(800);
						System.out.print(".");
					}
	
					System.out.println("\n");
	
					for (int i = 0; i < bateria.length; i++) {
						
						bateria[i] = (int) (Math.random() * 3);
						total = total + bateria[i];
						
					}
					
					mitjana = total / 10;
	
					System.out.print("Carga actual: ");
					
					for (int i = 0; i < bateria.length; i++) {
						
						System.out.print(bateria[i]);
						
					}
					
					System.out.println("");
					System.out.println("Carga total = " + total);
					System.out.println("Mediana = " + mitjana);
					
					System.out.println("_____________________________________________________________\n");
					break;
					
	
				case '3': /* O P C I Ó N 3 */
	
					System.out.println("_____________________________________________________________\n");
					System.out.println("Has seleccionado la opción 3: 'Estado actual de la batería'\n");
					
					// System.out.print(" ");
					System.out.print(
							"\n" 	+ "  ████████████████████████████████████████████████████████████████████████████  \r\n"
									+ "  ██                                                                        ██  \r\n"
									+ "  ██  █████  █████  █████  █████  █████  █████  █████  █████  █████  █████  ████\r\n"
									+ "  ██  █████  █████  █████  █████  █████  █████  █████  █████  █████  █████  ████\r\n"
									+ "  ██");
	
					for (int i = 0; i < bateria.length; i++) {
	
						if (bateria[i] == 0) {
							System.out.print("  █ - █");
						}
	
						if (bateria[i] == 1) {
							System.out.print("  █ + █");
						}
	
						if (bateria[i] == 2) {
							System.out.print("  █ x █");
						}
					}
					System.out.print("  ████");
	
					System.out.print("\n");
	
					System.out.println(""
							+ "  ██  █████  █████  █████  █████  █████  █████  █████  █████  █████  █████  ████\r\n"
							+ "  ██  █████  █████  █████  █████  █████  █████  █████  █████  █████  █████  ████\r\n"
							+ "  ██                                                                        ██  \r\n"
							+ "  ████████████████████████████████████████████████████████████████████████████  \r\n" + "");
					
					System.out.println("_____________________________________________________________\n");
					break;
					
	
				case '4': /* O P C I Ó N 4 */
	
					System.out.println("_____________________________________________________________\n");
					System.out.println("Has seleccionado la opción 4: 'Escribe [ n ] carácteres'\n");
	
					System.out.print("" 
							+ ",---,---,---,---,---,---,---,---,---,---,---,---,---,-------,\r\n"
							+ "|1/2| 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 0 | + | ' | <-    |\r\n"
							+ "|---'-,-'-,-'-,-'-,-'-,-'-,-'-,-'-,-'-,-'-,-'-,-'-,-'-,-----|\r\n"
							+ "| ->| | Q | W | E | R | T | Y | U | I | O | P | ] | ^ |     |\r\n"
							+ "|-----',--',--',--',--',--',--',--',--',--',--',--',--'|    |\r\n"
							+ "| Caps | A | S | D | F | G | H | J | K | L | \\ | [ | * |    |\r\n"
							+ "|----,-'-,-'-,-'-,-'-,-'-,-'-,-'-,-'-,-'-,-'-,-'-,-'---'----|\r\n"
							+ "|    | < | Z | X | C | V | B | N | M | , | . | - |          |\r\n"
							+ "|----'-,-',--'--,'---'---'---'---'---'---'-,-'---',--,------|\r\n"
							+ "| ctrl |  | alt |                          |altgr |  | ctrl |\r\n"
							+ "'------'  '-----'--------------------------'------'  '------'\r\n");
	
					System.out.println("¿Cuántos carácteres quieres introducir?");
					System.out.print(">> ");
					caracters = entrada.nextInt();
	
					for (int i = 0; i < caracters; i++) {
						
						consumir = 0;
						total = 0;
						System.out.println("\nIntroduce un carácter: ");
						System.out.print(">> ");
						letra = entrada.next().charAt(0);
	
						if ((letra > 47) && (letra < 58)) {
							
							que[0]++;
							System.out.print("Se consume una unidad");
	
							for (int j = 0; j < bateria.length; j++) {
	
								if ((bateria[j] > 0) && (consumir == 0)) {
									
									bateria[j]--;
									consumir++;
									sumatorio[0]++;
									
								}
								
							}
							
							for (int q = 0; q < bateria.length; q++) {
								
								total = total + bateria[q];
								
							}
							
							System.out.println(", estat de bateria : " + total);
							
							if (total == 0) {
								
								System.out.println("");
								System.out.println("\n\nFinalizamos la simulación, porque la batería está totalmente vacía");
								i = caracters;
								
							}
							
							consumir = 0;
							
							for (int z = 0; z < bateria.length; z++) {
								
								if (bateria[z] == 0) {
									System.out.print("-");
								}
								if (bateria[z] == 1) {
									System.out.print("+");
								}
								if (bateria[z] == 2) {
									System.out.print("*");
								}
							}
							
							System.out.println("");
							
						} else {
							
							for (int j = 0; j < vocales.length; j++) {
								
								if (letra == vocales[j]) {
									
									que[1]++;
									System.out.print("Se consumen dos unidades");
									
									for (j = 0; j < bateria.length; j++) {
										
										if ((bateria[j] > 0) && (consumir < 2)) {
											
											bateria[j]--;
											consumir++;
											sumatorio[1]++;
											
										}
										
									}
									
									for (int q = 0; q < bateria.length; q++) {
										
										total = total + bateria[q];
										
									}
									
									System.out.println(", estat de bateria : " + total);
									
									if (total == 0) {
										
										System.out.println("\n\nFinalizamos la simulación, porque la batería está totalmente vacía");
										i = caracters;
										
									}
									
									consumir = 0;
									
									for (int z = 0; z < bateria.length; z++) {
										
										if (bateria[z] == 0) {
											System.out.print("-");
										}
										if (bateria[z] == 1) {
											System.out.print("+");
										}
										if (bateria[z] == 2) {
											System.out.print("*");
										}
										
									}
									
								}
								
							}
							
	
							for (int k = 0; k < consonantes.length; k++) {
								
								if (letra == consonantes[k]) {
									
									que[2]++;
									System.out.print("Se consumen 3 unidades");
									for (int j = 0; j < bateria.length; j++) {
										
										if ((bateria[j] > 0) && (consumir < 3)) {
											
											bateria[j]--;
											consumir++;
											sumatorio[2]++;
										}
										
									}
									
									consumir = 0;
	
									for (int q = 0; q < bateria.length; q++) {
										
										total = total + bateria[q];
										
									}
									
									if (total == 0) {
										
										System.out.println("\n\nFinalizamos la simulación, porque la batería está totalmente vacía");
										i = caracters;
										
									}
	
									System.out.println(", estado de la batería : " + total);
	
									for (int z = 0; z < bateria.length; z++) {
										
										if (bateria[z] == 0) {
											System.out.print("-");
										} else if (bateria[z] == 1) {
											System.out.print("+");
										} else if (bateria[z] == 2) {
											System.out.print("*");
										}
										
									}
									
								}
								
							}
							
						}
	
						for (int q = 0; q < bateria.length; q++) {
							
							total = total + bateria[q];
							
						}
						
						if (total <= 0) {
							
							System.out.println("\nHas vaciado la batería");
							
						}
						
					}
	
					if (total > 0) {
						
						System.out.println("Todavía queda espacio en la batería, quieres continuar? (S / N)");
						pregunta = entrada.next().toLowerCase().charAt(0);
	
						if (pregunta == 's') {
							
							caracters = 100;
							
							for (int i = 0; i < caracters; i++) {
								
								consumir = 0;
								total = 0;
								System.out.println("Introduce un carácter: ");
								System.out.print(">> ");
								letra = entrada.next().charAt(0);
	
								if ((letra > 47) && (letra < 58)) {
									
									que[0]++;
									System.out.print("se consume 1 unidad");
	
									for (int j = 0; j < bateria.length; j++) {
	
										if ((bateria[j] > 0) && (consumir == 0)) {
											
											bateria[j]--;
											consumir++;
											sumatorio[0]++;
											
										}
										
									}
	
									for (int q = 0; q < bateria.length; q++) {
										
										total = total + bateria[q];
										
									}
	
									System.out.println(", estado de la batería : " + total);
	
									if (total == 0) {
										
										System.out.println("");
										System.out.println("\n\nFinalizamos la simulación, porque la batería está totalmente vacía");
										i = caracters;
										
									}
									
									consumir = 0;
	
									for (int z = 0; z < bateria.length; z++) {
	
										if (bateria[z] == 0) {
											System.out.print("-");
										}
										if (bateria[z] == 1) {
											System.out.print("+");
										}
										if (bateria[z] == 2) {
											System.out.print("*");
										}
										
									}
	
									System.out.println("");
	
								} else {
	
									for (int j = 0; j < vocales.length; j++) {
	
										if (letra == vocales[j]) {											
											
											que[1]++;
											System.out.print("Se consumen 2 unidades");
	
											for (j = 0; j < bateria.length; j++) {
	
												if ((bateria[j] > 0) && (consumir < 2)) {
													
													bateria[j]--;
													consumir++;
													sumatorio[1]++;
													
												}
												
											}											
	
											for (int q = 0; q < bateria.length; q++) {
												
												total = total + bateria[q];
												
											}
	
											System.out.println(", estado de la batería : " + total);
	
											if (total == 0) {
												
												System.out.println("\n\nFinalizamos la simulación, porque la batería está totalmente vacía");
												i = caracters;
												
											}
											
											consumir = 0;
	
											for (int z = 0; z < bateria.length; z++) {
	
												if (bateria[z] == 0) {
													System.out.print("-");
												}
	
												if (bateria[z] == 1) {
													System.out.print("+");
												}
	
												if (bateria[z] == 2) {
													System.out.print("*");
												}
												
											}
											
										}
										
									}
										
									for (int k = 0; k < consonantes.length; k++) {
	
										if (letra == consonantes[k]) {
											
											que[2]++;
											System.out.print("se consumen 3 unidades");
	
											for (int j = 0; j < bateria.length; j++) {
	
												if ((bateria[j] > 0) && (consumir < 3)) {
													
													bateria[j]--;
													consumir++;
													sumatorio[2]++;
												}
												
											}
											
											consumir = 0;
	
											for (int q = 0; q < bateria.length; q++) {
												
												total = total + bateria[q];
												
											}
	
											if (total == 0) {
												
												System.out.println("\n\nFinalizamos la simulación, porque la batería está totalmente vacía");
												i = caracters;
												
											}
	
											System.out.println(", estado de la batería : " + total);
	
											for (int z = 0; z < bateria.length; z++) {
	
												if (bateria[z] == 0) {
													System.out.print("-");
												}
	
												if (bateria[z] == 1) {
													System.out.print("+");
												}
	
												if (bateria[z] == 2) {
													System.out.print("*");
												}
												
											}
											
										}
										
									}
									
								}
								
	
								for (int q = 0; q < bateria.length; q++) {
									
									total = total + bateria[q];
									
								}								
	
								if (total <= 0) {
									
									System.out.println("\nHas vaciado la batería");
									
								}
								
							}
							
						}
						
					}
	
					System.out.println("_____________________________________________________________\n");
					break;
	
				case '5':
					System.out.println("_____________________________________________________________\n");
					System.out.println("Has seleccionado la opción 5: 'Estadísticas'\n");
	
					System.out.println("" 
							+ "             .+------+\r\n" 
							+ "           .' |      |\r\n"
							+ "          +   |      |\r\n" 
							+ "          |   |      |\r\n" 
							+ "          |  .+------+\r\n"
							+ "          |.'      .'\r\n" 
							+ "          +------+'\n");
	
					System.out.println("                                           Consumo de\n                                            energía");
					System.out.println("Números introducidos		[" + que[0] + "]		[" + sumatorio[0] + "]");
					System.out.println("Vocales introducidas		[" + que[1] + "]		[" + sumatorio[1] + "]");
					System.out.println("Consonantes introducidas	[" + que[2] + "]		[" + sumatorio[2] + "]");
					System.out.println("_____________________________________________________________\n");
					break;
					
	
				case '6':
					
					System.out.println("_____________________________________________________________\n");
					System.out.println("Has seleccionado la opción 6: 'Salir de la simulación'\n");
	
					System.out.print("  Vaciando batería");
	
					for (int d = 0; d < 3; d++) {
						
						Sleep(800);
						System.out.print(".");
						
					}
					
					System.out.print("\n\n");
	
					System.out.print("             Eliminando estadísticas");
	
					for (int d = 0; d < 3; d++) {
						
						Sleep(800);
						System.out.print(".");
						
					}
					
					System.out.print("\n\n");
	
					System.out.print("                             Saliendo de la simulación");
	
					for (int d = 0; d < 3; d++) {
						
						Sleep(800);
						System.out.print(".");
						
					}
	
					System.out.println("\n_____________________________________________________________\n");
					break;
					
	
				default:
					
					System.out.println("Introduce números entre el 1 y el 6");
					
				}

		} while (opcio != '6');
		
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
		System.out.println("=================== Simulacion finalizada ===================");

		entrada.close();
		
	}

}
