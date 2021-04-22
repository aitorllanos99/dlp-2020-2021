package es.uniovi.dlp.visitor.codegeneration;

import es.uniovi.dlp.visitor.AbstractVisitor;

public class ExecuteCGVisitor extends AbstractVisitor {
    private AddresCGVisitor addressVisitor;
    private ValueCGVisitor valueVisitor;
    private CodeGenerator generator;

    public ExecuteCGVisitor(CodeGenerator generator){
        this.generator = generator;
        this.addressVisitor = new AddresCGVisitor(generator);
        this.valueVisitor = new ValueCGVisitor(generator);
    }
}
