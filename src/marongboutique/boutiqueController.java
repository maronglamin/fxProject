/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marongboutique;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

/**
 *
 * @author admin
 */
public class boutiqueController implements Initializable {
    
    
    @FXML
    private BorderPane bp;

    @FXML
    private Button dashboard;

    @FXML
    private Button addPro;

    @FXML
    private Button sales;

    @FXML
    private Button receipt;

    @FXML
    private Button buy;

    @FXML
    private AnchorPane ap;

    @FXML
    void addPanel(MouseEvent event) throws IOException {
        loadPage("addPanel");
    }

    @FXML
    void buyPanel(MouseEvent event) throws IOException {
        loadPage("buyPanel");

    }

    @FXML
    void dashboardPanel(MouseEvent event) {
        bp.setCenter(ap);
    }

    @FXML
    void receiptPanel(MouseEvent event) throws IOException {
        loadPage("receiptPanel");
    }

    @FXML
    void salesPanel(MouseEvent event) throws IOException {
        loadPage("salesPanel");

    }
    
    private void loadPage(String page) throws IOException {
        Parent root = null;
        
        root = FXMLLoader.load(getClass().getResource(page + ".fxml"));
        
        bp.setCenter(root);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
