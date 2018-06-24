package uk.co.samuelwall.materialtaptargetprompt;

public interface PromptTextDelegate {
    boolean hasSkip();

    void onContentDimensionReady();
}
