

public class Pathient extends Clinic {
    String Doctor;
    int PlanLechenia ;

    public Pathient(String Doctor,int PlanLechenia,String surgeon, String therapis, String dentist) {
        super(surgeon, therapis, dentist);
        this.Doctor = Doctor;
        this.PlanLechenia = PlanLechenia;
    }

    public String getDoctor() {
        return Doctor;
    }

    public void setDoctor(String doctor) { // и
        this.Doctor = doctor; //
    }

    public int getPlanLechenia() {
        return PlanLechenia;
    }

    public void setPlanLechenia(int PlanLechenia) { // и
        this.PlanLechenia = PlanLechenia; //
    }

    @Override
    public void Treatsurgeon() {
        System.out.println("Пациент направлен к хирургу: " + surgeon);
    }

    @Override
    public void TreatDentist(){
        System.out.println("Пациент направлен к дантисту: " + dentist);

    }
    @Override
    public void treatTherapist() {
        for (int i = 0; i < PlanLechenia; i++) {
            System.out.println("Сеанс лечения " + (i + 1) + " у терапевта: " + therapist);
        }
    }

}






