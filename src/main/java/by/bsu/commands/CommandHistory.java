package by.bsu.commands;

import java.util.Stack;

public class CommandHistory {
    private final Stack<BrowserCommand> history = new Stack<>();

    public void push(BrowserCommand browserCommand) {
        history.push(browserCommand);
    }

    public BrowserCommand pop() {
        return history.pop();
    }
}
