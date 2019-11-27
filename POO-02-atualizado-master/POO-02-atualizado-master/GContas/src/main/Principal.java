/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Principal extends Application {
    
    public static void main(String[] args) {
        launch(args);
    }
    
    private static Stage stage;
    
    private static Scene login;
    private static Scene cadastrar;
    private static Scene cancelar;
    private static Scene salvar;
    private static Scene atualizar;
    private static Scene apagar;
    private static Scene limpar;
    
    
    @Override
    public void start(Stage stageP) throws Exception {
        
        stage = stageP;
        stageP.setTitle("Login");
        
        Parent fxmlLogin = FXMLLoader.load(getClass().getResource("/visao/Login.fxml"));
        login = new Scene(fxmlLogin);
        
        Parent fxmlCadastrar = FXMLLoader.load(getClass().getResource("/visao/Cadastrar.fxml"));
        cadastrar = new Scene(fxmlCadastrar);
        
        Parent fxmlCancelar = FXMLLoader.load(getClass().getResource("/visao/Cancelar.fxml"));
        cancelar = new Scene(fxmlCancelar);
        
        Parent fxmlSalvar = FXMLLoader.load(getClass().getResource("/visao/Salvar.fxml"));
        salvar = new Scene(fxmlSalvar);
        
        Parent fxmlAtualizar = FXMLLoader.load(getClass().getResource("/visao/Atualizar.fxml"));
        atualizar = new Scene(fxmlAtualizar);
        
        Parent fxmlApagar = FXMLLoader.load(getClass().getResource("/visao/Apagar.fxml"));
        apagar = new Scene(fxmlApagar);
        
        Parent fxmlLimpar = FXMLLoader.load(getClass().getResource("/visao/Limpar.fxml"));
        limpar = new Scene(fxmlLimpar);
        
        stageP.setScene(login);
        stageP.show();
    }
        
        //Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        //Scene scene = new Scene(root);
        
        //stage.setScene(scene);
        //stage.show();
    

    public static void changeScreen(String tela) {
        switch(tela){
            case "login":
                stage.setScene(login);
                break;
            
            case "cadastrar":
                stage.setScene(cadastrar);
                break;
                
            case "cancelar":
                stage.setScene(cancelar);
                break;
                
            case "salvar":
                stage.setScene(salvar);
                break;
                
            case "atualizar":
                stage.setScene(atualizar);
                break;
                
            case "apagar":
                stage.setScene(apagar);
                break;
                
            case "limpar":
                stage.setScene(limpar);
                break;
        }
        
    }
    
}
