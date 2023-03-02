import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

public class MyFrame extends JFrame
{
    MyFrame()
    {
        JButton startButton = new JButton();
        startButton.setBounds(20, 20, 120, 60);
        startButton.setText("Start");

        JButton resetButton = new JButton();
        resetButton.setBounds(160, 20, 120, 60);
        resetButton.setText("Reset");

        JScrollPane algorithmListScrollPane = new JScrollPane();

        // *** This looks wrong ***
        String[] algorithms =
                {
                        "Bubble Sort",
                        "Bucket Sort",
                        "Cocktail Sort",
                        "Comb Sort",
                        "Counting Sort",
                        "Heap Sort",
                        "Insertion Sort",
                        "Merge Sort",
                        "Pigeonhole Sort",
                        "Quick Sort",
                        "Radix Sort",
                        "Selection Sort",
                        "Shell Sort"
                };
        JList algorithmList = new JList(algorithms);
        algorithmListScrollPane.setViewportView(algorithmList);
        algorithmListScrollPane.setBounds(20, 120, 260, 180);

        JLabel selectedAlgorithmLabel = new JLabel();
        selectedAlgorithmLabel.setBounds(20, 90, 260, 40);
        selectedAlgorithmLabel.setText("Selected Algorithm: N/A");


        // *** Figure out how to get this somewhere else (if it needs to be) ***
        algorithmList.addListSelectionListener(new ListSelectionListener()
        {
            @Override
            public void valueChanged(ListSelectionEvent e)
            {
                String selectedAlgorithm = (String) algorithmList.getSelectedValue();
                selectedAlgorithmLabel.setText("Selected Algorithm: " + selectedAlgorithm);
            }
        });

        JPanel controlPanel = new JPanel();
        controlPanel.setLayout(null);
        controlPanel.setBackground(Color.LIGHT_GRAY);
        controlPanel.setBounds(960, 0, 320, 720);
        controlPanel.add(startButton);
        controlPanel.add(resetButton);
        controlPanel.add(algorithmListScrollPane);
        controlPanel.add(selectedAlgorithmLabel);

        this.setTitle("Sorting Algorithm Visualization");           // Sets frame title on the top
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        // Exits when X is clicked
        this.setLayout(null);
        this.setSize(1280, 720);                        // Sets frame size
        this.setVisible(true);                                      // Makes frame visible
        this.getContentPane().setBackground(Color.BLACK);           // Sets background color
        this.add(controlPanel);
    }


}