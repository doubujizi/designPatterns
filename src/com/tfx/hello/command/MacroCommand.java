package com.tfx.hello.command;

import java.util.Iterator;
import java.util.Stack;

/**
 * @author tianfuxian
 * @Description:
 * @Date: 2019-03-30 14:05
 */
public class MacroCommand implements Command {
    //命令集合
    private Stack commands = new Stack();

    @Override
    public void execute() {
        Iterator it = commands.iterator();
        while (it.hasNext()) {
            ((Command) it.next()).execute();
        }
    }

    public void append(Command command) {
        if (command != this) {
            commands.push(command);
        }
    }

    //删除最后一条命令
    public void undo() {
        if (!commands.empty()) {
            commands.pop();
        }
    }

    //删除所有命令
    public void clear() {
        commands.clear();
    }
}
