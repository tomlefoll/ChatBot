package chatbot;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		// afficher du message de bienvenue
		while (true){
			System.out.println("Bonjour! je suis votre chatbot. Poser moi une question.");
			
			// Boucle pour poser des qustions reponse 
			while (true){
				System.out.println("vous: ");
				String question = scanner.nextLine(); // l'utilisateur entre une question
				
				//condition pour quitter la conversation
				if(question.equalsIgnoreCase("au revoir")) {
					System.out.println("bot:au revoir! a bientot.");
					break;
					
				}
				
				// reponse base sur des question et repondre 
				if(question.contains("bonjour")) {
					System.out.println("bot:bonjour! comment ca va?");
						
				}else if(question.contains("comment ca va?")) {
					System.out.println("je vais bien, merci! et toi?");
				} else if(question.contains("quel est ton nom")) {
					System.out.println("bot: je suis un chatbot sans nom. et toi?");
				}else if (question.contains("quel age a-tu")) {
					System.out.println("bot:Je n'ai pas d'age, je suis un programme!");
				}else {
					System.out.println("bot: Desoler je en comprend cette question. ");
				}
			}
			
			//fermeture du scanner a la fin du programme 
			scanner.close();
		}
		

	}

}
