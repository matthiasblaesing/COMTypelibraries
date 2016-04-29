
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OlRuleExecuteOption implements IComEnum {
    
    /**
     * (0)
     */
    olRuleExecuteAllMessages(0),
    
    /**
     * (1)
     */
    olRuleExecuteReadMessages(1),
    
    /**
     * (2)
     */
    olRuleExecuteUnreadMessages(2),
    ;

    private OlRuleExecuteOption(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}