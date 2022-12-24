package by.bsu.commands.impl;

import by.bsu.Browser;
import by.bsu.commands.BrowserCommand;
import by.bsu.Tab;

public class OpenNewTabCommand extends BrowserCommand {
    public OpenNewTabCommand(Browser browser) {
        super(browser);
    }

    @Override
    public void execute(Tab tab) {
        backup();
        System.out.println("Opened");
        browser.openNewTab(tab);
    }
}
