
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002443B-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002443B-0001-0000-C000-000000000046}")
public interface IShapeRange extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x94)</p>
     */
    @ComProperty(name = "Application", dispId = 0x94)
    com.sun.jna.platform.win32.WinNT.HRESULT getApplication(VARIANT RHS);
            
    /**
     * <p>id(0x95)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    com.sun.jna.platform.win32.WinNT.HRESULT getCreator(VARIANT RHS);
            
    /**
     * <p>id(0x96)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.WinNT.HRESULT getParent(VARIANT RHS);
            
    /**
     * <p>id(0x76)</p>
     */
    @ComProperty(name = "Count", dispId = 0x76)
    com.sun.jna.platform.win32.WinNT.HRESULT getCount(VARIANT RHS);
            
    /**
     * <p>id(0xaa)</p>
     */
    @ComMethod(name = "Item", dispId = 0xaa)
    com.sun.jna.platform.win32.WinNT.HRESULT Item(Object Index,
            VARIANT RHS);
            
    /**
     * <p>id(0x0)</p>
     */
    @ComMethod(name = "_Default", dispId = 0x0)
    com.sun.jna.platform.win32.WinNT.HRESULT _Default(Object Index,
            VARIANT RHS);
            
    /**
     * <p>id(0x6cc)</p>
     */
    @ComMethod(name = "Align", dispId = 0x6cc)
    com.sun.jna.platform.win32.WinNT.HRESULT Align(eu.doppel_helix.jna.tlb.office2.MsoAlignCmd AlignCmd,
            eu.doppel_helix.jna.tlb.office2.MsoTriState RelativeTo);
            
    /**
     * <p>id(0x68b)</p>
     */
    @ComMethod(name = "Apply", dispId = 0x68b)
    com.sun.jna.platform.win32.WinNT.HRESULT Apply();
            
    /**
     * <p>id(0x75)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    com.sun.jna.platform.win32.WinNT.HRESULT Delete();
            
    /**
     * <p>id(0x6ce)</p>
     */
    @ComMethod(name = "Distribute", dispId = 0x6ce)
    com.sun.jna.platform.win32.WinNT.HRESULT Distribute(eu.doppel_helix.jna.tlb.office2.MsoDistributeCmd DistributeCmd,
            eu.doppel_helix.jna.tlb.office2.MsoTriState RelativeTo);
            
    /**
     * <p>id(0x40f)</p>
     */
    @ComMethod(name = "Duplicate", dispId = 0x40f)
    com.sun.jna.platform.win32.WinNT.HRESULT Duplicate(VARIANT RHS);
            
    /**
     * <p>id(0x68c)</p>
     */
    @ComMethod(name = "Flip", dispId = 0x68c)
    com.sun.jna.platform.win32.WinNT.HRESULT Flip(eu.doppel_helix.jna.tlb.office2.MsoFlipCmd FlipCmd);
            
    /**
     * <p>id(0x68e)</p>
     */
    @ComMethod(name = "IncrementLeft", dispId = 0x68e)
    com.sun.jna.platform.win32.WinNT.HRESULT IncrementLeft(Float Increment);
            
    /**
     * <p>id(0x690)</p>
     */
    @ComMethod(name = "IncrementRotation", dispId = 0x690)
    com.sun.jna.platform.win32.WinNT.HRESULT IncrementRotation(Float Increment);
            
    /**
     * <p>id(0x691)</p>
     */
    @ComMethod(name = "IncrementTop", dispId = 0x691)
    com.sun.jna.platform.win32.WinNT.HRESULT IncrementTop(Float Increment);
            
    /**
     * <p>id(0x2e)</p>
     */
    @ComMethod(name = "Group", dispId = 0x2e)
    com.sun.jna.platform.win32.WinNT.HRESULT Group(VARIANT RHS);
            
    /**
     * <p>id(0x692)</p>
     */
    @ComMethod(name = "PickUp", dispId = 0x692)
    com.sun.jna.platform.win32.WinNT.HRESULT PickUp();
            
    /**
     * <p>id(0x693)</p>
     */
    @ComMethod(name = "RerouteConnections", dispId = 0x693)
    com.sun.jna.platform.win32.WinNT.HRESULT RerouteConnections();
            
    /**
     * <p>id(0x6d0)</p>
     */
    @ComMethod(name = "Regroup", dispId = 0x6d0)
    com.sun.jna.platform.win32.WinNT.HRESULT Regroup(VARIANT RHS);
            
    /**
     * <p>id(0x694)</p>
     */
    @ComMethod(name = "ScaleHeight", dispId = 0x694)
    com.sun.jna.platform.win32.WinNT.HRESULT ScaleHeight(Float Factor,
            eu.doppel_helix.jna.tlb.office2.MsoTriState RelativeToOriginalSize,
            Object Scale);
            
    /**
     * <p>id(0x698)</p>
     */
    @ComMethod(name = "ScaleWidth", dispId = 0x698)
    com.sun.jna.platform.win32.WinNT.HRESULT ScaleWidth(Float Factor,
            eu.doppel_helix.jna.tlb.office2.MsoTriState RelativeToOriginalSize,
            Object Scale);
            
    /**
     * <p>id(0xeb)</p>
     */
    @ComMethod(name = "Select", dispId = 0xeb)
    com.sun.jna.platform.win32.WinNT.HRESULT Select(Object Replace);
            
    /**
     * <p>id(0x699)</p>
     */
    @ComMethod(name = "SetShapesDefaultProperties", dispId = 0x699)
    com.sun.jna.platform.win32.WinNT.HRESULT SetShapesDefaultProperties();
            
    /**
     * <p>id(0xf4)</p>
     */
    @ComMethod(name = "Ungroup", dispId = 0xf4)
    com.sun.jna.platform.win32.WinNT.HRESULT Ungroup(VARIANT RHS);
            
    /**
     * <p>id(0x26e)</p>
     */
    @ComMethod(name = "ZOrder", dispId = 0x26e)
    com.sun.jna.platform.win32.WinNT.HRESULT ZOrder(eu.doppel_helix.jna.tlb.office2.MsoZOrderCmd ZOrderCmd);
            
    /**
     * <p>id(0x69b)</p>
     */
    @ComProperty(name = "Adjustments", dispId = 0x69b)
    com.sun.jna.platform.win32.WinNT.HRESULT getAdjustments(VARIANT RHS);
            
    /**
     * <p>id(0x69c)</p>
     */
    @ComProperty(name = "TextFrame", dispId = 0x69c)
    com.sun.jna.platform.win32.WinNT.HRESULT getTextFrame(VARIANT RHS);
            
    /**
     * <p>id(0x69d)</p>
     */
    @ComProperty(name = "AutoShapeType", dispId = 0x69d)
    com.sun.jna.platform.win32.WinNT.HRESULT getAutoShapeType(VARIANT RHS);
            
    /**
     * <p>id(0x69d)</p>
     */
    @ComProperty(name = "AutoShapeType", dispId = 0x69d)
    com.sun.jna.platform.win32.WinNT.HRESULT setAutoShapeType(eu.doppel_helix.jna.tlb.office2.MsoAutoShapeType RHS);
            
    /**
     * <p>id(0x69e)</p>
     */
    @ComProperty(name = "Callout", dispId = 0x69e)
    com.sun.jna.platform.win32.WinNT.HRESULT getCallout(VARIANT RHS);
            
    /**
     * <p>id(0x69f)</p>
     */
    @ComProperty(name = "ConnectionSiteCount", dispId = 0x69f)
    com.sun.jna.platform.win32.WinNT.HRESULT getConnectionSiteCount(VARIANT RHS);
            
    /**
     * <p>id(0x6a0)</p>
     */
    @ComProperty(name = "Connector", dispId = 0x6a0)
    com.sun.jna.platform.win32.WinNT.HRESULT getConnector(VARIANT RHS);
            
    /**
     * <p>id(0x6a1)</p>
     */
    @ComProperty(name = "ConnectorFormat", dispId = 0x6a1)
    com.sun.jna.platform.win32.WinNT.HRESULT getConnectorFormat(VARIANT RHS);
            
    /**
     * <p>id(0x67f)</p>
     */
    @ComProperty(name = "Fill", dispId = 0x67f)
    com.sun.jna.platform.win32.WinNT.HRESULT getFill(VARIANT RHS);
            
    /**
     * <p>id(0x6a2)</p>
     */
    @ComProperty(name = "GroupItems", dispId = 0x6a2)
    com.sun.jna.platform.win32.WinNT.HRESULT getGroupItems(VARIANT RHS);
            
    /**
     * <p>id(0x7b)</p>
     */
    @ComProperty(name = "Height", dispId = 0x7b)
    com.sun.jna.platform.win32.WinNT.HRESULT getHeight(VARIANT RHS);
            
    /**
     * <p>id(0x7b)</p>
     */
    @ComProperty(name = "Height", dispId = 0x7b)
    com.sun.jna.platform.win32.WinNT.HRESULT setHeight(Float RHS);
            
    /**
     * <p>id(0x6a3)</p>
     */
    @ComProperty(name = "HorizontalFlip", dispId = 0x6a3)
    com.sun.jna.platform.win32.WinNT.HRESULT getHorizontalFlip(VARIANT RHS);
            
    /**
     * <p>id(0x7f)</p>
     */
    @ComProperty(name = "Left", dispId = 0x7f)
    com.sun.jna.platform.win32.WinNT.HRESULT getLeft(VARIANT RHS);
            
    /**
     * <p>id(0x7f)</p>
     */
    @ComProperty(name = "Left", dispId = 0x7f)
    com.sun.jna.platform.win32.WinNT.HRESULT setLeft(Float RHS);
            
    /**
     * <p>id(0x331)</p>
     */
    @ComProperty(name = "Line", dispId = 0x331)
    com.sun.jna.platform.win32.WinNT.HRESULT getLine(VARIANT RHS);
            
    /**
     * <p>id(0x6a4)</p>
     */
    @ComProperty(name = "LockAspectRatio", dispId = 0x6a4)
    com.sun.jna.platform.win32.WinNT.HRESULT getLockAspectRatio(VARIANT RHS);
            
    /**
     * <p>id(0x6a4)</p>
     */
    @ComProperty(name = "LockAspectRatio", dispId = 0x6a4)
    com.sun.jna.platform.win32.WinNT.HRESULT setLockAspectRatio(eu.doppel_helix.jna.tlb.office2.MsoTriState RHS);
            
    /**
     * <p>id(0x6e)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    com.sun.jna.platform.win32.WinNT.HRESULT getName(VARIANT RHS);
            
    /**
     * <p>id(0x6e)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    com.sun.jna.platform.win32.WinNT.HRESULT setName(String RHS);
            
    /**
     * <p>id(0x6a5)</p>
     */
    @ComProperty(name = "Nodes", dispId = 0x6a5)
    com.sun.jna.platform.win32.WinNT.HRESULT getNodes(VARIANT RHS);
            
    /**
     * <p>id(0x3b)</p>
     */
    @ComProperty(name = "Rotation", dispId = 0x3b)
    com.sun.jna.platform.win32.WinNT.HRESULT getRotation(VARIANT RHS);
            
    /**
     * <p>id(0x3b)</p>
     */
    @ComProperty(name = "Rotation", dispId = 0x3b)
    com.sun.jna.platform.win32.WinNT.HRESULT setRotation(Float RHS);
            
    /**
     * <p>id(0x65f)</p>
     */
    @ComProperty(name = "PictureFormat", dispId = 0x65f)
    com.sun.jna.platform.win32.WinNT.HRESULT getPictureFormat(VARIANT RHS);
            
    /**
     * <p>id(0x67)</p>
     */
    @ComProperty(name = "Shadow", dispId = 0x67)
    com.sun.jna.platform.win32.WinNT.HRESULT getShadow(VARIANT RHS);
            
    /**
     * <p>id(0x6a6)</p>
     */
    @ComProperty(name = "TextEffect", dispId = 0x6a6)
    com.sun.jna.platform.win32.WinNT.HRESULT getTextEffect(VARIANT RHS);
            
    /**
     * <p>id(0x6a7)</p>
     */
    @ComProperty(name = "ThreeD", dispId = 0x6a7)
    com.sun.jna.platform.win32.WinNT.HRESULT getThreeD(VARIANT RHS);
            
    /**
     * <p>id(0x7e)</p>
     */
    @ComProperty(name = "Top", dispId = 0x7e)
    com.sun.jna.platform.win32.WinNT.HRESULT getTop(VARIANT RHS);
            
    /**
     * <p>id(0x7e)</p>
     */
    @ComProperty(name = "Top", dispId = 0x7e)
    com.sun.jna.platform.win32.WinNT.HRESULT setTop(Float RHS);
            
    /**
     * <p>id(0x6c)</p>
     */
    @ComProperty(name = "Type", dispId = 0x6c)
    com.sun.jna.platform.win32.WinNT.HRESULT getType(VARIANT RHS);
            
    /**
     * <p>id(0x6a8)</p>
     */
    @ComProperty(name = "VerticalFlip", dispId = 0x6a8)
    com.sun.jna.platform.win32.WinNT.HRESULT getVerticalFlip(VARIANT RHS);
            
    /**
     * <p>id(0x26d)</p>
     */
    @ComProperty(name = "Vertices", dispId = 0x26d)
    com.sun.jna.platform.win32.WinNT.HRESULT getVertices(VARIANT RHS);
            
    /**
     * <p>id(0x22e)</p>
     */
    @ComProperty(name = "Visible", dispId = 0x22e)
    com.sun.jna.platform.win32.WinNT.HRESULT getVisible(VARIANT RHS);
            
    /**
     * <p>id(0x22e)</p>
     */
    @ComProperty(name = "Visible", dispId = 0x22e)
    com.sun.jna.platform.win32.WinNT.HRESULT setVisible(eu.doppel_helix.jna.tlb.office2.MsoTriState RHS);
            
    /**
     * <p>id(0x7a)</p>
     */
    @ComProperty(name = "Width", dispId = 0x7a)
    com.sun.jna.platform.win32.WinNT.HRESULT getWidth(VARIANT RHS);
            
    /**
     * <p>id(0x7a)</p>
     */
    @ComProperty(name = "Width", dispId = 0x7a)
    com.sun.jna.platform.win32.WinNT.HRESULT setWidth(Float RHS);
            
    /**
     * <p>id(0x6a9)</p>
     */
    @ComProperty(name = "ZOrderPosition", dispId = 0x6a9)
    com.sun.jna.platform.win32.WinNT.HRESULT getZOrderPosition(VARIANT RHS);
            
    /**
     * <p>id(0x6ab)</p>
     */
    @ComProperty(name = "BlackWhiteMode", dispId = 0x6ab)
    com.sun.jna.platform.win32.WinNT.HRESULT getBlackWhiteMode(VARIANT RHS);
            
    /**
     * <p>id(0x6ab)</p>
     */
    @ComProperty(name = "BlackWhiteMode", dispId = 0x6ab)
    com.sun.jna.platform.win32.WinNT.HRESULT setBlackWhiteMode(eu.doppel_helix.jna.tlb.office2.MsoBlackWhiteMode RHS);
            
    /**
     * <p>id(0x763)</p>
     */
    @ComProperty(name = "AlternativeText", dispId = 0x763)
    com.sun.jna.platform.win32.WinNT.HRESULT getAlternativeText(VARIANT RHS);
            
    /**
     * <p>id(0x763)</p>
     */
    @ComProperty(name = "AlternativeText", dispId = 0x763)
    com.sun.jna.platform.win32.WinNT.HRESULT setAlternativeText(String RHS);
            
    /**
     * <p>id(0x875)</p>
     */
    @ComProperty(name = "DiagramNode", dispId = 0x875)
    com.sun.jna.platform.win32.WinNT.HRESULT getDiagramNode(VARIANT RHS);
            
    /**
     * <p>id(0x876)</p>
     */
    @ComProperty(name = "HasDiagramNode", dispId = 0x876)
    com.sun.jna.platform.win32.WinNT.HRESULT getHasDiagramNode(VARIANT RHS);
            
    /**
     * <p>id(0x877)</p>
     */
    @ComProperty(name = "Diagram", dispId = 0x877)
    com.sun.jna.platform.win32.WinNT.HRESULT getDiagram(VARIANT RHS);
            
    /**
     * <p>id(0x878)</p>
     */
    @ComProperty(name = "HasDiagram", dispId = 0x878)
    com.sun.jna.platform.win32.WinNT.HRESULT getHasDiagram(VARIANT RHS);
            
    /**
     * <p>id(0x879)</p>
     */
    @ComProperty(name = "Child", dispId = 0x879)
    com.sun.jna.platform.win32.WinNT.HRESULT getChild(VARIANT RHS);
            
    /**
     * <p>id(0x87a)</p>
     */
    @ComProperty(name = "ParentGroup", dispId = 0x87a)
    com.sun.jna.platform.win32.WinNT.HRESULT getParentGroup(VARIANT RHS);
            
    /**
     * <p>id(0x87b)</p>
     */
    @ComProperty(name = "CanvasItems", dispId = 0x87b)
    com.sun.jna.platform.win32.WinNT.HRESULT getCanvasItems(VARIANT RHS);
            
    /**
     * <p>id(0x23a)</p>
     */
    @ComProperty(name = "ID", dispId = 0x23a)
    com.sun.jna.platform.win32.WinNT.HRESULT getID(VARIANT RHS);
            
    /**
     * <p>id(0x87c)</p>
     */
    @ComMethod(name = "CanvasCropLeft", dispId = 0x87c)
    com.sun.jna.platform.win32.WinNT.HRESULT CanvasCropLeft(Float Increment);
            
    /**
     * <p>id(0x87d)</p>
     */
    @ComMethod(name = "CanvasCropTop", dispId = 0x87d)
    com.sun.jna.platform.win32.WinNT.HRESULT CanvasCropTop(Float Increment);
            
    /**
     * <p>id(0x87e)</p>
     */
    @ComMethod(name = "CanvasCropRight", dispId = 0x87e)
    com.sun.jna.platform.win32.WinNT.HRESULT CanvasCropRight(Float Increment);
            
    /**
     * <p>id(0x87f)</p>
     */
    @ComMethod(name = "CanvasCropBottom", dispId = 0x87f)
    com.sun.jna.platform.win32.WinNT.HRESULT CanvasCropBottom(Float Increment);
            
    /**
     * <p>id(0x7)</p>
     */
    @ComProperty(name = "Chart", dispId = 0x7)
    com.sun.jna.platform.win32.WinNT.HRESULT getChart(VARIANT RHS);
            
    /**
     * <p>id(0xa62)</p>
     */
    @ComProperty(name = "HasChart", dispId = 0xa62)
    com.sun.jna.platform.win32.WinNT.HRESULT getHasChart(VARIANT RHS);
            
    /**
     * <p>id(0xa63)</p>
     */
    @ComProperty(name = "TextFrame2", dispId = 0xa63)
    com.sun.jna.platform.win32.WinNT.HRESULT getTextFrame2(VARIANT RHS);
            
    /**
     * <p>id(0xa64)</p>
     */
    @ComProperty(name = "ShapeStyle", dispId = 0xa64)
    com.sun.jna.platform.win32.WinNT.HRESULT getShapeStyle(VARIANT RHS);
            
    /**
     * <p>id(0xa64)</p>
     */
    @ComProperty(name = "ShapeStyle", dispId = 0xa64)
    com.sun.jna.platform.win32.WinNT.HRESULT setShapeStyle(eu.doppel_helix.jna.tlb.office2.MsoShapeStyleIndex RHS);
            
    /**
     * <p>id(0xa65)</p>
     */
    @ComProperty(name = "BackgroundStyle", dispId = 0xa65)
    com.sun.jna.platform.win32.WinNT.HRESULT getBackgroundStyle(VARIANT RHS);
            
    /**
     * <p>id(0xa65)</p>
     */
    @ComProperty(name = "BackgroundStyle", dispId = 0xa65)
    com.sun.jna.platform.win32.WinNT.HRESULT setBackgroundStyle(eu.doppel_helix.jna.tlb.office2.MsoBackgroundStyleIndex RHS);
            
    /**
     * <p>id(0xa66)</p>
     */
    @ComProperty(name = "SoftEdge", dispId = 0xa66)
    com.sun.jna.platform.win32.WinNT.HRESULT getSoftEdge(VARIANT RHS);
            
    /**
     * <p>id(0xa67)</p>
     */
    @ComProperty(name = "Glow", dispId = 0xa67)
    com.sun.jna.platform.win32.WinNT.HRESULT getGlow(VARIANT RHS);
            
    /**
     * <p>id(0xa68)</p>
     */
    @ComProperty(name = "Reflection", dispId = 0xa68)
    com.sun.jna.platform.win32.WinNT.HRESULT getReflection(VARIANT RHS);
            
    /**
     * <p>id(0xc7)</p>
     */
    @ComProperty(name = "Title", dispId = 0xc7)
    com.sun.jna.platform.win32.WinNT.HRESULT getTitle(VARIANT RHS);
            
    /**
     * <p>id(0xc7)</p>
     */
    @ComProperty(name = "Title", dispId = 0xc7)
    com.sun.jna.platform.win32.WinNT.HRESULT setTitle(String RHS);
            
    
}