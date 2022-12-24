package by.bsu.commands.impl;

import by.bsu.Browser;
import by.bsu.commands.BrowserCommand;
import by.bsu.Tab;

public class MuteTabCommand extends BrowserCommand {
    public MuteTabCommand(Browser browser) {
        super(browser);
    }

    @Override
    public void execute(Tab tab) {
        backup();
        System.out.println("Muted");
        browser.muteTab(tab);
    }
}
