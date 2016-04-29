
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoPresetMaterial implements IComEnum {
    
    /**
     * (-2)
     */
    msoPresetMaterialMixed(-2),
    
    /**
     * (1)
     */
    msoMaterialMatte(1),
    
    /**
     * (2)
     */
    msoMaterialPlastic(2),
    
    /**
     * (3)
     */
    msoMaterialMetal(3),
    
    /**
     * (4)
     */
    msoMaterialWireFrame(4),
    
    /**
     * (5)
     */
    msoMaterialMatte2(5),
    
    /**
     * (6)
     */
    msoMaterialPlastic2(6),
    
    /**
     * (7)
     */
    msoMaterialMetal2(7),
    
    /**
     * (8)
     */
    msoMaterialWarmMatte(8),
    
    /**
     * (9)
     */
    msoMaterialTranslucentPowder(9),
    
    /**
     * (10)
     */
    msoMaterialPowder(10),
    
    /**
     * (11)
     */
    msoMaterialDarkEdge(11),
    
    /**
     * (12)
     */
    msoMaterialSoftEdge(12),
    
    /**
     * (13)
     */
    msoMaterialClear(13),
    
    /**
     * (14)
     */
    msoMaterialFlat(14),
    
    /**
     * (15)
     */
    msoMaterialSoftMetal(15),
    ;

    private MsoPresetMaterial(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}