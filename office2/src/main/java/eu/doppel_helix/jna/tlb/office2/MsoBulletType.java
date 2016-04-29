
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoBulletType implements IComEnum {
    
    /**
     * (-2)
     */
    msoBulletMixed(-2),
    
    /**
     * (0)
     */
    msoBulletNone(0),
    
    /**
     * (1)
     */
    msoBulletUnnumbered(1),
    
    /**
     * (2)
     */
    msoBulletNumbered(2),
    
    /**
     * (3)
     */
    msoBulletPicture(3),
    ;

    private MsoBulletType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}