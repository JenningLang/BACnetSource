package com.serotonin.bacnet4j.util;


/**
 * �ӿ� TimeSource ��ʵ��
 * Ψһ�ķ������Ժ��뷵�ص�ǰʱ��
 * */
public class ClockTimeSource implements TimeSource {
    @Override
    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }
}
