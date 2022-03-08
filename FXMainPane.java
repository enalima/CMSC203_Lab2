import javafx.application.Platform;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

/**
 * This panel is the basic panel, inside which other panels are placed.  
 * Before beginning to implement, design the structure of your GUI in order to 
 * understand what panels go inside which ones, and what buttons or other components
 * go in which panels.  
 * @author ralexander
 *
 */
//make the main panel's layout be a VBox
public class FXMainPane extends VBox {

	

	//student Task #2:
	//  declare five buttons, a label, and a textfield
	//  declare two HBoxes
	Button b1;
	Button b2;
	Button b3;
	Button b4;
	Button b5;
	
	Label l1;
	
	TextField t1;
	
	HBox h1;
	HBox h2;
	
	//student Task #4:
	//  declare an instance of DataManager
	DataManager d1;
	/**
	 * The MainPanel constructor sets up the entire GUI in this approach.  Remember to
	 * wait to add a component to its containing component until the container has
	 * been created.  This is the only constraint on the order in which the following 
	 * statements appear.
	 */
	public FXMainPane() {
		//student Task #2:
		//  instantiate the buttons, label, and textfield
		//  instantiate the HBoxes
		b1 = new Button("Hello");
		b2 = new Button("Howdy");
		b3 = new Button("Chinesse");
		b4 = new Button("Clear");
		b5 = new Button("Exit");
		
		l1 = new Label("Feedback:");
		
		t1 = new TextField();
		
		h1 = new HBox();
		h2 = new HBox();
		

		
		
		//student Task #4:
		//  instantiate the DataManager instance
		//  set margins and set alignment of the components
		d1 = new DataManager();
		//student Task #3:
		//  add the label and textfield to one of the HBoxes
		//  add the buttons to the other HBox
		//  add the HBoxes to this FXMainPanel (a VBox)
		h1.getChildren().addAll(b1,b2,b3,b4,b5);
		
		h1.setAlignment(Pos.CENTER);
		h2.setAlignment(Pos.CENTER);
		
		h2.getChildren().addAll(l1,t1);
		
		getChildren().addAll(h1,h2);
		
		b1.setOnAction(new ButtonClickHandler());
		
//		b2.setOnAction(new ButtonClickHandler());
//		
//		b3.setOnAction(new ButtonClickHandler());
//		
//		b4.setOnAction(new ButtonClickHandler());
//	
//		b5.setOnAction(new ButtonClickHandler());
		
		
	}
	
	//Task #4:
	//  create a private inner class to handle the button clicks
	class ButtonClickHandler implements EventHandler<ActionEvent>
	{
	
	    @Override
	    public void handle(ActionEvent event)
	    {
	    		  l1.setText(d1.getHello());
	    }
	    
	    
	    
	}
}
	