package io.jenkins.plugins.plain_text_console_link;

import hudson.model.Action;

public class PlainTextConsoleLinkAction implements Action {

    @Override
    public String getIconFileName() {
        return "symbol-document-text-outline plugin-ionicons-api";
    }

    @Override
    public String getDisplayName() {
        return Messages.viewPlain();
    }

    @Override
    public String getUrlName() {
        return "consoleText";
    }
}
