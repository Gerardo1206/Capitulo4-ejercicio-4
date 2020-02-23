package ejercicio4;

public class BloodData {
    private TipoSangre bloodType;
    private TipoRh RhFactor;
    
    public BloodData(){
        bloodType=TipoSangre.O;
        RhFactor=TipoRh.POSITIVO;
    }
    public BloodData(TipoSangre bloodType, TipoRh RhFactor){
        this.RhFactor=RhFactor;
        this.bloodType=bloodType;
    }
    public String toString(){
        String a="Tipo:" + bloodType +"\n"+"Factor:"+RhFactor;
        return a;
    }

    public TipoSangre getBloodType() {
        return bloodType;
    }

    public TipoRh getRhFactor() {
        return RhFactor;
    }

    public void setBloodType(TipoSangre bloodType) {
        this.bloodType = bloodType;
    }

    public void setRhFactor(TipoRh RhFactor) {
        this.RhFactor = RhFactor;
    }
    
}
