package org.apache.plc4x.codegen.ast;

public class ConditionalStatement extends Expression {

    protected ConditionalStatement(TypeNode type) {
        super(type);
    }

    @Override public <T> T accept(NodeVisitor<T> visitor) {
        return null;
    }

    @Override public void write(Generator writer) {

    }
}