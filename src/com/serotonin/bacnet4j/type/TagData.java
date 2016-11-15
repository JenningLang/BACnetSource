/*
 * ============================================================================
 * GNU General Public License
 * ============================================================================
 *
 * Copyright (C) 2006-2011 Serotonin Software Technologies Inc. http://serotoninsoftware.com
 * @author Matthew Lohbihler
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * When signing a commercial license with Serotonin Software Technologies Inc.,
 * the following extension to GPL is made. A special exception to the GPL is 
 * included to allow you to distribute a combined work that includes BAcnet4J 
 * without being obliged to provide the source code for any proprietary components.
 */
package com.serotonin.bacnet4j.type;

/**
 * һ�� BACnet Э�����ݵ�Ԫ�Ŀɱ䲿�ֵĶ���
 * The definition of the variable part of a BACnet protocol data unit
 * 
 * ��ϸ��������� 20.2.1
 * */
public class TagData {
	// ������������һ�� tag �ڲ�����������
    public int tagNumber;
    public boolean contextSpecific;
    public long length;
    
    // �ײ�����
    public int tagLength;

    /**
     * ���������ܳ���
     * */
    public int getTotalLength() {
        return (int) (length + tagLength);
    }

    public boolean isStartTag() {
        return contextSpecific && ((length & 6) == 6);
    }

    public boolean isStartTag(int contextId) {
        return isStartTag() && tagNumber == contextId;
    }

    public boolean isEndTag() {
        return contextSpecific && ((length & 7) == 7);
    }

    public boolean isEndTag(int contextId) {
        return isEndTag() && tagNumber == contextId;
    }
}
