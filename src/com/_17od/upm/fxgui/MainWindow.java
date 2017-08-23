package com._17od.upm.fxgui;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class MainWindow extends Application
{
  MenuBar menuBar;
  Menu menuDatabase;
  Menu menuAccount;
  Menu menuHelp;
  
  // Database MenuItems
  MenuItem newDatabase;
  MenuItem openDatabase;
  MenuItem openDatabaseURL;
  SeparatorMenuItem sep1;
  MenuItem syncRemote;
  MenuItem changeMasterPass;
  MenuItem dataProp;
  SeparatorMenuItem sep2;
  MenuItem dataExport;
  MenuItem dataImport;
  SeparatorMenuItem sep3;
  MenuItem exit;
  
  // Account MenuItems
  MenuItem addAccount;
  MenuItem editAccount;
  MenuItem deleteAccount;
  MenuItem viewAccount;
  MenuItem copyUsername;
  MenuItem copyPassword;
  MenuItem launchURL;
  
  // Help MenuItems
  MenuItem about;
  
  public void start(Stage primaryStage) throws Exception
  {
    menuBar      = new MenuBar();
    menuDatabase = new Menu("Database");
    menuAccount  = new Menu("Account");
    menuHelp     = new Menu("Help");
    
    Menu[] menus = new Menu[] { menuDatabase, menuAccount, menuHelp };
    
    ArrayList<MenuItem> databaseMenuItems = new ArrayList<MenuItem>();
    
    menuBar.getMenus().addAll(menus);
    
    // Database MenuItems
    newDatabase      = new MenuItem("New Database");
    openDatabase     = new MenuItem("Open Database");
    openDatabaseURL  = new MenuItem("Open Database from URL");
    sep1             = new SeparatorMenuItem();
    syncRemote       = new MenuItem("Sync with Remote Database");
    changeMasterPass = new MenuItem("Change Master Password");
    dataProp         = new MenuItem("Database Properties");
    sep2             = new SeparatorMenuItem();
    dataExport       = new MenuItem("Export");
    dataImport       = new MenuItem("Import");
    sep3             = new SeparatorMenuItem();
    exit             = new MenuItem("Exit");
    
//    newDatabase.setOnAction(value);
//    newDatabase.setAccelerator(value);
    
    // Account MenuItems
    addAccount    = new MenuItem("Add Account");
    editAccount   = new MenuItem("Edit Account");
    deleteAccount = new MenuItem("Delete Account");
    viewAccount   = new MenuItem("View Account");
    copyUsername  = new MenuItem("Copy Username");
    copyPassword  = new MenuItem("Copy Password");
    launchURL     = new MenuItem("Launch URL");
    
    // Help MenuItems
    about = new MenuItem("About");
    
    // TODO Probably gonna want to see about getting a shortcut bar in here
  }
}