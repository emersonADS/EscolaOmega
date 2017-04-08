package totemomega_xp;
public class EnsinoRegular extends EscolaÔmega {
 
    @Override
    public double media(){
        double mediaAnual = (getBimestre1() + getBimestre2() + getBimestre3() + getBimestre4())/4;
        return mediaAnual;
    }
    @Override
    public double mediaExameFinal(){
        double mediaExameFinal = (6 * getMediaAnual() +(4 * getNotaExame()))/10;
        return mediaExameFinal;
    }
    @Override
    public double notaUltimobimestre(){
       double notaMinima4b = (getBimestre1() + getBimestre2() + getBimestre3());
       if(notaMinima4b > 30){
           notaMinima4b = 280-(getBimestre1() + getBimestre2() + getBimestre3());
       }else{
           notaMinima4b = 28-(getBimestre1() + getBimestre2() + getBimestre3());
       }
       return notaMinima4b;
    }
    @Override
    public double notaMinimaExame(){
        double notaMinimaExame;
        if(getMediaAnual() >= 10){
            notaMinimaExame = (6 * getMediaAnual() - 50)/4;
        }else{
            notaMinimaExame = (6 * getMediaAnual() - 5)/4;
        }
        return notaMinimaExame;
    }
}
