
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C031D-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C031D-0000-0000-C000-000000000046}")
public interface ShapeRange extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x60020000)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0x60020000)
    com.sun.jna.platform.win32.COM.util.IDispatch getApplication();
            
    /**
     * <p>id(0x60020001)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x60020001)
    Integer getCreator();
            
    /**
     * <p>id(0x1)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x1)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Count", dispId = 0x2)
    Integer getCount();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(11)</p>
     * @param Index [in] {@code Object}
     */
    @ComMethod(name = "Item", dispId = 0x0)
    Shape Item(Object Index);
            
    /**
     * <p>id(0xa)</p>
     * <p>vtableId(13)</p>
     * @param AlignCmd [in] {@code MsoAlignCmd}
     * @param RelativeTo [in] {@code MsoTriState}
     */
    @ComMethod(name = "Align", dispId = 0xa)
    void Align(MsoAlignCmd AlignCmd,
            MsoTriState RelativeTo);
            
    /**
     * <p>id(0xb)</p>
     * <p>vtableId(14)</p>
     */
    @ComMethod(name = "Apply", dispId = 0xb)
    void Apply();
            
    /**
     * <p>id(0xc)</p>
     * <p>vtableId(15)</p>
     */
    @ComMethod(name = "Delete", dispId = 0xc)
    void Delete();
            
    /**
     * <p>id(0xd)</p>
     * <p>vtableId(16)</p>
     * @param DistributeCmd [in] {@code MsoDistributeCmd}
     * @param RelativeTo [in] {@code MsoTriState}
     */
    @ComMethod(name = "Distribute", dispId = 0xd)
    void Distribute(MsoDistributeCmd DistributeCmd,
            MsoTriState RelativeTo);
            
    /**
     * <p>id(0xe)</p>
     * <p>vtableId(17)</p>
     */
    @ComMethod(name = "Duplicate", dispId = 0xe)
    ShapeRange Duplicate();
            
    /**
     * <p>id(0xf)</p>
     * <p>vtableId(18)</p>
     * @param FlipCmd [in] {@code MsoFlipCmd}
     */
    @ComMethod(name = "Flip", dispId = 0xf)
    void Flip(MsoFlipCmd FlipCmd);
            
    /**
     * <p>id(0x10)</p>
     * <p>vtableId(19)</p>
     * @param Increment [in] {@code Float}
     */
    @ComMethod(name = "IncrementLeft", dispId = 0x10)
    void IncrementLeft(Float Increment);
            
    /**
     * <p>id(0x11)</p>
     * <p>vtableId(20)</p>
     * @param Increment [in] {@code Float}
     */
    @ComMethod(name = "IncrementRotation", dispId = 0x11)
    void IncrementRotation(Float Increment);
            
    /**
     * <p>id(0x12)</p>
     * <p>vtableId(21)</p>
     * @param Increment [in] {@code Float}
     */
    @ComMethod(name = "IncrementTop", dispId = 0x12)
    void IncrementTop(Float Increment);
            
    /**
     * <p>id(0x13)</p>
     * <p>vtableId(22)</p>
     */
    @ComMethod(name = "Group", dispId = 0x13)
    Shape Group();
            
    /**
     * <p>id(0x14)</p>
     * <p>vtableId(23)</p>
     */
    @ComMethod(name = "PickUp", dispId = 0x14)
    void PickUp();
            
    /**
     * <p>id(0x15)</p>
     * <p>vtableId(24)</p>
     */
    @ComMethod(name = "Regroup", dispId = 0x15)
    Shape Regroup();
            
    /**
     * <p>id(0x16)</p>
     * <p>vtableId(25)</p>
     */
    @ComMethod(name = "RerouteConnections", dispId = 0x16)
    void RerouteConnections();
            
    /**
     * <p>id(0x17)</p>
     * <p>vtableId(26)</p>
     * @param Factor [in] {@code Float}
     * @param RelativeToOriginalSize [in] {@code MsoTriState}
     * @param fScale [in, optional] {@code MsoScaleFrom}
     */
    @ComMethod(name = "ScaleHeight", dispId = 0x17)
    void ScaleHeight(Float Factor,
            MsoTriState RelativeToOriginalSize,
            MsoScaleFrom fScale);
            
    /**
     * <p>id(0x18)</p>
     * <p>vtableId(27)</p>
     * @param Factor [in] {@code Float}
     * @param RelativeToOriginalSize [in] {@code MsoTriState}
     * @param fScale [in, optional] {@code MsoScaleFrom}
     */
    @ComMethod(name = "ScaleWidth", dispId = 0x18)
    void ScaleWidth(Float Factor,
            MsoTriState RelativeToOriginalSize,
            MsoScaleFrom fScale);
            
    /**
     * <p>id(0x19)</p>
     * <p>vtableId(28)</p>
     * @param Replace [in, optional] {@code Object}
     */
    @ComMethod(name = "Select", dispId = 0x19)
    void Select(Object Replace);
            
    /**
     * <p>id(0x1a)</p>
     * <p>vtableId(29)</p>
     */
    @ComMethod(name = "SetShapesDefaultProperties", dispId = 0x1a)
    void SetShapesDefaultProperties();
            
    /**
     * <p>id(0x1b)</p>
     * <p>vtableId(30)</p>
     */
    @ComMethod(name = "Ungroup", dispId = 0x1b)
    ShapeRange Ungroup();
            
    /**
     * <p>id(0x1c)</p>
     * <p>vtableId(31)</p>
     * @param ZOrderCmd [in] {@code MsoZOrderCmd}
     */
    @ComMethod(name = "ZOrder", dispId = 0x1c)
    void ZOrder(MsoZOrderCmd ZOrderCmd);
            
    /**
     * <p>id(0x64)</p>
     * <p>vtableId(32)</p>
     */
    @ComProperty(name = "Adjustments", dispId = 0x64)
    Adjustments getAdjustments();
            
    /**
     * <p>id(0x65)</p>
     * <p>vtableId(33)</p>
     */
    @ComProperty(name = "AutoShapeType", dispId = 0x65)
    MsoAutoShapeType getAutoShapeType();
            
    /**
     * <p>id(0x65)</p>
     * <p>vtableId(34)</p>
     * @param param0 [in] {@code MsoAutoShapeType}
     */
    @ComProperty(name = "AutoShapeType", dispId = 0x65)
    void setAutoShapeType(MsoAutoShapeType param0);
            
    /**
     * <p>id(0x66)</p>
     * <p>vtableId(35)</p>
     */
    @ComProperty(name = "BlackWhiteMode", dispId = 0x66)
    MsoBlackWhiteMode getBlackWhiteMode();
            
    /**
     * <p>id(0x66)</p>
     * <p>vtableId(36)</p>
     * @param param0 [in] {@code MsoBlackWhiteMode}
     */
    @ComProperty(name = "BlackWhiteMode", dispId = 0x66)
    void setBlackWhiteMode(MsoBlackWhiteMode param0);
            
    /**
     * <p>id(0x67)</p>
     * <p>vtableId(37)</p>
     */
    @ComProperty(name = "Callout", dispId = 0x67)
    CalloutFormat getCallout();
            
    /**
     * <p>id(0x68)</p>
     * <p>vtableId(38)</p>
     */
    @ComProperty(name = "ConnectionSiteCount", dispId = 0x68)
    Integer getConnectionSiteCount();
            
    /**
     * <p>id(0x69)</p>
     * <p>vtableId(39)</p>
     */
    @ComProperty(name = "Connector", dispId = 0x69)
    MsoTriState getConnector();
            
    /**
     * <p>id(0x6a)</p>
     * <p>vtableId(40)</p>
     */
    @ComProperty(name = "ConnectorFormat", dispId = 0x6a)
    ConnectorFormat getConnectorFormat();
            
    /**
     * <p>id(0x6b)</p>
     * <p>vtableId(41)</p>
     */
    @ComProperty(name = "Fill", dispId = 0x6b)
    FillFormat getFill();
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(42)</p>
     */
    @ComProperty(name = "GroupItems", dispId = 0x6c)
    GroupShapes getGroupItems();
            
    /**
     * <p>id(0x6d)</p>
     * <p>vtableId(43)</p>
     */
    @ComProperty(name = "Height", dispId = 0x6d)
    Float getHeight();
            
    /**
     * <p>id(0x6d)</p>
     * <p>vtableId(44)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "Height", dispId = 0x6d)
    void setHeight(Float param0);
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(45)</p>
     */
    @ComProperty(name = "HorizontalFlip", dispId = 0x6e)
    MsoTriState getHorizontalFlip();
            
    /**
     * <p>id(0x6f)</p>
     * <p>vtableId(46)</p>
     */
    @ComProperty(name = "Left", dispId = 0x6f)
    Float getLeft();
            
    /**
     * <p>id(0x6f)</p>
     * <p>vtableId(47)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "Left", dispId = 0x6f)
    void setLeft(Float param0);
            
    /**
     * <p>id(0x70)</p>
     * <p>vtableId(48)</p>
     */
    @ComProperty(name = "Line", dispId = 0x70)
    LineFormat getLine();
            
    /**
     * <p>id(0x71)</p>
     * <p>vtableId(49)</p>
     */
    @ComProperty(name = "LockAspectRatio", dispId = 0x71)
    MsoTriState getLockAspectRatio();
            
    /**
     * <p>id(0x71)</p>
     * <p>vtableId(50)</p>
     * @param param0 [in] {@code MsoTriState}
     */
    @ComProperty(name = "LockAspectRatio", dispId = 0x71)
    void setLockAspectRatio(MsoTriState param0);
            
    /**
     * <p>id(0x73)</p>
     * <p>vtableId(51)</p>
     */
    @ComProperty(name = "Name", dispId = 0x73)
    String getName();
            
    /**
     * <p>id(0x73)</p>
     * <p>vtableId(52)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Name", dispId = 0x73)
    void setName(String param0);
            
    /**
     * <p>id(0x74)</p>
     * <p>vtableId(53)</p>
     */
    @ComProperty(name = "Nodes", dispId = 0x74)
    ShapeNodes getNodes();
            
    /**
     * <p>id(0x75)</p>
     * <p>vtableId(54)</p>
     */
    @ComProperty(name = "Rotation", dispId = 0x75)
    Float getRotation();
            
    /**
     * <p>id(0x75)</p>
     * <p>vtableId(55)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "Rotation", dispId = 0x75)
    void setRotation(Float param0);
            
    /**
     * <p>id(0x76)</p>
     * <p>vtableId(56)</p>
     */
    @ComProperty(name = "PictureFormat", dispId = 0x76)
    PictureFormat getPictureFormat();
            
    /**
     * <p>id(0x77)</p>
     * <p>vtableId(57)</p>
     */
    @ComProperty(name = "Shadow", dispId = 0x77)
    ShadowFormat getShadow();
            
    /**
     * <p>id(0x78)</p>
     * <p>vtableId(58)</p>
     */
    @ComProperty(name = "TextEffect", dispId = 0x78)
    TextEffectFormat getTextEffect();
            
    /**
     * <p>id(0x79)</p>
     * <p>vtableId(59)</p>
     */
    @ComProperty(name = "TextFrame", dispId = 0x79)
    TextFrame getTextFrame();
            
    /**
     * <p>id(0x7a)</p>
     * <p>vtableId(60)</p>
     */
    @ComProperty(name = "ThreeD", dispId = 0x7a)
    ThreeDFormat getThreeD();
            
    /**
     * <p>id(0x7b)</p>
     * <p>vtableId(61)</p>
     */
    @ComProperty(name = "Top", dispId = 0x7b)
    Float getTop();
            
    /**
     * <p>id(0x7b)</p>
     * <p>vtableId(62)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "Top", dispId = 0x7b)
    void setTop(Float param0);
            
    /**
     * <p>id(0x7c)</p>
     * <p>vtableId(63)</p>
     */
    @ComProperty(name = "Type", dispId = 0x7c)
    MsoShapeType getType();
            
    /**
     * <p>id(0x7d)</p>
     * <p>vtableId(64)</p>
     */
    @ComProperty(name = "VerticalFlip", dispId = 0x7d)
    MsoTriState getVerticalFlip();
            
    /**
     * <p>id(0x7e)</p>
     * <p>vtableId(65)</p>
     */
    @ComProperty(name = "Vertices", dispId = 0x7e)
    Object getVertices();
            
    /**
     * <p>id(0x7f)</p>
     * <p>vtableId(66)</p>
     */
    @ComProperty(name = "Visible", dispId = 0x7f)
    MsoTriState getVisible();
            
    /**
     * <p>id(0x7f)</p>
     * <p>vtableId(67)</p>
     * @param param0 [in] {@code MsoTriState}
     */
    @ComProperty(name = "Visible", dispId = 0x7f)
    void setVisible(MsoTriState param0);
            
    /**
     * <p>id(0x80)</p>
     * <p>vtableId(68)</p>
     */
    @ComProperty(name = "Width", dispId = 0x80)
    Float getWidth();
            
    /**
     * <p>id(0x80)</p>
     * <p>vtableId(69)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "Width", dispId = 0x80)
    void setWidth(Float param0);
            
    /**
     * <p>id(0x81)</p>
     * <p>vtableId(70)</p>
     */
    @ComProperty(name = "ZOrderPosition", dispId = 0x81)
    Integer getZOrderPosition();
            
    /**
     * <p>id(0x82)</p>
     * <p>vtableId(71)</p>
     */
    @ComProperty(name = "Script", dispId = 0x82)
    Script getScript();
            
    /**
     * <p>id(0x83)</p>
     * <p>vtableId(72)</p>
     */
    @ComProperty(name = "AlternativeText", dispId = 0x83)
    String getAlternativeText();
            
    /**
     * <p>id(0x83)</p>
     * <p>vtableId(73)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "AlternativeText", dispId = 0x83)
    void setAlternativeText(String param0);
            
    /**
     * <p>id(0x84)</p>
     * <p>vtableId(74)</p>
     */
    @ComProperty(name = "HasDiagram", dispId = 0x84)
    MsoTriState getHasDiagram();
            
    /**
     * <p>id(0x85)</p>
     * <p>vtableId(75)</p>
     */
    @ComProperty(name = "Diagram", dispId = 0x85)
    IMsoDiagram getDiagram();
            
    /**
     * <p>id(0x86)</p>
     * <p>vtableId(76)</p>
     */
    @ComProperty(name = "HasDiagramNode", dispId = 0x86)
    MsoTriState getHasDiagramNode();
            
    /**
     * <p>id(0x87)</p>
     * <p>vtableId(77)</p>
     */
    @ComProperty(name = "DiagramNode", dispId = 0x87)
    DiagramNode getDiagramNode();
            
    /**
     * <p>id(0x88)</p>
     * <p>vtableId(78)</p>
     */
    @ComProperty(name = "Child", dispId = 0x88)
    MsoTriState getChild();
            
    /**
     * <p>id(0x89)</p>
     * <p>vtableId(79)</p>
     */
    @ComProperty(name = "ParentGroup", dispId = 0x89)
    Shape getParentGroup();
            
    /**
     * <p>id(0x8a)</p>
     * <p>vtableId(80)</p>
     */
    @ComProperty(name = "CanvasItems", dispId = 0x8a)
    CanvasShapes getCanvasItems();
            
    /**
     * <p>id(0x8b)</p>
     * <p>vtableId(81)</p>
     */
    @ComProperty(name = "Id", dispId = 0x8b)
    Integer getId();
            
    /**
     * <p>id(0x8c)</p>
     * <p>vtableId(82)</p>
     * @param Increment [in] {@code Float}
     */
    @ComMethod(name = "CanvasCropLeft", dispId = 0x8c)
    void CanvasCropLeft(Float Increment);
            
    /**
     * <p>id(0x8d)</p>
     * <p>vtableId(83)</p>
     * @param Increment [in] {@code Float}
     */
    @ComMethod(name = "CanvasCropTop", dispId = 0x8d)
    void CanvasCropTop(Float Increment);
            
    /**
     * <p>id(0x8e)</p>
     * <p>vtableId(84)</p>
     * @param Increment [in] {@code Float}
     */
    @ComMethod(name = "CanvasCropRight", dispId = 0x8e)
    void CanvasCropRight(Float Increment);
            
    /**
     * <p>id(0x8f)</p>
     * <p>vtableId(85)</p>
     * @param Increment [in] {@code Float}
     */
    @ComMethod(name = "CanvasCropBottom", dispId = 0x8f)
    void CanvasCropBottom(Float Increment);
            
    /**
     * <p>id(0x90)</p>
     * <p>vtableId(86)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "RTF", dispId = 0x90)
    void setRTF(String param0);
            
    /**
     * <p>id(0x91)</p>
     * <p>vtableId(87)</p>
     */
    @ComProperty(name = "TextFrame2", dispId = 0x91)
    TextFrame2 getTextFrame2();
            
    /**
     * <p>id(0x92)</p>
     * <p>vtableId(88)</p>
     */
    @ComMethod(name = "Cut", dispId = 0x92)
    void Cut();
            
    /**
     * <p>id(0x93)</p>
     * <p>vtableId(89)</p>
     */
    @ComMethod(name = "Copy", dispId = 0x93)
    void Copy();
            
    /**
     * <p>id(0x94)</p>
     * <p>vtableId(90)</p>
     */
    @ComProperty(name = "HasChart", dispId = 0x94)
    MsoTriState getHasChart();
            
    /**
     * <p>id(0x95)</p>
     * <p>vtableId(91)</p>
     */
    @ComProperty(name = "Chart", dispId = 0x95)
    IMsoChart getChart();
            
    /**
     * <p>id(0x96)</p>
     * <p>vtableId(92)</p>
     */
    @ComProperty(name = "ShapeStyle", dispId = 0x96)
    MsoShapeStyleIndex getShapeStyle();
            
    /**
     * <p>id(0x96)</p>
     * <p>vtableId(93)</p>
     * @param param0 [in] {@code MsoShapeStyleIndex}
     */
    @ComProperty(name = "ShapeStyle", dispId = 0x96)
    void setShapeStyle(MsoShapeStyleIndex param0);
            
    /**
     * <p>id(0x97)</p>
     * <p>vtableId(94)</p>
     */
    @ComProperty(name = "BackgroundStyle", dispId = 0x97)
    MsoBackgroundStyleIndex getBackgroundStyle();
            
    /**
     * <p>id(0x97)</p>
     * <p>vtableId(95)</p>
     * @param param0 [in] {@code MsoBackgroundStyleIndex}
     */
    @ComProperty(name = "BackgroundStyle", dispId = 0x97)
    void setBackgroundStyle(MsoBackgroundStyleIndex param0);
            
    /**
     * <p>id(0x98)</p>
     * <p>vtableId(96)</p>
     */
    @ComProperty(name = "SoftEdge", dispId = 0x98)
    SoftEdgeFormat getSoftEdge();
            
    /**
     * <p>id(0x99)</p>
     * <p>vtableId(97)</p>
     */
    @ComProperty(name = "Glow", dispId = 0x99)
    GlowFormat getGlow();
            
    /**
     * <p>id(0x9a)</p>
     * <p>vtableId(98)</p>
     */
    @ComProperty(name = "Reflection", dispId = 0x9a)
    ReflectionFormat getReflection();
            
    /**
     * <p>id(0x9b)</p>
     * <p>vtableId(99)</p>
     */
    @ComProperty(name = "Title", dispId = 0x9b)
    String getTitle();
            
    /**
     * <p>id(0x9b)</p>
     * <p>vtableId(100)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Title", dispId = 0x9b)
    void setTitle(String param0);
            
    /**
     * <p>id(0x9c)</p>
     * <p>vtableId(101)</p>
     * @param MergeCmd [in] {@code MsoMergeCmd}
     * @param PrimaryShape [in, optional] {@code Shape}
     */
    @ComMethod(name = "MergeShapes", dispId = 0x9c)
    void MergeShapes(MsoMergeCmd MergeCmd,
            Shape PrimaryShape);
            
    
}