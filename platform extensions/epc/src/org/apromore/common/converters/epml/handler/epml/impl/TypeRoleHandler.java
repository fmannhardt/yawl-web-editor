package org.apromore.common.converters.epml.handler.epml.impl;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

import org.apromore.common.converters.epml.context.EPMLConversionContext;
import org.oryxeditor.server.diagram.basic.BasicNode;
import org.oryxeditor.server.diagram.basic.BasicShape;

import de.epml.TypeAttribute;
import de.epml.TypePosition;
import de.epml.TypeRole;

public class TypeRoleHandler extends NodeHandler {

    private final TypeRole role;

    public TypeRoleHandler(final EPMLConversionContext context, final TypeRole role) {
        super(context);
        this.role = role;
    }

    @Override
    protected Map<String, String> convertProperties() {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("title", role.getName());
        hashMap.put("description", role.getDescription());
        return hashMap;
    }

    @Override
    protected TypePosition getPosition() {
        if (role.getGraphics() != null) {
            return role.getGraphics().getPosition();
        } else {
            TypePosition position = new de.epml.ObjectFactory().createTypePosition();
            position.setX(BigDecimal.valueOf(0));
            position.setY(BigDecimal.valueOf(30));
            position.setWidth(BigDecimal.valueOf(100));
            position.setHeight(BigDecimal.valueOf(60));
            return position;
        }
    }

    @Override
    protected BasicShape createShape() {
        for (TypeAttribute attribute : role.getAttribute()) {
            if ("IT system".equals(attribute.getValue())) {
                return new BasicNode(getShapeId().toString(), "System");
            }
            if ("Organizational Unit".equals(attribute.getValue())) {
                return new BasicNode(getShapeId().toString(), "Organization");
            }
        }

        return new BasicNode(getShapeId().toString(), "Position");
    }

    @Override
    protected BigInteger getShapeId() {
        return role.getId();
    }

}
