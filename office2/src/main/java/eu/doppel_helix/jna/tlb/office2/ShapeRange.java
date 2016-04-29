
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C031D-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C031D-0000-0000-C000-000000000046}")
public interface ShapeRange {
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
    @ComProperty(name = "Count", dispId = 0x2)
    Integer getCount();
            
    /**
     * <p>id(0x0)</p>
     */
    @ComMethod(name = "Item", dispId = 0x0)
    Shape Item(Object Index);
            
    /**
     * <p>id(0xa)</p>
     */
    @ComMethod(name = "Align", dispId = 0xa)
    void Align(MsoAlignCmd AlignCmd,
            MsoTriState RelativeTo);
            
    /**
     * <p>id(0xb)</p>
     */
    @ComMethod(name = "Apply", dispId = 0xb)
    void Apply();
            
    /**
     * <p>id(0xc)</p>
     */
    @ComMethod(name = "Delete", dispId = 0xc)
    void Delete();
            
    /**
     * <p>id(0xd)</p>
     */
    @ComMethod(name = "Distribute", dispId = 0xd)
    void Distribute(MsoDistributeCmd DistributeCmd,
            MsoTriState RelativeTo);
            
    /**
     * <p>id(0xe)</p>
     */
    @ComMethod(name = "Duplicate", dispId = 0xe)
    ShapeRange Duplicate();
            
    /**
     * <p>id(0xf)</p>
     */
    @ComMethod(name = "Flip", dispId = 0xf)
    void Flip(MsoFlipCmd FlipCmd);
            
    /**
     * <p>id(0x10)</p>
     */
    @ComMethod(name = "IncrementLeft", dispId = 0x10)
    void IncrementLeft(Float Increment);
            
    /**
     * <p>id(0x11)</p>
     */
    @ComMethod(name = "IncrementRotation", dispId = 0x11)
    void IncrementRotation(Float Increment);
            
    /**
     * <p>id(0x12)</p>
     */
    @ComMethod(name = "IncrementTop", dispId = 0x12)
    void IncrementTop(Float Increment);
            
    /**
     * <p>id(0x13)</p>
     */
    @ComMethod(name = "Group", dispId = 0x13)
    Shape Group();
            
    /**
     * <p>id(0x14)</p>
     */
    @ComMethod(name = "PickUp", dispId = 0x14)
    void PickUp();
            
    /**
     * <p>id(0x15)</p>
     */
    @ComMethod(name = "Regroup", dispId = 0x15)
    Shape Regroup();
            
    /**
     * <p>id(0x16)</p>
     */
    @ComMethod(name = "RerouteConnections", dispId = 0x16)
    void RerouteConnections();
            
    /**
     * <p>id(0x17)</p>
     */
    @ComMethod(name = "ScaleHeight", dispId = 0x17)
    void ScaleHeight(Float Factor,
            MsoTriState RelativeToOriginalSize,
            MsoScaleFrom fScale);
            
    /**
     * <p>id(0x18)</p>
     */
    @ComMethod(name = "ScaleWidth", dispId = 0x18)
    void ScaleWidth(Float Factor,
            MsoTriState RelativeToOriginalSize,
            MsoScaleFrom fScale);
            
    /**
     * <p>id(0x19)</p>
     */
    @ComMethod(name = "Select", dispId = 0x19)
    void Select(Object Replace);
            
    /**
     * <p>id(0x1a)</p>
     */
    @ComMethod(name = "SetShapesDefaultProperties", dispId = 0x1a)
    void SetShapesDefaultProperties();
            
    /**
     * <p>id(0x1b)</p>
     */
    @ComMethod(name = "Ungroup", dispId = 0x1b)
    ShapeRange Ungroup();
            
    /**
     * <p>id(0x1c)</p>
     */
    @ComMethod(name = "ZOrder", dispId = 0x1c)
    void ZOrder(MsoZOrderCmd ZOrderCmd);
            
    /**
     * <p>id(0x64)</p>
     */
    @ComProperty(name = "Adjustments", dispId = 0x64)
    Adjustments getAdjustments();
            
    /**
     * <p>id(0x65)</p>
     */
    @ComProperty(name = "AutoShapeType", dispId = 0x65)
    MsoAutoShapeType getAutoShapeType();
            
    /**
     * <p>id(0x65)</p>
     */
    @ComProperty(name = "AutoShapeType", dispId = 0x65)
    void setAutoShapeType(MsoAutoShapeType param0);
            
    /**
     * <p>id(0x66)</p>
     */
    @ComProperty(name = "BlackWhiteMode", dispId = 0x66)
    MsoBlackWhiteMode getBlackWhiteMode();
            
    /**
     * <p>id(0x66)</p>
     */
    @ComProperty(name = "BlackWhiteMode", dispId = 0x66)
    void setBlackWhiteMode(MsoBlackWhiteMode param0);
            
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
    MsoTriState getConnector();
            
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
    MsoTriState getHorizontalFlip();
            
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
    MsoTriState getLockAspectRatio();
            
    /**
     * <p>id(0x71)</p>
     */
    @ComProperty(name = "LockAspectRatio", dispId = 0x71)
    void setLockAspectRatio(MsoTriState param0);
            
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
    MsoShapeType getType();
            
    /**
     * <p>id(0x7d)</p>
     */
    @ComProperty(name = "VerticalFlip", dispId = 0x7d)
    MsoTriState getVerticalFlip();
            
    /**
     * <p>id(0x7e)</p>
     */
    @ComProperty(name = "Vertices", dispId = 0x7e)
    Object getVertices();
            
    /**
     * <p>id(0x7f)</p>
     */
    @ComProperty(name = "Visible", dispId = 0x7f)
    MsoTriState getVisible();
            
    /**
     * <p>id(0x7f)</p>
     */
    @ComProperty(name = "Visible", dispId = 0x7f)
    void setVisible(MsoTriState param0);
            
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
     * <p>id(0x82)</p>
     */
    @ComProperty(name = "Script", dispId = 0x82)
    Script getScript();
            
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
     * <p>id(0x84)</p>
     */
    @ComProperty(name = "HasDiagram", dispId = 0x84)
    MsoTriState getHasDiagram();
            
    /**
     * <p>id(0x85)</p>
     */
    @ComProperty(name = "Diagram", dispId = 0x85)
    IMsoDiagram getDiagram();
            
    /**
     * <p>id(0x86)</p>
     */
    @ComProperty(name = "HasDiagramNode", dispId = 0x86)
    MsoTriState getHasDiagramNode();
            
    /**
     * <p>id(0x87)</p>
     */
    @ComProperty(name = "DiagramNode", dispId = 0x87)
    DiagramNode getDiagramNode();
            
    /**
     * <p>id(0x88)</p>
     */
    @ComProperty(name = "Child", dispId = 0x88)
    MsoTriState getChild();
            
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
    @ComProperty(name = "Id", dispId = 0x8b)
    Integer getId();
            
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
    @ComProperty(name = "TextFrame2", dispId = 0x91)
    TextFrame2 getTextFrame2();
            
    /**
     * <p>id(0x92)</p>
     */
    @ComMethod(name = "Cut", dispId = 0x92)
    void Cut();
            
    /**
     * <p>id(0x93)</p>
     */
    @ComMethod(name = "Copy", dispId = 0x93)
    void Copy();
            
    /**
     * <p>id(0x94)</p>
     */
    @ComProperty(name = "HasChart", dispId = 0x94)
    MsoTriState getHasChart();
            
    /**
     * <p>id(0x95)</p>
     */
    @ComProperty(name = "Chart", dispId = 0x95)
    IMsoChart getChart();
            
    /**
     * <p>id(0x96)</p>
     */
    @ComProperty(name = "ShapeStyle", dispId = 0x96)
    MsoShapeStyleIndex getShapeStyle();
            
    /**
     * <p>id(0x96)</p>
     */
    @ComProperty(name = "ShapeStyle", dispId = 0x96)
    void setShapeStyle(MsoShapeStyleIndex param0);
            
    /**
     * <p>id(0x97)</p>
     */
    @ComProperty(name = "BackgroundStyle", dispId = 0x97)
    MsoBackgroundStyleIndex getBackgroundStyle();
            
    /**
     * <p>id(0x97)</p>
     */
    @ComProperty(name = "BackgroundStyle", dispId = 0x97)
    void setBackgroundStyle(MsoBackgroundStyleIndex param0);
            
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
    @ComProperty(name = "Title", dispId = 0x9b)
    String getTitle();
            
    /**
     * <p>id(0x9b)</p>
     */
    @ComProperty(name = "Title", dispId = 0x9b)
    void setTitle(String param0);
            
    /**
     * <p>id(0x9c)</p>
     */
    @ComMethod(name = "MergeShapes", dispId = 0x9c)
    void MergeShapes(MsoMergeCmd MergeCmd,
            Shape PrimaryShape);
            
    
}