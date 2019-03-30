package com.tfx.hello.command;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * @author tianfuxian
 * @Description:
 * @Date: 2019-03-30 14:24
 */
public class CommandAppStart extends JFrame implements ActionListener, MouseMotionListener, WindowListener {
    //绘制历史记录
    private MacroCommand history = new MacroCommand();
    //绘制区域
    private DrawCanvas canvas = new DrawCanvas(400, 400, history);
    //删除按钮
    private JButton cleanButton = new JButton("clear");

    public CommandAppStart(String title) throws HeadlessException {
        super(title);

        this.addWindowListener(this);
        canvas.addMouseMotionListener(this);
        cleanButton.addActionListener(this);

        Box buttonBox = new Box(BoxLayout.X_AXIS);
        buttonBox.add(cleanButton);
        Box mainBox = new Box(BoxLayout.Y_AXIS);
        mainBox.add(buttonBox);
        mainBox.add(canvas);
        getContentPane().add(mainBox);
        pack();
        show();


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == cleanButton) {
            history.clear();
            canvas.repaint();
        }
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        Command cmd = new DrawCommand(canvas, e.getPoint());
        history.append(cmd);
        cmd.execute();
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }

    public static void main(String[] args) {
        new CommandAppStart("Command Pattern Sample");
    }
}
