package com.example.calculator6;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class CalculatorController implements Initializable {
    private double answer;
    private double num1;
    private double num2;
    private String function = "";
    @FXML
    private Label GUI;
    @FXML
    private Button button0;
    @FXML
    private Button button00;
    @FXML
    private Button button1;
    @FXML
    private Button button2;
    @FXML
    private Button button3;
    @FXML
    private Button button4;
    @FXML
    private Button button5;
    @FXML
    private Button button6;
    @FXML
    private Button button7;
    @FXML
    private Button button8;
    @FXML
    private Button button9;
    @FXML
    private Button dotButton;
    @FXML
    private Button addButton;
    @FXML
    private Button subtractButton;
    @FXML
    private Button multiplyButton;
    @FXML
    private Button divideButton;
    @FXML
    private Button clearButton;
    @FXML
    private Button openBracketButton;
    @FXML
    private Button closeBracketButton;
    @FXML
    private Button equalsButton;

    public void button0Clicked(ActionEvent event) {
        GUI.setText(GUI.getText() + "0");
    }

    public void button00Clicked(ActionEvent event) {
        GUI.setText(GUI.getText() + "00");
    }

    public void button1Clicked(ActionEvent event) {
        GUI.setText(GUI.getText() + "1");
    }

    public void button2Clicked(ActionEvent event) {
        GUI.setText(GUI.getText() + "2");
    }

    public void button3Clicked(ActionEvent event) {
        GUI.setText(GUI.getText() + "3");
    }

    public void button4Clicked(ActionEvent event) {
        GUI.setText(GUI.getText() + "4");
    }

    public void button5Clicked(ActionEvent event) {
        GUI.setText(GUI.getText() + "5");
    }

    public void button6Clicked(ActionEvent event) {
        GUI.setText(GUI.getText() + "6");
    }

    public void button7Clicked(ActionEvent event) {
        GUI.setText(GUI.getText() + "7");
    }

    public void button8Clicked(ActionEvent event) {
        GUI.setText(GUI.getText() + "8");
    }

    public void button9Clicked(ActionEvent event) {
        GUI.setText(GUI.getText() + "9");
    }

    public void addButtonClicked(ActionEvent event) {
        num1 = Double.parseDouble(GUI.getText());
        function = "+";
        GUI.setText("");
    }

    public void subtractButtonClicked(ActionEvent event) {
        num1 = Double.parseDouble(GUI.getText());
        function = "-";
        GUI.setText("");
    }

    public void multiplyButtonClicked(ActionEvent event) {
        num1 = Double.parseDouble(GUI.getText());
        function = "*";
        GUI.setText("");
    }

    public void divideButtonClicked(ActionEvent event) {
        num1 = Double.parseDouble(GUI.getText());
        function = "/";
        GUI.setText("");
    }

    public void equalsButtonClicked(ActionEvent event) {
        num2 = Double.parseDouble(GUI.getText());
        calculate(getNum1(), getFunction(), getNum2());
        GUI.setText(String.valueOf(getAnswer()));
        function = "";
    }

    public void dotButtonClicked(ActionEvent event) {
        GUI.setText(GUI.getText() + ".");
    }

    public void clearButtonClicked(ActionEvent event) {
        GUI.setText("");
    }

    public void openBracketButtonClicked(ActionEvent event) {
        GUI.setText("No functionality yet. Click 'C' and continue");
    }

    public void closeBracketButtonClicked(ActionEvent event) {
        GUI.setText("No functionality yet. Click 'C' and continue");
    }

    private double calculate(double num1, String function, double num2) {
        GUI.getText();
        switch (getFunction()) {
            case "+":
                answer = getNum1() + getNum2();
                break;
            case "-":
                answer = getNum1() - getNum2();
                break;
            case "*":
                answer = getNum1() * getNum2();
                break;
            case "/":
                answer = getNum1() / getNum2();
                break;
            default:
        }
        return answer;
    }

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public String getFunction() {
        return function;
    }

    public double getAnswer() {
        return answer;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}