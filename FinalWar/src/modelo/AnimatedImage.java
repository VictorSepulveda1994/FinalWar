/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javafx.scene.image.Image;

/**
 * Created by Freyja on 03-11-2018.
 */
public class AnimatedImage
{
    public Image[] frames;
    public double duration;

    public Image getFrame(double time)
    {
        int index = (int)((time % (frames.length * duration)) / duration);
        return frames[index];
    }
}