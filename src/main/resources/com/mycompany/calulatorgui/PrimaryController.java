
package com.mycompany.calulatorgui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import java.io.IOException;

public class PrimaryController implements Initializable {
//These are all the buttons that will be in the calculator for the user to click.
    @FXML
    private TextField txt_Result;
    @FXML
    private Button nine;
    @FXML
    private Button seven;
    @FXML
    private Button eight;
    @FXML
    private Button divide;
    @FXML
    private Button four;
    @FXML
    private Button five;
    @FXML
    private Button six;
    @FXML
    private Button multiply;
    @FXML
    private Button one;
    @FXML
    private Button two;
    @FXML
    private Button three;
    @FXML
    private Button subtract;
    @FXML
    private Button zero;
    @FXML
    private Button clear;
    @FXML
    private Button equal;
    @FXML
    private Button addition;
    
    //These variables will hold two numbers and one operand and the variable answer will give the result.
    private int num1;
    private int num2;
    private int operand;
    private int answer;
    
    //Action button for the numbers between 0-9 and the clear button.
    @FXML
     void btnsClicked(ActionEvent event) {
        if(event.getSource()==one){
           txt_Result.setText(txt_Result.getText()+"1");
        }
        if(event.getSource()==two){
            txt_Result.setText(txt_Result.getText()+"2");
        }
        if(event.getSource()==three){
            txt_Result.setText(txt_Result.getText()+"3");
        }
        if(event.getSource()==four){
            txt_Result.setText(txt_Result.getText()+"4");
        }
         else if(event.getSource()==five){
            txt_Result.setText(txt_Result.getText()+"5");
        }
        if(event.getSource()==six){
            txt_Result.setText(txt_Result.getText()+"6");
        }
        if(event.getSource()==seven){
            txt_Result.setText(txt_Result.getText()+"7");
        }
        if(event.getSource()==eight){
            txt_Result.setText(txt_Result.getText()+"8");
        }
        if(event.getSource()==nine){
            txt_Result.setText(txt_Result.getText()+"9");
        }
        if(event.getSource()==zero){
            txt_Result.setText(txt_Result.getText()+"0");
        }
        if(event.getSource()==clear){
            txt_Result.setText("");
        }
        
        //These are the operand buttons.
        if (event.getSource()==addition){
            num1=Integer.parseInt(txt_Result.getText());
            txt_Result.setText("");
            this.operand = 1;
        }
        if(event.getSource()==subtract){
            num1=Integer.parseInt(txt_Result.getText());
            txt_Result.setText("");
            this.operand = 2;
        }
        if(event.getSource()==divide){
            num1=Integer.parseInt(txt_Result.getText());
            txt_Result.setText("");
            this.operand = 3;
        }
        if(event.getSource()==multiply){
            num1=Integer.parseInt(txt_Result.getText());
            txt_Result.setText("");
            this.operand = 4;
        }
        if(event.getSource()==equal){
            num2=Integer.parseInt(txt_Result.getText());
            
             //Switch statements that will calculate the two numbers based on the operand that the user clicked.
        switch(operand){
            case 1: this.answer=num1+num2;
            txt_Result.setText(String.valueOf(answer));
            break;
             case 2: this.answer=num1-num2;
            txt_Result.setText(String.valueOf(answer));
            break;
             case 3: this.answer=num1/num2;
            txt_Result.setText(String.valueOf(answer));
            break;
             case 4: this.answer=num1*num2;
            txt_Result.setText(String.valueOf(answer));
            break;
        }
           
        }
        
    }
     
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }   
    
}
