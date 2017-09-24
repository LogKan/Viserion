package client.abstractClasses;

/**
 * Copyright 2015, FHNW, Prof. Dr. Brad Richards. All rights reserved. This code
 * is licensed under the terms of the BSD 3-clause license (see the file
 * license.txt).
 * 
 * @author Brad Richards
 */
public class Controller<Model, View> {
	protected Model model;
	protected View view;
	
	protected Controller(Model model, View view){
		this.model = model;
		this.view = view;
	}
}
