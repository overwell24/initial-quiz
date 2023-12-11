/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.initialquiz.captcha;

import com.initialquiz.frame.LoginFrame;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import nl.captcha.Captcha;
import nl.captcha.backgrounds.GradiatedBackgroundProducer;
import nl.captcha.gimpy.DropShadowGimpyRenderer;
import nl.captcha.text.producer.DefaultTextProducer;


public class captchaGenerate {
    private Captcha captcha; 
    private String captchaText;
    private static int width = 175;
    private static int height = 65;
    
    public Captcha getcaptcha(){
        captcha = new Captcha.Builder(width, height)
                .addText(new DefaultTextProducer())
                .addBackground(new GradiatedBackgroundProducer())
                .addNoise()
                .addBorder()
                .build();
        
        return captcha;
    }
}
