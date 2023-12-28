package org.gradle.accessors.dm;

import org.gradle.api.NonNullApi;
import org.gradle.api.artifacts.ProjectDependency;
import org.gradle.api.internal.artifacts.dependencies.ProjectDependencyInternal;
import org.gradle.api.internal.artifacts.DefaultProjectDependencyFactory;
import org.gradle.api.internal.artifacts.dsl.dependencies.ProjectFinder;
import org.gradle.api.internal.catalog.DelegatingProjectDependency;
import org.gradle.api.internal.catalog.TypeSafeProjectDependencyFactory;
import javax.inject.Inject;

@NonNullApi
public class Mail_ProtocolsProjectDependency extends DelegatingProjectDependency {

    @Inject
    public Mail_ProtocolsProjectDependency(TypeSafeProjectDependencyFactory factory, ProjectDependencyInternal delegate) {
        super(factory, delegate);
    }

    /**
     * Creates a project dependency on the project at path ":mail:protocols:imap"
     */
    public Mail_Protocols_ImapProjectDependency getImap() { return new Mail_Protocols_ImapProjectDependency(getFactory(), create(":mail:protocols:imap")); }

    /**
     * Creates a project dependency on the project at path ":mail:protocols:pop3"
     */
    public Mail_Protocols_Pop3ProjectDependency getPop3() { return new Mail_Protocols_Pop3ProjectDependency(getFactory(), create(":mail:protocols:pop3")); }

    /**
     * Creates a project dependency on the project at path ":mail:protocols:smtp"
     */
    public Mail_Protocols_SmtpProjectDependency getSmtp() { return new Mail_Protocols_SmtpProjectDependency(getFactory(), create(":mail:protocols:smtp")); }

}
