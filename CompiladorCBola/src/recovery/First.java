package recovery;

import parser.*;

public class First { //implementa os conjuntos first p/ alguns n.terminais

    static public final RecoverySet main = new RecoverySet();
    static public final RecoverySet tipo = new RecoverySet();
    static public final RecoverySet declaracaoVariaveis = tipo;
    static public final RecoverySet identificador_variaveis = new RecoverySet();
    static public final RecoverySet atribuicao = new RecoverySet();
    static public final RecoverySet id = new RecoverySet();

    static {
    	main.add(new Integer(EG1Constants.INICIO));
    	
    	tipo.add(new Integer(EG1Constants.INTEIRO));
    	tipo.add(new Integer(EG1Constants.FLUTUANTE));
    	tipo.add(new Integer(EG1Constants.STRING));
    	
    	identificador_variaveis.add(new Integer(EG1Constants.VIRGULA));
    	identificador_variaveis.add(new Integer(EG1Constants.ID));
    	
    	atribuicao.add(new Integer(EG1Constants.ID));
    }
}
