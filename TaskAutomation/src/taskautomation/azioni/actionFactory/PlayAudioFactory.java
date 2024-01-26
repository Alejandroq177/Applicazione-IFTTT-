/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taskautomation.azioni.actionFactory;

import java.io.File;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import taskautomation.azioni.Action;
import taskautomation.azioni.PlayAudioDecorator;

/**
 *
 * @author Alejandro
 */
public class PlayAudioFactory implements ActionFactory{

    @Override
    public Action create(Action action) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open Audio File");
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("WAV files (*.wav)", "*.wav"));
        File selectedFile = fileChooser.showOpenDialog(new Stage());
        return new PlayAudioDecorator(selectedFile, action);
    }
    
}
