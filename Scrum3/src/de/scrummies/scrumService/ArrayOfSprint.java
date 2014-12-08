
package de.scrummies.scrumService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSprint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSprint">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Sprint" type="{http://www.fuldaai.de}Sprint" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSprint", namespace = "http://www.fuldaai.de", propOrder = {
    "sprint"
})
public class ArrayOfSprint {

    @XmlElement(name = "Sprint", nillable = true)
    protected List<Sprint> sprint;

    /**
     * Gets the value of the sprint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sprint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSprint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Sprint }
     * 
     * 
     */
    public List<Sprint> getSprint() {
        if (sprint == null) {
            sprint = new ArrayList<Sprint>();
        }
        return this.sprint;
    }

}
