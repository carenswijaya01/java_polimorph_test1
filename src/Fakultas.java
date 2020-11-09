
import java.util.ArrayList;
import java.util.List;


public class Fakultas {

    private List<Dosen> ld;
    private List<StaffTU> ls;

    Fakultas() {
        ld = new ArrayList<>();
        ls = new ArrayList<>();
    }

    public void addDosen(Dosen dosen) {
        ld.add(dosen);
    }

    public void addStaff(StaffTU staff) {
        ls.add(staff);
    }

    public void removeDosen(int index) {
        ld.remove(index);
    }

    public void removeStaff(int index) {
        ls.remove(index);
    }

    public void CetakDosen() {
        int i = 0;
        for (Dosen dosen : ld) {
            i++;
            System.out.println("Dosen #" + i);
            dosen.CetakIdentitas();
        }
    }

    public void CetakStaff() {
        int i = 0;
        for (StaffTU l : ls) {
            i++;
            System.out.println("Staff #" + i);
            l.CetakIdentitas();
        }
    }
}
