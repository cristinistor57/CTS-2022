package clase;

public class Student extends Aplicant {
    protected String facultate;
    protected int anStudii;

    public Student() {
        super();
    }

    public void setFacultate(String facultate) {
        this.facultate = facultate;
    }
    public void setAnStudii(int anStudii) {
        this.anStudii = anStudii;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append(super.toString());
        sb.append(", facultate=").append(facultate);
        sb.append(", an_studii=").append(anStudii);
        sb.append("}");
        return sb.toString();
    }
}
