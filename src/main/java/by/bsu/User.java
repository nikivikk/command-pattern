package by.bsu;

import by.bsu.commands.BrowserCommand;
import by.bsu.commands.CommandHistory;
import by.bsu.commands.impl.CloseTabCommand;
import by.bsu.commands.impl.OpenNewTabCommand;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class User {
    private final Browser browser = new Browser();
    private final CommandHistory commandHistory = new CommandHistory();

    public void demonstrate() {
        BrowserCommand open1 = new OpenNewTabCommand(browser);
        Tab tab = new Tab("Tab 1");
        open1.execute(tab);
        System.out.println(browser);
        commandHistory.push(open1);

        BrowserCommand open2 = new OpenNewTabCommand(browser);
        open2.execute(new Tab("Tab 2"));
        System.out.println(browser);
        commandHistory.push(open2);

        BrowserCommand open3 = new OpenNewTabCommand(browser);
        open3.execute(new Tab("Tab 3"));
        System.out.println(browser);
        commandHistory.push(open3);

        BrowserCommand close = new CloseTabCommand(browser);
        close.execute(tab);
        System.out.println(browser);
        commandHistory.push(close);

        undoCommand();
    }

    private void undoCommand(){
        commandHistory.pop().undo();
        System.out.println(browser);
    }
}
