import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class LinkedListUI {
    private JFrame frame;
    private JPanel listPanel;
    private linkedlist list;
    private JTextField valueField, indexField;

    public LinkedListUI() {
        list = new linkedlist();
        frame = new JFrame("Graphical Linked List");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1200, 600);
        frame.getContentPane().setBackground(Color.decode("#121212"));
        frame.setLayout(new BorderLayout(20, 20));

        // Top input area
        JPanel controlPanel = new JPanel();
        controlPanel.setBackground(Color.decode("#1E1E1E"));
        controlPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 10));

        valueField = new JTextField(5);
        indexField = new JTextField(5);

        JButton insertEndBtn = new JButton("Insert at End");
        JButton insertAtBtn = new JButton("Insert at Index");
        JButton deleteFirstBtn = new JButton("Delete First");
        JButton deleteLastBtn = new JButton("Delete Last");
        JButton deleteAtBtn = new JButton("Delete at Index");

        styleButton(insertEndBtn);
        styleButton(insertAtBtn);
        styleButton(deleteFirstBtn);
        styleButton(deleteLastBtn);
        styleButton(deleteAtBtn);
        styleField(valueField);
        styleField(indexField);

        controlPanel.add(new JLabel("Value: ")).setForeground(Color.WHITE);
        controlPanel.add(valueField);
        controlPanel.add(new JLabel("Index: ")).setForeground(Color.WHITE);
        controlPanel.add(indexField);
        controlPanel.add(insertEndBtn);
        controlPanel.add(insertAtBtn);
        controlPanel.add(deleteFirstBtn);
        controlPanel.add(deleteLastBtn);
        controlPanel.add(deleteAtBtn);

        frame.add(controlPanel, BorderLayout.NORTH);

        // Visual panel for the linked list
        listPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                drawLinkedList(g);
            }
        };
        listPanel.setBackground(Color.decode("#121212"));
        frame.add(listPanel, BorderLayout.CENTER);

        insertEndBtn.addActionListener(e -> {
            try {
                int val = Integer.parseInt(valueField.getText());
                list.insert(val);
                listPanel.repaint();
            } catch (Exception ignored) {}
        });

        insertAtBtn.addActionListener(e -> {
            try {
                int val = Integer.parseInt(valueField.getText());
                int idx = Integer.parseInt(indexField.getText());
                list.insert(val, idx);
                listPanel.repaint();
            } catch (Exception ignored) {}
        });

        deleteFirstBtn.addActionListener(e -> {
            list.deleteFirst();
            listPanel.repaint();
        });

        deleteLastBtn.addActionListener(e -> {
            list.deleteLast();
            listPanel.repaint();
        });

        deleteAtBtn.addActionListener(e -> {
            try {
                int idx = Integer.parseInt(indexField.getText());
                list.deleteatN(idx);
                listPanel.repaint();
            } catch (Exception ignored) {}
        });

        frame.setVisible(true);
    }

    private void drawLinkedList(Graphics g) {
        g.setColor(Color.WHITE);
        Font font = new Font("Arial", Font.BOLD, 16);
        g.setFont(font);
        int x = 50, y = 100;

        linkedlist.Node temp = list.head;
        while (temp != null) {
            g.setColor(Color.decode("#1F1F1F"));
            g.fillRoundRect(x, y, 60, 40, 10, 10);
            g.setColor(Color.WHITE);
            g.drawRoundRect(x, y, 60, 40, 10, 10);
            g.drawString(String.valueOf(temp.val), x + 20, y + 25);

            if (temp.next != null) {
                g.drawLine(x + 60, y + 20, x + 80, y + 20); // horizontal arrow line
                g.drawLine(x + 75, y + 15, x + 80, y + 20); // arrow tip
                g.drawLine(x + 75, y + 25, x + 80, y + 20);
            }

            x += 90;
            temp = temp.next;
        }
    }

    private void styleButton(JButton button) {
        button.setBackground(new Color(33, 150, 243));
        button.setForeground(Color.WHITE);
        button.setFocusPainted(false);
        button.setFont(new Font("Arial", Font.BOLD, 14));
        button.setPreferredSize(new Dimension(150, 30));
    }

    private void styleField(JTextField field) {
        field.setFont(new Font("Arial", Font.PLAIN, 16));
        field.setBackground(Color.decode("#2E2E2E"));
        field.setForeground(Color.WHITE);
        field.setCaretColor(Color.WHITE);
    }

    public static void main(String[] args) {
        new LinkedListUI();
    }
}
