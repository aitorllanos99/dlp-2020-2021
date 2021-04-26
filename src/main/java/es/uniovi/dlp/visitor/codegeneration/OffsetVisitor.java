package es.uniovi.dlp.visitor.codegeneration;

import es.uniovi.dlp.ast.definitions.FuncDefinition;
import es.uniovi.dlp.ast.definitions.VarDefinition;
import es.uniovi.dlp.ast.types.FuncType;
import es.uniovi.dlp.ast.types.RecordType;
import es.uniovi.dlp.visitor.AbstractVisitor;
import es.uniovi.dlp.visitor.Visitor;

public class OffsetVisitor extends AbstractVisitor<Object,Object> {
    private int desplazamientoGlobal = 0;
    private int desplazamientoLocal = 0;

    @Override
    public Object visit(VarDefinition varDefinition, Object param) {
        super.visit(varDefinition, param);
        if (varDefinition.getScope() == 0) {
            varDefinition.setOffset(desplazamientoGlobal);
            desplazamientoGlobal += varDefinition.getType().getNumberOfBytes();
        } else {
            desplazamientoLocal -= varDefinition.getType().getNumberOfBytes();
            varDefinition.setOffset(desplazamientoLocal);
        }
        return null;
    }

    @Override
    public Object visit(FuncDefinition funcDefinition, Object param) {
        desplazamientoLocal = 0;
        super.visit(funcDefinition, param);
        return null;
    }

    @Override
    public Object visit(FuncType funcType, Object param) {
        super.visit(funcType, param);
        int offsetParams = 4;
        if(funcType.getParameters().isEmpty())
            return null;
        for(var paramByte : funcType.getParameters()){
            paramByte.setOffset(offsetParams);
            offsetParams += paramByte.getType().getNumberOfBytes();
        }
        return null;
    }

    @Override
    public Object visit(RecordType recordType, Object param) {
        super.visit(recordType, param);
        int offsetFields = 0;
        for(var f: recordType.getFields()){
            f.setOffset(offsetFields);
            offsetFields += f.getType().getNumberOfBytes();
        }
        return null;
    }
}
