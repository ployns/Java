package labweek11;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Moke
 */
public class MainController implements Initializable {

    @FXML
    private TextField Annual_Interest_Rate;
    @FXML
    private TextField Number_Of_Years;
    @FXML
    private TextField Loan_Amount;
    @FXML
    private TextField Monthly_Payment;
    @FXML
    private TextField Total_Payment;
    @FXML
    private Button save;
    @FXML
    private Button load;
    @FXML
    private Button clear;
    @FXML
    private Button calculate;
    @FXML
    private Label warning;


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void save(ActionEvent event) throws FileNotFoundException, IOException {
        DataOutputStream outfile
                = new DataOutputStream(new FileOutputStream("loan.dat"));
        outfile.writeUTF(Annual_Interest_Rate.getText());
        outfile.writeUTF(Number_Of_Years.getText());
        outfile.writeUTF(Loan_Amount.getText());
        outfile.close();
    }

    @FXML
    private void load(ActionEvent event) throws FileNotFoundException, IOException {
        DataInputStream infile
                = new DataInputStream(new FileInputStream("loan.dat"));
        Annual_Interest_Rate.setText(infile.readUTF());
        Number_Of_Years.setText(infile.readUTF());
        Loan_Amount.setText(infile.readUTF());
        Monthly_Payment.clear();
        Total_Payment.clear();
        infile.close();
    }

    @FXML
    private void clear(ActionEvent event) {
        Annual_Interest_Rate.clear();
        Number_Of_Years.clear();
        Loan_Amount.clear();
        Monthly_Payment.clear();
        Total_Payment.clear();
    }

    @FXML
    private void calculate(ActionEvent event) {
        Loan l = new Loan(Double.parseDouble(Annual_Interest_Rate.getText()), Integer.parseInt(Number_Of_Years.getText()), Double.parseDouble(Loan_Amount.getText()));
        Monthly_Payment.setText(Double.toString(l.getMonthlyPayment()));
        Total_Payment.setText(Double.toString(l.getTotalPayment()));

        warning.setText("Only Number!!");


    }
    


}
