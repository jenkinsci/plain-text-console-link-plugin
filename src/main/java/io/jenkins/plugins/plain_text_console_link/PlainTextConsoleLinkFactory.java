package io.jenkins.plugins.plain_text_console_link;

import edu.umd.cs.findbugs.annotations.NonNull;
import hudson.Extension;
import hudson.model.Action;
import hudson.model.Run;
import java.util.Collection;
import java.util.Set;
import jenkins.model.TransientActionFactory;

@Extension
public class PlainTextConsoleLinkFactory extends TransientActionFactory<Run> {

    @Override
    public Class<Run> type() {
        return Run.class;
    }

    @NonNull
    @Override
    public Collection<? extends Action> createFor(@NonNull Run target) {
        return Set.of(new PlainTextConsoleLinkAction());
    }
}
