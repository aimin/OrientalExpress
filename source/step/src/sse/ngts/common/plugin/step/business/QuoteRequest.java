/*########################################################################
 *#                                                                      #
 *#                      Copyright (c) 2014 by                           #
 *#          Shanghai Stock Exchange (SSE), Shanghai, China              #
 *#                       All rights reserved.                           #
 *#                                                                      #
 *########################################################################
 */
package sse.ngts.common.plugin.step.business;

import sse.ngts.common.plugin.step.*;
import sse.ngts.common.plugin.step.field.*;

public class QuoteRequest extends Message {
	private static final long serialVersionUID = 20130819;
	public static final String MSGTYPE = "R";

	public QuoteRequest() {
		super();
		getHeader().setField(new MsgType(MSGTYPE));
	}

	public QuoteRequest(int[] fieldOrder) {
		super(fieldOrder);
		getHeader().setField(new MsgType(MSGTYPE));
	}

	public void set(ExecTransType value) {
		setField(value);
	}

	public ExecTransType get(ExecTransType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public ExecTransType getExecTransType() throws FieldNotFound {
		ExecTransType value = new ExecTransType();
		getField(value);
		return value;
	}

	public boolean isSet(ExecTransType field) {
		return isSetField(field);
	}

	public boolean isSetExecTransType() {
		return isSetField(ExecTransType.FIELD);
	}

	public void set(OrderQty value) {
		setField(value);
	}

	public OrderQty get(OrderQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public OrderQty getOrderQty() throws FieldNotFound {
		OrderQty value = new OrderQty();
		getField(value);
		return value;
	}

	public boolean isSet(OrderQty field) {
		return isSetField(field);
	}

	public boolean isSetOrderQty() {
		return isSetField(OrderQty.FIELD);
	}

	public void set(SecurityID value) {
		setField(value);
	}

	public SecurityID get(SecurityID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public SecurityID getSecurityID() throws FieldNotFound {
		SecurityID value = new SecurityID();
		getField(value);
		return value;
	}

	public boolean isSet(SecurityID field) {
		return isSetField(field);
	}

	public boolean isSetSecurityID() {
		return isSetField(SecurityID.FIELD);
	}

	public void set(Side value) {
		setField(value);
	}

	public Side get(Side value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public Side getSide() throws FieldNotFound {
		Side value = new Side();
		getField(value);
		return value;
	}

	public boolean isSet(Side field) {
		return isSetField(field);
	}

	public boolean isSetSide() {
		return isSetField(Side.FIELD);
	}

	public void set(Text value) {
		setField(value);
	}

	public Text get(Text value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public Text getText() throws FieldNotFound {
		Text value = new Text();
		getField(value);
		return value;
	}

	public boolean isSet(Text field) {
		return isSetField(field);
	}

	public boolean isSetText() {
		return isSetField(Text.FIELD);
	}

	public void set(TradeDate value) {
		setField(value);
	}

	public TradeDate get(TradeDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public TradeDate getTradeDate() throws FieldNotFound {
		TradeDate value = new TradeDate();
		getField(value);
		return value;
	}

	public boolean isSet(TradeDate field) {
		return isSetField(field);
	}

	public boolean isSetTradeDate() {
		return isSetField(TradeDate.FIELD);
	}

	public void set(QuoteReqID value) {
		setField(value);
	}

	public QuoteReqID get(QuoteReqID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public QuoteReqID getQuoteReqID() throws FieldNotFound {
		QuoteReqID value = new QuoteReqID();
		getField(value);
		return value;
	}

	public boolean isSet(QuoteReqID field) {
		return isSetField(field);
	}

	public boolean isSetQuoteReqID() {
		return isSetField(QuoteReqID.FIELD);
	}

	public void set(NoPartyIDs value) {
		setField(value);
	}

	public NoPartyIDs get(NoPartyIDs value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public NoPartyIDs getNoPartyIDs() throws FieldNotFound {
		NoPartyIDs value = new NoPartyIDs();
		getField(value);
		return value;
	}

	public boolean isSet(NoPartyIDs field) {
		return isSetField(field);
	}

	public boolean isSetNoPartyIDs() {
		return isSetField(NoPartyIDs.FIELD);
	}

	public void set(OrigClOrdID value) {
		setField(value);
	}

	public OrigClOrdID get(OrigClOrdID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public OrigClOrdID getOrigClOrdID() throws FieldNotFound {
		OrigClOrdID value = new OrigClOrdID();
		getField(value);
		return value;
	}

	public boolean isSet(OrigClOrdID field) {
		return isSetField(field);
	}

	public boolean isSetOrigClOrdID() {
		return isSetField(OrigClOrdID.FIELD);
	}

}
