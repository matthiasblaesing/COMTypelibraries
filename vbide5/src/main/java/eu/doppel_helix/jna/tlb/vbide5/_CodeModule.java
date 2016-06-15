
package eu.doppel_helix.jna.tlb.vbide5;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002E16E-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002E16E-0000-0000-C000-000000000046}")
public interface _CodeModule extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x60020000)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x60020000)
    VBComponent getParent();
            
    /**
     * <p>id(0x60020001)</p>
     */
    @ComProperty(name = "VBE", dispId = 0x60020001)
    VBE getVBE();
            
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "Name", dispId = 0x0)
    String getName();
            
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "Name", dispId = 0x0)
    void setName(String param0);
            
    /**
     * <p>id(0x60020004)</p>
     */
    @ComMethod(name = "AddFromString", dispId = 0x60020004)
    void AddFromString(String String);
            
    /**
     * <p>id(0x60020005)</p>
     */
    @ComMethod(name = "AddFromFile", dispId = 0x60020005)
    void AddFromFile(String FileName);
            
    /**
     * <p>id(0x60020006)</p>
     */
    @ComProperty(name = "Lines", dispId = 0x60020006)
    String getLines(Integer StartLine,
            Integer Count);
            
    /**
     * <p>id(0x60020007)</p>
     */
    @ComProperty(name = "CountOfLines", dispId = 0x60020007)
    Integer getCountOfLines();
            
    /**
     * <p>id(0x60020008)</p>
     */
    @ComMethod(name = "InsertLines", dispId = 0x60020008)
    void InsertLines(Integer Line,
            String String);
            
    /**
     * <p>id(0x60020009)</p>
     */
    @ComMethod(name = "DeleteLines", dispId = 0x60020009)
    void DeleteLines(Integer StartLine,
            Integer Count);
            
    /**
     * <p>id(0x6002000a)</p>
     */
    @ComMethod(name = "ReplaceLine", dispId = 0x6002000a)
    void ReplaceLine(Integer Line,
            String String);
            
    /**
     * <p>id(0x6002000b)</p>
     */
    @ComProperty(name = "ProcStartLine", dispId = 0x6002000b)
    Integer getProcStartLine(String ProcName,
            vbext_ProcKind ProcKind);
            
    /**
     * <p>id(0x6002000c)</p>
     */
    @ComProperty(name = "ProcCountLines", dispId = 0x6002000c)
    Integer getProcCountLines(String ProcName,
            vbext_ProcKind ProcKind);
            
    /**
     * <p>id(0x6002000d)</p>
     */
    @ComProperty(name = "ProcBodyLine", dispId = 0x6002000d)
    Integer getProcBodyLine(String ProcName,
            vbext_ProcKind ProcKind);
            
    /**
     * <p>id(0x6002000e)</p>
     */
    @ComProperty(name = "ProcOfLine", dispId = 0x6002000e)
    String getProcOfLine(Integer Line,
            VARIANT ProcKind);
            
    /**
     * <p>id(0x6002000f)</p>
     */
    @ComProperty(name = "CountOfDeclarationLines", dispId = 0x6002000f)
    Integer getCountOfDeclarationLines();
            
    /**
     * <p>id(0x60020010)</p>
     */
    @ComMethod(name = "CreateEventProc", dispId = 0x60020010)
    Integer CreateEventProc(String EventName,
            String ObjectName);
            
    /**
     * <p>id(0x60020011)</p>
     */
    @ComMethod(name = "Find", dispId = 0x60020011)
    Boolean Find(String Target,
            VARIANT StartLine,
            VARIANT StartColumn,
            VARIANT EndLine,
            VARIANT EndColumn,
            Boolean WholeWord,
            Boolean MatchCase,
            Boolean PatternSearch);
            
    /**
     * <p>id(0x60020012)</p>
     */
    @ComProperty(name = "CodePane", dispId = 0x60020012)
    CodePane getCodePane();
            
    
}