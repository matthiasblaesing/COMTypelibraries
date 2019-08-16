
package eu.doppel_helix.jna.tlb.excel1;

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
     * @param pos [in, optional] {@code eu.doppel_helix.jna.tlb.office2.DiagramNode}
     * @param nodeType [in, optional] {@code eu.doppel_helix.jna.tlb.office2.DiagramNode}
     */
    @ComMethod(name = "AddNode", dispId = 0xa)
    eu.doppel_helix.jna.tlb.office2.DiagramNode AddNode(eu.doppel_helix.jna.tlb.office2.DiagramNode pos,
            eu.doppel_helix.jna.tlb.office2.DiagramNode nodeType);
            
    /**
     * <p>id(0xb)</p>
     * <p>vtableId(10)</p>
     */
    @ComMethod(name = "Delete", dispId = 0xb)
    void Delete();
            
    /**
     * <p>id(0xc)</p>
     * <p>vtableId(11)</p>
     * @param pTargetNode [in] {@code eu.doppel_helix.jna.tlb.office2.DiagramNode}
     * @param pos [in] {@code eu.doppel_helix.jna.tlb.office2.DiagramNode}
     */
    @ComMethod(name = "MoveNode", dispId = 0xc)
    void MoveNode(eu.doppel_helix.jna.tlb.office2.DiagramNode pTargetNode,
            eu.doppel_helix.jna.tlb.office2.DiagramNode pos);
            
    /**
     * <p>id(0xd)</p>
     * <p>vtableId(12)</p>
     * @param pTargetNode [in] {@code eu.doppel_helix.jna.tlb.office2.DiagramNode}
     */
    @ComMethod(name = "ReplaceNode", dispId = 0xd)
    void ReplaceNode(eu.doppel_helix.jna.tlb.office2.DiagramNode pTargetNode);
            
    /**
     * <p>id(0xe)</p>
     * <p>vtableId(13)</p>
     * @param pTargetNode [in] {@code eu.doppel_helix.jna.tlb.office2.DiagramNode}
     * @param swapChildren [in, optional] {@code Boolean}
     */
    @ComMethod(name = "SwapNode", dispId = 0xe)
    void SwapNode(eu.doppel_helix.jna.tlb.office2.DiagramNode pTargetNode,
            Boolean swapChildren);
            
    /**
     * <p>id(0xf)</p>
     * <p>vtableId(14)</p>
     * @param copyChildren [in] {@code Boolean}
     * @param pTargetNode [in] {@code eu.doppel_helix.jna.tlb.office2.DiagramNode}
     * @param pos [in, optional] {@code eu.doppel_helix.jna.tlb.office2.DiagramNode}
     */
    @ComMethod(name = "CloneNode", dispId = 0xf)
    eu.doppel_helix.jna.tlb.office2.DiagramNode CloneNode(Boolean copyChildren,
            eu.doppel_helix.jna.tlb.office2.DiagramNode pTargetNode,
            eu.doppel_helix.jna.tlb.office2.DiagramNode pos);
            
    /**
     * <p>id(0x10)</p>
     * <p>vtableId(15)</p>
     * @param pReceivingNode [in] {@code eu.doppel_helix.jna.tlb.office2.DiagramNode}
     */
    @ComMethod(name = "TransferChildren", dispId = 0x10)
    void TransferChildren(eu.doppel_helix.jna.tlb.office2.DiagramNode pReceivingNode);
            
    /**
     * <p>id(0x11)</p>
     * <p>vtableId(16)</p>
     */
    @ComMethod(name = "NextNode", dispId = 0x11)
    eu.doppel_helix.jna.tlb.office2.DiagramNode NextNode();
            
    /**
     * <p>id(0x12)</p>
     * <p>vtableId(17)</p>
     */
    @ComMethod(name = "PrevNode", dispId = 0x12)
    eu.doppel_helix.jna.tlb.office2.DiagramNode PrevNode();
            
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
    eu.doppel_helix.jna.tlb.office2.DiagramNode getChildren();
            
    /**
     * <p>id(0x66)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "Shape", dispId = 0x66)
    eu.doppel_helix.jna.tlb.office2.DiagramNode getShape();
            
    /**
     * <p>id(0x67)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "Root", dispId = 0x67)
    eu.doppel_helix.jna.tlb.office2.DiagramNode getRoot();
            
    /**
     * <p>id(0x68)</p>
     * <p>vtableId(22)</p>
     */
    @ComProperty(name = "Diagram", dispId = 0x68)
    eu.doppel_helix.jna.tlb.office2.DiagramNode getDiagram();
            
    /**
     * <p>id(0x69)</p>
     * <p>vtableId(23)</p>
     */
    @ComProperty(name = "Layout", dispId = 0x69)
    eu.doppel_helix.jna.tlb.office2.DiagramNode getLayout();
            
    /**
     * <p>id(0x69)</p>
     * <p>vtableId(24)</p>
     * @param param0 [in] {@code eu.doppel_helix.jna.tlb.office2.DiagramNode}
     */
    @ComProperty(name = "Layout", dispId = 0x69)
    void setLayout(eu.doppel_helix.jna.tlb.office2.DiagramNode param0);
            
    /**
     * <p>id(0x6a)</p>
     * <p>vtableId(25)</p>
     */
    @ComProperty(name = "TextShape", dispId = 0x6a)
    eu.doppel_helix.jna.tlb.office2.DiagramNode getTextShape();
            
    
}