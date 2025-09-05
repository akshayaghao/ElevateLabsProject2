package COEP.Admission.Management.System.AdmissionService;

import COEP.Admission.Management.System.Model.Student;

public class MeritService {
    // Simple merit formula: 60% HSC + 40% normalized entrance (out of 200)
    public double compute(Student s) {
        double hsc = s.getHscPercentage().doubleValue();     
        double ent = s.getEntranceScore().doubleValue();     
        double entPct = (ent / 200.0) * 100.0;
        return (0.60 * hsc) + (0.40 * entPct);
    }
}