
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C03C8-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C03C8-0000-0000-C000-000000000046}")
public interface SmartArtNode extends IUnknown, IRawDispatchHandle, IDispatch {
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
    @ComMethod(name = "AddNode", dispId = 0x2)
    SmartArtNode AddNode(MsoSmartArtNodePosition Position,
            MsoSmartArtNodeType Type);
            
    /**
     * <p>id(0x3)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x3)
    void Delete();
            
    /**
     * <p>id(0x4)</p>
     */
    @ComMethod(name = "Promote", dispId = 0x4)
    void Promote();
            
    /**
     * <p>id(0x5)</p>
     */
    @ComMethod(name = "Demote", dispId = 0x5)
    void Demote();
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "OrgChartLayout", dispId = 0x6)
    MsoOrgChartLayoutType getOrgChartLayout();
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "OrgChartLayout", dispId = 0x6)
    void setOrgChartLayout(MsoOrgChartLayoutType param0);
            
    /**
     * <p>id(0x7)</p>
     */
    @ComProperty(name = "Shapes", dispId = 0x7)
    ShapeRange getShapes();
            
    /**
     * <p>id(0x8)</p>
     */
    @ComProperty(name = "TextFrame2", dispId = 0x8)
    TextFrame2 getTextFrame2();
            
    /**
     * <p>id(0x9)</p>
     */
    @ComMethod(name = "Larger", dispId = 0x9)
    void Larger();
            
    /**
     * <p>id(0xa)</p>
     */
    @ComMethod(name = "Smaller", dispId = 0xa)
    void Smaller();
            
    /**
     * <p>id(0xb)</p>
     */
    @ComProperty(name = "Level", dispId = 0xb)
    Integer getLevel();
            
    /**
     * <p>id(0xc)</p>
     */
    @ComProperty(name = "Hidden", dispId = 0xc)
    MsoTriState getHidden();
            
    /**
     * <p>id(0xd)</p>
     */
    @ComProperty(name = "Nodes", dispId = 0xd)
    SmartArtNodes getNodes();
            
    /**
     * <p>id(0xe)</p>
     */
    @ComProperty(name = "ParentNode", dispId = 0xe)
    SmartArtNode getParentNode();
            
    /**
     * <p>id(0xf)</p>
     */
    @ComProperty(name = "Type", dispId = 0xf)
    MsoSmartArtNodeType getType();
            
    /**
     * <p>id(0x10)</p>
     */
    @ComMethod(name = "ReorderUp", dispId = 0x10)
    void ReorderUp();
            
    /**
     * <p>id(0x11)</p>
     */
    @ComMethod(name = "ReorderDown", dispId = 0x11)
    void ReorderDown();
            
    
}