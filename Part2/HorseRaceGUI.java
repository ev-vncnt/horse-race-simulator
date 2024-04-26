package Part2;
import javax.swing.*;
import java.awt.*;

public class HorseRaceGUI extends JFrame {
    private Horse horse1;
    private Horse horse2;
    private Horse horse3;

    private JTextField horse1NameField;
    private JComboBox<String> horse1IconComboBox;
    private JSlider horse1ConfidenceSlider;

    private JTextField horse2NameField;
    private JComboBox<String> horse2IconComboBox;
    private JSlider horse2ConfidenceSlider;

    private JTextField horse3NameField;
    private JComboBox<String> horse3IconComboBox;
    private JSlider horse3ConfidenceSlider;

    private JLabel horse1Label;
    private JLabel horse2Label;
    private JLabel horse3Label;

    private JButton startRaceButton;


    public HorseRaceGUI() {
        setTitle("Horse Racing Game");
        setSize(500, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        // Initialize horse customization components
        horse1NameField = new JTextField("Axel", 10);
        String[] horseIcons = {"🐎", "🐴", "🦄"}; // Example horse icons
        horse1IconComboBox = new JComboBox<>(horseIcons);
        horse1ConfidenceSlider = new JSlider(JSlider.HORIZONTAL, 0, 100, 50);
        
        // Initialize components for Horse 2 and Horse 3
        horse2NameField = new JTextField("Beames", 10);
        horse2IconComboBox = new JComboBox<>(horseIcons);
        horse2ConfidenceSlider = new JSlider(JSlider.HORIZONTAL, 0, 100, 50);
        horse3NameField = new JTextField("Cherry", 10);
        horse3IconComboBox = new JComboBox<>(horseIcons);
        horse3ConfidenceSlider = new JSlider(JSlider.HORIZONTAL, 0, 100, 50);



        // Add event listeners to horse customization components
        horse1NameField.addActionListener(e -> updateHorse1Name());
        horse1IconComboBox.addActionListener(e -> updateHorse1Icon());
        horse1ConfidenceSlider.addChangeListener(e -> updateHorse1Confidence());
        
        // Add event listeners for Horse 2 and Horse 3 customization
        horse2NameField.addActionListener(e -> updateHorse2Name());
        horse2IconComboBox.addActionListener(e -> updateHorse2Icon());
        horse2ConfidenceSlider.addChangeListener(e -> updateHorse2Confidence());
        horse3NameField.addActionListener(e -> updateHorse3Name());
        horse3IconComboBox.addActionListener(e -> updateHorse3Icon());
        horse3ConfidenceSlider.addChangeListener(e -> updateHorse3Confidence());
        
        // Add components to the GUI
        JPanel customizationPanel = new JPanel();
        customizationPanel.setLayout(new GridLayout(3, 2));
        customizationPanel.add(new JLabel("Horse 1 Name:"));
        customizationPanel.add(horse1NameField);
        customizationPanel.add(new JLabel("Horse 1 Icon:"));
        customizationPanel.add(horse1IconComboBox);
        customizationPanel.add(new JLabel("Horse 1 Confidence:"));
        customizationPanel.add(horse1ConfidenceSlider);
        add(customizationPanel, BorderLayout.NORTH);
        customizationPanel.add(new JLabel("Horse 2 Name:"));
        customizationPanel.add(horse2NameField);
        customizationPanel.add(new JLabel("Horse 2 Icon:"));
        customizationPanel.add(horse2IconComboBox);
        customizationPanel.add(new JLabel("Horse 2 Confidence:"));
        customizationPanel.add(horse2ConfidenceSlider);
        customizationPanel.add(new JLabel("Horse 3 Name:"));
        customizationPanel.add(horse3NameField);
        customizationPanel.add(new JLabel("Horse 3 Icon:"));
        customizationPanel.add(horse3IconComboBox);
        customizationPanel.add(new JLabel("Horse 3 Confidence:"));
        customizationPanel.add(horse3ConfidenceSlider);

        // Initialize the "Start Race" button
        startRaceButton = new JButton("Start Race");
        startRaceButton.addActionListener(e -> startRace());
        
        // Add the "Start Race" button to the GUI
        customizationPanel.add(startRaceButton);

        setVisible(true);
        
        // Initialize horse object
        horse1 = new Horse('A', "Axel", 0.5); // Initial values

        // Initialize labels for horse customization
        horse1Label = new JLabel("Horse 1:");
        horse2Label = new JLabel("Horse 2:");
        horse3Label = new JLabel("Horse 3:");

        // Set layout for customization panel
        customizationPanel.setLayout(new GridLayout(3, 3, 10, 10));
    
        // Add labels and components to the customization panel
        customizationPanel.add(horse1Label);
        customizationPanel.add(horse1NameField);
        customizationPanel.add(horse1IconComboBox);
        customizationPanel.add(horse2Label);
        customizationPanel.add(horse2NameField);
        customizationPanel.add(horse2IconComboBox);
        customizationPanel.add(horse3Label);
        customizationPanel.add(horse3NameField);
        customizationPanel.add(horse3IconComboBox);
        customizationPanel.add(horse1ConfidenceSlider);
        customizationPanel.add(new JLabel("Name"));
        customizationPanel.add(new JLabel("Icon"));
        customizationPanel.add(horse2ConfidenceSlider);
        customizationPanel.add(new JLabel("Name"));
        customizationPanel.add(new JLabel("Icon"));
        customizationPanel.add(horse3ConfidenceSlider);
        customizationPanel.add(new JLabel("Name"));
        customizationPanel.add(new JLabel("Icon"));
        customizationPanel.add(startRaceButton);


    }
    
    private void updateHorse1Name() {
        String newName = horse1NameField.getText();
        horse1.setName(newName);
    }
    
    private void updateHorse1Icon() {
        String selectedIcon = (String) horse1IconComboBox.getSelectedItem();
        horse1.setSymbol(selectedIcon.charAt(0));
    }
    
    private void updateHorse1Confidence() {
        double newConfidence = horse1ConfidenceSlider.getValue() / 100.0;
        horse1.setConfidence(newConfidence);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(HorseRaceGUI::new);
    }

    private void updateHorse2Name() {
        String newName = horse2NameField.getText();
        horse2.setName(newName);
    }
    
    private void updateHorse2Icon() {
        String selectedIcon = (String) horse2IconComboBox.getSelectedItem();
        horse2.setSymbol(selectedIcon.charAt(0));
    }
    
    private void updateHorse2Confidence() {
        double newConfidence = horse2ConfidenceSlider.getValue() / 100.0;
        horse2.setConfidence(newConfidence);
    }
    
    private void updateHorse3Name() {
        String newName = horse3NameField.getText();
        horse3.setName(newName);
    }
    
    private void updateHorse3Icon() {
        String selectedIcon = (String) horse3IconComboBox.getSelectedItem();
        horse3.setSymbol(selectedIcon.charAt(0));
    }

    private void updateHorse3Confidence() {
        double newConfidence = horse3ConfidenceSlider.getValue() / 100.0;
        horse3.setConfidence(newConfidence);
    }

    // Implement the action listener for the "Start Race" button
    private void startRace() {
    // Disable customization components
    horse1NameField.setEnabled(false);
    horse1IconComboBox.setEnabled(false);
    horse1ConfidenceSlider.setEnabled(false);
    horse2NameField.setEnabled(false);
    horse2IconComboBox.setEnabled(false);
    horse2ConfidenceSlider.setEnabled(false);
    horse3NameField.setEnabled(false);
    horse3IconComboBox.setEnabled(false);
    horse3ConfidenceSlider.setEnabled(false);
    startRaceButton.setEnabled(false);
    
    // Create and customize the horses
    Horse horse1 = new Horse(horse1IconComboBox.getSelectedItem().toString().charAt(0), horse1NameField.getText(), horse1ConfidenceSlider.getValue() / 100.0);
    Horse horse2 = new Horse(horse2IconComboBox.getSelectedItem().toString().charAt(0), horse2NameField.getText(), horse2ConfidenceSlider.getValue() / 100.0);
    Horse horse3 = new Horse(horse3IconComboBox.getSelectedItem().toString().charAt(0), horse3NameField.getText(), horse3ConfidenceSlider.getValue() / 100.0);
    
    // Create the race and add horses
    Race race = new Race(15);
    race.addHorse(horse1, 1);
    race.addHorse(horse2, 2);
    race.addHorse(horse3, 3);
    
    // Start the race
    race.startRace();
    
    // Enable the "Start Race" button after the race is finished
    startRaceButton.setEnabled(true);
    
    // Re-enable customization components
    horse1NameField.setEnabled(true);
    horse1IconComboBox.setEnabled(true);
    horse1ConfidenceSlider.setEnabled(true);
    horse2NameField.setEnabled(true);
    horse2IconComboBox.setEnabled(true);
    horse2ConfidenceSlider.setEnabled(true);
    horse3NameField.setEnabled(true);
    horse3IconComboBox.setEnabled(true);
    horse3ConfidenceSlider.setEnabled(true);
}
}
