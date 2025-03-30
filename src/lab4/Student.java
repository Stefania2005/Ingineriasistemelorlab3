package lab4;
// // /ex 2
//
//import java.util.*;
//
//class Student {
//   public String prenume;
//   private String nume;
//   private String grupa;
//   List<Integer> note;
//
////   public Student(String nume, String grupa) {
////       this.nume = nume;
////       this.grupa = grupa;
//    this.note = new ArrayList<>();
//  }
//
//    public String getNume() {
//       return nume;
//   }
//
//   public String getGrupa() {
//       return grupa;
//   }
//
//   public void adaugaNota(int nota) {
//      note.add(nota);
//   }
//
//    public boolean esteIntegralist() {
//       return note.stream().allMatch(n -> n >= 5);
//    }
//  public float getMedie() {
//     return (float) note.stream().mapToInt(Integer::intValue).sum() / note.size();
//    }
//
//    public long getNumarRestante() {
//        return note.stream().filter(n -> n < 5).count();
//   }
//
//   @Override
//   public String toString() {
//     return String.format("%s (%s) - Note: %s", nume, grupa, note);
//   }
//}
//
//class ByGroupComparator implements Comparator<Student> {
//   @Override
//   public int compare(Student o1, Student o2) {
//       int groupCompare = o1.getGrupa().compareTo(o2.getGrupa());
//       return (groupCompare != 0) ? groupCompare : o1.getNume().compareTo(o2.getNume());
//   }
//}
//
//class ByGradesComparator implements Comparator<Student> {
//    @Override
//   public int compare(Student o1, Student o2) {
//       return Float.compare(o2.getMedie(), o1.getMedie()); // Descrescător
//   }
//}
//
//class ByRestanteComparator implements Comparator<Student> {
//    @Override
//   public int compare(Student o1, Student o2) {
//       return Long.compare(o1.getNumarRestante(), o2.getNumarRestante()); // Crescător
//    }
//}

