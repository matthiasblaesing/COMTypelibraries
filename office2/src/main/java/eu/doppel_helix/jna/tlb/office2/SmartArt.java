
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C03C6-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C03C6-0000-0000-C000-000000000046}")
public interface SmartArt {
    /**
     * <p>id(0x60020000)</p>
     */
    @ComProperty(name = "Application", dispId = 0x60020000)
    com.sun.jna.platform.win32.COM.util.IDispatch getApplication();
            
    /**
     * <p>id(0x60020001)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x60020001)
    Integer getCreator();
            
    /**
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x1)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "AllNodes", dispId = 0x2)
    SmartArtNodes getAllNodes();
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "Nodes", dispId = 0x3)
    SmartArtNodes getNodes();
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "Layout", dispId = 0x4)
    SmartArtLayout getLayout();
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "Layout", dispId = 0x4)
    void setLayout(SmartArtLayout param0);
            
    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "QuickStyle", dispId = 0x5)
    SmartArtQuickStyle getQuickStyle();
            
    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "QuickStyle", dispId = 0x5)
    void setQuickStyle(SmartArtQuickStyle param0);
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "Color", dispId = 0x6)
    SmartArtColor getColor();
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "Color", dispId = 0x6)
    void setColor(SmartArtColor param0);
            
    /**
     * <p>id(0x7)</p>
     */
    @ComProperty(name = "Reverse", dispId = 0x7)
    MsoTriState getReverse();
            
    /**
     * <p>id(0x7)</p>
     */
    @ComProperty(name = "Reverse", dispId = 0x7)
    void setReverse(MsoTriState param0);
            
    /**
     * <p>id(0x8)</p>
     */
    @ComMethod(name = "Reset", dispId = 0x8)
    void Reset();
            
    
}