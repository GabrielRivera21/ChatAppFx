package edu.uprb.chat.controller;

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

	public void startServer() {
		// ceate a new Server
		server = new Server(1500, this);
		new ServerRunning().start();
		btnStartServer.setDisable(true);
		btnStopServer.setDisable(false);
	}

	public void stopServer() {
		if(server != null) {
			server.stop();
			btnStopServer.setDisable(true);
			btnStartServer.setDisable(true);
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
		}
	}

	public void appendEvent(String string) {
		txtAreaEventLog.appendText(string + "\n");
	}

	public void appendRoom(String messageLf) {
		txtAreaChatMsg.appendText(messageLf + "\n");
		
	}
}
