package org.telegram.ui.VoiceControl;

public class ChangeRecognized {
    private String speechText = null;
    private ChangeListener listener;

    public String getSpeechText() {
        return speechText;
    }

    public void setSpeechText(String speechText) {
        this.speechText = speechText;
        if (listener != null) listener.onChange();
    }

    public ChangeListener getListener() {
        return listener;
    }

    public void setListener(ChangeListener listener) {
        this.listener = listener;
    }

    public interface ChangeListener {
        void onChange();
    }
}

















