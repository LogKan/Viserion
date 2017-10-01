package client.clientSplashScreen;
import abstractClasses.Controller;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.concurrent.Worker;

/**
 * Copyright 2015, FHNW, Prof. Dr. Brad Richards. All rights reserved. This code
 * is licensed under the terms of the BSD 3-clause license (see the file
 * license.txt).
 * 
 * @author Brad Richards
 */
public class Client_Splash_Controller extends Controller<Client_Splash_Model, Client_Splash_View> {
	public Client_Splash_Controller(final client.Dominion_Client main, Client_Splash_Model model, Client_Splash_View view) {
        super(model, view);
        
        // We could monitor the progress property and pass it on to the progress bar
        // However, JavaFX can also do this for us: We just bind the progressProperty of the
        // progress bar to the progressProperty of the task.
        view.progress.progressProperty().bind(model.initializer.progressProperty());

        model.initializer.stateProperty().addListener(
                (observable, oldValue, newValue) -> {
                    if (newValue == Worker.State.SUCCEEDED)
                        main.startApp();
                });
    }
}
