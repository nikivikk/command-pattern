package by.bsu.commands;

import by.bsu.Browser;
import by.bsu.Tab;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

//Command
@RequiredArgsConstructor
public abstract class BrowserCommand {
    private List<Tab> openedTabs;
    protected final Browser browser;

    public void backup() {
        openedTabs = new ArrayList<>(browser.getOpenedTabs());
    }

    public abstract void execute(Tab tab);

    public void undo() {
        System.out.println("Command undo");
        browser.setOpenedTabs(new ArrayList<>(openedTabs));
    }
}
