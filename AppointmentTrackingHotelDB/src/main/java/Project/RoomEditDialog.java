/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;

/**
 *
 * @author Asmz
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RoomEditDialog extends JDialog {
    private JTextField txtRoomNumber;
    private JTextField txtRoomType;
    private JTextField txtBedType;
    private JTextField txtPrice;
    private JButton btnSave;
    private boolean saveButtonClicked;

    public RoomEditDialog(Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    private void initComponents() {
        // Initialize and configure components (text fields, buttons, etc.)
        // Add event listeners for button actions
        // Set layout and add components to the dialog
        // ...
    }

    public void setRoomDetails(String roomNo, String roomType, String bedType, String price) {
        // Set the existing room details in the text fields
        txtRoomNumber.setText(roomNo);
        txtRoomType.setText(roomType);
        txtBedType.setText(bedType);
        txtPrice.setText(price);
    }

    public String getRoomNumber() {
        return txtRoomNumber.getText().trim();
    }

    public String getRoomType() {
        return txtRoomType.getText().trim();
    }

    public String getBedType() {
        return txtBedType.getText().trim();
    }

    public String getPrice() {
        return txtPrice.getText().trim();
    }

    public boolean isSaveButtonClicked() {
        return saveButtonClicked;
    }
    
    // Implement event listener methods for button actions
    // ...
}

