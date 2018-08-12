/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package project;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.StackPane;

/**
 *
 * @author muhammad ashraf bahy
 */
public class controller {
    @FXML
    private StackPane spane;
     
    @FXML
    public void show() throws Exception{
        Parent root =FXMLLoader.load(getClass().getResource("pane1.fxml"));
        spane.getChildren().clear();
        spane.getChildren().add(root);
        
    }
 
       @FXML
    public void show1() throws Exception{
        Parent root =FXMLLoader.load(getClass().getResource("pane2.fxml"));
        spane.getChildren().clear();
        spane.getChildren().add(root);
        
    }
       @FXML
    public void show2() throws Exception{
        Parent root =FXMLLoader.load(getClass().getResource("pane3.fxml"));
        spane.getChildren().clear();
        spane.getChildren().add(root);
        
    }
       @FXML
    public void show3() throws Exception{
        Parent root =FXMLLoader.load(getClass().getResource("pane4.fxml"));
        spane.getChildren().clear();
        spane.getChildren().add(root);
        
    }
       @FXML
    public void show4() throws Exception{
        Parent root =FXMLLoader.load(getClass().getResource("pane5.fxml"));
        spane.getChildren().clear();
        spane.getChildren().add(root);
        
    }
       @FXML
    public void show5() throws Exception{
        Parent root =FXMLLoader.load(getClass().getResource("pane6.fxml"));
        spane.getChildren().clear();
        spane.getChildren().add(root);
        
    }
}
