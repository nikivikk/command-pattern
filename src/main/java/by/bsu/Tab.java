package by.bsu;

import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@ToString
public class Tab {
    private final String name;
    private boolean isMuted = false;

    public void mute() {
        isMuted = true;
    }
}
