package org.telegram.ui.VoiceControl;

public class SpeechParser {

    public SpeechParser() {

    }

    public String parseCommands(String text) {
        switch (text) {
            case "reply":
                return "#eb346b";
            case "dismiss":
                return "#344feb";
            case "send":
                return "#ff6333";
            default:
                return "#ffffff";

        }
    }
}
