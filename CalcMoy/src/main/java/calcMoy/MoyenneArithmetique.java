package calcMoy;

public class MoyenneArithmetique {
    public double getMoy(Etudiant etudiant) {
        int nbNote;
        try {nbNote = etudiant.getNbNotes();}
        catch (EtudiantSansNoteException e) {throw new MoyenneNonCalculableException();}

        double moy = 0;
        for (int i = 0; i < nbNote; i++) {
            moy += etudiant.getNote(i);
        }
        return moy/nbNote;
    }

    public double getMoyObject(Etudiant etudiant) {
        int nbNote;
        try {nbNote = etudiant.getNbNotes();}
        catch (EtudiantSansNoteException e) {throw new MoyenneNonCalculableException();}

        double moy = 0;
        for (int i = 0; i < nbNote; i++) {
            moy += etudiant.getNote(i);
        }
        return moy/nbNote;
    }
}
