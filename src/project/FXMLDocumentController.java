/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.SubScene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javax.swing.JOptionPane;

/**
 *
 * @author Enjoy
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private StackPane stack_pane;
    private Scene sc;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
 try {
            //Node root = FXMLLoader.load(getClass().getResource("pane2.fxml"));
            //Node ppp = FXMLLoader.load(getClass().getResource("start.fxml"));
//            pane.getChildren().clear();
         //   stack_pane.getChildren().add(root);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        
        }

        
// TODO
    }  

    @FXML
    private void show(MouseEvent event) {
 
     try {
            Node root = FXMLLoader.load(getClass().getResource("student.fxml"));
            
            stack_pane.getChildren().clear();
             stack_pane.getChildren().add(root);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        
        }
    
    }
    
    @FXML
    private void show2(MouseEvent event) {
 
     try {
            Node root = FXMLLoader.load(getClass().getResource("doctors.fxml"));
            stack_pane.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
             stack_pane.getChildren().clear();
             stack_pane.getChildren().add(root);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        
        }
    
    }
        @FXML
    private void show3(MouseEvent event) {
 
     try {
            Node root = FXMLLoader.load(getClass().getResource("depart.fxml"));
             stack_pane.getChildren().clear();
             stack_pane.getChildren().add(root);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        
        }
    
    }
            @FXML
    private void show4(MouseEvent event) {
 
     try {
           
            Node root = FXMLLoader.load(getClass().getResource("subject.fxml"));
             stack_pane.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
             stack_pane.getChildren().clear();
             stack_pane.getChildren().add(root);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        
        }
    
    }
}
