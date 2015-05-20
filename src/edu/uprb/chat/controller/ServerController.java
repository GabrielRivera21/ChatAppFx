package edu.uprb.chat.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;

public class ServerController {
	@FXML
	private TextArea txtAreaChatMsg;
	@FXML
	private TextArea txtAreaEventLog;
	@FXML
	private ListView<String> listUsersConnected;
	@FXML
	private Button btnStartServer;
	@FXML
	private Button btnStopServer;
	
	private Server server;
	
	private ObservableList<String> users;

	public void startServer() {
		// ceate a new Server
		server = new Server(1500, this);
		users = FXCollections.observableArrayList();
		listUsersConnected.setItems(users);
		new ServerRunning().start();
		btnStartServer.setDisable(true);
		btnStopServer.setDisable(false);
	}

	public void stopServer() {
		if(server != null) {
			server.stop();
			btnStopServer.setDisable(true);
			btnStartServer.setDisable(false);
			listUsersConnected.setItems(null);
			server = null;
			return;
		}
	}

	/*
	 * A thread to run the Server
	 */
	class ServerRunning extends Thread {
		public void run() {
			server.start();         // should execute until if fails
			// the server failed
			appendEvent("Server Stopped\n");
			server = null;
			users = null;
		}
	}
	
	public void addUser(String user) {
		users.add(user);
		listUsersConnected.setItems(users);
	}
	public void appendEvent(String string) {
		txtAreaEventLog.appendText(string + "\n");
	}

	public void appendRoom(String messageLf) {
		txtAreaChatMsg.appendText(messageLf + "\n");
	}

	public void remove(String username) {
		users.remove(username);
		listUsersConnected.setItems(users);
	}
}
