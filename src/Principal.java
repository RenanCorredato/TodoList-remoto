
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Principal {

	public static void main(String[] args) {
		Menu menu = new Menu();
		
		System.out.println("Bem vindo ao sistema de TodeList");
		
		List<String> categorias = new ArrayList<String>();
		
		
		boolean continua = true;
		while(continua) {
			menu.imprimeMenu();
			String valorDecisao = menu.decisaoUsuaruio();
			
			
			switch (valorDecisao) {
				case"1":{
					System.out.println("Digite o nome da categoria sem espaço");
					Scanner scanNomeCategoria = new Scanner(System.in);
					String nomeCategoria = scanNomeCategoria.next();
					
					categorias.add(nomeCategoria);
					break;
				}	
				
					case "2":{
						for (String nome:categorias) {
							System.out.println("Nome da Categoria: " + nome);
							}
						break;
					}
					case "3":{
						int posicao = 0;
						for(String i : categorias) {
						System.out.println(posicao + " - " + i );
						posicao++;
                                  }
						
						System.out.println("Ditgite o numero do item que deseja excluir");
					
						Scanner scannRemoveItem = new Scanner(System.in);
						int removeitem = scannRemoveItem.nextInt();
						
						categorias.remove(removeitem);
						System.out.println("Item Removido: " + removeitem );
						
						
						
						break;
						}
							
					case"0":{
						System.exit(0);
					}
					default:{
						System.out.println("Opção inválida");
						break;
					}
				}
			}
		}
	}
