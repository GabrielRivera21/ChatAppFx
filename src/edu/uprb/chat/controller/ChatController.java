package edu.uprb.chat.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ChatController {
	
	@FXML
	private Button btnLogin;
	
	@FXML
	private Button btnLogout;
	
	public void sendMessage() {
		//TODO: Send Msgs
		System.out.println("Send Message.");
	}
	
	public void login() {
		//TODO
		System.out.println("Login.");
	}
	
	public void logout() {
		//TODO
		System.out.println("Logout");
	}
}
