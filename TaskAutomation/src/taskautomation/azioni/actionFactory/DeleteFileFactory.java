/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taskautomation.azioni.actionFactory;

import java.io.File;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import taskautomation.azioni.Action;
import taskautomation.azioni.DeleteFileDecorator;
import taskautomation.azioni.PlayAudioDecorator;

/**
 *
 * @author Alejandro
 */
public class DeleteFileFactory implements ActionFactory {

    @Override
    public Action create(Action action) {
        return new DeleteFileDecorator(action);
    }

}
