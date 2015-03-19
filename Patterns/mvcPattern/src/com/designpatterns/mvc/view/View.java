/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.designpatterns.mvc.view;

import com.designpatterns.mvc.model.Model;
import javax.swing.JFrame;

/**
 *
 * @author Daria
 */
public class View extends JFrame{
    
    private Model model;
    
    public View (Model model) {
        super("MVC demo");
        
        this.model = model;
    }
}
