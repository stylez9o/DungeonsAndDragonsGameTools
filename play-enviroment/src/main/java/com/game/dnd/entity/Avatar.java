package com.game.dnd.entity;

import java.awt.image.*;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class Avatar extends Application{

        // load the image
        Image image;
        List<Image> images = new ArrayList<Image>();
        List<File> files = new ArrayList<File>();



        public void loadEveryAvatar(int anzahlMonster){
        

            for (int i = 0; i<anzahlMonster; i++) {
                for(int j = 1; j<anzahlMonster; j++){
                    String datei = "avatar" + j + ".png";
                    File file = new File(datei);
                    Image image = new Image(datei);
                    files.add(file);
                    images.add(image);
                }
            }



    @Override
    public void start(Stage arg0) throws Exception {
        
        // simple displays ImageView the image as is
        ImageView iv1 = new ImageView();
        iv1.setImage(image);
        
        // resizes the image to have width of 100 while preserving the ratio and using
         // higher quality filtering method; this ImageView is also cached to
         // improve performance
         ImageView iv2 = new ImageView();
         iv2.setImage(image);
         iv2.setFitWidth(100);
         iv2.setPreserveRatio(true);
         iv2.setSmooth(true);
         iv2.setCache(true);
    }

}
