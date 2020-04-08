package application;




import javafx.fxml.*;
import javafx.scene.control.Button;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputControl;
import javafx.scene.text.Text;

public class TicTacToeGame {
	
	@FXML
	private TextField display;
	@FXML
	private Button Button1;
	@FXML
	private Button Button2;
	@FXML
	private Button Button3;
	@FXML
	private Button Button4;
	@FXML
	private Button Button5;
	@FXML
	private Button Button6;
	@FXML
	private Button Button7;
	@FXML
	private Button Button8;
	@FXML
	private Button Button9;
	
	int count=0;
	
	@FXML
	public void StartGame1() {
		if(count % 2 == 0) {
			Button1.setText("0");
			check();
			count++;
		}else {
			Button1.setText("X");
			check();
			count++;
		}
		
	}
	@FXML
	public void StartGame2() {
		if(count % 2 == 0) {
			Button2.setText("0");
			check();
			count++;
		}else {
			Button2.setText("X");
			check();
			count++;
		}
	}
	@FXML
	public void StartGame3() {
		if(count % 2 == 0) {
			Button3.setText("0");
			check();
			count++;
		}else {
			Button3.setText("X");
			check();
			count++;
		}
	}
	@FXML
	public void StartGame4() {
		if(count % 2 == 0) {
			Button4.setText("0");
			check();
			count++;
		}else {
			Button4.setText("X");
			check();
			count++;
		}
	}
	@FXML
	public void StartGame5() {
		if(count % 2 == 0) {
			Button5.setText("0");
			check();
			count++;
		}else {
			Button5.setText("X");
			check();
			count++;
		}
	}
	@FXML
	public void StartGame6() {
		if(count % 2 == 0) {
			Button6.setText("0");
			check();
			count++;
		}else {
			Button6.setText("X");
			check();
			count++;
		}
	}
	@FXML
	public void StartGame7() {
		if(count % 2 == 0) {
			Button7.setText("0");
			check();
			count++;
		}else {
			Button7.setText("X");
			check();
			count++;
		}
	}
	@FXML
	public void StartGame8() {
		if(count % 2 == 0) {
			Button8.setText("0");
			check();
			count++;
		}else {
			Button8.setText("X");
			check();
			count++;
		}
	}
	@FXML
	public void StartGame9() {
		if(count % 2 == 0) {
			Button9.setText("0");
			check();
			count++;
		}else {
			Button9.setText("X");
			check();
			count++;
		}
	}
	
	public void check() {
		
		if(Button1.getText()=="0" && Button2.getText()=="0" && Button3.getText()=="0" || Button1.getText()=="X" && Button2.getText()=="X" && Button3.getText()=="X" ) {
			if(count%2==0) {
				display.setText("0 Win The Match");
			}else {
				display.setText("x Win The Match");
			}
		}
		if(Button4.getText()=="0" && Button5.getText()=="0" && Button6.getText()=="0" || Button4.getText()=="X" && Button5.getText()=="X" && Button6.getText()=="X") {
			if(count%2==0) {
				display.setText("0 Win The Match");
			}else {
				display.setText("x Win The Match");
			}
		}
		if(Button7.getText()=="0" && Button8.getText()=="0" && Button9.getText()=="0" || Button7.getText()=="X" && Button8.getText()=="X" && Button9.getText()=="X") {
			if(count%2==0) {
				display.setText("0 Win The Match");
			}else {
				display.setText("x Win The Match");
			}
		}
		if(Button1.getText()=="0" && Button5.getText()=="0" && Button9.getText()=="0" || Button1.getText()=="X" && Button5.getText()=="X" && Button9.getText()=="X") {
			display.setText("You Win The Match");if(count%2==0) {
				display.setText("0 Win The Match");
			}else {
				display.setText("x Win The Match");
			}
		}
		if(Button3.getText()=="0" && Button5.getText()=="0" && Button7.getText()=="0" || Button3.getText()=="X" && Button5.getText()=="X" && Button7.getText()=="X") {
			if(count%2==0) {
				display.setText("0 Win The Match");
			}else {
				display.setText("x Win The Match");
			}
		}
		if(Button1.getText()=="0" && Button4.getText()=="0" && Button7.getText()=="0" || Button1.getText()=="X" && Button4.getText()=="X" && Button7.getText()=="X") {
			if(count%2==0) {
				display.setText("0 Win The Match");
			}else {
				display.setText("x Win The Match");
			}
		}
		if(Button2.getText()=="0" && Button5.getText()=="0" && Button8.getText()=="0" || Button2.getText()=="X" && Button5.getText()=="X" && Button8.getText()=="X") {
			if(count%2==0) {
				display.setText("0 Win The Match");
			}else {
				display.setText("x Win The Match");
			}
		}
		if(Button3.getText()=="0" && Button6.getText()=="0" && Button9.getText()=="0" || Button3.getText()=="X" && Button6.getText()=="X" && Button9.getText()=="X") {
			if(count%2==0) {
				display.setText("0 Win The Match");
			}else {
				display.setText("x Win The Match");
			}
		}
	}
	
	public void reset() {
		Button1.setText("");
		Button2.setText("");
		Button3.setText("");
		Button4.setText("");
		Button5.setText("");
		Button6.setText("");
		Button7.setText("");
		Button8.setText("");
		Button9.setText("");
		display.setText("");
		
	}
	

}
