package ClassesEObjetos.AppBancario.Controller;

import ClassesEObjetos.AppBancario.ASCC;

public class ASCCController {
    public void ShowTitleOffAnim(){
        ASCC ascc = new ASCC();
        String[] F = ascc.get_LetterF();
        String[] U = ascc.get_LetterU();
        String[] T = ascc.get_LetterT();
        String[] R = ascc.get_LetterR();
        String[] E = ascc.get_LetterE();
        String[] Space = ascc.get_LetterSpace();
        String[] B = ascc.get_LetterB();
        String[] A = ascc.get_LetterA();
        String[] C = ascc.get_LetterC();
        String[] N =ascc.get_LetterN();
        String[] K = ascc.get_LetterK();

        for(int i = 0; i < F.length;i++){
            System.out.println(F[i]+U[i]+T[i]+U[i]+R[i]+E[i]+Space[i]+B[i]+A[i]+A[i]+N[i]+C[i]+K[i]);
        }

    }
    public static void Pausa(long seconds){
        try {
            Thread.sleep(seconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
