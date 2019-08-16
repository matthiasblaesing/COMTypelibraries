
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00024439-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00024439-0000-0000-C000-000000000046}")
public interface Shape extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x94)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0x94)
    Application getApplication();
            
    /**
     * <p>id(0x95)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    XlCreator getCreator();
            
    /**
     * <p>id(0x96)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x68b)</p>
     * <p>vtableId(10)</p>
     */
    @ComMethod(name = "Apply", dispId = 0x68b)
    void Apply();
            
    /**
     * <p>id(0x75)</p>
     * <p>vtableId(11)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    void Delete();
            
    /**
     * <p>id(0x40f)</p>
     * <p>vtableId(12)</p>
     */
    @ComMethod(name = "Duplicate", dispId = 0x40f)
    Shape Duplicate();
            
    /**
     * <p>id(0x68c)</p>
     * <p>vtableId(13)</p>
     * @param FlipCmd [in] {@code eu.doppel_helix.jna.tlb.office2.MsoFlipCmd}
     */
    @ComMethod(name = "Flip", dispId = 0x68c)
    void Flip(eu.doppel_helix.jna.tlb.office2.MsoFlipCmd FlipCmd);
            
    /**
     * <p>id(0x68e)</p>
     * <p>vtableId(14)</p>
     * @param Increment [in] {@code Float}
     */
    @ComMethod(name = "IncrementLeft", dispId = 0x68e)
    void IncrementLeft(Float Increment);
            
    /**
     * <p>id(0x690)</p>
     * <p>vtableId(15)</p>
     * @param Increment [in] {@code Float}
     */
    @ComMethod(name = "IncrementRotation", dispId = 0x690)
    void IncrementRotation(Float Increment);
            
    /**
     * <p>id(0x691)</p>
     * <p>vtableId(16)</p>
     * @param Increment [in] {@code Float}
     */
    @ComMethod(name = "IncrementTop", dispId = 0x691)
    void IncrementTop(Float Increment);
            
    /**
     * <p>id(0x692)</p>
     * <p>vtableId(17)</p>
     */
    @ComMethod(name = "PickUp", dispId = 0x692)
    void PickUp();
            
    /**
     * <p>id(0x693)</p>
     * <p>vtableId(18)</p>
     */
    @ComMethod(name = "RerouteConnections", dispId = 0x693)
    void RerouteConnections();
            
    /**
     * <p>id(0x694)</p>
     * <p>vtableId(19)</p>
     * @param Factor [in] {@code Float}
     * @param RelativeToOriginalSize [in] {@code eu.doppel_helix.jna.tlb.office2.MsoTriState}
     * @param Scale [in, optional] {@code Object}
     */
    @ComMethod(name = "ScaleHeight", dispId = 0x694)
    void ScaleHeight(Float Factor,
            eu.doppel_helix.jna.tlb.office2.MsoTriState RelativeToOriginalSize,
            Object Scale);
            
    /**
     * <p>id(0x698)</p>
     * <p>vtableId(20)</p>
     * @param Factor [in] {@code Float}
     * @param RelativeToOriginalSize [in] {@code eu.doppel_helix.jna.tlb.office2.MsoTriState}
     * @param Scale [in, optional] {@code Object}
     */
    @ComMethod(name = "ScaleWidth", dispId = 0x698)
    void ScaleWidth(Float Factor,
            eu.doppel_helix.jna.tlb.office2.MsoTriState RelativeToOriginalSize,
            Object Scale);
            
    /**
     * <p>id(0xeb)</p>
     * <p>vtableId(21)</p>
     * @param Replace [in, optional] {@code Object}
     */
    @ComMethod(name = "Select", dispId = 0xeb)
    void Select(Object Replace);
            
    /**
     * <p>id(0x699)</p>
     * <p>vtableId(22)</p>
     */
    @ComMethod(name = "SetShapesDefaultProperties", dispId = 0x699)
    void SetShapesDefaultProperties();
            
    /**
     * <p>id(0xf4)</p>
     * <p>vtableId(23)</p>
     */
    @ComMethod(name = "Ungroup", dispId = 0xf4)
    ShapeRange Ungroup();
            
    /**
     * <p>id(0x26e)</p>
     * <p>vtableId(24)</p>
     * @param ZOrderCmd [in] {@code eu.doppel_helix.jna.tlb.office2.MsoZOrderCmd}
     */
    @ComMethod(name = "ZOrder", dispId = 0x26e)
    void ZOrder(eu.doppel_helix.jna.tlb.office2.MsoZOrderCmd ZOrderCmd);
            
    /**
     * <p>id(0x69b)</p>
     * <p>vtableId(25)</p>
     */
    @ComProperty(name = "Adjustments", dispId = 0x69b)
    eu.doppel_helix.jna.tlb.office2.Adjustments getAdjustments();
            
    /**
     * <p>id(0x69c)</p>
     * <p>vtableId(26)</p>
     */
    @ComProperty(name = "TextFrame", dispId = 0x69c)
    TextFrame getTextFrame();
            
    /**
     * <p>id(0x69d)</p>
     * <p>vtableId(27)</p>
     */
    @ComProperty(name = "AutoShapeType", dispId = 0x69d)
    eu.doppel_helix.jna.tlb.office2.MsoAutoShapeType getAutoShapeType();
            
    /**
     * <p>id(0x69d)</p>
     * <p>vtableId(28)</p>
     * @param param0 [in] {@code eu.doppel_helix.jna.tlb.office2.MsoAutoShapeType}
     */
    @ComProperty(name = "AutoShapeType", dispId = 0x69d)
    void setAutoShapeType(eu.doppel_helix.jna.tlb.office2.MsoAutoShapeType param0);
            
    /**
     * <p>id(0x69e)</p>
     * <p>vtableId(29)</p>
     */
    @ComProperty(name = "Callout", dispId = 0x69e)
    eu.doppel_helix.jna.tlb.office2.CalloutFormat getCallout();
            
    /**
     * <p>id(0x69f)</p>
     * <p>vtableId(30)</p>
     */
    @ComProperty(name = "ConnectionSiteCount", dispId = 0x69f)
    Integer getConnectionSiteCount();
            
    /**
     * <p>id(0x6a0)</p>
     * <p>vtableId(31)</p>
     */
    @ComProperty(name = "Connector", dispId = 0x6a0)
    eu.doppel_helix.jna.tlb.office2.MsoTriState getConnector();
            
    /**
     * <p>id(0x6a1)</p>
     * <p>vtableId(32)</p>
     */
    @ComProperty(name = "ConnectorFormat", dispId = 0x6a1)
    ConnectorFormat getConnectorFormat();
            
    /**
     * <p>id(0x67f)</p>
     * <p>vtableId(33)</p>
     */
    @ComProperty(name = "Fill", dispId = 0x67f)
    eu.doppel_helix.jna.tlb.office2.FillFormat getFill();
            
    /**
     * <p>id(0x6a2)</p>
     * <p>vtableId(34)</p>
     */
    @ComProperty(name = "GroupItems", dispId = 0x6a2)
    GroupShapes getGroupItems();
            
    /**
     * <p>id(0x7b)</p>
     * <p>vtableId(35)</p>
     */
    @ComProperty(name = "Height", dispId = 0x7b)
    Float getHeight();
            
    /**
     * <p>id(0x7b)</p>
     * <p>vtableId(36)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "Height", dispId = 0x7b)
    void setHeight(Float param0);
            
    /**
     * <p>id(0x6a3)</p>
     * <p>vtableId(37)</p>
     */
    @ComProperty(name = "HorizontalFlip", dispId = 0x6a3)
    eu.doppel_helix.jna.tlb.office2.MsoTriState getHorizontalFlip();
            
    /**
     * <p>id(0x7f)</p>
     * <p>vtableId(38)</p>
     */
    @ComProperty(name = "Left", dispId = 0x7f)
    Float getLeft();
            
    /**
     * <p>id(0x7f)</p>
     * <p>vtableId(39)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "Left", dispId = 0x7f)
    void setLeft(Float param0);
            
    /**
     * <p>id(0x331)</p>
     * <p>vtableId(40)</p>
     */
    @ComProperty(name = "Line", dispId = 0x331)
    eu.doppel_helix.jna.tlb.office2.LineFormat getLine();
            
    /**
     * <p>id(0x6a4)</p>
     * <p>vtableId(41)</p>
     */
    @ComProperty(name = "LockAspectRatio", dispId = 0x6a4)
    eu.doppel_helix.jna.tlb.office2.MsoTriState getLockAspectRatio();
            
    /**
     * <p>id(0x6a4)</p>
     * <p>vtableId(42)</p>
     * @param param0 [in] {@code eu.doppel_helix.jna.tlb.office2.MsoTriState}
     */
    @ComProperty(name = "LockAspectRatio", dispId = 0x6a4)
    void setLockAspectRatio(eu.doppel_helix.jna.tlb.office2.MsoTriState param0);
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(43)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    String getName();
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(44)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    void setName(String param0);
            
    /**
     * <p>id(0x6a5)</p>
     * <p>vtableId(45)</p>
     */
    @ComProperty(name = "Nodes", dispId = 0x6a5)
    eu.doppel_helix.jna.tlb.office2.ShapeNodes getNodes();
            
    /**
     * <p>id(0x3b)</p>
     * <p>vtableId(46)</p>
     */
    @ComProperty(name = "Rotation", dispId = 0x3b)
    Float getRotation();
            
    /**
     * <p>id(0x3b)</p>
     * <p>vtableId(47)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "Rotation", dispId = 0x3b)
    void setRotation(Float param0);
            
    /**
     * <p>id(0x65f)</p>
     * <p>vtableId(48)</p>
     */
    @ComProperty(name = "PictureFormat", dispId = 0x65f)
    eu.doppel_helix.jna.tlb.office2.PictureFormat getPictureFormat();
            
    /**
     * <p>id(0x67)</p>
     * <p>vtableId(49)</p>
     */
    @ComProperty(name = "Shadow", dispId = 0x67)
    eu.doppel_helix.jna.tlb.office2.ShadowFormat getShadow();
            
    /**
     * <p>id(0x6a6)</p>
     * <p>vtableId(50)</p>
     */
    @ComProperty(name = "TextEffect", dispId = 0x6a6)
    eu.doppel_helix.jna.tlb.office2.TextEffectFormat getTextEffect();
            
    /**
     * <p>id(0x6a7)</p>
     * <p>vtableId(51)</p>
     */
    @ComProperty(name = "ThreeD", dispId = 0x6a7)
    eu.doppel_helix.jna.tlb.office2.ThreeDFormat getThreeD();
            
    /**
     * <p>id(0x7e)</p>
     * <p>vtableId(52)</p>
     */
    @ComProperty(name = "Top", dispId = 0x7e)
    Float getTop();
            
    /**
     * <p>id(0x7e)</p>
     * <p>vtableId(53)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "Top", dispId = 0x7e)
    void setTop(Float param0);
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(54)</p>
     */
    @ComProperty(name = "Type", dispId = 0x6c)
    eu.doppel_helix.jna.tlb.office2.MsoShapeType getType();
            
    /**
     * <p>id(0x6a8)</p>
     * <p>vtableId(55)</p>
     */
    @ComProperty(name = "VerticalFlip", dispId = 0x6a8)
    eu.doppel_helix.jna.tlb.office2.MsoTriState getVerticalFlip();
            
    /**
     * <p>id(0x26d)</p>
     * <p>vtableId(56)</p>
     */
    @ComProperty(name = "Vertices", dispId = 0x26d)
    Object getVertices();
            
    /**
     * <p>id(0x22e)</p>
     * <p>vtableId(57)</p>
     */
    @ComProperty(name = "Visible", dispId = 0x22e)
    eu.doppel_helix.jna.tlb.office2.MsoTriState getVisible();
            
    /**
     * <p>id(0x22e)</p>
     * <p>vtableId(58)</p>
     * @param param0 [in] {@code eu.doppel_helix.jna.tlb.office2.MsoTriState}
     */
    @ComProperty(name = "Visible", dispId = 0x22e)
    void setVisible(eu.doppel_helix.jna.tlb.office2.MsoTriState param0);
            
    /**
     * <p>id(0x7a)</p>
     * <p>vtableId(59)</p>
     */
    @ComProperty(name = "Width", dispId = 0x7a)
    Float getWidth();
            
    /**
     * <p>id(0x7a)</p>
     * <p>vtableId(60)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "Width", dispId = 0x7a)
    void setWidth(Float param0);
            
    /**
     * <p>id(0x6a9)</p>
     * <p>vtableId(61)</p>
     */
    @ComProperty(name = "ZOrderPosition", dispId = 0x6a9)
    Integer getZOrderPosition();
            
    /**
     * <p>id(0x6aa)</p>
     * <p>vtableId(62)</p>
     */
    @ComProperty(name = "Hyperlink", dispId = 0x6aa)
    Hyperlink getHyperlink();
            
    /**
     * <p>id(0x6ab)</p>
     * <p>vtableId(63)</p>
     */
    @ComProperty(name = "BlackWhiteMode", dispId = 0x6ab)
    eu.doppel_helix.jna.tlb.office2.MsoBlackWhiteMode getBlackWhiteMode();
            
    /**
     * <p>id(0x6ab)</p>
     * <p>vtableId(64)</p>
     * @param param0 [in] {@code eu.doppel_helix.jna.tlb.office2.MsoBlackWhiteMode}
     */
    @ComProperty(name = "BlackWhiteMode", dispId = 0x6ab)
    void setBlackWhiteMode(eu.doppel_helix.jna.tlb.office2.MsoBlackWhiteMode param0);
            
    /**
     * <p>id(0x6ac)</p>
     * <p>vtableId(65)</p>
     */
    @ComProperty(name = "DrawingObject", dispId = 0x6ac)
    com.sun.jna.platform.win32.COM.util.IDispatch getDrawingObject();
            
    /**
     * <p>id(0x254)</p>
     * <p>vtableId(66)</p>
     */
    @ComProperty(name = "OnAction", dispId = 0x254)
    String getOnAction();
            
    /**
     * <p>id(0x254)</p>
     * <p>vtableId(67)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnAction", dispId = 0x254)
    void setOnAction(String param0);
            
    /**
     * <p>id(0x10d)</p>
     * <p>vtableId(68)</p>
     */
    @ComProperty(name = "Locked", dispId = 0x10d)
    Boolean getLocked();
            
    /**
     * <p>id(0x10d)</p>
     * <p>vtableId(69)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Locked", dispId = 0x10d)
    void setLocked(Boolean param0);
            
    /**
     * <p>id(0x26c)</p>
     * <p>vtableId(70)</p>
     */
    @ComProperty(name = "TopLeftCell", dispId = 0x26c)
    Range getTopLeftCell();
            
    /**
     * <p>id(0x267)</p>
     * <p>vtableId(71)</p>
     */
    @ComProperty(name = "BottomRightCell", dispId = 0x267)
    Range getBottomRightCell();
            
    /**
     * <p>id(0x269)</p>
     * <p>vtableId(72)</p>
     */
    @ComProperty(name = "Placement", dispId = 0x269)
    XlPlacement getPlacement();
            
    /**
     * <p>id(0x269)</p>
     * <p>vtableId(73)</p>
     * @param param0 [in] {@code XlPlacement}
     */
    @ComProperty(name = "Placement", dispId = 0x269)
    void setPlacement(XlPlacement param0);
            
    /**
     * <p>id(0x227)</p>
     * <p>vtableId(74)</p>
     */
    @ComMethod(name = "Copy", dispId = 0x227)
    void Copy();
            
    /**
     * <p>id(0x235)</p>
     * <p>vtableId(75)</p>
     */
    @ComMethod(name = "Cut", dispId = 0x235)
    void Cut();
            
    /**
     * <p>id(0xd5)</p>
     * <p>vtableId(76)</p>
     * @param Appearance [in, optional] {@code Object}
     * @param Format [in, optional] {@code Object}
     */
    @ComMethod(name = "CopyPicture", dispId = 0xd5)
    void CopyPicture(Object Appearance,
            Object Format);
            
    /**
     * <p>id(0x6ad)</p>
     * <p>vtableId(77)</p>
     */
    @ComProperty(name = "ControlFormat", dispId = 0x6ad)
    ControlFormat getControlFormat();
            
    /**
     * <p>id(0x6ae)</p>
     * <p>vtableId(78)</p>
     */
    @ComProperty(name = "LinkFormat", dispId = 0x6ae)
    LinkFormat getLinkFormat();
            
    /**
     * <p>id(0x6af)</p>
     * <p>vtableId(79)</p>
     */
    @ComProperty(name = "OLEFormat", dispId = 0x6af)
    OLEFormat getOLEFormat();
            
    /**
     * <p>id(0x6b0)</p>
     * <p>vtableId(80)</p>
     */
    @ComProperty(name = "FormControlType", dispId = 0x6b0)
    XlFormControl getFormControlType();
            
    /**
     * <p>id(0x763)</p>
     * <p>vtableId(81)</p>
     */
    @ComProperty(name = "AlternativeText", dispId = 0x763)
    String getAlternativeText();
            
    /**
     * <p>id(0x763)</p>
     * <p>vtableId(82)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "AlternativeText", dispId = 0x763)
    void setAlternativeText(String param0);
            
    /**
     * <p>id(0x764)</p>
     * <p>vtableId(83)</p>
     */
    @ComProperty(name = "Script", dispId = 0x764)
    eu.doppel_helix.jna.tlb.office2.Script getScript();
            
    /**
     * <p>id(0x875)</p>
     * <p>vtableId(84)</p>
     */
    @ComProperty(name = "DiagramNode", dispId = 0x875)
    eu.doppel_helix.jna.tlb.office2.DiagramNode getDiagramNode();
            
    /**
     * <p>id(0x876)</p>
     * <p>vtableId(85)</p>
     */
    @ComProperty(name = "HasDiagramNode", dispId = 0x876)
    eu.doppel_helix.jna.tlb.office2.MsoTriState getHasDiagramNode();
            
    /**
     * <p>id(0x877)</p>
     * <p>vtableId(86)</p>
     */
    @ComProperty(name = "Diagram", dispId = 0x877)
    Diagram getDiagram();
            
    /**
     * <p>id(0x878)</p>
     * <p>vtableId(87)</p>
     */
    @ComProperty(name = "HasDiagram", dispId = 0x878)
    eu.doppel_helix.jna.tlb.office2.MsoTriState getHasDiagram();
            
    /**
     * <p>id(0x879)</p>
     * <p>vtableId(88)</p>
     */
    @ComProperty(name = "Child", dispId = 0x879)
    eu.doppel_helix.jna.tlb.office2.MsoTriState getChild();
            
    /**
     * <p>id(0x87a)</p>
     * <p>vtableId(89)</p>
     */
    @ComProperty(name = "ParentGroup", dispId = 0x87a)
    Shape getParentGroup();
            
    /**
     * <p>id(0x87b)</p>
     * <p>vtableId(90)</p>
     */
    @ComProperty(name = "CanvasItems", dispId = 0x87b)
    eu.doppel_helix.jna.tlb.office2.CanvasShapes getCanvasItems();
            
    /**
     * <p>id(0x23a)</p>
     * <p>vtableId(91)</p>
     */
    @ComProperty(name = "ID", dispId = 0x23a)
    Integer getID();
            
    /**
     * <p>id(0x87c)</p>
     * <p>vtableId(92)</p>
     * @param Increment [in] {@code Float}
     */
    @ComMethod(name = "CanvasCropLeft", dispId = 0x87c)
    void CanvasCropLeft(Float Increment);
            
    /**
     * <p>id(0x87d)</p>
     * <p>vtableId(93)</p>
     * @param Increment [in] {@code Float}
     */
    @ComMethod(name = "CanvasCropTop", dispId = 0x87d)
    void CanvasCropTop(Float Increment);
            
    /**
     * <p>id(0x87e)</p>
     * <p>vtableId(94)</p>
     * @param Increment [in] {@code Float}
     */
    @ComMethod(name = "CanvasCropRight", dispId = 0x87e)
    void CanvasCropRight(Float Increment);
            
    /**
     * <p>id(0x87f)</p>
     * <p>vtableId(95)</p>
     * @param Increment [in] {@code Float}
     */
    @ComMethod(name = "CanvasCropBottom", dispId = 0x87f)
    void CanvasCropBottom(Float Increment);
            
    /**
     * <p>id(0x7)</p>
     * <p>vtableId(96)</p>
     */
    @ComProperty(name = "Chart", dispId = 0x7)
    Chart getChart();
            
    /**
     * <p>id(0xa62)</p>
     * <p>vtableId(97)</p>
     */
    @ComProperty(name = "HasChart", dispId = 0xa62)
    eu.doppel_helix.jna.tlb.office2.MsoTriState getHasChart();
            
    /**
     * <p>id(0xa63)</p>
     * <p>vtableId(98)</p>
     */
    @ComProperty(name = "TextFrame2", dispId = 0xa63)
    eu.doppel_helix.jna.tlb.office2.TextFrame2 getTextFrame2();
            
    /**
     * <p>id(0xa64)</p>
     * <p>vtableId(99)</p>
     */
    @ComProperty(name = "ShapeStyle", dispId = 0xa64)
    eu.doppel_helix.jna.tlb.office2.MsoShapeStyleIndex getShapeStyle();
            
    /**
     * <p>id(0xa64)</p>
     * <p>vtableId(100)</p>
     * @param param0 [in] {@code eu.doppel_helix.jna.tlb.office2.MsoShapeStyleIndex}
     */
    @ComProperty(name = "ShapeStyle", dispId = 0xa64)
    void setShapeStyle(eu.doppel_helix.jna.tlb.office2.MsoShapeStyleIndex param0);
            
    /**
     * <p>id(0xa65)</p>
     * <p>vtableId(101)</p>
     */
    @ComProperty(name = "BackgroundStyle", dispId = 0xa65)
    eu.doppel_helix.jna.tlb.office2.MsoBackgroundStyleIndex getBackgroundStyle();
            
    /**
     * <p>id(0xa65)</p>
     * <p>vtableId(102)</p>
     * @param param0 [in] {@code eu.doppel_helix.jna.tlb.office2.MsoBackgroundStyleIndex}
     */
    @ComProperty(name = "BackgroundStyle", dispId = 0xa65)
    void setBackgroundStyle(eu.doppel_helix.jna.tlb.office2.MsoBackgroundStyleIndex param0);
            
    /**
     * <p>id(0xa66)</p>
     * <p>vtableId(103)</p>
     */
    @ComProperty(name = "SoftEdge", dispId = 0xa66)
    eu.doppel_helix.jna.tlb.office2.SoftEdgeFormat getSoftEdge();
            
    /**
     * <p>id(0xa67)</p>
     * <p>vtableId(104)</p>
     */
    @ComProperty(name = "Glow", dispId = 0xa67)
    eu.doppel_helix.jna.tlb.office2.GlowFormat getGlow();
            
    /**
     * <p>id(0xa68)</p>
     * <p>vtableId(105)</p>
     */
    @ComProperty(name = "Reflection", dispId = 0xa68)
    eu.doppel_helix.jna.tlb.office2.ReflectionFormat getReflection();
            
    /**
     * <p>id(0xb66)</p>
     * <p>vtableId(106)</p>
     */
    @ComProperty(name = "HasSmartArt", dispId = 0xb66)
    eu.doppel_helix.jna.tlb.office2.MsoTriState getHasSmartArt();
            
    /**
     * <p>id(0xb67)</p>
     * <p>vtableId(107)</p>
     */
    @ComProperty(name = "SmartArt", dispId = 0xb67)
    eu.doppel_helix.jna.tlb.office2.SmartArt getSmartArt();
            
    /**
     * <p>id(0xc7)</p>
     * <p>vtableId(108)</p>
     */
    @ComProperty(name = "Title", dispId = 0xc7)
    String getTitle();
            
    /**
     * <p>id(0xc7)</p>
     * <p>vtableId(109)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Title", dispId = 0xc7)
    void setTitle(String param0);
            
    
}