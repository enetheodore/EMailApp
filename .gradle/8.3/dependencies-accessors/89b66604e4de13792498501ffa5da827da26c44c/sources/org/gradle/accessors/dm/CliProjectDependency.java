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
public class CliProjectDependency extends DelegatingProjectDependency {

    @Inject
    public CliProjectDependency(TypeSafeProjectDependencyFactory factory, ProjectDependencyInternal delegate) {
        super(factory, delegate);
    }

    /**
     * Creates a project dependency on the project at path ":cli:autodiscovery-cli"
     */
    public Cli_AutodiscoveryCliProjectDependency getAutodiscoveryCli() { return new Cli_AutodiscoveryCliProjectDependency(getFactory(), create(":cli:autodiscovery-cli")); }

    /**
     * Creates a project dependency on the project at path ":cli:html-cleaner-cli"
     */
    public Cli_HtmlCleanerCliProjectDependency getHtmlCleanerCli() { return new Cli_HtmlCleanerCliProjectDependency(getFactory(), create(":cli:html-cleaner-cli")); }

}
