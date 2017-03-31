
package eu.doppel_helix.jna.tlb.wbemdisp1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * Defines a privilege
 *
 * <p>uuid({176D2F70-5AF3-11D2-8B4A-00600806D9B6})</p>
 */
public enum WbemPrivilegeEnum implements IComEnum {
    
    /**
     * (1)
     */
    wbemPrivilegeCreateToken(1),
    
    /**
     * (2)
     */
    wbemPrivilegePrimaryToken(2),
    
    /**
     * (3)
     */
    wbemPrivilegeLockMemory(3),
    
    /**
     * (4)
     */
    wbemPrivilegeIncreaseQuota(4),
    
    /**
     * (5)
     */
    wbemPrivilegeMachineAccount(5),
    
    /**
     * (6)
     */
    wbemPrivilegeTcb(6),
    
    /**
     * (7)
     */
    wbemPrivilegeSecurity(7),
    
    /**
     * (8)
     */
    wbemPrivilegeTakeOwnership(8),
    
    /**
     * (9)
     */
    wbemPrivilegeLoadDriver(9),
    
    /**
     * (10)
     */
    wbemPrivilegeSystemProfile(10),
    
    /**
     * (11)
     */
    wbemPrivilegeSystemtime(11),
    
    /**
     * (12)
     */
    wbemPrivilegeProfileSingleProcess(12),
    
    /**
     * (13)
     */
    wbemPrivilegeIncreaseBasePriority(13),
    
    /**
     * (14)
     */
    wbemPrivilegeCreatePagefile(14),
    
    /**
     * (15)
     */
    wbemPrivilegeCreatePermanent(15),
    
    /**
     * (16)
     */
    wbemPrivilegeBackup(16),
    
    /**
     * (17)
     */
    wbemPrivilegeRestore(17),
    
    /**
     * (18)
     */
    wbemPrivilegeShutdown(18),
    
    /**
     * (19)
     */
    wbemPrivilegeDebug(19),
    
    /**
     * (20)
     */
    wbemPrivilegeAudit(20),
    
    /**
     * (21)
     */
    wbemPrivilegeSystemEnvironment(21),
    
    /**
     * (22)
     */
    wbemPrivilegeChangeNotify(22),
    
    /**
     * (23)
     */
    wbemPrivilegeRemoteShutdown(23),
    
    /**
     * (24)
     */
    wbemPrivilegeUndock(24),
    
    /**
     * (25)
     */
    wbemPrivilegeSyncAgent(25),
    
    /**
     * (26)
     */
    wbemPrivilegeEnableDelegation(26),
    
    /**
     * (27)
     */
    wbemPrivilegeManageVolume(27),
    ;

    private WbemPrivilegeEnum(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}