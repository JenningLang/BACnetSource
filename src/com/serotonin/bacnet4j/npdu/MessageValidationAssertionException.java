package com.serotonin.bacnet4j.npdu;


/**
 * ����쳣���������б�ʹ�� <br/>
 * IncomingRequestParser ��� parseApdu() <br/>
 * IncomingMessageExecutor ��� parseFrame()
 * */
public class MessageValidationAssertionException extends Exception {
    private static final long serialVersionUID = -1;

    public MessageValidationAssertionException(String message) {
        super(message);
    }
}
