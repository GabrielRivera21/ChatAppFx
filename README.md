# ChatAppFx
A Chat App using Java FX to demonstrate TCP/IP Connection

## Prerequisites
You will need the following things properly installed on your computer.

* [JDK SE 1.8.0_45](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
* [Eclipse Luna with e(fx)clipse plugin](http://www.eclipse.org/efxclipse/install.html)
* [Java FX SceneBuilder 2.0](http://www.oracle.com/technetwork/java/javafxscenebuilder-1x-archive-2199384.html)

## Configuring JavaFX SceneBuilder to Eclipse
After Installing JavaFX Scene Builder to your computer you need to:

1. Open Eclipse
2. Click <b>Window</b> -> <b>Preferences</b>
3. Click on <b>JavaFX</b>
4. Browse the <b>SceneBuilder executable</b> for the installed JavaFX Scene Builder 2.0.exe.

## Setting up The Project
##### Clone the Repository
On your Terminal or Git Shell execute the following command on the directory where you want to clone the project.
```bash
$ git clone https://github.com/GabrielRivera21/ChatAppFx.git
```

##### Import the Project to Eclipse
1. Click on <b>File</b> -> <b>Import...</b>
2. Select on <b>General</b> -> <b>Existing Projects into Workspace</b>
3. Then specify the directory where you cloned the project on Root Directory
4. Check the Checkbox of the Project
5. Click <b>Finish</b>

## Running the Application
In order to run this Chat App on your local computer you must deploy the ChatServer first and then open a ChatClient and connect to that ChatServer.

##### Deploying the ChatServer
1. Right-Click `ChatServer.java` -> <b>Run As</b> -> <b>Java Application</b>
2. Then Click on <b>Start</b> on the GUI to start the Server.

##### Connecting to the ChatServer
1. Right-Click `ChatClient.java` -> <b>Run As</b> -> <b>Java Application</b>
2. Leave `localhost` on Host IP Field and Type in the `Username` you want.
3. Click <b>Login</b> on the GUI and you should see yourself connected.



