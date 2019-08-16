
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C0370-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C0370-0000-0000-C000-000000000046}")
public interface DiagramNode extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0xa)</p>
     * <p>vtableId(9)</p>
     * @param Pos [in, optional] {@code MsoRelativeNodePosition}
     * @param NodeType [in, optional] {@code MsoDiagramNodeType}
     */
    @ComMethod(name = "AddNode", dispId = 0xa)
    DiagramNode AddNode(MsoRelativeNodePosition Pos,
            MsoDiagramNodeType NodeType);
            
    /**
     * <p>id(0xb)</p>
     * <p>vtableId(10)</p>
     */
    @ComMethod(name = "Delete", dispId = 0xb)
    void Delete();
            
    /**
     * <p>id(0xc)</p>
     * <p>vtableId(11)</p>
     * @param TargetNode [in] {@code DiagramNode}
     * @param Pos [in] {@code MsoRelativeNodePosition}
     */
    @ComMethod(name = "MoveNode", dispId = 0xc)
    void MoveNode(DiagramNode TargetNode,
            MsoRelativeNodePosition Pos);
            
    /**
     * <p>id(0xd)</p>
     * <p>vtableId(12)</p>
     * @param TargetNode [in] {@code DiagramNode}
     */
    @ComMethod(name = "ReplaceNode", dispId = 0xd)
    void ReplaceNode(DiagramNode TargetNode);
            
    /**
     * <p>id(0xe)</p>
     * <p>vtableId(13)</p>
     * @param TargetNode [in] {@code DiagramNode}
     * @param SwapChildren [in, optional] {@code Boolean}
     */
    @ComMethod(name = "SwapNode", dispId = 0xe)
    void SwapNode(DiagramNode TargetNode,
            Boolean SwapChildren);
            
    /**
     * <p>id(0xf)</p>
     * <p>vtableId(14)</p>
     * @param CopyChildren [in] {@code Boolean}
     * @param TargetNode [in] {@code DiagramNode}
     * @param Pos [in, optional] {@code MsoRelativeNodePosition}
     */
    @ComMethod(name = "CloneNode", dispId = 0xf)
    DiagramNode CloneNode(Boolean CopyChildren,
            DiagramNode TargetNode,
            MsoRelativeNodePosition Pos);
            
    /**
     * <p>id(0x10)</p>
     * <p>vtableId(15)</p>
     * @param ReceivingNode [in] {@code DiagramNode}
     */
    @ComMethod(name = "TransferChildren", dispId = 0x10)
    void TransferChildren(DiagramNode ReceivingNode);
            
    /**
     * <p>id(0x11)</p>
     * <p>vtableId(16)</p>
     */
    @ComMethod(name = "NextNode", dispId = 0x11)
    DiagramNode NextNode();
            
    /**
     * <p>id(0x12)</p>
     * <p>vtableId(17)</p>
     */
    @ComMethod(name = "PrevNode", dispId = 0x12)
    DiagramNode PrevNode();
            
    /**
     * <p>id(0x64)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x64)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x65)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "Children", dispId = 0x65)
    DiagramNodeChildren getChildren();
            
    /**
     * <p>id(0x66)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "Shape", dispId = 0x66)
    Shape getShape();
            
    /**
     * <p>id(0x67)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "Root", dispId = 0x67)
    DiagramNode getRoot();
            
    /**
     * <p>id(0x68)</p>
     * <p>vtableId(22)</p>
     */
    @ComProperty(name = "Diagram", dispId = 0x68)
    IMsoDiagram getDiagram();
            
    /**
     * <p>id(0x69)</p>
     * <p>vtableId(23)</p>
     */
    @ComProperty(name = "Layout", dispId = 0x69)
    MsoOrgChartLayoutType getLayout();
            
    /**
     * <p>id(0x69)</p>
     * <p>vtableId(24)</p>
     * @param param0 [in] {@code MsoOrgChartLayoutType}
     */
    @ComProperty(name = "Layout", dispId = 0x69)
    void setLayout(MsoOrgChartLayoutType param0);
            
    /**
     * <p>id(0x6a)</p>
     * <p>vtableId(25)</p>
     */
    @ComProperty(name = "TextShape", dispId = 0x6a)
    Shape getTextShape();
            
    
}