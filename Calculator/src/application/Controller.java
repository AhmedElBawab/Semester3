package application;

import java.io.IOException;

import eg.edu.alexu.csd.oop.calculator.Calculator;
import eg.edu.alexu.csd.oop.calculator.cs08.MyCalculator;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {

	Calculator c = new MyCalculator();
	
	@FXML
	public TextField formula;
	@FXML
	public Label answer;
	public void one(ActionEvent e) throws IOException {
		this.formula.appendText("1");
	}

	public void two(ActionEvent e) throws IOException {
		this.formula.appendText("2");
	}

	public void three(ActionEvent e) throws IOException {
		this.formula.appendText("3");
	}

	public void four(ActionEvent e) throws IOException {
		this.formula.appendText("4");
	}

	public void five(ActionEvent e) throws IOException {
		this.formula.appendText("5");
	}

	public void six(ActionEvent e) throws IOException {
		this.formula.appendText("6");
	}

	public void seven(ActionEvent e) throws IOException {
		this.formula.appendText("7");
	}

	public void eight(ActionEvent e) throws IOException {
		this.formula.appendText("8");
	}

	public void nine(ActionEvent e) throws IOException {
		this.formula.appendText("9");
	}

	public void zero(ActionEvent e) throws IOException {
		this.formula.appendText("0");
	}
	
	public void dot(ActionEvent e) throws IOException {
		this.formula.appendText(".");
	}

	public void save(ActionEvent e) throws IOException {
		c.save();
	}

	public void load(ActionEvent e) throws IOException {
		c.load();
	}

	public void next(ActionEvent e) throws IOException {
		this.formula.setText(c.next());
	}

	public void prev(ActionEvent e) throws IOException {
		this.formula.setText(c.prev());
	}

	public void enter(ActionEvent e) throws IOException {
		c.input(this.formula.getText());
	}

	public void clear(ActionEvent e) throws IOException {
		this.formula.clear();
		this.answer.setText("");
	}

	public void current(ActionEvent e) throws IOException {
		this.formula.setText(c.current());
		this.answer.setText("");
	}

	public void plus(ActionEvent e) throws IOException {
		this.formula.appendText("+");
	}

	public void minus(ActionEvent e) throws IOException {
		this.formula.appendText("-");
	}

	public void division(ActionEvent e) throws IOException {
		this.formula.appendText("/");
	}

	public void multiply(ActionEvent e) throws IOException {
		this.formula.appendText("*");
	}
	
	public void equal(ActionEvent e) throws IOException {
		this.enter(e);
		this.answer.setText(c.getResult());
	}

}
