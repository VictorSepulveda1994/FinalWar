/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.Stage;

/**
 *
 * @author Freyja
 */
public class EscenaJuego extends Application{
    private int width=800,height=600;

    @Override
    public void start(Stage primaryStage) throws Exception {
        Group root = new Group();
        primaryStage.setTitle("FW");
        primaryStage.setResizable(false);
        primaryStage.setScene(new Scene(root, width, height));

        Canvas canvas = new Canvas( width, height );
        root.getChildren().add(canvas);

        GraphicsContext gc = canvas.getGraphicsContext2D();

        final long startNanoTime = System.nanoTime();

        new AnimationTimer()
        {
            public void handle(long currentNanoTime)
            {
                double t = (currentNanoTime - startNanoTime) / 1000000000.0;// actualiza a 60fps
                //agregar aqui las animaciones, para ocupar, darle a la animacion el parametro t
            }
        }.start();
        
        primaryStage.show();
    }
    
}
