//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.0 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.08.19 at 11:07:17 AM BST 
//

package com.google.earth.kml._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for boundaryType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name=&quot;boundaryType&quot;&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base=&quot;{http://www.w3.org/2001/XMLSchema}anyType&quot;&gt;
 *       &lt;all&gt;
 *         &lt;element name=&quot;LinearRing&quot; type=&quot;{http://earth.google.com/kml/2.1}LinearRingType&quot;/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "boundaryType", propOrder = {

})
@SuppressWarnings("all")
public class BoundaryType {

  @XmlElement(name = "LinearRing", required = true)
  protected LinearRingType linearRing;

  /**
   * Gets the value of the linearRing property.
   * 
   * @return possible object is {@link LinearRingType }
   * 
   */
  public LinearRingType getLinearRing() {
    return linearRing;
  }

  /**
   * Sets the value of the linearRing property.
   * 
   * @param value
   *          allowed object is {@link LinearRingType }
   * 
   */
  public void setLinearRing(LinearRingType value) {
    this.linearRing = value;
  }

}