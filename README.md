[FrostBytes.drawio](https://github.com/user-attachments/files/23511354/FrostBytes.drawio)# 🍨 FrostByte-Creamery App 🍦

Capstone2 YUU.

The Ice Cream Shop Ordering System is a Java-based console application that allows customers to browse a menu,
create customized ice cream, ice cream cake, smoothie orders, and receive a detailed receipt upon order.

---

## Features 🏪
- 📋 Interactive Menu- Users can browse available items.
- ✅ Customizable Orders - User can pick size, flavors, and toppings.
- 🧾 Order Management - User orders are stored and calculated in the order class, and display's price to the user when checking out.
- 🧩 Receipt - When an order is completed, the system automatically enters it into the "receipts.txt"

---  

### Tech Stack
Java 17, IntelliJ IDEA, Object-Oriented Programming Principles

---

### Home Menu

1) Order
0) Cancel

### Order Menu

1) Order Ice cream
2) Order Smoothie
3) Order Ice cream Cake
4) CheckOut
5) Menu
0) Cancel

---

### Interesting code


---

## Project Structure 


---

## UML Diagram
[Uploading F<mxfile host="app.diagrams.net" agent="Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0" version="28.2.9">
  <diagram name="Page-1" id="dwbYevj4Cv5Vr4sU4vnd">
    <mxGraphModel dx="1034" dy="970" grid="0" gridSize="10" guides="1" tooltips="1" connect="1" arrows="1" fold="1" page="0" pageScale="1" pageWidth="850" pageHeight="1100" background="none" math="0" shadow="0">
      <root>
        <mxCell id="0" />
        <mxCell id="1" parent="0" />
        <mxCell id="xGrtgyR2Zx4XB9vofMDu-12" value="MenuItem" style="swimlane;fontStyle=1;align=center;verticalAlign=top;childLayout=stackLayout;horizontal=1;startSize=26;horizontalStack=0;resizeParent=1;resizeParentMax=0;resizeLast=0;collapsible=1;marginBottom=0;whiteSpace=wrap;html=1;" vertex="1" parent="1">
          <mxGeometry x="90" y="-40" width="150" height="158" as="geometry" />
        </mxCell>
        <mxCell id="xGrtgyR2Zx4XB9vofMDu-13" value="-&amp;nbsp; name: String&lt;div&gt;-&amp;nbsp; price: double&lt;/div&gt;&lt;div&gt;-&amp;nbsp; size: String&lt;/div&gt;&lt;div&gt;-&amp;nbsp; toppings: List&amp;lt;String&amp;gt;&lt;/div&gt;&lt;div&gt;-&amp;nbsp; flavors: List&amp;lt;String&amp;gt;&lt;/div&gt;" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" vertex="1" parent="xGrtgyR2Zx4XB9vofMDu-12">
          <mxGeometry y="26" width="150" height="84" as="geometry" />
        </mxCell>
        <mxCell id="xGrtgyR2Zx4XB9vofMDu-14" value="" style="line;strokeWidth=1;fillColor=none;align=left;verticalAlign=middle;spacingTop=-1;spacingLeft=3;spacingRight=3;rotatable=0;labelPosition=right;points=[];portConstraint=eastwest;strokeColor=inherit;" vertex="1" parent="xGrtgyR2Zx4XB9vofMDu-12">
          <mxGeometry y="110" width="150" height="8" as="geometry" />
        </mxCell>
        <mxCell id="xGrtgyR2Zx4XB9vofMDu-15" value="+&amp;nbsp; getDescription(): String" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" vertex="1" parent="xGrtgyR2Zx4XB9vofMDu-12">
          <mxGeometry y="118" width="150" height="40" as="geometry" />
        </mxCell>
        <mxCell id="xGrtgyR2Zx4XB9vofMDu-17" value="IceCream" style="swimlane;fontStyle=1;align=center;verticalAlign=top;childLayout=stackLayout;horizontal=1;startSize=26;horizontalStack=0;resizeParent=1;resizeParentMax=0;resizeLast=0;collapsible=1;marginBottom=0;whiteSpace=wrap;html=1;" vertex="1" parent="1">
          <mxGeometry x="30" y="240" width="160" height="86" as="geometry" />
        </mxCell>
        <mxCell id="xGrtgyR2Zx4XB9vofMDu-18" value="-&amp;nbsp; container: String" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" vertex="1" parent="xGrtgyR2Zx4XB9vofMDu-17">
          <mxGeometry y="26" width="160" height="26" as="geometry" />
        </mxCell>
        <mxCell id="xGrtgyR2Zx4XB9vofMDu-19" value="" style="line;strokeWidth=1;fillColor=none;align=left;verticalAlign=middle;spacingTop=-1;spacingLeft=3;spacingRight=3;rotatable=0;labelPosition=right;points=[];portConstraint=eastwest;strokeColor=inherit;" vertex="1" parent="xGrtgyR2Zx4XB9vofMDu-17">
          <mxGeometry y="52" width="160" height="8" as="geometry" />
        </mxCell>
        <mxCell id="xGrtgyR2Zx4XB9vofMDu-20" value="+&amp;nbsp; getDescription()" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" vertex="1" parent="xGrtgyR2Zx4XB9vofMDu-17">
          <mxGeometry y="60" width="160" height="26" as="geometry" />
        </mxCell>
        <mxCell id="xGrtgyR2Zx4XB9vofMDu-25" value="Smoothie" style="swimlane;fontStyle=1;align=center;verticalAlign=top;childLayout=stackLayout;horizontal=1;startSize=26;horizontalStack=0;resizeParent=1;resizeParentMax=0;resizeLast=0;collapsible=1;marginBottom=0;whiteSpace=wrap;html=1;" vertex="1" parent="1">
          <mxGeometry x="240" y="240" width="160" height="52" as="geometry" />
        </mxCell>
        <mxCell id="xGrtgyR2Zx4XB9vofMDu-28" value="+&amp;nbsp; getDescription()" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" vertex="1" parent="xGrtgyR2Zx4XB9vofMDu-25">
          <mxGeometry y="26" width="160" height="26" as="geometry" />
        </mxCell>
        <mxCell id="xGrtgyR2Zx4XB9vofMDu-29" value="IceCreamCake" style="swimlane;fontStyle=1;align=center;verticalAlign=top;childLayout=stackLayout;horizontal=1;startSize=26;horizontalStack=0;resizeParent=1;resizeParentMax=0;resizeLast=0;collapsible=1;marginBottom=0;whiteSpace=wrap;html=1;" vertex="1" parent="1">
          <mxGeometry x="440" y="240" width="160" height="52" as="geometry" />
        </mxCell>
        <mxCell id="xGrtgyR2Zx4XB9vofMDu-32" value="+&amp;nbsp; getDescription()" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" vertex="1" parent="xGrtgyR2Zx4XB9vofMDu-29">
          <mxGeometry y="26" width="160" height="26" as="geometry" />
        </mxCell>
        <mxCell id="xGrtgyR2Zx4XB9vofMDu-33" value="Order" style="swimlane;fontStyle=1;align=center;verticalAlign=top;childLayout=stackLayout;horizontal=1;startSize=26;horizontalStack=0;resizeParent=1;resizeParentMax=0;resizeLast=0;collapsible=1;marginBottom=0;whiteSpace=wrap;html=1;" vertex="1" parent="1">
          <mxGeometry x="340" y="-40" width="190" height="130" as="geometry" />
        </mxCell>
        <mxCell id="xGrtgyR2Zx4XB9vofMDu-34" value="-&amp;nbsp; menuItems: List&amp;lt;MenuITems&amp;gt;&lt;div&gt;- orderDate: LocalDateTime&lt;br&gt;&lt;div&gt;&lt;br&gt;&lt;/div&gt;&lt;/div&gt;" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" vertex="1" parent="xGrtgyR2Zx4XB9vofMDu-33">
          <mxGeometry y="26" width="190" height="44" as="geometry" />
        </mxCell>
        <mxCell id="xGrtgyR2Zx4XB9vofMDu-35" value="" style="line;strokeWidth=1;fillColor=none;align=left;verticalAlign=middle;spacingTop=-1;spacingLeft=3;spacingRight=3;rotatable=0;labelPosition=right;points=[];portConstraint=eastwest;strokeColor=inherit;" vertex="1" parent="xGrtgyR2Zx4XB9vofMDu-33">
          <mxGeometry y="70" width="190" height="8" as="geometry" />
        </mxCell>
        <mxCell id="xGrtgyR2Zx4XB9vofMDu-36" value="+&amp;nbsp; addMenuItem()&lt;div&gt;+&amp;nbsp; getMenuItem()&lt;/div&gt;&lt;div&gt;+ calculatePrice();double&lt;/div&gt;&lt;div&gt;&lt;br&gt;&lt;/div&gt;" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" vertex="1" parent="xGrtgyR2Zx4XB9vofMDu-33">
          <mxGeometry y="78" width="190" height="52" as="geometry" />
        </mxCell>
        <mxCell id="xGrtgyR2Zx4XB9vofMDu-41" value="Receipt" style="swimlane;fontStyle=1;align=center;verticalAlign=top;childLayout=stackLayout;horizontal=1;startSize=26;horizontalStack=0;resizeParent=1;resizeParentMax=0;resizeLast=0;collapsible=1;marginBottom=0;whiteSpace=wrap;html=1;" vertex="1" parent="1">
          <mxGeometry x="650" y="240" width="160" height="86" as="geometry" />
        </mxCell>
        <mxCell id="xGrtgyR2Zx4XB9vofMDu-42" value="-&amp;nbsp; order: order" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" vertex="1" parent="xGrtgyR2Zx4XB9vofMDu-41">
          <mxGeometry y="26" width="160" height="26" as="geometry" />
        </mxCell>
        <mxCell id="xGrtgyR2Zx4XB9vofMDu-43" value="" style="line;strokeWidth=1;fillColor=none;align=left;verticalAlign=middle;spacingTop=-1;spacingLeft=3;spacingRight=3;rotatable=0;labelPosition=right;points=[];portConstraint=eastwest;strokeColor=inherit;" vertex="1" parent="xGrtgyR2Zx4XB9vofMDu-41">
          <mxGeometry y="52" width="160" height="8" as="geometry" />
        </mxCell>
        <mxCell id="xGrtgyR2Zx4XB9vofMDu-44" value="+ saveReceipt()" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" vertex="1" parent="xGrtgyR2Zx4XB9vofMDu-41">
          <mxGeometry y="60" width="160" height="26" as="geometry" />
        </mxCell>
        <mxCell id="xGrtgyR2Zx4XB9vofMDu-45" value="" style="endArrow=none;html=1;edgeStyle=orthogonalEdgeStyle;rounded=0;entryX=0.563;entryY=0;entryDx=0;entryDy=0;entryPerimeter=0;" edge="1" parent="1" target="xGrtgyR2Zx4XB9vofMDu-17">
          <mxGeometry relative="1" as="geometry">
            <mxPoint x="160" y="123" as="sourcePoint" />
            <mxPoint x="210" y="170" as="targetPoint" />
          </mxGeometry>
        </mxCell>
        <mxCell id="xGrtgyR2Zx4XB9vofMDu-46" value="parent" style="edgeLabel;resizable=0;html=1;align=left;verticalAlign=bottom;" connectable="0" vertex="1" parent="xGrtgyR2Zx4XB9vofMDu-45">
          <mxGeometry x="-1" relative="1" as="geometry" />
        </mxCell>
        <mxCell id="xGrtgyR2Zx4XB9vofMDu-47" value="child" style="edgeLabel;resizable=0;html=1;align=right;verticalAlign=bottom;" connectable="0" vertex="1" parent="xGrtgyR2Zx4XB9vofMDu-45">
          <mxGeometry x="1" relative="1" as="geometry" />
        </mxCell>
        <mxCell id="xGrtgyR2Zx4XB9vofMDu-48" value="" style="endArrow=none;html=1;edgeStyle=orthogonalEdgeStyle;rounded=0;entryX=0.552;entryY=-0.06;entryDx=0;entryDy=0;entryPerimeter=0;" edge="1" parent="1" target="xGrtgyR2Zx4XB9vofMDu-25">
          <mxGeometry relative="1" as="geometry">
            <mxPoint x="160" y="120" as="sourcePoint" />
            <mxPoint x="400" y="70" as="targetPoint" />
          </mxGeometry>
        </mxCell>
        <mxCell id="xGrtgyR2Zx4XB9vofMDu-49" value="parent" style="edgeLabel;resizable=0;html=1;align=left;verticalAlign=bottom;" connectable="0" vertex="1" parent="xGrtgyR2Zx4XB9vofMDu-48">
          <mxGeometry x="-1" relative="1" as="geometry" />
        </mxCell>
        <mxCell id="xGrtgyR2Zx4XB9vofMDu-50" value="child" style="edgeLabel;resizable=0;html=1;align=right;verticalAlign=bottom;" connectable="0" vertex="1" parent="xGrtgyR2Zx4XB9vofMDu-48">
          <mxGeometry x="1" relative="1" as="geometry" />
        </mxCell>
        <mxCell id="xGrtgyR2Zx4XB9vofMDu-51" value="" style="endArrow=none;html=1;edgeStyle=orthogonalEdgeStyle;rounded=0;entryX=0.5;entryY=0;entryDx=0;entryDy=0;" edge="1" parent="1" target="xGrtgyR2Zx4XB9vofMDu-29">
          <mxGeometry relative="1" as="geometry">
            <mxPoint x="280" y="120" as="sourcePoint" />
            <mxPoint x="400" y="70" as="targetPoint" />
          </mxGeometry>
        </mxCell>
        <mxCell id="xGrtgyR2Zx4XB9vofMDu-52" value="parent" style="edgeLabel;resizable=0;html=1;align=left;verticalAlign=bottom;" connectable="0" vertex="1" parent="xGrtgyR2Zx4XB9vofMDu-51">
          <mxGeometry x="-1" relative="1" as="geometry" />
        </mxCell>
        <mxCell id="xGrtgyR2Zx4XB9vofMDu-53" value="child" style="edgeLabel;resizable=0;html=1;align=right;verticalAlign=bottom;" connectable="0" vertex="1" parent="xGrtgyR2Zx4XB9vofMDu-51">
          <mxGeometry x="1" relative="1" as="geometry" />
        </mxCell>
        <mxCell id="xGrtgyR2Zx4XB9vofMDu-54" value="UserInterface" style="swimlane;fontStyle=1;align=center;verticalAlign=top;childLayout=stackLayout;horizontal=1;startSize=26;horizontalStack=0;resizeParent=1;resizeParentMax=0;resizeLast=0;collapsible=1;marginBottom=0;whiteSpace=wrap;html=1;" vertex="1" parent="1">
          <mxGeometry x="640" y="-40" width="160" height="200" as="geometry" />
        </mxCell>
        <mxCell id="xGrtgyR2Zx4XB9vofMDu-55" value="-&amp;nbsp; scanner: Scanner&lt;div&gt;-&amp;nbsp; order: Order&lt;/div&gt;&lt;div&gt;-&amp;nbsp; toppings, flavors&lt;/div&gt;" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" vertex="1" parent="xGrtgyR2Zx4XB9vofMDu-54">
          <mxGeometry y="26" width="160" height="54" as="geometry" />
        </mxCell>
        <mxCell id="xGrtgyR2Zx4XB9vofMDu-56" value="" style="line;strokeWidth=1;align=left;verticalAlign=middle;spacingTop=-1;spacingLeft=3;spacingRight=3;rotatable=0;labelPosition=right;points=[];portConstraint=eastwest;" vertex="1" parent="xGrtgyR2Zx4XB9vofMDu-54">
          <mxGeometry y="80" width="160" height="8" as="geometry" />
        </mxCell>
        <mxCell id="xGrtgyR2Zx4XB9vofMDu-57" value="&lt;span style=&quot;background-color: light-dark(#ffffff, var(--ge-dark-color, #121212));&quot;&gt;+&amp;nbsp; start()&lt;/span&gt;&lt;div&gt;&lt;span style=&quot;background-color: light-dark(#ffffff, var(--ge-dark-color, #121212));&quot;&gt;+&amp;nbsp; newOrder()&lt;/span&gt;&lt;/div&gt;&lt;div&gt;&lt;span style=&quot;background-color: light-dark(#ffffff, var(--ge-dark-color, #121212));&quot;&gt;+&amp;nbsp; orderIceCream()&lt;/span&gt;&lt;/div&gt;&lt;div&gt;&lt;span style=&quot;background-color: light-dark(#ffffff, var(--ge-dark-color, #121212));&quot;&gt;+&amp;nbsp; orderSmoothie()&lt;/span&gt;&lt;/div&gt;&lt;div&gt;&lt;span style=&quot;background-color: light-dark(#ffffff, var(--ge-dark-color, #121212));&quot;&gt;+&amp;nbsp; orderIceCreamCake()&lt;/span&gt;&lt;/div&gt;&lt;div&gt;&lt;span style=&quot;background-color: light-dark(#ffffff, var(--ge-dark-color, #121212));&quot;&gt;+&amp;nbsp; shopMenu&lt;/span&gt;&lt;/div&gt;&lt;div&gt;&lt;span style=&quot;background-color: light-dark(#ffffff, var(--ge-dark-color, #121212));&quot;&gt;+&amp;nbsp; checkout()&lt;/span&gt;&lt;/div&gt;" style="text;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" vertex="1" parent="xGrtgyR2Zx4XB9vofMDu-54">
          <mxGeometry y="88" width="160" height="112" as="geometry" />
        </mxCell>
        <mxCell id="xGrtgyR2Zx4XB9vofMDu-58" value="" style="endArrow=block;endFill=1;html=1;edgeStyle=orthogonalEdgeStyle;align=left;verticalAlign=top;rounded=0;" edge="1" parent="1">
          <mxGeometry x="-1" relative="1" as="geometry">
            <mxPoint x="240" y="20" as="sourcePoint" />
            <mxPoint x="340" y="20" as="targetPoint" />
          </mxGeometry>
        </mxCell>
        <mxCell id="xGrtgyR2Zx4XB9vofMDu-59" value="1" style="edgeLabel;resizable=0;html=1;align=left;verticalAlign=bottom;" connectable="0" vertex="1" parent="xGrtgyR2Zx4XB9vofMDu-58">
          <mxGeometry x="-1" relative="1" as="geometry" />
        </mxCell>
        <mxCell id="xGrtgyR2Zx4XB9vofMDu-60" value="" style="endArrow=block;endFill=1;html=1;edgeStyle=orthogonalEdgeStyle;align=left;verticalAlign=top;rounded=0;" edge="1" parent="1">
          <mxGeometry x="-1" relative="1" as="geometry">
            <mxPoint x="530" y="40" as="sourcePoint" />
            <mxPoint x="640" y="40" as="targetPoint" />
            <mxPoint as="offset" />
          </mxGeometry>
        </mxCell>
        <mxCell id="xGrtgyR2Zx4XB9vofMDu-61" value="1" style="edgeLabel;resizable=0;html=1;align=left;verticalAlign=bottom;" connectable="0" vertex="1" parent="xGrtgyR2Zx4XB9vofMDu-60">
          <mxGeometry x="-1" relative="1" as="geometry" />
        </mxCell>
        <mxCell id="xGrtgyR2Zx4XB9vofMDu-62" value="" style="endArrow=block;endFill=1;html=1;edgeStyle=orthogonalEdgeStyle;align=left;verticalAlign=top;rounded=0;exitX=0.395;exitY=-0.042;exitDx=0;exitDy=0;exitPerimeter=0;" edge="1" parent="1" source="xGrtgyR2Zx4XB9vofMDu-41">
          <mxGeometry x="-1" y="-22" relative="1" as="geometry">
            <mxPoint x="718" y="230" as="sourcePoint" />
            <mxPoint x="710" y="162" as="targetPoint" />
            <mxPoint x="-5" y="14" as="offset" />
          </mxGeometry>
        </mxCell>
        <mxCell id="xGrtgyR2Zx4XB9vofMDu-63" value="1" style="edgeLabel;resizable=0;html=1;align=left;verticalAlign=bottom;" connectable="0" vertex="1" parent="xGrtgyR2Zx4XB9vofMDu-62">
          <mxGeometry x="-1" relative="1" as="geometry" />
        </mxCell>
      </root>
    </mxGraphModel>
  </diagram>
</mxfile>
rostBytes.drawio…]()

---

### Extra pics of code



