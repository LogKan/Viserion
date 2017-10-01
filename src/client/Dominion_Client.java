package client;

import client.clientSplashScreen.Client_Splash_Controller;
import client.clientSplashScreen.Client_Splash_Model;
import client.clientSplashScreen.Client_Splash_View;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;

public class Dominion_Client extends Application{
	private static Dominion_Client mainProgram; // singleton
    private Client_Splash_View splashView;
    private App_View view;

    private ServiceLocator serviceLocator; // resources, after initialization

	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
    public void init() {
        if (mainProgram == null) {
            mainProgram = this;
        } else {
            Platform.exit();
        }
    }

	@Override
	public void start(Stage primaryStage) throws Exception {
        // Create and display the splash screen and model
        Client_Splash_Model splashModel = new Client_Splash_Model();
        splashView = new Client_Splash_View(primaryStage, splashModel);
        new Client_Splash_Controller(this, splashModel, splashView);
        splashView.start();

        // Display the splash screen and begin the initialization
        splashModel.initialize();		
	}
	
	public void startApp() {
		
	}
	
	public void stop(){
		
	}

}
