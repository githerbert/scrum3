
package de.scrummies.scrumService;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BugFindBySearchStringResult" type="{http://www.fuldaai.de}ArrayOfBug" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "bugFindBySearchStringResult"
})
@XmlRootElement(name = "BugFindBySearchStringResponse")
public class BugFindBySearchStringResponse {

    @XmlElementRef(name = "BugFindBySearchStringResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfBug> bugFindBySearchStringResult;

    /**
     * Gets the value of the bugFindBySearchStringResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfBug }{@code >}
     *     
     */
    public JAXBElement<ArrayOfBug> getBugFindBySearchStringResult() {
        return bugFindBySearchStringResult;
    }

    /**
     * Sets the value of the bugFindBySearchStringResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfBug }{@code >}
     *     
     */
    public void setBugFindBySearchStringResult(JAXBElement<ArrayOfBug> value) {
        this.bugFindBySearchStringResult = value;
    }

}
