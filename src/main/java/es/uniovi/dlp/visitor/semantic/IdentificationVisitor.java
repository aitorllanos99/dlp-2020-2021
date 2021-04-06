package es.uniovi.dlp.visitor.semantic;


import es.uniovi.dlp.ast.definitions.FuncDefinition;
import es.uniovi.dlp.ast.definitions.VarDefinition;
import es.uniovi.dlp.ast.expressions.Invocation;
import es.uniovi.dlp.ast.expressions.Variable;
import es.uniovi.dlp.ast.types.RecordField;
import es.uniovi.dlp.ast.types.RecordType;
import es.uniovi.dlp.ast.types.Type;
import es.uniovi.dlp.error.ErrorManager;
import es.uniovi.dlp.error.ErrorReason;
import es.uniovi.dlp.error.Location;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class IdentificationVisitor extends AbstractVisitor<Type, Type> {
    private SymbolTable table = new SymbolTable();

    @Override
    public Type visit(VarDefinition varDefinition, Type param) {
        if (table.findInCurrentScope(varDefinition.getName()) == null) //Habria que buscar en el scope actual o solo en la tabla??
            table.insert(varDefinition);
        else
            ErrorManager.getInstance().addError(new Location(varDefinition.getLine(), varDefinition.getColumn()), ErrorReason.VARIABLE_ALREADY_DECLARED);
        super.visit(varDefinition,param);
        return null;
    }

    @Override
    public Type visit(FuncDefinition funcDefinition, Type param) {
        if (table.find(funcDefinition.getName()) == null)
            table.insert(funcDefinition);
        else
            ErrorManager.getInstance().addError(new Location(funcDefinition.getLine(), funcDefinition.getColumn()), ErrorReason.FUNCTION_ALREADY_DECLARED);
        //Hacemos el ambito de la funcion
        table.set();
        super.visit(funcDefinition, param);
        table.reset();
        return null;
    }

    @Override
    public Type visit(Invocation invocation, Type param) {
        if (table.find(invocation.getName().getIdent()) == null)
            ErrorManager.getInstance().addError(new Location(invocation.getLine(), invocation.getColumn()), ErrorReason.FUNCTION_NOT_DECLARED);
        super.visit(invocation,param);
        return null;
    }

    @Override
    public Type visit(Variable variable, Type param) {
        if (table.find(variable.getIdent()) == null)
            ErrorManager.getInstance().addError(new Location(variable.getLine(), variable.getColumn()), ErrorReason.VARIABLE_NOT_DECLARED);
        super.visit(variable,param);
        return null;
    }

     /* @Override
   public Type visit(RecordField recordField, Type param) {
        //Patch for this case, should be modifed, without break it prints it twice

        if (table.find(recordField.getName()) != null)
           ErrorManager.getInstance().addError(new Location(recordField.getLine(), recordField.getColumn()), ErrorReason.FIELD_ALREADY_DECLARED);

       return null;
    }*/

    @Override
    public Type visit(RecordType recordType, Type param){
        for (RecordField f : recordType.getFields())
            if(recordType.getFields().stream().filter(e -> f.getName().equals(e.getName())).count() > 1) {
                ErrorManager.getInstance().addError(new Location(f.getLine(), f.getColumn()), ErrorReason.FIELD_ALREADY_DECLARED);
                break;
            }
      /*  table.set();
        super.visit(recordType,param);
        table.reset();*/
        return  null;
    }



}
