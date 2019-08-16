
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000209B5-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000209B5-0000-0000-C000-000000000046}")
public interface ShapeRange extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x1f40)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0x1f40)
    Application getApplication();
            
    /**
     * <p>id(0x1f41)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x1f41)
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
     * <p>id(0x64)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "Adjustments", dispId = 0x64)
    Adjustments getAdjustments();
            
    /**
     * <p>id(0x65)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "AutoShapeType", dispId = 0x65)
    eu.doppel_helix.jna.tlb.office2.MsoAutoShapeType getAutoShapeType();
            
    /**
     * <p>id(0x65)</p>
     * <p>vtableId(14)</p>
     * @param param0 [in] {@code eu.doppel_helix.jna.tlb.office2.MsoAutoShapeType}
     */
    @ComProperty(name = "AutoShapeType", dispId = 0x65)
    void setAutoShapeType(eu.doppel_helix.jna.tlb.office2.MsoAutoShapeType param0);
            
    /**
     * <p>id(0x67)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "Callout", dispId = 0x67)
    CalloutFormat getCallout();
            
    /**
     * <p>id(0x68)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "ConnectionSiteCount", dispId = 0x68)
    Integer getConnectionSiteCount();
            
    /**
     * <p>id(0x69)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "Connector", dispId = 0x69)
    eu.doppel_helix.jna.tlb.office2.MsoTriState getConnector();
            
    /**
     * <p>id(0x6a)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "ConnectorFormat", dispId = 0x6a)
    ConnectorFormat getConnectorFormat();
            
    /**
     * <p>id(0x6b)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "Fill", dispId = 0x6b)
    FillFormat getFill();
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "GroupItems", dispId = 0x6c)
    GroupShapes getGroupItems();
            
    /**
     * <p>id(0x6d)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "Height", dispId = 0x6d)
    Float getHeight();
            
    /**
     * <p>id(0x6d)</p>
     * <p>vtableId(22)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "Height", dispId = 0x6d)
    void setHeight(Float param0);
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(23)</p>
     */
    @ComProperty(name = "HorizontalFlip", dispId = 0x6e)
    eu.doppel_helix.jna.tlb.office2.MsoTriState getHorizontalFlip();
            
    /**
     * <p>id(0x6f)</p>
     * <p>vtableId(24)</p>
     */
    @ComProperty(name = "Left", dispId = 0x6f)
    Float getLeft();
            
    /**
     * <p>id(0x6f)</p>
     * <p>vtableId(25)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "Left", dispId = 0x6f)
    void setLeft(Float param0);
            
    /**
     * <p>id(0x70)</p>
     * <p>vtableId(26)</p>
     */
    @ComProperty(name = "Line", dispId = 0x70)
    LineFormat getLine();
            
    /**
     * <p>id(0x71)</p>
     * <p>vtableId(27)</p>
     */
    @ComProperty(name = "LockAspectRatio", dispId = 0x71)
    eu.doppel_helix.jna.tlb.office2.MsoTriState getLockAspectRatio();
            
    /**
     * <p>id(0x71)</p>
     * <p>vtableId(28)</p>
     * @param param0 [in] {@code eu.doppel_helix.jna.tlb.office2.MsoTriState}
     */
    @ComProperty(name = "LockAspectRatio", dispId = 0x71)
    void setLockAspectRatio(eu.doppel_helix.jna.tlb.office2.MsoTriState param0);
            
    /**
     * <p>id(0x73)</p>
     * <p>vtableId(29)</p>
     */
    @ComProperty(name = "Name", dispId = 0x73)
    String getName();
            
    /**
     * <p>id(0x73)</p>
     * <p>vtableId(30)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Name", dispId = 0x73)
    void setName(String param0);
            
    /**
     * <p>id(0x74)</p>
     * <p>vtableId(31)</p>
     */
    @ComProperty(name = "Nodes", dispId = 0x74)
    ShapeNodes getNodes();
            
    /**
     * <p>id(0x75)</p>
     * <p>vtableId(32)</p>
     */
    @ComProperty(name = "Rotation", dispId = 0x75)
    Float getRotation();
            
    /**
     * <p>id(0x75)</p>
     * <p>vtableId(33)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "Rotation", dispId = 0x75)
    void setRotation(Float param0);
            
    /**
     * <p>id(0x76)</p>
     * <p>vtableId(34)</p>
     */
    @ComProperty(name = "PictureFormat", dispId = 0x76)
    PictureFormat getPictureFormat();
            
    /**
     * <p>id(0x77)</p>
     * <p>vtableId(35)</p>
     */
    @ComProperty(name = "Shadow", dispId = 0x77)
    ShadowFormat getShadow();
            
    /**
     * <p>id(0x78)</p>
     * <p>vtableId(36)</p>
     */
    @ComProperty(name = "TextEffect", dispId = 0x78)
    TextEffectFormat getTextEffect();
            
    /**
     * <p>id(0x79)</p>
     * <p>vtableId(37)</p>
     */
    @ComProperty(name = "TextFrame", dispId = 0x79)
    TextFrame getTextFrame();
            
    /**
     * <p>id(0x7a)</p>
     * <p>vtableId(38)</p>
     */
    @ComProperty(name = "ThreeD", dispId = 0x7a)
    ThreeDFormat getThreeD();
            
    /**
     * <p>id(0x7b)</p>
     * <p>vtableId(39)</p>
     */
    @ComProperty(name = "Top", dispId = 0x7b)
    Float getTop();
            
    /**
     * <p>id(0x7b)</p>
     * <p>vtableId(40)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "Top", dispId = 0x7b)
    void setTop(Float param0);
            
    /**
     * <p>id(0x7c)</p>
     * <p>vtableId(41)</p>
     */
    @ComProperty(name = "Type", dispId = 0x7c)
    eu.doppel_helix.jna.tlb.office2.MsoShapeType getType();
            
    /**
     * <p>id(0x7d)</p>
     * <p>vtableId(42)</p>
     */
    @ComProperty(name = "VerticalFlip", dispId = 0x7d)
    eu.doppel_helix.jna.tlb.office2.MsoTriState getVerticalFlip();
            
    /**
     * <p>id(0x7e)</p>
     * <p>vtableId(43)</p>
     */
    @ComProperty(name = "Vertices", dispId = 0x7e)
    Object getVertices();
            
    /**
     * <p>id(0x7f)</p>
     * <p>vtableId(44)</p>
     */
    @ComProperty(name = "Visible", dispId = 0x7f)
    eu.doppel_helix.jna.tlb.office2.MsoTriState getVisible();
            
    /**
     * <p>id(0x7f)</p>
     * <p>vtableId(45)</p>
     * @param param0 [in] {@code eu.doppel_helix.jna.tlb.office2.MsoTriState}
     */
    @ComProperty(name = "Visible", dispId = 0x7f)
    void setVisible(eu.doppel_helix.jna.tlb.office2.MsoTriState param0);
            
    /**
     * <p>id(0x80)</p>
     * <p>vtableId(46)</p>
     */
    @ComProperty(name = "Width", dispId = 0x80)
    Float getWidth();
            
    /**
     * <p>id(0x80)</p>
     * <p>vtableId(47)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "Width", dispId = 0x80)
    void setWidth(Float param0);
            
    /**
     * <p>id(0x81)</p>
     * <p>vtableId(48)</p>
     */
    @ComProperty(name = "ZOrderPosition", dispId = 0x81)
    Integer getZOrderPosition();
            
    /**
     * <p>id(0x3e9)</p>
     * <p>vtableId(49)</p>
     */
    @ComProperty(name = "Hyperlink", dispId = 0x3e9)
    Hyperlink getHyperlink();
            
    /**
     * <p>id(0x12c)</p>
     * <p>vtableId(50)</p>
     */
    @ComProperty(name = "RelativeHorizontalPosition", dispId = 0x12c)
    WdRelativeHorizontalPosition getRelativeHorizontalPosition();
            
    /**
     * <p>id(0x12c)</p>
     * <p>vtableId(51)</p>
     * @param param0 [in] {@code WdRelativeHorizontalPosition}
     */
    @ComProperty(name = "RelativeHorizontalPosition", dispId = 0x12c)
    void setRelativeHorizontalPosition(WdRelativeHorizontalPosition param0);
            
    /**
     * <p>id(0x12d)</p>
     * <p>vtableId(52)</p>
     */
    @ComProperty(name = "RelativeVerticalPosition", dispId = 0x12d)
    WdRelativeVerticalPosition getRelativeVerticalPosition();
            
    /**
     * <p>id(0x12d)</p>
     * <p>vtableId(53)</p>
     * @param param0 [in] {@code WdRelativeVerticalPosition}
     */
    @ComProperty(name = "RelativeVerticalPosition", dispId = 0x12d)
    void setRelativeVerticalPosition(WdRelativeVerticalPosition param0);
            
    /**
     * <p>id(0x12e)</p>
     * <p>vtableId(54)</p>
     */
    @ComProperty(name = "LockAnchor", dispId = 0x12e)
    Integer getLockAnchor();
            
    /**
     * <p>id(0x12e)</p>
     * <p>vtableId(55)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "LockAnchor", dispId = 0x12e)
    void setLockAnchor(Integer param0);
            
    /**
     * <p>id(0x12f)</p>
     * <p>vtableId(56)</p>
     */
    @ComProperty(name = "WrapFormat", dispId = 0x12f)
    WrapFormat getWrapFormat();
            
    /**
     * <p>id(0x130)</p>
     * <p>vtableId(57)</p>
     */
    @ComProperty(name = "Anchor", dispId = 0x130)
    Range getAnchor();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(58)</p>
     * @param Index [in] {@code Object}
     */
    @ComMethod(name = "Item", dispId = 0x0)
    Shape Item(Object Index);
            
    /**
     * <p>id(0xa)</p>
     * <p>vtableId(59)</p>
     * @param Align [in] {@code eu.doppel_helix.jna.tlb.office2.MsoAlignCmd}
     * @param RelativeTo [in] {@code Integer}
     */
    @ComMethod(name = "Align", dispId = 0xa)
    void Align(eu.doppel_helix.jna.tlb.office2.MsoAlignCmd Align,
            Integer RelativeTo);
            
    /**
     * <p>id(0xb)</p>
     * <p>vtableId(60)</p>
     */
    @ComMethod(name = "Apply", dispId = 0xb)
    void Apply();
            
    /**
     * <p>id(0xc)</p>
     * <p>vtableId(61)</p>
     */
    @ComMethod(name = "Delete", dispId = 0xc)
    void Delete();
            
    /**
     * <p>id(0xd)</p>
     * <p>vtableId(62)</p>
     * @param Distribute [in] {@code eu.doppel_helix.jna.tlb.office2.MsoDistributeCmd}
     * @param RelativeTo [in] {@code Integer}
     */
    @ComMethod(name = "Distribute", dispId = 0xd)
    void Distribute(eu.doppel_helix.jna.tlb.office2.MsoDistributeCmd Distribute,
            Integer RelativeTo);
            
    /**
     * <p>id(0xe)</p>
     * <p>vtableId(63)</p>
     */
    @ComMethod(name = "Duplicate", dispId = 0xe)
    ShapeRange Duplicate();
            
    /**
     * <p>id(0xf)</p>
     * <p>vtableId(64)</p>
     * @param FlipCmd [in] {@code eu.doppel_helix.jna.tlb.office2.MsoFlipCmd}
     */
    @ComMethod(name = "Flip", dispId = 0xf)
    void Flip(eu.doppel_helix.jna.tlb.office2.MsoFlipCmd FlipCmd);
            
    /**
     * <p>id(0x10)</p>
     * <p>vtableId(65)</p>
     * @param Increment [in] {@code Float}
     */
    @ComMethod(name = "IncrementLeft", dispId = 0x10)
    void IncrementLeft(Float Increment);
            
    /**
     * <p>id(0x11)</p>
     * <p>vtableId(66)</p>
     * @param Increment [in] {@code Float}
     */
    @ComMethod(name = "IncrementRotation", dispId = 0x11)
    void IncrementRotation(Float Increment);
            
    /**
     * <p>id(0x12)</p>
     * <p>vtableId(67)</p>
     * @param Increment [in] {@code Float}
     */
    @ComMethod(name = "IncrementTop", dispId = 0x12)
    void IncrementTop(Float Increment);
            
    /**
     * <p>id(0x13)</p>
     * <p>vtableId(68)</p>
     */
    @ComMethod(name = "Group", dispId = 0x13)
    Shape Group();
            
    /**
     * <p>id(0x14)</p>
     * <p>vtableId(69)</p>
     */
    @ComMethod(name = "PickUp", dispId = 0x14)
    void PickUp();
            
    /**
     * <p>id(0x15)</p>
     * <p>vtableId(70)</p>
     */
    @ComMethod(name = "Regroup", dispId = 0x15)
    Shape Regroup();
            
    /**
     * <p>id(0x16)</p>
     * <p>vtableId(71)</p>
     */
    @ComMethod(name = "RerouteConnections", dispId = 0x16)
    void RerouteConnections();
            
    /**
     * <p>id(0x17)</p>
     * <p>vtableId(72)</p>
     * @param Factor [in] {@code Float}
     * @param RelativeToOriginalSize [in] {@code eu.doppel_helix.jna.tlb.office2.MsoTriState}
     * @param Scale [in, optional] {@code eu.doppel_helix.jna.tlb.office2.MsoScaleFrom}
     */
    @ComMethod(name = "ScaleHeight", dispId = 0x17)
    void ScaleHeight(Float Factor,
            eu.doppel_helix.jna.tlb.office2.MsoTriState RelativeToOriginalSize,
            eu.doppel_helix.jna.tlb.office2.MsoScaleFrom Scale);
            
    /**
     * <p>id(0x18)</p>
     * <p>vtableId(73)</p>
     * @param Factor [in] {@code Float}
     * @param RelativeToOriginalSize [in] {@code eu.doppel_helix.jna.tlb.office2.MsoTriState}
     * @param Scale [in, optional] {@code eu.doppel_helix.jna.tlb.office2.MsoScaleFrom}
     */
    @ComMethod(name = "ScaleWidth", dispId = 0x18)
    void ScaleWidth(Float Factor,
            eu.doppel_helix.jna.tlb.office2.MsoTriState RelativeToOriginalSize,
            eu.doppel_helix.jna.tlb.office2.MsoScaleFrom Scale);
            
    /**
     * <p>id(0x19)</p>
     * <p>vtableId(74)</p>
     * @param Replace [in, optional] {@code Object}
     */
    @ComMethod(name = "Select", dispId = 0x19)
    void Select(Object Replace);
            
    /**
     * <p>id(0x1a)</p>
     * <p>vtableId(75)</p>
     */
    @ComMethod(name = "SetShapesDefaultProperties", dispId = 0x1a)
    void SetShapesDefaultProperties();
            
    /**
     * <p>id(0x1b)</p>
     * <p>vtableId(76)</p>
     */
    @ComMethod(name = "Ungroup", dispId = 0x1b)
    ShapeRange Ungroup();
            
    /**
     * <p>id(0x1c)</p>
     * <p>vtableId(77)</p>
     * @param ZOrderCmd [in] {@code eu.doppel_helix.jna.tlb.office2.MsoZOrderCmd}
     */
    @ComMethod(name = "ZOrder", dispId = 0x1c)
    void ZOrder(eu.doppel_helix.jna.tlb.office2.MsoZOrderCmd ZOrderCmd);
            
    /**
     * <p>id(0x1d)</p>
     * <p>vtableId(78)</p>
     */
    @ComMethod(name = "ConvertToFrame", dispId = 0x1d)
    Frame ConvertToFrame();
            
    /**
     * <p>id(0x1e)</p>
     * <p>vtableId(79)</p>
     */
    @ComMethod(name = "ConvertToInlineShape", dispId = 0x1e)
    InlineShape ConvertToInlineShape();
            
    /**
     * <p>id(0x32)</p>
     * <p>vtableId(80)</p>
     */
    @ComMethod(name = "Activate", dispId = 0x32)
    void Activate();
            
    /**
     * <p>id(0x83)</p>
     * <p>vtableId(81)</p>
     */
    @ComProperty(name = "AlternativeText", dispId = 0x83)
    String getAlternativeText();
            
    /**
     * <p>id(0x83)</p>
     * <p>vtableId(82)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "AlternativeText", dispId = 0x83)
    void setAlternativeText(String param0);
            
    /**
     * <p>id(0x84)</p>
     * <p>vtableId(83)</p>
     */
    @ComProperty(name = "HasDiagram", dispId = 0x84)
    eu.doppel_helix.jna.tlb.office2.MsoTriState getHasDiagram();
            
    /**
     * <p>id(0x85)</p>
     * <p>vtableId(84)</p>
     */
    @ComProperty(name = "Diagram", dispId = 0x85)
    eu.doppel_helix.jna.tlb.office2.IMsoDiagram getDiagram();
            
    /**
     * <p>id(0x86)</p>
     * <p>vtableId(85)</p>
     */
    @ComProperty(name = "HasDiagramNode", dispId = 0x86)
    eu.doppel_helix.jna.tlb.office2.MsoTriState getHasDiagramNode();
            
    /**
     * <p>id(0x87)</p>
     * <p>vtableId(86)</p>
     */
    @ComProperty(name = "DiagramNode", dispId = 0x87)
    DiagramNode getDiagramNode();
            
    /**
     * <p>id(0x88)</p>
     * <p>vtableId(87)</p>
     */
    @ComProperty(name = "Child", dispId = 0x88)
    eu.doppel_helix.jna.tlb.office2.MsoTriState getChild();
            
    /**
     * <p>id(0x89)</p>
     * <p>vtableId(88)</p>
     */
    @ComProperty(name = "ParentGroup", dispId = 0x89)
    Shape getParentGroup();
            
    /**
     * <p>id(0x8a)</p>
     * <p>vtableId(89)</p>
     */
    @ComProperty(name = "CanvasItems", dispId = 0x8a)
    CanvasShapes getCanvasItems();
            
    /**
     * <p>id(0x8b)</p>
     * <p>vtableId(90)</p>
     */
    @ComProperty(name = "ID", dispId = 0x8b)
    Integer getID();
            
    /**
     * <p>id(0x8c)</p>
     * <p>vtableId(91)</p>
     * @param Increment [in] {@code Float}
     */
    @ComMethod(name = "CanvasCropLeft", dispId = 0x8c)
    void CanvasCropLeft(Float Increment);
            
    /**
     * <p>id(0x8d)</p>
     * <p>vtableId(92)</p>
     * @param Increment [in] {@code Float}
     */
    @ComMethod(name = "CanvasCropTop", dispId = 0x8d)
    void CanvasCropTop(Float Increment);
            
    /**
     * <p>id(0x8e)</p>
     * <p>vtableId(93)</p>
     * @param Increment [in] {@code Float}
     */
    @ComMethod(name = "CanvasCropRight", dispId = 0x8e)
    void CanvasCropRight(Float Increment);
            
    /**
     * <p>id(0x8f)</p>
     * <p>vtableId(94)</p>
     * @param Increment [in] {@code Float}
     */
    @ComMethod(name = "CanvasCropBottom", dispId = 0x8f)
    void CanvasCropBottom(Float Increment);
            
    /**
     * <p>id(0x90)</p>
     * <p>vtableId(95)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "RTF", dispId = 0x90)
    void setRTF(String param0);
            
    /**
     * <p>id(0x91)</p>
     * <p>vtableId(96)</p>
     */
    @ComProperty(name = "LayoutInCell", dispId = 0x91)
    Integer getLayoutInCell();
            
    /**
     * <p>id(0x91)</p>
     * <p>vtableId(97)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "LayoutInCell", dispId = 0x91)
    void setLayoutInCell(Integer param0);
            
    /**
     * <p>id(0xc8)</p>
     * <p>vtableId(98)</p>
     */
    @ComProperty(name = "LeftRelative", dispId = 0xc8)
    Float getLeftRelative();
            
    /**
     * <p>id(0xc8)</p>
     * <p>vtableId(99)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "LeftRelative", dispId = 0xc8)
    void setLeftRelative(Float param0);
            
    /**
     * <p>id(0xc9)</p>
     * <p>vtableId(100)</p>
     */
    @ComProperty(name = "TopRelative", dispId = 0xc9)
    Float getTopRelative();
            
    /**
     * <p>id(0xc9)</p>
     * <p>vtableId(101)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "TopRelative", dispId = 0xc9)
    void setTopRelative(Float param0);
            
    /**
     * <p>id(0xca)</p>
     * <p>vtableId(102)</p>
     */
    @ComProperty(name = "WidthRelative", dispId = 0xca)
    Float getWidthRelative();
            
    /**
     * <p>id(0xca)</p>
     * <p>vtableId(103)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "WidthRelative", dispId = 0xca)
    void setWidthRelative(Float param0);
            
    /**
     * <p>id(0xcb)</p>
     * <p>vtableId(104)</p>
     */
    @ComProperty(name = "HeightRelative", dispId = 0xcb)
    Float getHeightRelative();
            
    /**
     * <p>id(0xcb)</p>
     * <p>vtableId(105)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "HeightRelative", dispId = 0xcb)
    void setHeightRelative(Float param0);
            
    /**
     * <p>id(0xcc)</p>
     * <p>vtableId(106)</p>
     */
    @ComProperty(name = "RelativeHorizontalSize", dispId = 0xcc)
    WdRelativeHorizontalSize getRelativeHorizontalSize();
            
    /**
     * <p>id(0xcc)</p>
     * <p>vtableId(107)</p>
     * @param param0 [in] {@code WdRelativeHorizontalSize}
     */
    @ComProperty(name = "RelativeHorizontalSize", dispId = 0xcc)
    void setRelativeHorizontalSize(WdRelativeHorizontalSize param0);
            
    /**
     * <p>id(0xcd)</p>
     * <p>vtableId(108)</p>
     */
    @ComProperty(name = "RelativeVerticalSize", dispId = 0xcd)
    WdRelativeVerticalSize getRelativeVerticalSize();
            
    /**
     * <p>id(0xcd)</p>
     * <p>vtableId(109)</p>
     * @param param0 [in] {@code WdRelativeVerticalSize}
     */
    @ComProperty(name = "RelativeVerticalSize", dispId = 0xcd)
    void setRelativeVerticalSize(WdRelativeVerticalSize param0);
            
    /**
     * <p>id(0x98)</p>
     * <p>vtableId(110)</p>
     */
    @ComProperty(name = "SoftEdge", dispId = 0x98)
    SoftEdgeFormat getSoftEdge();
            
    /**
     * <p>id(0x99)</p>
     * <p>vtableId(111)</p>
     */
    @ComProperty(name = "Glow", dispId = 0x99)
    GlowFormat getGlow();
            
    /**
     * <p>id(0x9a)</p>
     * <p>vtableId(112)</p>
     */
    @ComProperty(name = "Reflection", dispId = 0x9a)
    ReflectionFormat getReflection();
            
    /**
     * <p>id(0x9b)</p>
     * <p>vtableId(113)</p>
     */
    @ComProperty(name = "TextFrame2", dispId = 0x9b)
    eu.doppel_helix.jna.tlb.office2.TextFrame2 getTextFrame2();
            
    /**
     * <p>id(0x96)</p>
     * <p>vtableId(114)</p>
     */
    @ComProperty(name = "ShapeStyle", dispId = 0x96)
    eu.doppel_helix.jna.tlb.office2.MsoShapeStyleIndex getShapeStyle();
            
    /**
     * <p>id(0x96)</p>
     * <p>vtableId(115)</p>
     * @param param0 [in] {@code eu.doppel_helix.jna.tlb.office2.MsoShapeStyleIndex}
     */
    @ComProperty(name = "ShapeStyle", dispId = 0x96)
    void setShapeStyle(eu.doppel_helix.jna.tlb.office2.MsoShapeStyleIndex param0);
            
    /**
     * <p>id(0x97)</p>
     * <p>vtableId(116)</p>
     */
    @ComProperty(name = "BackgroundStyle", dispId = 0x97)
    eu.doppel_helix.jna.tlb.office2.MsoBackgroundStyleIndex getBackgroundStyle();
            
    /**
     * <p>id(0x97)</p>
     * <p>vtableId(117)</p>
     * @param param0 [in] {@code eu.doppel_helix.jna.tlb.office2.MsoBackgroundStyleIndex}
     */
    @ComProperty(name = "BackgroundStyle", dispId = 0x97)
    void setBackgroundStyle(eu.doppel_helix.jna.tlb.office2.MsoBackgroundStyleIndex param0);
            
    /**
     * <p>id(0xce)</p>
     * <p>vtableId(118)</p>
     */
    @ComProperty(name = "Title", dispId = 0xce)
    String getTitle();
            
    /**
     * <p>id(0xce)</p>
     * <p>vtableId(119)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Title", dispId = 0xce)
    void setTitle(String param0);
            
    
}