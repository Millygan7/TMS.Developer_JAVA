

public abstract class Clinic  {
     String surgeon;
     String therapist;
     String dentist;

    public Clinic(String surgeon, String therapis, String dentist ) {

        this.surgeon = surgeon;
        this.therapist = therapis;
        this.dentist = dentist;
    }

    public Clinic() {
    }

    public String getSurgeon() {
        return surgeon;
    }

    public void setSurgeon(String surgeon) { // и
        this.surgeon = surgeon; //
    }

    public String getTherapist() {
        return therapist;
    }

    public void setTherapist(String therapist) { // исправлено имя метода
        this.therapist = therapist;
    }

    public String getDentist() {
        return dentist;
    }

    public void setDentist(String dentist) {
        this.dentist = dentist;
    }

public void Treatsurgeon(){

    }

    public void TreatDentist(){

    }

 public void TreatTherapis(){




    }

    public abstract void treatTherapist();
}







