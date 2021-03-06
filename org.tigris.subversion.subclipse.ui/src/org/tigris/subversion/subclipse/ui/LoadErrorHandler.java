package org.tigris.subversion.subclipse.ui;

import org.eclipse.swt.widgets.Display;
import org.tigris.subversion.clientadapter.ILoadErrorHandler;
import org.tigris.subversion.clientadapter.ISVNClientWrapper;
import org.tigris.subversion.subclipse.core.util.InputDialog;
import org.tigris.subversion.subclipse.ui.dialogs.LoadErrorDialog;

public class LoadErrorHandler implements ILoadErrorHandler {
	private static boolean loadErrorHandled = false;

	public void handleLoadError(ISVNClientWrapper clientWrapper) {
		String svnInterface = SVNUIPlugin.getPlugin().getPreferenceStore()
				.getString(ISVNUIConstants.PREF_SVNINTERFACE);
		if (svnInterface != null && !svnInterface.equals("javahl")) {
			return;
		}
		final String loadErrors = clientWrapper.getLoadErrors();
		loadErrorHandled = true;
		if (!SVNUIPlugin.TEST_MODE) {
//			Display.getDefault().syncExec(new Runnable() {
//				public void run() {
//					InputDialog dialog = new InputDialog(Display.getDefault()
//							.getActiveShell(), org.tigris.subversion.subclipse.core.Messages.SVNINSTALLINFO,
//							org.tigris.subversion.subclipse.core.Messages.SVNINSTALLINFO1, "", null);
//					dialog.open();
//				}
//			});
		}
	}

	public static boolean loadErrorHandled() {
		return loadErrorHandled;
	}

}
