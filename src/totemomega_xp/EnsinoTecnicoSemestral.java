package totemomega_xp;
public class EnsinoTecnicoSemestral extends EscolaÔmega{
     @Override
    public double media(){
        double mediaSemestral = (getBimestre1() + getBimestre2())/2;
        return mediaSemestral;
    }
    @Override
    public double mediaExameFinal(){
        double mediaExameFinal = (getMediaSemestral() + getNotaExame())/2;
         return mediaExameFinal;
    }
    @Override
    public double notaUltimobimestre(){
        double notaMinima2b = getBimestre1();
        if(notaMinima2b >10){
            notaMinima2b = 140 - getBimestre1();
        }else{
            notaMinima2b = 14 - getBimestre1();
        }
        return notaMinima2b;
    }
    @Override
    public double notaMinimaExame(){
        double notaMinimaExame ;
        if(getMediaSemestral() > 10){
            notaMinimaExame = 100 - getMediaSemestral();
        }else{
            notaMinimaExame = 10 - getMediaSemestral();
        }
        return notaMinimaExame;
    }
}