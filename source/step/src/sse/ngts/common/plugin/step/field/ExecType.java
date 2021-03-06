/*########################################################################
 *#                                                                      #
 *#                      Copyright (c) 2014 by                           #
 *#          Shanghai Stock Exchange (SSE), Shanghai, China              #
 *#                       All rights reserved.                           #
 *#                                                                      #
 *########################################################################
 */
package sse.ngts.common.plugin.step.field;

import sse.ngts.common.plugin.fieldtype.CharField;

public class ExecType extends CharField {
	static final long serialVersionUID = 20050617;
	public static final int FIELD = 150;
	public static final char NEW = '0';
	public static final char PARTIAL_FILL = '1';
	public static final char FILL = '2';
	public static final char DONE_FOR_DAY = '3';
	public static final char CANCELED = '4';
	public static final char REPLACE = '5';
	public static final char PENDING_CANCEL = '6';
	public static final char STOPPED = '7';
	public static final char REJECTED = '8';
	public static final char SUSPENDED = '9';
	public static final char PENDING_NEW = 'A';
	public static final char CALCULATED = 'B';
	public static final char EXPIRED = 'C';
	public static final char RESTATED = 'D';
	public static final char PENDING_REPLACE = 'E';
	public static final char TRADE = 'F';
	public static final char TRADE_CORRECT = 'G';
	public static final char TRADE_CANCEL = 'H';
	public static final char ORDER_STATUS = 'I';
	public static final char TRADE_IN_A_CLEARING_HOLD = 'J';
	public static final char TRADE_HAS_BEEN_RELEASED_TO_CLEARING = 'K';
	public static final char TRIGGERED_OR_ACTIVATED_BY_SYSTEM = 'L';

	public ExecType() {
		super(150);
	}

	public ExecType(char data) {
		super(150, data);
	}
}
