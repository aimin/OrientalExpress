/*########################################################################
 *#                                                                      #
 *#                      Copyright (c) 2014 by                           #
 *#          Shanghai Stock Exchange (SSE), Shanghai, China              #
 *#                       All rights reserved.                           #
 *#                                                                      #
 *########################################################################
 */
package sse.ngts.common.plugin.step.field;

import sse.ngts.common.plugin.fieldtype.IntField;

public class MDEntryPositionNo extends IntField {
	static final long serialVersionUID = 20050617;
	public static final int FIELD = 290;

	public MDEntryPositionNo() {
		super(290);
	}

	public MDEntryPositionNo(int data) {
		super(290, data);
	}
}
