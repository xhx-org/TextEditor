package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm {
    public static void main(String[] args) {
        JFrame form = new JFrame("Title");
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
        JMenuItem exitItem = new JMenuItem("退出");
        exitItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        fileMenu.add(exitItem);
        bar.add(fileMenu);
        return bar;
    }

    public static void addEditor(Container panel) {
        JEditorPane editor = new JEditorPane();
        editor.setSize(200, 200);
        panel.setLayout(null);
        panel.add(editor);

    }
}
