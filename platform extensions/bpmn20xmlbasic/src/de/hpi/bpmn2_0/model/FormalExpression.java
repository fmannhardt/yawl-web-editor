/**
 * Copyright (c) 2009
 * Philipp Giese, Sven Wagner-Boysen
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package de.hpi.bpmn2_0.model;

import de.hpi.bpmn2_0.util.EscapingStringAdapter;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * <p>Java class for tFormalExpression complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="tFormalExpression">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.omg.org/bpmn20}tExpression">
 *       &lt;attribute name="language" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="evaluatesToTypeRef" type="{http://www.w3.org/2001/XMLSchema}QName" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tFormalExpression", propOrder = {
        "language",
        "evaluatesToTypeRef"
})
public class FormalExpression extends Expression {

    public FormalExpression() {
        super();
    }

    public FormalExpression(String expressionString) {
        super(expressionString);
    }

    @XmlAttribute
    @XmlSchemaType(name = "anyURI")
    @XmlJavaTypeAdapter(EscapingStringAdapter.class)
    protected String language;

    @XmlAttribute
    @XmlJavaTypeAdapter(EscapingStringAdapter.class)
    protected String evaluatesToTypeRef;

    /* Getter & Setter */

    /**
     * Gets the value of the language property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the evaluatesToTypeRef property.
     *
     * @return possible object is
     *         {@link QName }
     */
    public String getEvaluatesToTypeRef() {
        return evaluatesToTypeRef;
    }

    /**
     * Sets the value of the evaluatesToTypeRef property.
     *
     * @param value allowed object is
     *              {@link QName }
     */
    public void setEvaluatesToTypeRef(String value) {
        this.evaluatesToTypeRef = value;
    }
}
