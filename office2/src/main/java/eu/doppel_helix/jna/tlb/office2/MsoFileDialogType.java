
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoFileDialogType implements IComEnum {
    
    /**
     * (1)
     */
    msoFileDialogOpen(1),
    
    /**
     * (2)
     */
    msoFileDialogSaveAs(2),
    
    /**
     * (3)
     */
    msoFileDialogFilePicker(3),
    
    /**
     * (4)
     */
    msoFileDialogFolderPicker(4),
    ;

    private MsoFileDialogType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}