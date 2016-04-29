
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoLightRigType implements IComEnum {
    
    /**
     * (-2)
     */
    msoLightRigMixed(-2),
    
    /**
     * (1)
     */
    msoLightRigLegacyFlat1(1),
    
    /**
     * (2)
     */
    msoLightRigLegacyFlat2(2),
    
    /**
     * (3)
     */
    msoLightRigLegacyFlat3(3),
    
    /**
     * (4)
     */
    msoLightRigLegacyFlat4(4),
    
    /**
     * (5)
     */
    msoLightRigLegacyNormal1(5),
    
    /**
     * (6)
     */
    msoLightRigLegacyNormal2(6),
    
    /**
     * (7)
     */
    msoLightRigLegacyNormal3(7),
    
    /**
     * (8)
     */
    msoLightRigLegacyNormal4(8),
    
    /**
     * (9)
     */
    msoLightRigLegacyHarsh1(9),
    
    /**
     * (10)
     */
    msoLightRigLegacyHarsh2(10),
    
    /**
     * (11)
     */
    msoLightRigLegacyHarsh3(11),
    
    /**
     * (12)
     */
    msoLightRigLegacyHarsh4(12),
    
    /**
     * (13)
     */
    msoLightRigThreePoint(13),
    
    /**
     * (14)
     */
    msoLightRigBalanced(14),
    
    /**
     * (15)
     */
    msoLightRigSoft(15),
    
    /**
     * (16)
     */
    msoLightRigHarsh(16),
    
    /**
     * (17)
     */
    msoLightRigFlood(17),
    
    /**
     * (18)
     */
    msoLightRigContrasting(18),
    
    /**
     * (19)
     */
    msoLightRigMorning(19),
    
    /**
     * (20)
     */
    msoLightRigSunrise(20),
    
    /**
     * (21)
     */
    msoLightRigSunset(21),
    
    /**
     * (22)
     */
    msoLightRigChilly(22),
    
    /**
     * (23)
     */
    msoLightRigFreezing(23),
    
    /**
     * (24)
     */
    msoLightRigFlat(24),
    
    /**
     * (25)
     */
    msoLightRigTwoPoint(25),
    
    /**
     * (26)
     */
    msoLightRigGlow(26),
    
    /**
     * (27)
     */
    msoLightRigBrightRoom(27),
    ;

    private MsoLightRigType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}