
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000209E9-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000209E9-0000-0000-C000-000000000046}")
public interface DiagramNode {
    /**
     * <p>id(0x3e8)</p>
     */
    @ComProperty(name = "Application", dispId = 0x3e8)
    Application getApplication();
            
    /**
     * <p>id(0x3e9)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x3e9)
    Integer getCreator();
            
    /**
     * <p>id(0x64)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x64)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x65)</p>
     */
    @ComProperty(name = "Children", dispId = 0x65)
    DiagramNodeChildren getChildren();
            
    /**
     * <p>id(0x66)</p>
     */
    @ComProperty(name = "Shape", dispId = 0x66)
    Shape getShape();
            
    /**
     * <p>id(0x67)</p>
     */
    @ComProperty(name = "Root", dispId = 0x67)
    DiagramNode getRoot();
            
    /**
     * <p>id(0x68)</p>
     */
    @ComProperty(name = "Diagram", dispId = 0x68)
    Diagram getDiagram();
            
    /**
     * <p>id(0x69)</p>
     */
    @ComProperty(name = "Layout", dispId = 0x69)
    eu.doppel_helix.jna.tlb.office2.MsoOrgChartLayoutType getLayout();
            
    /**
     * <p>id(0x69)</p>
     */
    @ComProperty(name = "Layout", dispId = 0x69)
    void setLayout(eu.doppel_helix.jna.tlb.office2.MsoOrgChartLayoutType param0);
            
    /**
     * <p>id(0x6a)</p>
     */
    @ComProperty(name = "TextShape", dispId = 0x6a)
    Shape getTextShape();
            
    /**
     * <p>id(0xa)</p>
     */
    @ComMethod(name = "AddNode", dispId = 0xa)
    DiagramNode AddNode(eu.doppel_helix.jna.tlb.office2.MsoRelativeNodePosition Pos,
            eu.doppel_helix.jna.tlb.office2.MsoDiagramNodeType NodeType);
            
    /**
     * <p>id(0xb)</p>
     */
    @ComMethod(name = "Delete", dispId = 0xb)
    void Delete();
            
    /**
     * <p>id(0xc)</p>
     */
    @ComMethod(name = "MoveNode", dispId = 0xc)
    void MoveNode(VARIANT TargetNode,
            eu.doppel_helix.jna.tlb.office2.MsoRelativeNodePosition Pos);
            
    /**
     * <p>id(0xd)</p>
     */
    @ComMethod(name = "ReplaceNode", dispId = 0xd)
    void ReplaceNode(VARIANT TargetNode);
            
    /**
     * <p>id(0xe)</p>
     */
    @ComMethod(name = "SwapNode", dispId = 0xe)
    void SwapNode(VARIANT TargetNode,
            eu.doppel_helix.jna.tlb.office2.MsoRelativeNodePosition Pos);
            
    /**
     * <p>id(0xf)</p>
     */
    @ComMethod(name = "CloneNode", dispId = 0xf)
    DiagramNode CloneNode(Boolean copyChildren,
            VARIANT TargetNode,
            eu.doppel_helix.jna.tlb.office2.MsoRelativeNodePosition Pos);
            
    /**
     * <p>id(0x10)</p>
     */
    @ComMethod(name = "TransferChildren", dispId = 0x10)
    void TransferChildren(VARIANT ReceivingNode);
            
    /**
     * <p>id(0x11)</p>
     */
    @ComMethod(name = "NextNode", dispId = 0x11)
    DiagramNode NextNode();
            
    /**
     * <p>id(0x12)</p>
     */
    @ComMethod(name = "PrevNode", dispId = 0x12)
    DiagramNode PrevNode();
            
    
}