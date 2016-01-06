package org.jboss.tools.teiid.reddeer.perspective;

import org.jboss.reddeer.eclipse.ui.perspectives.AbstractPerspective;
import org.jboss.tools.teiid.reddeer.view.ModelExplorer;

/**
 * Represents a Teiid perspective. It is a singleton.
 * 
 * @author Lucia Jelinkova
 *
 */
public class TeiidPerspective extends AbstractPerspective {

	private static final String NAME = "Teiid Designer";

	private static final TeiidPerspective INSTANCE = new TeiidPerspective();

	private ModelExplorer modelExplorerView;

	public TeiidPerspective() {
		super(NAME);
	}

	public static final TeiidPerspective getInstance() {
		INSTANCE.open();
		return INSTANCE;
	}

	/**
	 * Previous to Kepler
	 * 
	 * @return
	 */
	/*
	 * @Deprecated public TeiidInstanceView getTeiidInstanceView(){ if (teiidInstanceView == null){ teiidInstanceView =
	 * new TeiidInstanceView(); } return teiidInstanceView; }
	 */

	public ModelExplorer getModelExplorerView() {
		if (modelExplorerView == null) {
			modelExplorerView = new ModelExplorer();
		}
		return modelExplorerView;
	}
}
