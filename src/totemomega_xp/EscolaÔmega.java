package totemomega_xp;

public abstract class  EscolaÔmega {
    private double bimestre1;
    private double bimestre2;
    private double bimestre3;
    private double bimestre4;
    private double notaExame;
    private double mediaAnual;
    private double mediaSemestral;
   

    public double getBimestre1() {
        return bimestre1;
    }

    public void setBimestre1(double bimestre1) {
        this.bimestre1 = bimestre1;
    }
    public void setBimestre1(String bimestre1) {
        this.bimestre1 = Double.parseDouble(bimestre1);
    }
    public double getBimestre2() {
        return bimestre2;
    }
    public void setBimestre2(double bimestre2) {
        this.bimestre2 = bimestre2;
    }
    public void setBimestre2(String bimestre2) {
        this.bimestre2 = Double.parseDouble(bimestre2);
    }
    public double getBimestre3() {
        return bimestre3;
    }
    public void setBimestre3(double bimestre3) {
        this.bimestre3 = bimestre3;
    }
    public void setBimestre3(String bimestre3) {
        this.bimestre3 = Double.parseDouble(bimestre3);
    }
    public double getBimestre4() {
        return bimestre4;
    }
    public void setBimestre4(double bimestre4) {
        this.bimestre4 = bimestre4;
    }
    public void setBimestre4(String bimestre4) {
        this.bimestre4 = Double.parseDouble(bimestre4);
    }
    public double getNotaExame() {
        return notaExame;
    }
    public void setNotaExame(double notaExame) {
        this.notaExame = notaExame;
    }
    public void setNotaExame(String notaExame) {
        this.notaExame = Double.parseDouble(notaExame);
    }
    public double getMediaAnual() {
        return mediaAnual;
    }
    public void setMediaAnual(double mediaAnual) {
        this.mediaAnual = mediaAnual;
    }
    public void setMediaAnual(String mediaAnual) {
        this.mediaAnual =  Double.parseDouble(mediaAnual);
    }
    public double getMediaSemestral() {
        return mediaSemestral;
    }
    public void setMediaSemestral(double mediaSemestral) {
        this.mediaSemestral = mediaSemestral;
    }
    public void setMediaSemestral(String mediaSemestral) {
        this.mediaSemestral = Double.parseDouble(mediaSemestral);
    }
    //início dos métodos
    public abstract double media();
    public abstract double mediaExameFinal();
    public abstract double notaUltimobimestre();
    public abstract double notaMinimaExame();
}
