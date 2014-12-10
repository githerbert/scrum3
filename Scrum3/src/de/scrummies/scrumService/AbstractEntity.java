
package de.scrummies.scrumService;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AbstractEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractEntity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RecCreated" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="RecModified" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractEntity", namespace = "http://www.fuldaai.de", propOrder = {
    "recCreated",
    "recModified"
})
@XmlSeeAlso({
    AbstractWorkItem.class,
    AbstractExtentions.class
})
public class AbstractEntity implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 7858247158437586916L;
	@XmlElement(name = "RecCreated")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar recCreated;
    @XmlElement(name = "RecModified")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar recModified;

    /**
     * Gets the value of the recCreated property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRecCreated() {
        return recCreated;
    }

    /**
     * Sets the value of the recCreated property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRecCreated(XMLGregorianCalendar value) {
        this.recCreated = value;
    }

    /**
     * Gets the value of the recModified property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRecModified() {
        return recModified;
    }

    /**
     * Sets the value of the recModified property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRecModified(XMLGregorianCalendar value) {
        this.recModified = value;
    }

}
