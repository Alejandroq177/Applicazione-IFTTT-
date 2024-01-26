/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taskautomation.azioni.actionFactory;

import javafx.scene.control.TextInputDialog;
import taskautomation.azioni.Action;
import taskautomation.azioni.DisplayMessageDecorator;

/**
 *
 * @author Alejandro
 */
public class DisplayMessageFactory implements ActionFactory{

    @Override
    public Action create(Action action) {
        TextInputDialog dialog = new TextInputDialog("Type your message please");
        dialog.setHeaderText(null);
        dialog.setTitle("Display Message");
        dialog.setContentText("Type your message please:");
        String message = dialog.showAndWait().orElse("");
        return new DisplayMessageDecorator(message, action);
    }

}
