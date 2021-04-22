package es.uniovi.dlp.visitor.codegeneration;

import es.uniovi.dlp.visitor.AbstractVisitor;

public class ValueCGVisitor extends AbstractVisitor {
    private CodeGenerator generator;

    public ValueCGVisitor(CodeGenerator generator) {
        this.generator = generator;
    }
}
