package interview.flipkart;

import java.util.Scanner;

import interview.flipkart.command.Downvote;
import interview.flipkart.command.Follow;
import interview.flipkart.command.Login;
import interview.flipkart.command.NewsFeed;
import interview.flipkart.command.Postman;
import interview.flipkart.command.Reply;
import interview.flipkart.command.Signup;
import interview.flipkart.command.Upvote;

public class Console{
public static String DELIMETER = "~";
	public void init() {
		Scanner scan = new Scanner(System.in);
		while (true) {
			String input = scan.nextLine();
			String command = input.split(DELIMETER)[0];
			switch(command){
			case "signup": new Signup().process(input); break;
			case "login": new Login().process(input); break;
			case "post":new Postman().post(input); break;
			case "reply": new Reply().process(input);break;
			case "upvote" : new Upvote().process(input);break;
			case "downvote": new Downvote().process(input); break;
			case "shownewsfeed": new NewsFeed().display();break;
			case "follow":new Follow().process(input);break;
			default : System.out.println("Unknown command"); break;
			}
		}
	}
}