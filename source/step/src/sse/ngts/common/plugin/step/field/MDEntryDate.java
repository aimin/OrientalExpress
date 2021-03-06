/*########################################################################
 *#                                                                      #
 *#                      Copyright (c) 2014 by                           #
 *#          Shanghai Stock Exchange (SSE), Shanghai, China              #
 *#                       All rights reserved.                           #
 *#                                                                      #
 *########################################################################
 */
package sse.ngts.common.plugin.step.field;

import sse.ngts.common.plugin.fieldtype.UtcDateOnlyField;

import java.util.Date;

public class MDEntryDate extends UtcDateOnlyField {
	static final long serialVersionUID = 20050617;
	public static final int FIELD = 272;

	public MDEntryDate() {
		super(272);
	}

	public MDEntryDate(Date data) {
		super(272, data);
	}
}
