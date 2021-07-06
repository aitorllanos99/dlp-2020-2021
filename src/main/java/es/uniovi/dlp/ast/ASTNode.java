package es.uniovi.dlp.ast;


/* ------------- Comentario Examen ---------------
Se ha realizado modificaciones a la gramatica.
Se ha añadido una nueva sentencia en statements relativa a RegisterAssignment.
 - Esta es muy similar a assignment, contiene dos expressiones.
Se ha añaidido la clase implementando la interfaz Statement.

No se ha modificado ninguna clase previa.
 */
public interface ASTNode {

    int getLine();
    int getColumn();


}
