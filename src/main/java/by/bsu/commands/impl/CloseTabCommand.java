package by.bsu.commands.impl;

import by.bsu.Browser;
import by.bsu.commands.BrowserCommand;
import by.bsu.Tab;

public class CloseTabCommand extends BrowserCommand {
    public CloseTabCommand(Browser browser) {
        super(browser);
    }

    @Override
    public void execute(Tab tab) {
        backup();
        System.out.println("Closed");
        browser.closeTab(tab);
    }
}
