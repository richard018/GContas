/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Aluno
 */
public class GcontasController implements Initializable {

    @FXML
    private TableColumn<?, ?> Concessionaria;
    @FXML
    private TableColumn<?, ?> Descrição;
    @FXML
    private TableColumn<?, ?> Vencimento;
    @FXML
    private TableColumn<?, ?> ID;
    @FXML
    private Button salva;
    @FXML
    private Button atualizar;
    @FXML
    private Button apagar;
    @FXML
    private Button limpar;
    @FXML
    private TextField concessionaria;
    @FXML
    private TextField descrição;
    @FXML
    private TextField vencimento;
    @FXML
    private TextField id;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void salvar(ActionEvent event) {
    }

    @FXML
    private void atualizar(ActionEvent event) {
    }

    @FXML
    private void apagar(ActionEvent event) {
    }

    @FXML
    private void limpar(ActionEvent event) {
    }

    @FXML
    private void Concessionaria(ActionEvent event) {
    }

    @FXML
    private void Descrição(ActionEvent event) {
    }

    @FXML
    private void Vencimento(ActionEvent event) {
    }

    @FXML
    private void ID(ActionEvent event) {
    }
    
}
