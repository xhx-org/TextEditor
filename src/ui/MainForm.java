package ui;

import actions.FileActions;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class MainForm extends JFrame{
    public MainForm(String title) {
        super(title);
        setSize(200, 200);
        setJMenuBar(setMenuBar());
        addEditor(getContentPane());
        setVisible(true);
    }

    public JMenuBar setMenuBar() {

        JMenuBar bar = new JMenuBar();
        JMenu fileMenu = new JMenu("文件");
        fileMenu.add(getItem("退出", FileActions.QuitAction));

        bar.add(fileMenu);
        return bar;
    }

    public void addEditor(Container panel) {
        JEditorPane editor = new JEditorPane();

        editor.setSize(200, 200);
        panel.setLayout(new GridLayout());
        panel.add(editor);

    }

    public JMenuItem getItem(String name, ActionListener event) {
        JMenuItem item = new JMenuItem(name);
        item.addActionListener(event);
        return item;
    }
}
