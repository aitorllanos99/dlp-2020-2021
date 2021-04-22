package es.uniovi.dlp.visitor.codegeneration;

import es.uniovi.dlp.visitor.AbstractVisitor;

public class AddresCGVisitor extends AbstractVisitor {
    private CodeGenerator generator;

    public AddresCGVisitor(CodeGenerator generator) {
        this.generator =  generator;

    }
}
