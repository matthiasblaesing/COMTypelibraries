
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OlRuleType implements IComEnum {
    
    /**
     * (0)
     */
    olRuleReceive(0),
    
    /**
     * (1)
     */
    olRuleSend(1),
    ;

    private OlRuleType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}