package by.bsu;//Receiver

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Setter
@ToString
@Getter
public class Browser {
    private List<Tab> openedTabs = new ArrayList<>();

    public void openNewTab(Tab tab) {
        openedTabs.add(tab);
    }

    public void closeTab(Tab tab) {
        openedTabs.remove(tab);
    }

    public void muteTab(Tab tab) {
        openedTabs.stream().filter(t -> t.equals(tab)).findFirst().get().mute();
    }
}
