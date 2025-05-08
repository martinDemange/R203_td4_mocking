package mocking;

import calcMoy.Etudiant;
import calcMoy.EtudiantSansNoteException;
import calcMoy.MoyenneArithmetique;
import calcMoy.MoyenneNonCalculableException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;


public class MoyenneArithmetiqueTest {
    @Mock Etudiant etudiant;
    private MoyenneArithmetique arithmetique;

    @BeforeEach
    void setUp() {
        etudiant = mock(Etudiant.class);
        arithmetique = new MoyenneArithmetique();
    }

    @Test
    void shouldCalculateAverageOfTenGrades(){
        // 11 notes
        // [0 ,2 ,4 ,6 ,8 ,10 , 12 ,14 ,16 ,18 ,20]
        // should return 10/20
        when(etudiant.getNbNotes()).thenReturn(11);
        when(etudiant.getNote(anyInt())).thenReturn(0.0,2.0 ,4.0 ,6.0 ,8.0 ,10.0 , 12.0 ,14.0 ,16.0 ,18.0 ,20.0);
        assertEquals(10, arithmetique.getMoy(etudiant));
    }

    @Test
    void shouldThrowEtudiantSansNoteException(){
        when(etudiant.getNbNotes()).thenThrow(EtudiantSansNoteException.class);
        assertThrows(MoyenneNonCalculableException.class, () -> arithmetique.getMoy(etudiant));
    }

    @Test
    void shouldCalculateAverageOfOneGradeWhereNoteIsAObject(){

    }


}
