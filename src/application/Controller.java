package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
//import javafx.scene.control.TextField;

public class Controller {

	/*
	 * @FXML private TextField name1;
	 * 
	 * @FXML private TextField name2;
	 * 
	 * @FXML private TextField name3;
	 * 
	 * @FXML private TextField name4;
	 * 
	 * @FXML private Button add10btn1;
	 * 
	 * @FXML private Button add20btn1;
	 * 
	 * @FXML private Button add50btn1;
	 * 
	 * @FXML private Button add100btn1;
	 * 
	 * @FXML private Button sub10btn1;
	 * 
	 * @FXML private Button sub20btn1;
	 * 
	 * @FXML private Button sub50btn1;
	 * 
	 * @FXML private Button sub100btn1;
	 * 
	 * @FXML private Button add10btn2;
	 * 
	 * @FXML private Button add20btn2;
	 * 
	 * @FXML private Button add500btn2;
	 * 
	 * @FXML private Button add100btn2;
	 * 
	 * @FXML private Button sub10btn2;
	 * 
	 * @FXML private Button sub20btn2;
	 * 
	 * @FXML private Button sub50btn2;
	 * 
	 * @FXML private Button sub100btn2;
	 * 
	 * @FXML private Button add10btn3;
	 * 
	 * @FXML private Button add20btn3;
	 * 
	 * @FXML private Button add500btn3;
	 * 
	 * @FXML private Button add100btn3;
	 * 
	 * @FXML private Button sub10btn3;
	 * 
	 * @FXML private Button sub20btn3;
	 * 
	 * @FXML private Button sub50btn3;
	 * 
	 * @FXML private Button sub100btn3;
	 * 
	 * @FXML private Button add10btn4;
	 * 
	 * @FXML private Button add20btn4;
	 * 
	 * @FXML private Button add50btn4;
	 * 
	 * @FXML private Button add100btn4;
	 * 
	 * @FXML private Button sub10btn4;
	 * 
	 * @FXML private Button sub20btn4;
	 * 
	 * @FXML private Button sub500btn4;
	 * 
	 * @FXML private Button sub100btn4;
	 */
	@FXML
	private Button score1;
	@FXML
	private Button score2;
	@FXML
	private Button score3;
	@FXML
	private Button score4;

	// Player 1
	// Add

	public void add10p1() {
		int oldValue = Integer.parseInt(score1.getText());
		int newValue = oldValue + 10;
		score1.setText("" + newValue);
	}

	public void add20p1() {
		int oldValue = Integer.parseInt(score1.getText());
		int newValue = oldValue + 20;
		score1.setText("" + newValue);
	}

	public void add50p1() {
		int oldValue = Integer.parseInt(score1.getText());
		int newValue = oldValue + 50;
		score1.setText("" + newValue);
	}

	public void add100p1() {
		int oldValue = Integer.parseInt(score1.getText());
		int newValue = oldValue + 100;
		score1.setText("" + newValue);
	}

	// sub

	public void sub10p1() {
		int oldValue = Integer.parseInt(score1.getText());
		int newValue = oldValue - 10;
		score1.setText("" + newValue);
	}

	public void sub20p1() {
		int oldValue = Integer.parseInt(score1.getText());
		int newValue = oldValue - 20;
		score1.setText("" + newValue);
	}

	public void sub50p1() {
		int oldValue = Integer.parseInt(score1.getText());
		int newValue = oldValue - 50;
		score1.setText("" + newValue);
	}

	public void sub100p1() {
		int oldValue = Integer.parseInt(score1.getText());
		int newValue = oldValue - 100;
		score1.setText("" + newValue);
	}

	// Player 2
	// Add

	public void add10p2() {
		int oldValue = Integer.parseInt(score2.getText());
		int newValue = oldValue + 10;
		score2.setText("" + newValue);
	}

	public void add20p2() {
		int oldValue = Integer.parseInt(score2.getText());
		int newValue = oldValue + 20;
		score2.setText("" + newValue);
	}

	public void add50p2() {
		int oldValue = Integer.parseInt(score2.getText());
		int newValue = oldValue + 50;
		score2.setText("" + newValue);
	}

	public void add100p2() {
		int oldValue = Integer.parseInt(score2.getText());
		int newValue = oldValue + 100;
		score2.setText("" + newValue);
	}

	// sub

	public void sub10p2() {
		int oldValue = Integer.parseInt(score2.getText());
		int newValue = oldValue - 10;
		score2.setText("" + newValue);
	}

	public void sub20p2() {
		int oldValue = Integer.parseInt(score2.getText());
		int newValue = oldValue - 20;
		score2.setText("" + newValue);
	}

	public void sub50p2() {
		int oldValue = Integer.parseInt(score2.getText());
		int newValue = oldValue - 50;
		score2.setText("" + newValue);
	}

	public void sub100p2() {
		int oldValue = Integer.parseInt(score2.getText());
		int newValue = oldValue - 100;
		score2.setText("" + newValue);
	}
	// Player 3
	// Add

	public void add10p3() {
		int oldValue = Integer.parseInt(score3.getText());
		int newValue = oldValue + 10;
		score3.setText("" + newValue);
	}

	public void add20p3() {
		int oldValue = Integer.parseInt(score3.getText());
		int newValue = oldValue + 20;
		score3.setText("" + newValue);
	}

	public void add50p3() {
		int oldValue = Integer.parseInt(score3.getText());
		int newValue = oldValue + 50;
		score3.setText("" + newValue);
	}

	public void add100p3() {
		int oldValue = Integer.parseInt(score3.getText());
		int newValue = oldValue + 100;
		score3.setText("" + newValue);
	}

	// sub

	public void sub10p3() {
		int oldValue = Integer.parseInt(score3.getText());
		int newValue = oldValue - 10;
		score3.setText("" + newValue);
	}

	public void sub20p3() {
		int oldValue = Integer.parseInt(score3.getText());
		int newValue = oldValue - 20;
		score3.setText("" + newValue);
	}

	public void sub50p3() {
		int oldValue = Integer.parseInt(score3.getText());
		int newValue = oldValue - 50;
		score3.setText("" + newValue);
	}

	public void sub100p3() {
		int oldValue = Integer.parseInt(score3.getText());
		int newValue = oldValue - 100;
		score3.setText("" + newValue);
	}

	// Player 4
	// Add

	public void add10p4() {
		int oldValue = Integer.parseInt(score4.getText());
		int newValue = oldValue + 10;
		score4.setText("" + newValue);
	}

	public void add20p4() {
		int oldValue = Integer.parseInt(score4.getText());
		int newValue = oldValue + 20;
		score4.setText("" + newValue);
	}

	public void add50p4() {
		int oldValue = Integer.parseInt(score4.getText());
		int newValue = oldValue + 50;
		score4.setText("" + newValue);
	}

	public void add100p4() {
		int oldValue = Integer.parseInt(score4.getText());
		int newValue = oldValue + 100;
		score4.setText("" + newValue);
	}

	// sub

	public void sub10p4() {
		int oldValue = Integer.parseInt(score4.getText());
		int newValue = oldValue - 10;
		score4.setText("" + newValue);
	}

	public void sub20p4() {
		int oldValue = Integer.parseInt(score4.getText());
		int newValue = oldValue - 20;
		score4.setText("" + newValue);
	}

	public void sub50p4() {
		int oldValue = Integer.parseInt(score4.getText());
		int newValue = oldValue - 50;
		score4.setText("" + newValue);
	}

	public void sub100p4() {
		int oldValue = Integer.parseInt(score4.getText());
		int newValue = oldValue - 100;
		score4.setText("" + newValue);
	}

}
