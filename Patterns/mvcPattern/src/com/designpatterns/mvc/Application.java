/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.designpatterns.mvc;

import com.designpatterns.mvc.controller.Controller;
import com.designpatterns.mvc.model.Model;
import com.designpatterns.mvc.view.View;
import javax.swing.SwingUtilities;

public class Application {
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run(){
                runApp();
            }
        });
    }
    
    public static void runApp(){
        Model model = new Model();
        View view = new View (model);
        
        Controller controller = new Controller (view, model);
    }
}
