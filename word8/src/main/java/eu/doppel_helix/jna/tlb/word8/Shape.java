
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000209A0-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000209A0-0000-0000-C000-000000000046}")
public interface Shape extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x1f40)</p>
     */
    @ComProperty(name = "Application", dispId = 0x1f40)
    Application getApplication();
            
    /**
     * <p>id(0x1f41)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x1f41)
    Integer getCreator();
            
    /**
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x1)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x64)</p>
     */
    @ComProperty(name = "Adjustments", dispId = 0x64)
    Adjustments getAdjustments();
            
    /**
     * <p>id(0x65)</p>
     */
    @ComProperty(name = "AutoShapeType", dispId = 0x65)
    eu.doppel_helix.jna.tlb.office2.MsoAutoShapeType getAutoShapeType();
            
    /**
     * <p>id(0x65)</p>
     */
    @ComProperty(name = "AutoShapeType", dispId = 0x65)
    void setAutoShapeType(eu.doppel_helix.jna.tlb.office2.MsoAutoShapeType param0);
            
    /**
     * <p>id(0x67)</p>
     */
    @ComProperty(name = "Callout", dispId = 0x67)
    CalloutFormat getCallout();
            
    /**
     * <p>id(0x68)</p>
     */
    @ComProperty(name = "ConnectionSiteCount", dispId = 0x68)
    Integer getConnectionSiteCount();
            
    /**
     * <p>id(0x69)</p>
     */
    @ComProperty(name = "Connector", dispId = 0x69)
    eu.doppel_helix.jna.tlb.office2.MsoTriState getConnector();
            
    /**
     * <p>id(0x6a)</p>
     */
    @ComProperty(name = "ConnectorFormat", dispId = 0x6a)
    ConnectorFormat getConnectorFormat();
            
    /**
     * <p>id(0x6b)</p>
     */
    @ComProperty(name = "Fill", dispId = 0x6b)
    FillFormat getFill();
            
    /**
     * <p>id(0x6c)</p>
     */
    @ComProperty(name = "GroupItems", dispId = 0x6c)
    GroupShapes getGroupItems();
            
    /**
     * <p>id(0x6d)</p>
     */
    @ComProperty(name = "Height", dispId = 0x6d)
    Float getHeight();
            
    /**
     * <p>id(0x6d)</p>
     */
    @ComProperty(name = "Height", dispId = 0x6d)
    void setHeight(Float param0);
            
    /**
     * <p>id(0x6e)</p>
     */
    @ComProperty(name = "HorizontalFlip", dispId = 0x6e)
    eu.doppel_helix.jna.tlb.office2.MsoTriState getHorizontalFlip();
            
    /**
     * <p>id(0x6f)</p>
     */
    @ComProperty(name = "Left", dispId = 0x6f)
    Float getLeft();
            
    /**
     * <p>id(0x6f)</p>
     */
    @ComProperty(name = "Left", dispId = 0x6f)
    void setLeft(Float param0);
            
    /**
     * <p>id(0x70)</p>
     */
    @ComProperty(name = "Line", dispId = 0x70)
    LineFormat getLine();
            
    /**
     * <p>id(0x71)</p>
     */
    @ComProperty(name = "LockAspectRatio", dispId = 0x71)
    eu.doppel_helix.jna.tlb.office2.MsoTriState getLockAspectRatio();
            
    /**
     * <p>id(0x71)</p>
     */
    @ComProperty(name = "LockAspectRatio", dispId = 0x71)
    void setLockAspectRatio(eu.doppel_helix.jna.tlb.office2.MsoTriState param0);
            
    /**
     * <p>id(0x73)</p>
     */
    @ComProperty(name = "Name", dispId = 0x73)
    String getName();
            
    /**
     * <p>id(0x73)</p>
     */
    @ComProperty(name = "Name", dispId = 0x73)
    void setName(String param0);
            
    /**
     * <p>id(0x74)</p>
     */
    @ComProperty(name = "Nodes", dispId = 0x74)
    ShapeNodes getNodes();
            
    /**
     * <p>id(0x75)</p>
     */
    @ComProperty(name = "Rotation", dispId = 0x75)
    Float getRotation();
            
    /**
     * <p>id(0x75)</p>
     */
    @ComProperty(name = "Rotation", dispId = 0x75)
    void setRotation(Float param0);
            
    /**
     * <p>id(0x76)</p>
     */
    @ComProperty(name = "PictureFormat", dispId = 0x76)
    PictureFormat getPictureFormat();
            
    /**
     * <p>id(0x77)</p>
     */
    @ComProperty(name = "Shadow", dispId = 0x77)
    ShadowFormat getShadow();
            
    /**
     * <p>id(0x78)</p>
     */
    @ComProperty(name = "TextEffect", dispId = 0x78)
    TextEffectFormat getTextEffect();
            
    /**
     * <p>id(0x79)</p>
     */
    @ComProperty(name = "TextFrame", dispId = 0x79)
    TextFrame getTextFrame();
            
    /**
     * <p>id(0x7a)</p>
     */
    @ComProperty(name = "ThreeD", dispId = 0x7a)
    ThreeDFormat getThreeD();
            
    /**
     * <p>id(0x7b)</p>
     */
    @ComProperty(name = "Top", dispId = 0x7b)
    Float getTop();
            
    /**
     * <p>id(0x7b)</p>
     */
    @ComProperty(name = "Top", dispId = 0x7b)
    void setTop(Float param0);
            
    /**
     * <p>id(0x7c)</p>
     */
    @ComProperty(name = "Type", dispId = 0x7c)
    eu.doppel_helix.jna.tlb.office2.MsoShapeType getType();
            
    /**
     * <p>id(0x7d)</p>
     */
    @ComProperty(name = "VerticalFlip", dispId = 0x7d)
    eu.doppel_helix.jna.tlb.office2.MsoTriState getVerticalFlip();
            
    /**
     * <p>id(0x7e)</p>
     */
    @ComProperty(name = "Vertices", dispId = 0x7e)
    Object getVertices();
            
    /**
     * <p>id(0x7f)</p>
     */
    @ComProperty(name = "Visible", dispId = 0x7f)
    eu.doppel_helix.jna.tlb.office2.MsoTriState getVisible();
            
    /**
     * <p>id(0x7f)</p>
     */
    @ComProperty(name = "Visible", dispId = 0x7f)
    void setVisible(eu.doppel_helix.jna.tlb.office2.MsoTriState param0);
            
    /**
     * <p>id(0x80)</p>
     */
    @ComProperty(name = "Width", dispId = 0x80)
    Float getWidth();
            
    /**
     * <p>id(0x80)</p>
     */
    @ComProperty(name = "Width", dispId = 0x80)
    void setWidth(Float param0);
            
    /**
     * <p>id(0x81)</p>
     */
    @ComProperty(name = "ZOrderPosition", dispId = 0x81)
    Integer getZOrderPosition();
            
    /**
     * <p>id(0x3e9)</p>
     */
    @ComProperty(name = "Hyperlink", dispId = 0x3e9)
    Hyperlink getHyperlink();
            
    /**
     * <p>id(0x12c)</p>
     */
    @ComProperty(name = "RelativeHorizontalPosition", dispId = 0x12c)
    WdRelativeHorizontalPosition getRelativeHorizontalPosition();
            
    /**
     * <p>id(0x12c)</p>
     */
    @ComProperty(name = "RelativeHorizontalPosition", dispId = 0x12c)
    void setRelativeHorizontalPosition(WdRelativeHorizontalPosition param0);
            
    /**
     * <p>id(0x12d)</p>
     */
    @ComProperty(name = "RelativeVerticalPosition", dispId = 0x12d)
    WdRelativeVerticalPosition getRelativeVerticalPosition();
            
    /**
     * <p>id(0x12d)</p>
     */
    @ComProperty(name = "RelativeVerticalPosition", dispId = 0x12d)
    void setRelativeVerticalPosition(WdRelativeVerticalPosition param0);
            
    /**
     * <p>id(0x12e)</p>
     */
    @ComProperty(name = "LockAnchor", dispId = 0x12e)
    Integer getLockAnchor();
            
    /**
     * <p>id(0x12e)</p>
     */
    @ComProperty(name = "LockAnchor", dispId = 0x12e)
    void setLockAnchor(Integer param0);
            
    /**
     * <p>id(0x12f)</p>
     */
    @ComProperty(name = "WrapFormat", dispId = 0x12f)
    WrapFormat getWrapFormat();
            
    /**
     * <p>id(0x1f4)</p>
     */
    @ComProperty(name = "OLEFormat", dispId = 0x1f4)
    OLEFormat getOLEFormat();
            
    /**
     * <p>id(0x1f5)</p>
     */
    @ComProperty(name = "Anchor", dispId = 0x1f5)
    Range getAnchor();
            
    /**
     * <p>id(0x1f6)</p>
     */
    @ComProperty(name = "LinkFormat", dispId = 0x1f6)
    LinkFormat getLinkFormat();
            
    /**
     * <p>id(0xa)</p>
     */
    @ComMethod(name = "Apply", dispId = 0xa)
    void Apply();
            
    /**
     * <p>id(0xb)</p>
     */
    @ComMethod(name = "Delete", dispId = 0xb)
    void Delete();
            
    /**
     * <p>id(0xc)</p>
     */
    @ComMethod(name = "Duplicate", dispId = 0xc)
    Shape Duplicate();
            
    /**
     * <p>id(0xd)</p>
     */
    @ComMethod(name = "Flip", dispId = 0xd)
    void Flip(eu.doppel_helix.jna.tlb.office2.MsoFlipCmd FlipCmd);
            
    /**
     * <p>id(0xe)</p>
     */
    @ComMethod(name = "IncrementLeft", dispId = 0xe)
    void IncrementLeft(Float Increment);
            
    /**
     * <p>id(0xf)</p>
     */
    @ComMethod(name = "IncrementRotation", dispId = 0xf)
    void IncrementRotation(Float Increment);
            
    /**
     * <p>id(0x10)</p>
     */
    @ComMethod(name = "IncrementTop", dispId = 0x10)
    void IncrementTop(Float Increment);
            
    /**
     * <p>id(0x11)</p>
     */
    @ComMethod(name = "PickUp", dispId = 0x11)
    void PickUp();
            
    /**
     * <p>id(0x12)</p>
     */
    @ComMethod(name = "RerouteConnections", dispId = 0x12)
    void RerouteConnections();
            
    /**
     * <p>id(0x13)</p>
     */
    @ComMethod(name = "ScaleHeight", dispId = 0x13)
    void ScaleHeight(Float Factor,
            eu.doppel_helix.jna.tlb.office2.MsoTriState RelativeToOriginalSize,
            eu.doppel_helix.jna.tlb.office2.MsoScaleFrom Scale);
            
    /**
     * <p>id(0x14)</p>
     */
    @ComMethod(name = "ScaleWidth", dispId = 0x14)
    void ScaleWidth(Float Factor,
            eu.doppel_helix.jna.tlb.office2.MsoTriState RelativeToOriginalSize,
            eu.doppel_helix.jna.tlb.office2.MsoScaleFrom Scale);
            
    /**
     * <p>id(0x15)</p>
     */
    @ComMethod(name = "Select", dispId = 0x15)
    void Select(Object Replace);
            
    /**
     * <p>id(0x16)</p>
     */
    @ComMethod(name = "SetShapesDefaultProperties", dispId = 0x16)
    void SetShapesDefaultProperties();
            
    /**
     * <p>id(0x17)</p>
     */
    @ComMethod(name = "Ungroup", dispId = 0x17)
    ShapeRange Ungroup();
            
    /**
     * <p>id(0x18)</p>
     */
    @ComMethod(name = "ZOrder", dispId = 0x18)
    void ZOrder(eu.doppel_helix.jna.tlb.office2.MsoZOrderCmd ZOrderCmd);
            
    /**
     * <p>id(0x19)</p>
     */
    @ComMethod(name = "ConvertToInlineShape", dispId = 0x19)
    InlineShape ConvertToInlineShape();
            
    /**
     * <p>id(0x1d)</p>
     */
    @ComMethod(name = "ConvertToFrame", dispId = 0x1d)
    Frame ConvertToFrame();
            
    /**
     * <p>id(0x32)</p>
     */
    @ComMethod(name = "Activate", dispId = 0x32)
    void Activate();
            
    /**
     * <p>id(0x83)</p>
     */
    @ComProperty(name = "AlternativeText", dispId = 0x83)
    String getAlternativeText();
            
    /**
     * <p>id(0x83)</p>
     */
    @ComProperty(name = "AlternativeText", dispId = 0x83)
    void setAlternativeText(String param0);
            
    /**
     * <p>id(0x1f7)</p>
     */
    @ComProperty(name = "Script", dispId = 0x1f7)
    eu.doppel_helix.jna.tlb.office2.Script getScript();
            
    /**
     * <p>id(0x84)</p>
     */
    @ComProperty(name = "HasDiagram", dispId = 0x84)
    eu.doppel_helix.jna.tlb.office2.MsoTriState getHasDiagram();
            
    /**
     * <p>id(0x85)</p>
     */
    @ComProperty(name = "Diagram", dispId = 0x85)
    eu.doppel_helix.jna.tlb.office2.IMsoDiagram getDiagram();
            
    /**
     * <p>id(0x86)</p>
     */
    @ComProperty(name = "HasDiagramNode", dispId = 0x86)
    eu.doppel_helix.jna.tlb.office2.MsoTriState getHasDiagramNode();
            
    /**
     * <p>id(0x87)</p>
     */
    @ComProperty(name = "DiagramNode", dispId = 0x87)
    DiagramNode getDiagramNode();
            
    /**
     * <p>id(0x88)</p>
     */
    @ComProperty(name = "Child", dispId = 0x88)
    eu.doppel_helix.jna.tlb.office2.MsoTriState getChild();
            
    /**
     * <p>id(0x89)</p>
     */
    @ComProperty(name = "ParentGroup", dispId = 0x89)
    Shape getParentGroup();
            
    /**
     * <p>id(0x8a)</p>
     */
    @ComProperty(name = "CanvasItems", dispId = 0x8a)
    CanvasShapes getCanvasItems();
            
    /**
     * <p>id(0x8b)</p>
     */
    @ComProperty(name = "ID", dispId = 0x8b)
    Integer getID();
            
    /**
     * <p>id(0x8c)</p>
     */
    @ComMethod(name = "CanvasCropLeft", dispId = 0x8c)
    void CanvasCropLeft(Float Increment);
            
    /**
     * <p>id(0x8d)</p>
     */
    @ComMethod(name = "CanvasCropTop", dispId = 0x8d)
    void CanvasCropTop(Float Increment);
            
    /**
     * <p>id(0x8e)</p>
     */
    @ComMethod(name = "CanvasCropRight", dispId = 0x8e)
    void CanvasCropRight(Float Increment);
            
    /**
     * <p>id(0x8f)</p>
     */
    @ComMethod(name = "CanvasCropBottom", dispId = 0x8f)
    void CanvasCropBottom(Float Increment);
            
    /**
     * <p>id(0x90)</p>
     */
    @ComProperty(name = "RTF", dispId = 0x90)
    void setRTF(String param0);
            
    /**
     * <p>id(0x91)</p>
     */
    @ComProperty(name = "LayoutInCell", dispId = 0x91)
    Integer getLayoutInCell();
            
    /**
     * <p>id(0x91)</p>
     */
    @ComProperty(name = "LayoutInCell", dispId = 0x91)
    void setLayoutInCell(Integer param0);
            
    /**
     * <p>id(0x94)</p>
     */
    @ComProperty(name = "HasChart", dispId = 0x94)
    eu.doppel_helix.jna.tlb.office2.MsoTriState getHasChart();
            
    /**
     * <p>id(0x95)</p>
     */
    @ComProperty(name = "Chart", dispId = 0x95)
    Chart getChart();
            
    /**
     * <p>id(0xc8)</p>
     */
    @ComProperty(name = "LeftRelative", dispId = 0xc8)
    Float getLeftRelative();
            
    /**
     * <p>id(0xc8)</p>
     */
    @ComProperty(name = "LeftRelative", dispId = 0xc8)
    void setLeftRelative(Float param0);
            
    /**
     * <p>id(0xc9)</p>
     */
    @ComProperty(name = "TopRelative", dispId = 0xc9)
    Float getTopRelative();
            
    /**
     * <p>id(0xc9)</p>
     */
    @ComProperty(name = "TopRelative", dispId = 0xc9)
    void setTopRelative(Float param0);
            
    /**
     * <p>id(0xca)</p>
     */
    @ComProperty(name = "WidthRelative", dispId = 0xca)
    Float getWidthRelative();
            
    /**
     * <p>id(0xca)</p>
     */
    @ComProperty(name = "WidthRelative", dispId = 0xca)
    void setWidthRelative(Float param0);
            
    /**
     * <p>id(0xcb)</p>
     */
    @ComProperty(name = "HeightRelative", dispId = 0xcb)
    Float getHeightRelative();
            
    /**
     * <p>id(0xcb)</p>
     */
    @ComProperty(name = "HeightRelative", dispId = 0xcb)
    void setHeightRelative(Float param0);
            
    /**
     * <p>id(0xcc)</p>
     */
    @ComProperty(name = "RelativeHorizontalSize", dispId = 0xcc)
    WdRelativeHorizontalSize getRelativeHorizontalSize();
            
    /**
     * <p>id(0xcc)</p>
     */
    @ComProperty(name = "RelativeHorizontalSize", dispId = 0xcc)
    void setRelativeHorizontalSize(WdRelativeHorizontalSize param0);
            
    /**
     * <p>id(0xcd)</p>
     */
    @ComProperty(name = "RelativeVerticalSize", dispId = 0xcd)
    WdRelativeVerticalSize getRelativeVerticalSize();
            
    /**
     * <p>id(0xcd)</p>
     */
    @ComProperty(name = "RelativeVerticalSize", dispId = 0xcd)
    void setRelativeVerticalSize(WdRelativeVerticalSize param0);
            
    /**
     * <p>id(0x98)</p>
     */
    @ComProperty(name = "SoftEdge", dispId = 0x98)
    SoftEdgeFormat getSoftEdge();
            
    /**
     * <p>id(0x99)</p>
     */
    @ComProperty(name = "Glow", dispId = 0x99)
    GlowFormat getGlow();
            
    /**
     * <p>id(0x9a)</p>
     */
    @ComProperty(name = "Reflection", dispId = 0x9a)
    ReflectionFormat getReflection();
            
    /**
     * <p>id(0x9b)</p>
     */
    @ComProperty(name = "TextFrame2", dispId = 0x9b)
    eu.doppel_helix.jna.tlb.office2.TextFrame2 getTextFrame2();
            
    /**
     * <p>id(0xce)</p>
     */
    @ComProperty(name = "HasSmartArt", dispId = 0xce)
    eu.doppel_helix.jna.tlb.office2.MsoTriState getHasSmartArt();
            
    /**
     * <p>id(0x9c)</p>
     */
    @ComProperty(name = "SmartArt", dispId = 0x9c)
    eu.doppel_helix.jna.tlb.office2.SmartArt getSmartArt();
            
    /**
     * <p>id(0x96)</p>
     */
    @ComProperty(name = "ShapeStyle", dispId = 0x96)
    eu.doppel_helix.jna.tlb.office2.MsoShapeStyleIndex getShapeStyle();
            
    /**
     * <p>id(0x96)</p>
     */
    @ComProperty(name = "ShapeStyle", dispId = 0x96)
    void setShapeStyle(eu.doppel_helix.jna.tlb.office2.MsoShapeStyleIndex param0);
            
    /**
     * <p>id(0x97)</p>
     */
    @ComProperty(name = "BackgroundStyle", dispId = 0x97)
    eu.doppel_helix.jna.tlb.office2.MsoBackgroundStyleIndex getBackgroundStyle();
            
    /**
     * <p>id(0x97)</p>
     */
    @ComProperty(name = "BackgroundStyle", dispId = 0x97)
    void setBackgroundStyle(eu.doppel_helix.jna.tlb.office2.MsoBackgroundStyleIndex param0);
            
    /**
     * <p>id(0x9e)</p>
     */
    @ComProperty(name = "Title", dispId = 0x9e)
    String getTitle();
            
    /**
     * <p>id(0x9e)</p>
     */
    @ComProperty(name = "Title", dispId = 0x9e)
    void setTitle(String param0);
            
    /**
     * <p>id(0xcf)</p>
     */
    @ComProperty(name = "AnchorID", dispId = 0xcf)
    Integer getAnchorID();
            
    /**
     * <p>id(0xd0)</p>
     */
    @ComProperty(name = "EditID", dispId = 0xd0)
    Integer getEditID();
            
    
}