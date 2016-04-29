
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoCustomXMLValidationErrorType implements IComEnum {
    
    /**
     * (0)
     */
    msoCustomXMLValidationErrorSchemaGenerated(0),
    
    /**
     * (1)
     */
    msoCustomXMLValidationErrorAutomaticallyCleared(1),
    
    /**
     * (2)
     */
    msoCustomXMLValidationErrorManual(2),
    ;

    private MsoCustomXMLValidationErrorType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}