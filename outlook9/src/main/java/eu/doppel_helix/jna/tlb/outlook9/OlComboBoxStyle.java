
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({382F8459-84AD-4CEB-8705-A8F8E2DC15E1})</p>
 */
public enum OlComboBoxStyle implements IComEnum {
    
    /**
     * Combo (0)
     */
    olComboBoxStyleCombo(0),
    
    /**
     * List (2)
     */
    olComboBoxStyleList(2),
    ;

    private OlComboBoxStyle(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}