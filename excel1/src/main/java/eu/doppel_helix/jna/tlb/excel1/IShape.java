
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00024439-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00024439-0001-0000-C000-000000000046}")
public interface IShape extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x94)</p>
     * <p>vtableId(7)</p>
     * @param RHS [out] {@code Application}
     */
    @ComProperty(name = "Application", dispId = 0x94)
    com.sun.jna.platform.win32.WinNT.HRESULT getApplication(VARIANT RHS);
            
    /**
     * <p>id(0x95)</p>
     * <p>vtableId(8)</p>
     * @param RHS [out] {@code XlCreator}
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    com.sun.jna.platform.win32.WinNT.HRESULT getCreator(VARIANT RHS);
            
    /**
     * <p>id(0x96)</p>
     * <p>vtableId(9)</p>
     * @param RHS [out] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.WinNT.HRESULT getParent(VARIANT RHS);
            
    /**
     * <p>id(0x68b)</p>
     * <p>vtableId(10)</p>
     */
    @ComMethod(name = "Apply", dispId = 0x68b)
    com.sun.jna.platform.win32.WinNT.HRESULT Apply();
            
    /**
     * <p>id(0x75)</p>
     * <p>vtableId(11)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    com.sun.jna.platform.win32.WinNT.HRESULT Delete();
            
    /**
     * <p>id(0x40f)</p>
     * <p>vtableId(12)</p>
     * @param RHS [out] {@code Shape}
     */
    @ComMethod(name = "Duplicate", dispId = 0x40f)
    com.sun.jna.platform.win32.WinNT.HRESULT Duplicate(VARIANT RHS);
            
    /**
     * <p>id(0x68c)</p>
     * <p>vtableId(13)</p>
     * @param FlipCmd [in] {@code eu.doppel_helix.jna.tlb.office2.MsoFlipCmd}
     */
    @ComMethod(name = "Flip", dispId = 0x68c)
    com.sun.jna.platform.win32.WinNT.HRESULT Flip(eu.doppel_helix.jna.tlb.office2.MsoFlipCmd FlipCmd);
            
    /**
     * <p>id(0x68e)</p>
     * <p>vtableId(14)</p>
     * @param Increment [in] {@code Float}
     */
    @ComMethod(name = "IncrementLeft", dispId = 0x68e)
    com.sun.jna.platform.win32.WinNT.HRESULT IncrementLeft(Float Increment);
            
    /**
     * <p>id(0x690)</p>
     * <p>vtableId(15)</p>
     * @param Increment [in] {@code Float}
     */
    @ComMethod(name = "IncrementRotation", dispId = 0x690)
    com.sun.jna.platform.win32.WinNT.HRESULT IncrementRotation(Float Increment);
            
    /**
     * <p>id(0x691)</p>
     * <p>vtableId(16)</p>
     * @param Increment [in] {@code Float}
     */
    @ComMethod(name = "IncrementTop", dispId = 0x691)
    com.sun.jna.platform.win32.WinNT.HRESULT IncrementTop(Float Increment);
            
    /**
     * <p>id(0x692)</p>
     * <p>vtableId(17)</p>
     */
    @ComMethod(name = "PickUp", dispId = 0x692)
    com.sun.jna.platform.win32.WinNT.HRESULT PickUp();
            
    /**
     * <p>id(0x693)</p>
     * <p>vtableId(18)</p>
     */
    @ComMethod(name = "RerouteConnections", dispId = 0x693)
    com.sun.jna.platform.win32.WinNT.HRESULT RerouteConnections();
            
    /**
     * <p>id(0x694)</p>
     * <p>vtableId(19)</p>
     * @param Factor [in] {@code Float}
     * @param RelativeToOriginalSize [in] {@code eu.doppel_helix.jna.tlb.office2.MsoTriState}
     * @param Scale [in, optional] {@code Object}
     */
    @ComMethod(name = "ScaleHeight", dispId = 0x694)
    com.sun.jna.platform.win32.WinNT.HRESULT ScaleHeight(Float Factor,
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
    com.sun.jna.platform.win32.WinNT.HRESULT ScaleWidth(Float Factor,
            eu.doppel_helix.jna.tlb.office2.MsoTriState RelativeToOriginalSize,
            Object Scale);
            
    /**
     * <p>id(0xeb)</p>
     * <p>vtableId(21)</p>
     * @param Replace [in, optional] {@code Object}
     */
    @ComMethod(name = "Select", dispId = 0xeb)
    com.sun.jna.platform.win32.WinNT.HRESULT Select(Object Replace);
            
    /**
     * <p>id(0x699)</p>
     * <p>vtableId(22)</p>
     */
    @ComMethod(name = "SetShapesDefaultProperties", dispId = 0x699)
    com.sun.jna.platform.win32.WinNT.HRESULT SetShapesDefaultProperties();
            
    /**
     * <p>id(0xf4)</p>
     * <p>vtableId(23)</p>
     * @param RHS [out] {@code ShapeRange}
     */
    @ComMethod(name = "Ungroup", dispId = 0xf4)
    com.sun.jna.platform.win32.WinNT.HRESULT Ungroup(VARIANT RHS);
            
    /**
     * <p>id(0x26e)</p>
     * <p>vtableId(24)</p>
     * @param ZOrderCmd [in] {@code eu.doppel_helix.jna.tlb.office2.MsoZOrderCmd}
     */
    @ComMethod(name = "ZOrder", dispId = 0x26e)
    com.sun.jna.platform.win32.WinNT.HRESULT ZOrder(eu.doppel_helix.jna.tlb.office2.MsoZOrderCmd ZOrderCmd);
            
    /**
     * <p>id(0x69b)</p>
     * <p>vtableId(25)</p>
     * @param RHS [out] {@code eu.doppel_helix.jna.tlb.office2.Adjustments}
     */
    @ComProperty(name = "Adjustments", dispId = 0x69b)
    com.sun.jna.platform.win32.WinNT.HRESULT getAdjustments(VARIANT RHS);
            
    /**
     * <p>id(0x69c)</p>
     * <p>vtableId(26)</p>
     * @param RHS [out] {@code TextFrame}
     */
    @ComProperty(name = "TextFrame", dispId = 0x69c)
    com.sun.jna.platform.win32.WinNT.HRESULT getTextFrame(VARIANT RHS);
            
    /**
     * <p>id(0x69d)</p>
     * <p>vtableId(27)</p>
     * @param RHS [out] {@code eu.doppel_helix.jna.tlb.office2.MsoAutoShapeType}
     */
    @ComProperty(name = "AutoShapeType", dispId = 0x69d)
    com.sun.jna.platform.win32.WinNT.HRESULT getAutoShapeType(VARIANT RHS);
            
    /**
     * <p>id(0x69d)</p>
     * <p>vtableId(28)</p>
     * @param RHS [in] {@code eu.doppel_helix.jna.tlb.office2.MsoAutoShapeType}
     */
    @ComProperty(name = "AutoShapeType", dispId = 0x69d)
    com.sun.jna.platform.win32.WinNT.HRESULT setAutoShapeType(eu.doppel_helix.jna.tlb.office2.MsoAutoShapeType RHS);
            
    /**
     * <p>id(0x69e)</p>
     * <p>vtableId(29)</p>
     * @param RHS [out] {@code eu.doppel_helix.jna.tlb.office2.CalloutFormat}
     */
    @ComProperty(name = "Callout", dispId = 0x69e)
    com.sun.jna.platform.win32.WinNT.HRESULT getCallout(VARIANT RHS);
            
    /**
     * <p>id(0x69f)</p>
     * <p>vtableId(30)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "ConnectionSiteCount", dispId = 0x69f)
    com.sun.jna.platform.win32.WinNT.HRESULT getConnectionSiteCount(VARIANT RHS);
            
    /**
     * <p>id(0x6a0)</p>
     * <p>vtableId(31)</p>
     * @param RHS [out] {@code eu.doppel_helix.jna.tlb.office2.MsoTriState}
     */
    @ComProperty(name = "Connector", dispId = 0x6a0)
    com.sun.jna.platform.win32.WinNT.HRESULT getConnector(VARIANT RHS);
            
    /**
     * <p>id(0x6a1)</p>
     * <p>vtableId(32)</p>
     * @param RHS [out] {@code ConnectorFormat}
     */
    @ComProperty(name = "ConnectorFormat", dispId = 0x6a1)
    com.sun.jna.platform.win32.WinNT.HRESULT getConnectorFormat(VARIANT RHS);
            
    /**
     * <p>id(0x67f)</p>
     * <p>vtableId(33)</p>
     * @param RHS [out] {@code eu.doppel_helix.jna.tlb.office2.FillFormat}
     */
    @ComProperty(name = "Fill", dispId = 0x67f)
    com.sun.jna.platform.win32.WinNT.HRESULT getFill(VARIANT RHS);
            
    /**
     * <p>id(0x6a2)</p>
     * <p>vtableId(34)</p>
     * @param RHS [out] {@code GroupShapes}
     */
    @ComProperty(name = "GroupItems", dispId = 0x6a2)
    com.sun.jna.platform.win32.WinNT.HRESULT getGroupItems(VARIANT RHS);
            
    /**
     * <p>id(0x7b)</p>
     * <p>vtableId(35)</p>
     * @param RHS [out] {@code Float}
     */
    @ComProperty(name = "Height", dispId = 0x7b)
    com.sun.jna.platform.win32.WinNT.HRESULT getHeight(VARIANT RHS);
            
    /**
     * <p>id(0x7b)</p>
     * <p>vtableId(36)</p>
     * @param RHS [in] {@code Float}
     */
    @ComProperty(name = "Height", dispId = 0x7b)
    com.sun.jna.platform.win32.WinNT.HRESULT setHeight(Float RHS);
            
    /**
     * <p>id(0x6a3)</p>
     * <p>vtableId(37)</p>
     * @param RHS [out] {@code eu.doppel_helix.jna.tlb.office2.MsoTriState}
     */
    @ComProperty(name = "HorizontalFlip", dispId = 0x6a3)
    com.sun.jna.platform.win32.WinNT.HRESULT getHorizontalFlip(VARIANT RHS);
            
    /**
     * <p>id(0x7f)</p>
     * <p>vtableId(38)</p>
     * @param RHS [out] {@code Float}
     */
    @ComProperty(name = "Left", dispId = 0x7f)
    com.sun.jna.platform.win32.WinNT.HRESULT getLeft(VARIANT RHS);
            
    /**
     * <p>id(0x7f)</p>
     * <p>vtableId(39)</p>
     * @param RHS [in] {@code Float}
     */
    @ComProperty(name = "Left", dispId = 0x7f)
    com.sun.jna.platform.win32.WinNT.HRESULT setLeft(Float RHS);
            
    /**
     * <p>id(0x331)</p>
     * <p>vtableId(40)</p>
     * @param RHS [out] {@code eu.doppel_helix.jna.tlb.office2.LineFormat}
     */
    @ComProperty(name = "Line", dispId = 0x331)
    com.sun.jna.platform.win32.WinNT.HRESULT getLine(VARIANT RHS);
            
    /**
     * <p>id(0x6a4)</p>
     * <p>vtableId(41)</p>
     * @param RHS [out] {@code eu.doppel_helix.jna.tlb.office2.MsoTriState}
     */
    @ComProperty(name = "LockAspectRatio", dispId = 0x6a4)
    com.sun.jna.platform.win32.WinNT.HRESULT getLockAspectRatio(VARIANT RHS);
            
    /**
     * <p>id(0x6a4)</p>
     * <p>vtableId(42)</p>
     * @param RHS [in] {@code eu.doppel_helix.jna.tlb.office2.MsoTriState}
     */
    @ComProperty(name = "LockAspectRatio", dispId = 0x6a4)
    com.sun.jna.platform.win32.WinNT.HRESULT setLockAspectRatio(eu.doppel_helix.jna.tlb.office2.MsoTriState RHS);
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(43)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    com.sun.jna.platform.win32.WinNT.HRESULT getName(VARIANT RHS);
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(44)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    com.sun.jna.platform.win32.WinNT.HRESULT setName(String RHS);
            
    /**
     * <p>id(0x6a5)</p>
     * <p>vtableId(45)</p>
     * @param RHS [out] {@code eu.doppel_helix.jna.tlb.office2.ShapeNodes}
     */
    @ComProperty(name = "Nodes", dispId = 0x6a5)
    com.sun.jna.platform.win32.WinNT.HRESULT getNodes(VARIANT RHS);
            
    /**
     * <p>id(0x3b)</p>
     * <p>vtableId(46)</p>
     * @param RHS [out] {@code Float}
     */
    @ComProperty(name = "Rotation", dispId = 0x3b)
    com.sun.jna.platform.win32.WinNT.HRESULT getRotation(VARIANT RHS);
            
    /**
     * <p>id(0x3b)</p>
     * <p>vtableId(47)</p>
     * @param RHS [in] {@code Float}
     */
    @ComProperty(name = "Rotation", dispId = 0x3b)
    com.sun.jna.platform.win32.WinNT.HRESULT setRotation(Float RHS);
            
    /**
     * <p>id(0x65f)</p>
     * <p>vtableId(48)</p>
     * @param RHS [out] {@code eu.doppel_helix.jna.tlb.office2.PictureFormat}
     */
    @ComProperty(name = "PictureFormat", dispId = 0x65f)
    com.sun.jna.platform.win32.WinNT.HRESULT getPictureFormat(VARIANT RHS);
            
    /**
     * <p>id(0x67)</p>
     * <p>vtableId(49)</p>
     * @param RHS [out] {@code eu.doppel_helix.jna.tlb.office2.ShadowFormat}
     */
    @ComProperty(name = "Shadow", dispId = 0x67)
    com.sun.jna.platform.win32.WinNT.HRESULT getShadow(VARIANT RHS);
            
    /**
     * <p>id(0x6a6)</p>
     * <p>vtableId(50)</p>
     * @param RHS [out] {@code eu.doppel_helix.jna.tlb.office2.TextEffectFormat}
     */
    @ComProperty(name = "TextEffect", dispId = 0x6a6)
    com.sun.jna.platform.win32.WinNT.HRESULT getTextEffect(VARIANT RHS);
            
    /**
     * <p>id(0x6a7)</p>
     * <p>vtableId(51)</p>
     * @param RHS [out] {@code eu.doppel_helix.jna.tlb.office2.ThreeDFormat}
     */
    @ComProperty(name = "ThreeD", dispId = 0x6a7)
    com.sun.jna.platform.win32.WinNT.HRESULT getThreeD(VARIANT RHS);
            
    /**
     * <p>id(0x7e)</p>
     * <p>vtableId(52)</p>
     * @param RHS [out] {@code Float}
     */
    @ComProperty(name = "Top", dispId = 0x7e)
    com.sun.jna.platform.win32.WinNT.HRESULT getTop(VARIANT RHS);
            
    /**
     * <p>id(0x7e)</p>
     * <p>vtableId(53)</p>
     * @param RHS [in] {@code Float}
     */
    @ComProperty(name = "Top", dispId = 0x7e)
    com.sun.jna.platform.win32.WinNT.HRESULT setTop(Float RHS);
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(54)</p>
     * @param RHS [out] {@code eu.doppel_helix.jna.tlb.office2.MsoShapeType}
     */
    @ComProperty(name = "Type", dispId = 0x6c)
    com.sun.jna.platform.win32.WinNT.HRESULT getType(VARIANT RHS);
            
    /**
     * <p>id(0x6a8)</p>
     * <p>vtableId(55)</p>
     * @param RHS [out] {@code eu.doppel_helix.jna.tlb.office2.MsoTriState}
     */
    @ComProperty(name = "VerticalFlip", dispId = 0x6a8)
    com.sun.jna.platform.win32.WinNT.HRESULT getVerticalFlip(VARIANT RHS);
            
    /**
     * <p>id(0x26d)</p>
     * <p>vtableId(56)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "Vertices", dispId = 0x26d)
    com.sun.jna.platform.win32.WinNT.HRESULT getVertices(VARIANT RHS);
            
    /**
     * <p>id(0x22e)</p>
     * <p>vtableId(57)</p>
     * @param RHS [out] {@code eu.doppel_helix.jna.tlb.office2.MsoTriState}
     */
    @ComProperty(name = "Visible", dispId = 0x22e)
    com.sun.jna.platform.win32.WinNT.HRESULT getVisible(VARIANT RHS);
            
    /**
     * <p>id(0x22e)</p>
     * <p>vtableId(58)</p>
     * @param RHS [in] {@code eu.doppel_helix.jna.tlb.office2.MsoTriState}
     */
    @ComProperty(name = "Visible", dispId = 0x22e)
    com.sun.jna.platform.win32.WinNT.HRESULT setVisible(eu.doppel_helix.jna.tlb.office2.MsoTriState RHS);
            
    /**
     * <p>id(0x7a)</p>
     * <p>vtableId(59)</p>
     * @param RHS [out] {@code Float}
     */
    @ComProperty(name = "Width", dispId = 0x7a)
    com.sun.jna.platform.win32.WinNT.HRESULT getWidth(VARIANT RHS);
            
    /**
     * <p>id(0x7a)</p>
     * <p>vtableId(60)</p>
     * @param RHS [in] {@code Float}
     */
    @ComProperty(name = "Width", dispId = 0x7a)
    com.sun.jna.platform.win32.WinNT.HRESULT setWidth(Float RHS);
            
    /**
     * <p>id(0x6a9)</p>
     * <p>vtableId(61)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "ZOrderPosition", dispId = 0x6a9)
    com.sun.jna.platform.win32.WinNT.HRESULT getZOrderPosition(VARIANT RHS);
            
    /**
     * <p>id(0x6aa)</p>
     * <p>vtableId(62)</p>
     * @param RHS [out] {@code Hyperlink}
     */
    @ComProperty(name = "Hyperlink", dispId = 0x6aa)
    com.sun.jna.platform.win32.WinNT.HRESULT getHyperlink(VARIANT RHS);
            
    /**
     * <p>id(0x6ab)</p>
     * <p>vtableId(63)</p>
     * @param RHS [out] {@code eu.doppel_helix.jna.tlb.office2.MsoBlackWhiteMode}
     */
    @ComProperty(name = "BlackWhiteMode", dispId = 0x6ab)
    com.sun.jna.platform.win32.WinNT.HRESULT getBlackWhiteMode(VARIANT RHS);
            
    /**
     * <p>id(0x6ab)</p>
     * <p>vtableId(64)</p>
     * @param RHS [in] {@code eu.doppel_helix.jna.tlb.office2.MsoBlackWhiteMode}
     */
    @ComProperty(name = "BlackWhiteMode", dispId = 0x6ab)
    com.sun.jna.platform.win32.WinNT.HRESULT setBlackWhiteMode(eu.doppel_helix.jna.tlb.office2.MsoBlackWhiteMode RHS);
            
    /**
     * <p>id(0x6ac)</p>
     * <p>vtableId(65)</p>
     * @param RHS [out] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComProperty(name = "DrawingObject", dispId = 0x6ac)
    com.sun.jna.platform.win32.WinNT.HRESULT getDrawingObject(VARIANT RHS);
            
    /**
     * <p>id(0x254)</p>
     * <p>vtableId(66)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "OnAction", dispId = 0x254)
    com.sun.jna.platform.win32.WinNT.HRESULT getOnAction(VARIANT RHS);
            
    /**
     * <p>id(0x254)</p>
     * <p>vtableId(67)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "OnAction", dispId = 0x254)
    com.sun.jna.platform.win32.WinNT.HRESULT setOnAction(String RHS);
            
    /**
     * <p>id(0x10d)</p>
     * <p>vtableId(68)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "Locked", dispId = 0x10d)
    com.sun.jna.platform.win32.WinNT.HRESULT getLocked(VARIANT RHS);
            
    /**
     * <p>id(0x10d)</p>
     * <p>vtableId(69)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "Locked", dispId = 0x10d)
    com.sun.jna.platform.win32.WinNT.HRESULT setLocked(Boolean RHS);
            
    /**
     * <p>id(0x26c)</p>
     * <p>vtableId(70)</p>
     * @param RHS [out] {@code Range}
     */
    @ComProperty(name = "TopLeftCell", dispId = 0x26c)
    com.sun.jna.platform.win32.WinNT.HRESULT getTopLeftCell(VARIANT RHS);
            
    /**
     * <p>id(0x267)</p>
     * <p>vtableId(71)</p>
     * @param RHS [out] {@code Range}
     */
    @ComProperty(name = "BottomRightCell", dispId = 0x267)
    com.sun.jna.platform.win32.WinNT.HRESULT getBottomRightCell(VARIANT RHS);
            
    /**
     * <p>id(0x269)</p>
     * <p>vtableId(72)</p>
     * @param RHS [out] {@code XlPlacement}
     */
    @ComProperty(name = "Placement", dispId = 0x269)
    com.sun.jna.platform.win32.WinNT.HRESULT getPlacement(VARIANT RHS);
            
    /**
     * <p>id(0x269)</p>
     * <p>vtableId(73)</p>
     * @param RHS [in] {@code XlPlacement}
     */
    @ComProperty(name = "Placement", dispId = 0x269)
    com.sun.jna.platform.win32.WinNT.HRESULT setPlacement(XlPlacement RHS);
            
    /**
     * <p>id(0x227)</p>
     * <p>vtableId(74)</p>
     */
    @ComMethod(name = "Copy", dispId = 0x227)
    com.sun.jna.platform.win32.WinNT.HRESULT Copy();
            
    /**
     * <p>id(0x235)</p>
     * <p>vtableId(75)</p>
     */
    @ComMethod(name = "Cut", dispId = 0x235)
    com.sun.jna.platform.win32.WinNT.HRESULT Cut();
            
    /**
     * <p>id(0xd5)</p>
     * <p>vtableId(76)</p>
     * @param Appearance [in, optional] {@code Object}
     * @param Format [in, optional] {@code Object}
     */
    @ComMethod(name = "CopyPicture", dispId = 0xd5)
    com.sun.jna.platform.win32.WinNT.HRESULT CopyPicture(Object Appearance,
            Object Format);
            
    /**
     * <p>id(0x6ad)</p>
     * <p>vtableId(77)</p>
     * @param RHS [out] {@code ControlFormat}
     */
    @ComProperty(name = "ControlFormat", dispId = 0x6ad)
    com.sun.jna.platform.win32.WinNT.HRESULT getControlFormat(VARIANT RHS);
            
    /**
     * <p>id(0x6ae)</p>
     * <p>vtableId(78)</p>
     * @param RHS [out] {@code LinkFormat}
     */
    @ComProperty(name = "LinkFormat", dispId = 0x6ae)
    com.sun.jna.platform.win32.WinNT.HRESULT getLinkFormat(VARIANT RHS);
            
    /**
     * <p>id(0x6af)</p>
     * <p>vtableId(79)</p>
     * @param RHS [out] {@code OLEFormat}
     */
    @ComProperty(name = "OLEFormat", dispId = 0x6af)
    com.sun.jna.platform.win32.WinNT.HRESULT getOLEFormat(VARIANT RHS);
            
    /**
     * <p>id(0x6b0)</p>
     * <p>vtableId(80)</p>
     * @param RHS [out] {@code XlFormControl}
     */
    @ComProperty(name = "FormControlType", dispId = 0x6b0)
    com.sun.jna.platform.win32.WinNT.HRESULT getFormControlType(VARIANT RHS);
            
    /**
     * <p>id(0x763)</p>
     * <p>vtableId(81)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "AlternativeText", dispId = 0x763)
    com.sun.jna.platform.win32.WinNT.HRESULT getAlternativeText(VARIANT RHS);
            
    /**
     * <p>id(0x763)</p>
     * <p>vtableId(82)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "AlternativeText", dispId = 0x763)
    com.sun.jna.platform.win32.WinNT.HRESULT setAlternativeText(String RHS);
            
    /**
     * <p>id(0x764)</p>
     * <p>vtableId(83)</p>
     * @param RHS [out] {@code eu.doppel_helix.jna.tlb.office2.Script}
     */
    @ComProperty(name = "Script", dispId = 0x764)
    com.sun.jna.platform.win32.WinNT.HRESULT getScript(VARIANT RHS);
            
    /**
     * <p>id(0x875)</p>
     * <p>vtableId(84)</p>
     * @param RHS [out] {@code eu.doppel_helix.jna.tlb.office2.DiagramNode}
     */
    @ComProperty(name = "DiagramNode", dispId = 0x875)
    com.sun.jna.platform.win32.WinNT.HRESULT getDiagramNode(VARIANT RHS);
            
    /**
     * <p>id(0x876)</p>
     * <p>vtableId(85)</p>
     * @param RHS [out] {@code eu.doppel_helix.jna.tlb.office2.MsoTriState}
     */
    @ComProperty(name = "HasDiagramNode", dispId = 0x876)
    com.sun.jna.platform.win32.WinNT.HRESULT getHasDiagramNode(VARIANT RHS);
            
    /**
     * <p>id(0x877)</p>
     * <p>vtableId(86)</p>
     * @param RHS [out] {@code Diagram}
     */
    @ComProperty(name = "Diagram", dispId = 0x877)
    com.sun.jna.platform.win32.WinNT.HRESULT getDiagram(VARIANT RHS);
            
    /**
     * <p>id(0x878)</p>
     * <p>vtableId(87)</p>
     * @param RHS [out] {@code eu.doppel_helix.jna.tlb.office2.MsoTriState}
     */
    @ComProperty(name = "HasDiagram", dispId = 0x878)
    com.sun.jna.platform.win32.WinNT.HRESULT getHasDiagram(VARIANT RHS);
            
    /**
     * <p>id(0x879)</p>
     * <p>vtableId(88)</p>
     * @param RHS [out] {@code eu.doppel_helix.jna.tlb.office2.MsoTriState}
     */
    @ComProperty(name = "Child", dispId = 0x879)
    com.sun.jna.platform.win32.WinNT.HRESULT getChild(VARIANT RHS);
            
    /**
     * <p>id(0x87a)</p>
     * <p>vtableId(89)</p>
     * @param RHS [out] {@code Shape}
     */
    @ComProperty(name = "ParentGroup", dispId = 0x87a)
    com.sun.jna.platform.win32.WinNT.HRESULT getParentGroup(VARIANT RHS);
            
    /**
     * <p>id(0x87b)</p>
     * <p>vtableId(90)</p>
     * @param RHS [out] {@code eu.doppel_helix.jna.tlb.office2.CanvasShapes}
     */
    @ComProperty(name = "CanvasItems", dispId = 0x87b)
    com.sun.jna.platform.win32.WinNT.HRESULT getCanvasItems(VARIANT RHS);
            
    /**
     * <p>id(0x23a)</p>
     * <p>vtableId(91)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "ID", dispId = 0x23a)
    com.sun.jna.platform.win32.WinNT.HRESULT getID(VARIANT RHS);
            
    /**
     * <p>id(0x87c)</p>
     * <p>vtableId(92)</p>
     * @param Increment [in] {@code Float}
     */
    @ComMethod(name = "CanvasCropLeft", dispId = 0x87c)
    com.sun.jna.platform.win32.WinNT.HRESULT CanvasCropLeft(Float Increment);
            
    /**
     * <p>id(0x87d)</p>
     * <p>vtableId(93)</p>
     * @param Increment [in] {@code Float}
     */
    @ComMethod(name = "CanvasCropTop", dispId = 0x87d)
    com.sun.jna.platform.win32.WinNT.HRESULT CanvasCropTop(Float Increment);
            
    /**
     * <p>id(0x87e)</p>
     * <p>vtableId(94)</p>
     * @param Increment [in] {@code Float}
     */
    @ComMethod(name = "CanvasCropRight", dispId = 0x87e)
    com.sun.jna.platform.win32.WinNT.HRESULT CanvasCropRight(Float Increment);
            
    /**
     * <p>id(0x87f)</p>
     * <p>vtableId(95)</p>
     * @param Increment [in] {@code Float}
     */
    @ComMethod(name = "CanvasCropBottom", dispId = 0x87f)
    com.sun.jna.platform.win32.WinNT.HRESULT CanvasCropBottom(Float Increment);
            
    /**
     * <p>id(0x7)</p>
     * <p>vtableId(96)</p>
     * @param RHS [out] {@code Chart}
     */
    @ComProperty(name = "Chart", dispId = 0x7)
    com.sun.jna.platform.win32.WinNT.HRESULT getChart(VARIANT RHS);
            
    /**
     * <p>id(0xa62)</p>
     * <p>vtableId(97)</p>
     * @param RHS [out] {@code eu.doppel_helix.jna.tlb.office2.MsoTriState}
     */
    @ComProperty(name = "HasChart", dispId = 0xa62)
    com.sun.jna.platform.win32.WinNT.HRESULT getHasChart(VARIANT RHS);
            
    /**
     * <p>id(0xa63)</p>
     * <p>vtableId(98)</p>
     * @param RHS [out] {@code eu.doppel_helix.jna.tlb.office2.TextFrame2}
     */
    @ComProperty(name = "TextFrame2", dispId = 0xa63)
    com.sun.jna.platform.win32.WinNT.HRESULT getTextFrame2(VARIANT RHS);
            
    /**
     * <p>id(0xa64)</p>
     * <p>vtableId(99)</p>
     * @param RHS [out] {@code eu.doppel_helix.jna.tlb.office2.MsoShapeStyleIndex}
     */
    @ComProperty(name = "ShapeStyle", dispId = 0xa64)
    com.sun.jna.platform.win32.WinNT.HRESULT getShapeStyle(VARIANT RHS);
            
    /**
     * <p>id(0xa64)</p>
     * <p>vtableId(100)</p>
     * @param RHS [in] {@code eu.doppel_helix.jna.tlb.office2.MsoShapeStyleIndex}
     */
    @ComProperty(name = "ShapeStyle", dispId = 0xa64)
    com.sun.jna.platform.win32.WinNT.HRESULT setShapeStyle(eu.doppel_helix.jna.tlb.office2.MsoShapeStyleIndex RHS);
            
    /**
     * <p>id(0xa65)</p>
     * <p>vtableId(101)</p>
     * @param RHS [out] {@code eu.doppel_helix.jna.tlb.office2.MsoBackgroundStyleIndex}
     */
    @ComProperty(name = "BackgroundStyle", dispId = 0xa65)
    com.sun.jna.platform.win32.WinNT.HRESULT getBackgroundStyle(VARIANT RHS);
            
    /**
     * <p>id(0xa65)</p>
     * <p>vtableId(102)</p>
     * @param RHS [in] {@code eu.doppel_helix.jna.tlb.office2.MsoBackgroundStyleIndex}
     */
    @ComProperty(name = "BackgroundStyle", dispId = 0xa65)
    com.sun.jna.platform.win32.WinNT.HRESULT setBackgroundStyle(eu.doppel_helix.jna.tlb.office2.MsoBackgroundStyleIndex RHS);
            
    /**
     * <p>id(0xa66)</p>
     * <p>vtableId(103)</p>
     * @param RHS [out] {@code eu.doppel_helix.jna.tlb.office2.SoftEdgeFormat}
     */
    @ComProperty(name = "SoftEdge", dispId = 0xa66)
    com.sun.jna.platform.win32.WinNT.HRESULT getSoftEdge(VARIANT RHS);
            
    /**
     * <p>id(0xa67)</p>
     * <p>vtableId(104)</p>
     * @param RHS [out] {@code eu.doppel_helix.jna.tlb.office2.GlowFormat}
     */
    @ComProperty(name = "Glow", dispId = 0xa67)
    com.sun.jna.platform.win32.WinNT.HRESULT getGlow(VARIANT RHS);
            
    /**
     * <p>id(0xa68)</p>
     * <p>vtableId(105)</p>
     * @param RHS [out] {@code eu.doppel_helix.jna.tlb.office2.ReflectionFormat}
     */
    @ComProperty(name = "Reflection", dispId = 0xa68)
    com.sun.jna.platform.win32.WinNT.HRESULT getReflection(VARIANT RHS);
            
    /**
     * <p>id(0xb66)</p>
     * <p>vtableId(106)</p>
     * @param RHS [out] {@code eu.doppel_helix.jna.tlb.office2.MsoTriState}
     */
    @ComProperty(name = "HasSmartArt", dispId = 0xb66)
    com.sun.jna.platform.win32.WinNT.HRESULT getHasSmartArt(VARIANT RHS);
            
    /**
     * <p>id(0xb67)</p>
     * <p>vtableId(107)</p>
     * @param RHS [out] {@code eu.doppel_helix.jna.tlb.office2.SmartArt}
     */
    @ComProperty(name = "SmartArt", dispId = 0xb67)
    com.sun.jna.platform.win32.WinNT.HRESULT getSmartArt(VARIANT RHS);
            
    /**
     * <p>id(0xc7)</p>
     * <p>vtableId(108)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "Title", dispId = 0xc7)
    com.sun.jna.platform.win32.WinNT.HRESULT getTitle(VARIANT RHS);
            
    /**
     * <p>id(0xc7)</p>
     * <p>vtableId(109)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "Title", dispId = 0xc7)
    com.sun.jna.platform.win32.WinNT.HRESULT setTitle(String RHS);
            
    
}