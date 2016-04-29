
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlCmdType implements IComEnum {
    
    /**
     * (1)
     */
    xlCmdCube(1),
    
    /**
     * (2)
     */
    xlCmdSql(2),
    
    /**
     * (3)
     */
    xlCmdTable(3),
    
    /**
     * (4)
     */
    xlCmdDefault(4),
    
    /**
     * (5)
     */
    xlCmdList(5),
    
    /**
     * (6)
     */
    xlCmdTableCollection(6),
    
    /**
     * (7)
     */
    xlCmdExcel(7),
    
    /**
     * (8)
     */
    xlCmdDAX(8),
    ;

    private XlCmdType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}