/*########################################################################
 *#                                                                      #
 *#                      Copyright (c) 2014 by                           #
 *#          Shanghai Stock Exchange (SSE), Shanghai, China              #
 *#                       All rights reserved.                           #
 *#                                                                      #
 *########################################################################
 */
package sse.ngts.common.plugin.step.field;

import sse.ngts.common.plugin.fieldtype.StringField;

public class SendingDate extends StringField {
	static final long serialVersionUID = 20050617;
	public static final int FIELD = 51;

	public SendingDate() {
		super(51);
	}

	public SendingDate(String data) {
		super(51, data);
	}
}
