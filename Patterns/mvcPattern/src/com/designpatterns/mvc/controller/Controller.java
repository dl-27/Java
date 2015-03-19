/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.designpatterns.mvc.controller;
import com.designpatterns.mvc.view.View;
import com.designpatterns.mvc.model.Model;

/**
 *
 * @author Daria
 */
public class Controller {
    
    private View view;
    private Model model;
    
    public Controller(View view, Model model){
        this.view = view;
        this.model = model;
    }
}
