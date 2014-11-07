package org.kohsuke.github;
/**
 * Represents the type of repo related activity 
 *
 * @author Arun Kalyanasundaram
 * @see GHRepoActivity
 */

public enum GHRepoActivity {
	REPO ("repo"),
	STAR ("starred"),
	WATCH ("subscribers");
	
	private final String text;

    /**
     * @param text
     */
    private GHRepoActivity(final String text) {
        this.text = text;
    }

    /* (non-Javadoc)
     * @see java.lang.Enum#toString()
     */
    @Override
    public String toString() {
        return text;
    }
}
