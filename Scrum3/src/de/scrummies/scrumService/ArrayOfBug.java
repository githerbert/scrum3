
package de.scrummies.scrumService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfBug complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfBug">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Bug" type="{http://www.fuldaai.de}Bug" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfBug", namespace = "http://www.fuldaai.de", propOrder = {
    "bug"
})
public class ArrayOfBug {

    @XmlElement(name = "Bug", nillable = true)
    protected List<Bug> bug;

    /**
     * Gets the value of the bug property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bug property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBug().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Bug }
     * 
     * 
     */
    public List<Bug> getBug() {
        if (bug == null) {
            bug = new ArrayList<Bug>();
        }
        return this.bug;
    }

}
