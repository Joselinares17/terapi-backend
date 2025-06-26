package org.terapi.backend.entity.enums;

import lombok.Getter;

@Getter
public enum Mode {
    VIDEO("Video"),
    AUDIO("Audio"),
    CHAT("Chat");

    private final String spanishLabel;

    Mode(String spanishLabel) {
        this.spanishLabel = spanishLabel;
    }
}
