package totemomega_xp;
public class EnsinoSemestral extends EscolaÔmega {
    @Override
    public double media(){
        double mediaSemestral = (getBimestre1() + getBimestre2())/2;
        return mediaSemestral;
    }
    @Override
    public double mediaExameFinal(){
        double mediaExameFinal = (6 * getMediaSemestral()+(4 * getNotaExame()))/10;
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
        double notaMinimaExame;
        if(getMediaSemestral()>= 10){
            notaMinimaExame = (6 * getMediaSemestral()- 50)/4;
        }else{
            notaMinimaExame = (6 * getMediaSemestral() - 5)/4;
        }
        return notaMinimaExame;
    }
}