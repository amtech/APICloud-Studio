/**
 * APICloud Studio
 * Copyright (c) 2014-2015 by APICloud, Inc. All Rights Reserved.
 * Licensed under the terms of the GNU Public License (GPL) v3.
 * Please see the license.html included with this distribution for details.
 * Any modifications to this file must keep this entire header intact.
 */

package com.apicloud.navigator.ui.wizards;

public class TXTWizard extends NewFileWizard {

	@Override
	public String getFileType() {
		return "TXT";
	}

	@Override
	public String getFileExt() {
		return "txt";
	}

	@Override
	public String getDefaultTemplate() {
		return "template.txt";
	}

}
