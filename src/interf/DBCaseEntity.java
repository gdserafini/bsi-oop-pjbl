package interf;

/*
 * Esta interface deve ser implementada na classe Case
 * - Permitirá que o caso seja salvo no bando de dados
 * - Essa "regra" de salvamento (com essa interface) 
 *   será usada na classe cadastro no método de salvamento 
 *   no banco de dados
 * - getCaseId() retorna um id único para cada caso (int) - identificação no db
 * - getDBCaseEntityData() retorna as informações necessárias que serão
 *   salvas no arquivo txt - string de 1 linha
 */
public interface DBCaseEntity {
    int getCaseId();
    String getDBCaseEntityData() 
        throws IllegalArgumentException, IllegalAccessException;
}
