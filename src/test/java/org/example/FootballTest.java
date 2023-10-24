package org.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class FootballTest {
    @Test
    void WMnation() {
        WorldCup worldCup = new WorldCup();
        assertThat(worldCup.wm("Deutschland") == 1);
    }
    @Test
    void EMnation() {
        Euro euro = new Euro();
        assertThat(euro.euro("Deutschland") == 1);
    }
    @Test
    void Copanation() {
        Copa copa = new Copa();
        assertThat(copa.copa("Argentinien") == 1);
    }

}
