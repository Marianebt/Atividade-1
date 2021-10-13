/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main {
    public static void main (String[] args) {
        Paciente paciente1 = new Paciente ("Mariane", "28.09.2003", feminino, Santusseguros, ovo, Anegativo);
        System.out.println("Nome da paciente1: "+paciente1.Nome+" Data de nascimento: "+paciente1.dataNascimento+" sexo: "+paciente1.sexo+" planoSaude: "+paciente1.planoSaude+" alergia: "+paciente1.alrgia+" tipoSanguineo: "+paciente1.tipoSanguineo"")";
    }
}