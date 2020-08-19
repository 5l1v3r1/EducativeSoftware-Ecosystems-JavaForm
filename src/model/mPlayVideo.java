package model;
import java.awt.BorderLayout;
import java.io.File;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaException;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class mPlayVideo {
    
    private JFXPanel jfxpanel;
    private JPanel jpanel;
    private MediaPlayer mediaplayer;
    private Media media;
    private MediaView mediaView;
    private Scene scene;
    private File file;
    private String path;
    private int H;
    private int W;
    
    // Constructor
    public mPlayVideo(){
        this.jfxpanel = new JFXPanel();

    }
    public void setJpanel(JPanel jpanel) {
        this.jpanel = jpanel;
    }

    /**
     * @return the mediaplayer
     */
    public MediaPlayer getMediaplayer() {
        return mediaplayer;
    }

    /**
     * @param path the path to set
     */
    public void setPath(String path) {
        this.path = path;
    }
    
    public void showVideo(){
        try {
            //getMediaplayer().
            int W = this.jpanel.getWidth();
            int H = this.jpanel.getHeight();
            this.file = new File(this.path);
            this.media = new Media(this.file.toURI().toString());
            this.mediaplayer = new MediaPlayer(this.media);
            this.mediaView = new MediaView(this.mediaplayer);
            this.mediaView.setFitHeight(H);
            this.mediaView.setFitWidth(W);
            this.scene = new Scene(new Group(this.mediaView)); 
            this.jfxpanel.setSize(W,H);
            this.jfxpanel.setScene(this.scene);
            this.getMediaplayer().setCycleCount(MediaPlayer.INDEFINITE);
            
            // border
            this.jpanel.setLayout(new BorderLayout());
            this.jpanel.add(this.jfxpanel, BorderLayout.CENTER);
            
            
            
            
        } catch (MediaException e) {
            JOptionPane.showMessageDialog(null,"There was a mistake while opening a video or file","Error while opening ",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void play(){
        try {
            getMediaplayer().play();
        } catch (MediaException e) {
            System.out.println("There was a mistake while playing");
        }
    }
    public void stop(){
        try {
            getMediaplayer().stop();
        } catch (MediaException e) {
            System.out.println("There was a mistake while stopping");
        }
    }
    public void pause(){
        try {
            getMediaplayer().pause();
        } catch (MediaException e) {
            System.out.println("There was a mistake in the pause");
        }
    }
    public void setVolume(double value){
        try {
            getMediaplayer().setVolume(value);
        } catch (MediaException e) {
            System.out.println("There was a mistake while raising volume ");
        }
    }

    
}
