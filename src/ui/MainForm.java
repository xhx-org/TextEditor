package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm {
    public static void main(String[] args) {
        JFrame form = new JFrame("记事本");
        form.setSize(200, 200);
        // set the menu bar
        form.setJMenuBar(setMenuBar());
        // add editor content
        addEditor(form.getContentPane());
        form.setVisible(true);

    }

    public static JMenuBar setMenuBar() {

        JMenuBar bar = new JMenuBar();
        JMenu fileMenu = new JMenu("文件");
        fileMenu.add(getItem("退出", (e)->System.exit(0)));

        bar.add(fileMenu);
        return bar;
    }

    public static void addEditor(Container panel) {
        JEditorPane editor = new JEditorPane();

        editor.setSize(200, 200);
        panel.setLayout(new GridLayout());
        panel.add(editor);

    }

    public static JMenuItem getItem(String name, ActionListener event) {
        JMenuItem item = new JMenuItem(name);
        item.addActionListener(event);
        return item;
    }
}
